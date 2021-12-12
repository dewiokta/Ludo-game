package game;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    private static int uniqueId;
    private ArrayList<Server.ClientThread> clients;
    private int port;
    private boolean keepGoing;
    private int numPlayer;
    private KoneksiServer player1;
    private KoneksiServer player2;
    private KoneksiServer player3;
    private KoneksiServer player4;
    layout game = new layout();
    

    public Server() {
        this.port = 9999;
        clients = new ArrayList<>();
    }

    public void start() {
        keepGoing = true;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (numPlayer < 4) {
                System.out.println("ChatServer waiting for Clients on port " + port + ".");
                Socket socket = serverSocket.accept();
                numPlayer++;
                System.out.println("Player #" + numPlayer + " has connected.");
                KoneksiServer server = new KoneksiServer(socket,numPlayer);
                if(numPlayer==1){
                    player1 = server;
                }else if(numPlayer==2){
                    player2 = server;
                }else if(numPlayer==3){
                    player3 = server;
                }else{
		    player4 = server;	
		}
                Server.ClientThread t = new Server.ClientThread(socket);
                clients.add(t);
                t.start();
                send("login~" + t.username + "~" + t.username + " sedang login...~Server~\n");
            }
             System.out.println("We have 4 Player. No longer accepting connections");
             game.setVisible(true);
             //if playyer 4 gmme starts
//             if (numPlayer==4) {
//                game.setVisible(true);
//            }
        } catch (IOException e) {
            String msg = "Exception on new ServerSocket: " + e + "\n";
            System.out.println(msg);
        }
    }
    
    private class KoneksiServer implements Runnable{
    private Socket socket;
        private DataInputStream dis;
        private DataOutputStream dos;
        private int playerID;
        public KoneksiServer(Socket s, int id) {
            socket = s;
            playerID = id;
            try {
                dis = new DataInputStream(socket.getInputStream());
                dos = new DataOutputStream(socket.getOutputStream());

            } catch (IOException ex) {
                System.out.println("IOException from SSC Constructor");
            }
        }
        
        public void run(){
            try{
                dos.writeInt(playerID);
                dos.flush();
                
                while(true){
                    
                }
            }
            catch(IOException ex){
                System.out.println("IOException from run() SSC");
            }
        }
    }
    

    private synchronized void send(String message) {
        System.out.println(message);
        for (int i = clients.size(); --i >= 0;) {
            Server.ClientThread ct = clients.get(i);
            if (!ct.writeMsg(message)) {
                clients.remove(i);
                System.out.println("Disconnected Client " + ct.username + " removed from list.");
            }
        }
    }

    private String getClients() {
        String s = "";
        for (ClientThread clientThread : clients) {
            s += clientThread.username + ":";
        }
        s += "---";
        System.out.println(s);
        return s;
    }

    private synchronized void remove(int id) {
        for (int i = 0; i < clients.size(); ++i) {
            Server.ClientThread ct = clients.get(i);
            if (ct.id == id) {
                clients.remove(i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    private class ClientThread extends Thread {

        private Socket socket;
        private ObjectInputStream sInput;
        private ObjectOutputStream sOutput;
        private int id;
        private String username;

        public ClientThread(Socket socket) {
            id = ++uniqueId;
            this.socket = socket;
            System.out.println("Menciptakan Object Input/Output Streams");
            try {
                sOutput = new ObjectOutputStream(socket.getOutputStream());
                sInput = new ObjectInputStream(socket.getInputStream());
                String message = (String) sInput.readObject();
                username = message.split("~")[1];
                System.out.println(username + " masuk.");
            } catch (IOException e) {
                System.out.println("Exception creating new Input/output Streams: " + e);
            } catch (ClassNotFoundException e) {
            }
        }

        private void close() {
            try {
                if (sOutput != null) {
                    sOutput.close();
                }
            } catch (Exception e) {
            }
            try {
                if (sInput != null) {
                    sInput.close();
                }
            } catch (Exception e) {
            }
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (Exception e) {
            }
        }

        private boolean writeMsg(String msg) {
            if (!socket.isConnected()) {
                close();
                return false;
            }
            try {
                sOutput.writeObject(msg);
            } catch (IOException e) {
                System.out.println("Error " + username);
                System.out.println(e.toString());
            }
            return true;
        }
    }
}
