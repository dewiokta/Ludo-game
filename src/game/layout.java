/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class layout extends javax.swing.JFrame {

    int resultDice;

    String[] redTrack = {"place2", "place3", "place4", "place5", "place6", "place7", "place8", "place9", "place10", "place11", "place12", "place13", "place14", "place15", "place16", "place17", "place18", "place19", "place20", "place21", "place22", "place23", "place24", "place25", "place26", "place27", "place28", "place29", "place30", "place31", "place32", "place33", "place34", "place135", "place36", "place37", "place38", "place39", "place40", "place41", "place42", "place43", "place44", "place45", "place46", "place47", "place48", "place49", "place50", "place51", "place52", "redplace1", "redplace2", "redplace3", "redplace4", "redplace5", "redplace6"};
    String[] greenTrack = {"place15", "place16", "place17", "place18", "place19", "place20", "place21", "place22", "place23", "place24", "place25", "place26", "place27", "place28", "place29", "place30", "place31", "place32", "place33", "place34", "place135", "place36", "place37", "place38", "place39", "place40", "place41", "place42", "place43", "place44", "place45", "place46", "place47", "place48", "place49", "place50", "place51", "place52", "place1", "place2", "place3", "place4", "place5", "place6", "place7", "place8", "place9", "place10", "place11", "place12", "place13", "greenplace1", "greenplace2", "greenplace3", "greenplace4", "greenplace5", "greenplace6"};
    String[] yellowTrack = {"place28", "place29", "place30", "place31", "place32", "place33", "place34", "place135", "place36", "place37", "place38", "place39", "place40", "place41", "place42", "place43", "place44", "place45", "place46", "place47", "place48", "place49", "place50", "place51", "place52", "place1", "place2", "place3", "place4", "place5", "place6", "place7", "place8", "place9", "place10", "place11", "place12", "place13", "place14", "place15", "place16", "place17", "place18", "place19", "place20", "place21", "place22", "place23", "place24", "place25", "place26", "yellowplace1", "yellowplace2", "yellowplace3", "yellowplace4", "yellowplace5", "yellowplace6"};
    String[] blueTrack = {"place41", "place42", "place43", "place44", "place45", "place46", "place47", "place48", "place49", "place50", "place51", "place52", "place1", "place2", "place3", "place4", "place5", "place6", "place7", "place8", "place9", "place10", "place11", "place12", "place13", "place14", "place15", "place16", "place17", "place18", "place19", "place20", "place21", "place22", "place23", "place24", "place25", "place26", "place27", "place28", "place29", "place30", "place31", "place32", "place33", "place34", "place135", "place36", "place37", "place38", "place39", "blueplace1", "blueplace2", "blueplace3", "blueplace4", "blueplace5", "blueplace6"};

    String[] currentPlayer = {"red", "green", "yellow", "blue"};
    int current = 0;

    boolean redStart1 = true;
    boolean redStart2 = true;
    boolean greenStart1 = true;
    boolean greenStart2 = true;
    boolean yellowStart1 = true;
    boolean yellowStart2 = true;
    boolean blueStart1 = true;
    boolean blueStart2 = true;

    int helpRedNow1 = 0;
    int helpRedNow2 = 0;
    int helpGreenNow1 = 0;
    int helpGreenNow2 = 0;
    int helpYellowNow1 = 0;
    int helpYellowNow2 = 0;
    int helpBlueNow1 = 0;
    int helpBlueNow2 = 0;

    String redNow1 = "", redNow2 = "", greenNow1 = "", greenNow2 = "", yellowNow1 = "", yellowNow2 = "", blueNow1 = "", blueNow2 = "";

    int idxWinRed = 0, idxWinGreen = 0, idxWinYellow = 0, idxWinBlue = 0;

    /**
     * Creates new form layout
     */
    public layout() {
        initComponents();

        redLabel.setVisible(true);
        greenLabel.setVisible(false);
        yellowLabel.setVisible(false);
        blueLabel.setVisible(false);

        redMv.setVisible(false);
        greenMv.setVisible(false);
        yellowMv.setVisible(false);
        blueMv.setVisible(false);

        redpionplace1.setBackground(Color.red);
        redpionplace2.setBackground(Color.red);
        greenpionplace1.setBackground(Color.green);
        greenpionplace2.setBackground(Color.green);
        yellowpionplace1.setBackground(Color.yellow);
        yellowpionplace2.setBackground(Color.yellow);
        bluepionplace1.setBackground(Color.blue);
        bluepionplace2.setBackground(Color.blue);
    }

    public void win() {
        if (idxWinRed == 2) {
            JOptionPane.showMessageDialog(this, "Player Red Win !!", "Info", JOptionPane.PLAIN_MESSAGE);
        } else if (idxWinGreen == 2) {
            JOptionPane.showMessageDialog(this, "Player Green Win !!", "Info", JOptionPane.PLAIN_MESSAGE);
        } else if (idxWinBlue == 2) {
            JOptionPane.showMessageDialog(this, "Player Blue Win !!", "Info", JOptionPane.PLAIN_MESSAGE);
        } else if (idxWinYellow == 2) {
            JOptionPane.showMessageDialog(this, "Player Yellow Win !!", "Info", JOptionPane.PLAIN_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel60 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        redpionplace2 = new javax.swing.JPanel();
        redpionplace1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        place1 = new javax.swing.JPanel();
        place2 = new javax.swing.JPanel();
        place3 = new javax.swing.JPanel();
        place4 = new javax.swing.JPanel();
        place5 = new javax.swing.JPanel();
        place6 = new javax.swing.JPanel();
        place12 = new javax.swing.JPanel();
        place11 = new javax.swing.JPanel();
        place10 = new javax.swing.JPanel();
        place9 = new javax.swing.JPanel();
        place8 = new javax.swing.JPanel();
        place7 = new javax.swing.JPanel();
        place13 = new javax.swing.JPanel();
        greenplace1 = new javax.swing.JPanel();
        greenplace2 = new javax.swing.JPanel();
        greenplace3 = new javax.swing.JPanel();
        greenplace4 = new javax.swing.JPanel();
        greenplace5 = new javax.swing.JPanel();
        place14 = new javax.swing.JPanel();
        place15 = new javax.swing.JPanel();
        place16 = new javax.swing.JPanel();
        place17 = new javax.swing.JPanel();
        place18 = new javax.swing.JPanel();
        place19 = new javax.swing.JPanel();
        place52 = new javax.swing.JPanel();
        redplace1 = new javax.swing.JPanel();
        redplace2 = new javax.swing.JPanel();
        redplace3 = new javax.swing.JPanel();
        redplace4 = new javax.swing.JPanel();
        redplace5 = new javax.swing.JPanel();
        place51 = new javax.swing.JPanel();
        place50 = new javax.swing.JPanel();
        place49 = new javax.swing.JPanel();
        place48 = new javax.swing.JPanel();
        place47 = new javax.swing.JPanel();
        place46 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        greenpionplace2 = new javax.swing.JPanel();
        greenpionplace1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        place20 = new javax.swing.JPanel();
        place27 = new javax.swing.JPanel();
        place21 = new javax.swing.JPanel();
        yellowplace5 = new javax.swing.JPanel();
        place32 = new javax.swing.JPanel();
        place31 = new javax.swing.JPanel();
        yellowplace4 = new javax.swing.JPanel();
        yellowplace3 = new javax.swing.JPanel();
        place22 = new javax.swing.JPanel();
        place23 = new javax.swing.JPanel();
        yellowplace2 = new javax.swing.JPanel();
        place29 = new javax.swing.JPanel();
        place30 = new javax.swing.JPanel();
        place28 = new javax.swing.JPanel();
        yellowplace1 = new javax.swing.JPanel();
        place24 = new javax.swing.JPanel();
        place25 = new javax.swing.JPanel();
        place26 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        bluepionplace1 = new javax.swing.JPanel();
        bluepionplace2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        yellowpionplace2 = new javax.swing.JPanel();
        yellowpionplace1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        place45 = new javax.swing.JPanel();
        blueplace5 = new javax.swing.JPanel();
        place33 = new javax.swing.JPanel();
        place44 = new javax.swing.JPanel();
        blueplace4 = new javax.swing.JPanel();
        place34 = new javax.swing.JPanel();
        place43 = new javax.swing.JPanel();
        blueplace3 = new javax.swing.JPanel();
        place35 = new javax.swing.JPanel();
        place42 = new javax.swing.JPanel();
        blueplace2 = new javax.swing.JPanel();
        place36 = new javax.swing.JPanel();
        place41 = new javax.swing.JPanel();
        blueplace1 = new javax.swing.JPanel();
        place37 = new javax.swing.JPanel();
        place40 = new javax.swing.JPanel();
        place39 = new javax.swing.JPanel();
        place38 = new javax.swing.JPanel();
        blueplace6 = new javax.swing.JPanel();
        greenplace6 = new javax.swing.JPanel();
        yellowplace6 = new javax.swing.JPanel();
        redplace6 = new javax.swing.JPanel();
        mousebutton = new javax.swing.JButton();
        redLabel = new javax.swing.JLabel();
        greenLabel = new javax.swing.JLabel();
        yellowLabel = new javax.swing.JLabel();
        blueLabel = new javax.swing.JLabel();
        diceplace = new javax.swing.JLabel();
        redMv = new javax.swing.JLabel();
        greenMv = new javax.swing.JLabel();
        yellowMv = new javax.swing.JLabel();
        blueMv = new javax.swing.JLabel();

        jPanel60.setBackground(new java.awt.Color(255, 0, 0));
        jPanel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel85.setBackground(new java.awt.Color(0, 0, 0));

        jPanel89.setBackground(new java.awt.Color(0, 0, 0));
        jPanel89.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        redpionplace2.setBackground(new java.awt.Color(255, 255, 255));
        redpionplace2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout redpionplace2Layout = new javax.swing.GroupLayout(redpionplace2);
        redpionplace2.setLayout(redpionplace2Layout);
        redpionplace2Layout.setHorizontalGroup(
            redpionplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        redpionplace2Layout.setVerticalGroup(
            redpionplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        redpionplace1.setBackground(new java.awt.Color(255, 255, 255));
        redpionplace1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout redpionplace1Layout = new javax.swing.GroupLayout(redpionplace1);
        redpionplace1.setLayout(redpionplace1Layout);
        redpionplace1Layout.setHorizontalGroup(
            redpionplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        redpionplace1Layout.setVerticalGroup(
            redpionplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PLAYER 1");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel85Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(redpionplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel85Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(redpionplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel85Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel85Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(redpionplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(redpionplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel85Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        place1.setBackground(new java.awt.Color(255, 255, 255));
        place1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place1Layout = new javax.swing.GroupLayout(place1);
        place1.setLayout(place1Layout);
        place1Layout.setHorizontalGroup(
            place1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        place1Layout.setVerticalGroup(
            place1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place2.setBackground(new java.awt.Color(255, 255, 255));
        place2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout place2Layout = new javax.swing.GroupLayout(place2);
        place2.setLayout(place2Layout);
        place2Layout.setHorizontalGroup(
            place2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place2Layout.setVerticalGroup(
            place2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place3.setBackground(new java.awt.Color(255, 255, 255));
        place3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place3Layout = new javax.swing.GroupLayout(place3);
        place3.setLayout(place3Layout);
        place3Layout.setHorizontalGroup(
            place3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place3Layout.setVerticalGroup(
            place3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place4.setBackground(new java.awt.Color(255, 255, 255));
        place4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place4Layout = new javax.swing.GroupLayout(place4);
        place4.setLayout(place4Layout);
        place4Layout.setHorizontalGroup(
            place4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place4Layout.setVerticalGroup(
            place4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place5.setBackground(new java.awt.Color(255, 255, 255));
        place5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place5Layout = new javax.swing.GroupLayout(place5);
        place5.setLayout(place5Layout);
        place5Layout.setHorizontalGroup(
            place5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place5Layout.setVerticalGroup(
            place5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place6.setBackground(new java.awt.Color(255, 255, 255));
        place6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place6Layout = new javax.swing.GroupLayout(place6);
        place6.setLayout(place6Layout);
        place6Layout.setHorizontalGroup(
            place6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place6Layout.setVerticalGroup(
            place6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place12.setBackground(new java.awt.Color(255, 255, 255));
        place12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place12Layout = new javax.swing.GroupLayout(place12);
        place12.setLayout(place12Layout);
        place12Layout.setHorizontalGroup(
            place12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place12Layout.setVerticalGroup(
            place12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place11.setBackground(new java.awt.Color(255, 255, 255));
        place11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place11Layout = new javax.swing.GroupLayout(place11);
        place11.setLayout(place11Layout);
        place11Layout.setHorizontalGroup(
            place11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place11Layout.setVerticalGroup(
            place11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place10.setBackground(new java.awt.Color(0, 0, 0));
        place10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place10Layout = new javax.swing.GroupLayout(place10);
        place10.setLayout(place10Layout);
        place10Layout.setHorizontalGroup(
            place10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place10Layout.setVerticalGroup(
            place10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place9.setBackground(new java.awt.Color(255, 255, 255));
        place9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place9Layout = new javax.swing.GroupLayout(place9);
        place9.setLayout(place9Layout);
        place9Layout.setHorizontalGroup(
            place9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place9Layout.setVerticalGroup(
            place9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place8.setBackground(new java.awt.Color(255, 255, 255));
        place8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place8Layout = new javax.swing.GroupLayout(place8);
        place8.setLayout(place8Layout);
        place8Layout.setHorizontalGroup(
            place8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place8Layout.setVerticalGroup(
            place8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place7.setBackground(new java.awt.Color(255, 255, 255));
        place7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place7Layout = new javax.swing.GroupLayout(place7);
        place7.setLayout(place7Layout);
        place7Layout.setHorizontalGroup(
            place7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place7Layout.setVerticalGroup(
            place7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place13.setBackground(new java.awt.Color(255, 255, 255));
        place13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place13Layout = new javax.swing.GroupLayout(place13);
        place13.setLayout(place13Layout);
        place13Layout.setHorizontalGroup(
            place13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place13Layout.setVerticalGroup(
            place13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        greenplace1.setBackground(new java.awt.Color(255, 255, 255));
        greenplace1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        javax.swing.GroupLayout greenplace1Layout = new javax.swing.GroupLayout(greenplace1);
        greenplace1.setLayout(greenplace1Layout);
        greenplace1Layout.setHorizontalGroup(
            greenplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        greenplace1Layout.setVerticalGroup(
            greenplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        greenplace2.setBackground(new java.awt.Color(255, 255, 255));
        greenplace2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        javax.swing.GroupLayout greenplace2Layout = new javax.swing.GroupLayout(greenplace2);
        greenplace2.setLayout(greenplace2Layout);
        greenplace2Layout.setHorizontalGroup(
            greenplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        greenplace2Layout.setVerticalGroup(
            greenplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        greenplace3.setBackground(new java.awt.Color(255, 255, 255));
        greenplace3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        javax.swing.GroupLayout greenplace3Layout = new javax.swing.GroupLayout(greenplace3);
        greenplace3.setLayout(greenplace3Layout);
        greenplace3Layout.setHorizontalGroup(
            greenplace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        greenplace3Layout.setVerticalGroup(
            greenplace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        greenplace4.setBackground(new java.awt.Color(255, 255, 255));
        greenplace4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        javax.swing.GroupLayout greenplace4Layout = new javax.swing.GroupLayout(greenplace4);
        greenplace4.setLayout(greenplace4Layout);
        greenplace4Layout.setHorizontalGroup(
            greenplace4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        greenplace4Layout.setVerticalGroup(
            greenplace4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        greenplace5.setBackground(new java.awt.Color(255, 255, 255));
        greenplace5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        javax.swing.GroupLayout greenplace5Layout = new javax.swing.GroupLayout(greenplace5);
        greenplace5.setLayout(greenplace5Layout);
        greenplace5Layout.setHorizontalGroup(
            greenplace5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        greenplace5Layout.setVerticalGroup(
            greenplace5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place14.setBackground(new java.awt.Color(255, 255, 255));
        place14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place14Layout = new javax.swing.GroupLayout(place14);
        place14.setLayout(place14Layout);
        place14Layout.setHorizontalGroup(
            place14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place14Layout.setVerticalGroup(
            place14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place15.setBackground(new java.awt.Color(255, 255, 255));
        place15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        javax.swing.GroupLayout place15Layout = new javax.swing.GroupLayout(place15);
        place15.setLayout(place15Layout);
        place15Layout.setHorizontalGroup(
            place15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place15Layout.setVerticalGroup(
            place15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place16.setBackground(new java.awt.Color(255, 255, 255));
        place16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place16Layout = new javax.swing.GroupLayout(place16);
        place16.setLayout(place16Layout);
        place16Layout.setHorizontalGroup(
            place16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place16Layout.setVerticalGroup(
            place16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place17.setBackground(new java.awt.Color(255, 255, 255));
        place17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place17Layout = new javax.swing.GroupLayout(place17);
        place17.setLayout(place17Layout);
        place17Layout.setHorizontalGroup(
            place17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place17Layout.setVerticalGroup(
            place17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place18.setBackground(new java.awt.Color(255, 255, 255));
        place18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place18Layout = new javax.swing.GroupLayout(place18);
        place18.setLayout(place18Layout);
        place18Layout.setHorizontalGroup(
            place18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place18Layout.setVerticalGroup(
            place18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place19.setBackground(new java.awt.Color(255, 255, 255));
        place19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place19Layout = new javax.swing.GroupLayout(place19);
        place19.setLayout(place19Layout);
        place19Layout.setHorizontalGroup(
            place19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place19Layout.setVerticalGroup(
            place19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place52.setBackground(new java.awt.Color(255, 255, 255));
        place52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place52Layout = new javax.swing.GroupLayout(place52);
        place52.setLayout(place52Layout);
        place52Layout.setHorizontalGroup(
            place52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        place52Layout.setVerticalGroup(
            place52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        redplace1.setBackground(new java.awt.Color(255, 255, 255));
        redplace1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout redplace1Layout = new javax.swing.GroupLayout(redplace1);
        redplace1.setLayout(redplace1Layout);
        redplace1Layout.setHorizontalGroup(
            redplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        redplace1Layout.setVerticalGroup(
            redplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        redplace2.setBackground(new java.awt.Color(255, 255, 255));
        redplace2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout redplace2Layout = new javax.swing.GroupLayout(redplace2);
        redplace2.setLayout(redplace2Layout);
        redplace2Layout.setHorizontalGroup(
            redplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        redplace2Layout.setVerticalGroup(
            redplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        redplace3.setBackground(new java.awt.Color(255, 255, 255));
        redplace3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout redplace3Layout = new javax.swing.GroupLayout(redplace3);
        redplace3.setLayout(redplace3Layout);
        redplace3Layout.setHorizontalGroup(
            redplace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        redplace3Layout.setVerticalGroup(
            redplace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        redplace4.setBackground(new java.awt.Color(255, 255, 255));
        redplace4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout redplace4Layout = new javax.swing.GroupLayout(redplace4);
        redplace4.setLayout(redplace4Layout);
        redplace4Layout.setHorizontalGroup(
            redplace4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        redplace4Layout.setVerticalGroup(
            redplace4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        redplace5.setBackground(new java.awt.Color(255, 255, 255));
        redplace5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout redplace5Layout = new javax.swing.GroupLayout(redplace5);
        redplace5.setLayout(redplace5Layout);
        redplace5Layout.setHorizontalGroup(
            redplace5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        redplace5Layout.setVerticalGroup(
            redplace5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place51.setBackground(new java.awt.Color(255, 255, 255));
        place51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place51Layout = new javax.swing.GroupLayout(place51);
        place51.setLayout(place51Layout);
        place51Layout.setHorizontalGroup(
            place51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        place51Layout.setVerticalGroup(
            place51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place50.setBackground(new java.awt.Color(255, 255, 255));
        place50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place50Layout = new javax.swing.GroupLayout(place50);
        place50.setLayout(place50Layout);
        place50Layout.setHorizontalGroup(
            place50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place50Layout.setVerticalGroup(
            place50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place49.setBackground(new java.awt.Color(0, 0, 0));
        place49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place49Layout = new javax.swing.GroupLayout(place49);
        place49.setLayout(place49Layout);
        place49Layout.setHorizontalGroup(
            place49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place49Layout.setVerticalGroup(
            place49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place48.setBackground(new java.awt.Color(255, 255, 255));
        place48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place48Layout = new javax.swing.GroupLayout(place48);
        place48.setLayout(place48Layout);
        place48Layout.setHorizontalGroup(
            place48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place48Layout.setVerticalGroup(
            place48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place47.setBackground(new java.awt.Color(255, 255, 255));
        place47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place47Layout = new javax.swing.GroupLayout(place47);
        place47.setLayout(place47Layout);
        place47Layout.setHorizontalGroup(
            place47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place47Layout.setVerticalGroup(
            place47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place46.setBackground(new java.awt.Color(255, 255, 255));
        place46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place46Layout = new javax.swing.GroupLayout(place46);
        place46.setLayout(place46Layout);
        place46Layout.setHorizontalGroup(
            place46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place46Layout.setVerticalGroup(
            place46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel41.setBackground(new java.awt.Color(0, 255, 0));
        jPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel86.setBackground(new java.awt.Color(0, 0, 0));

        jPanel90.setBackground(new java.awt.Color(0, 0, 0));
        jPanel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        greenpionplace2.setBackground(new java.awt.Color(255, 255, 255));
        greenpionplace2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        javax.swing.GroupLayout greenpionplace2Layout = new javax.swing.GroupLayout(greenpionplace2);
        greenpionplace2.setLayout(greenpionplace2Layout);
        greenpionplace2Layout.setHorizontalGroup(
            greenpionplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        greenpionplace2Layout.setVerticalGroup(
            greenpionplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        greenpionplace1.setBackground(new java.awt.Color(255, 255, 255));
        greenpionplace1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        javax.swing.GroupLayout greenpionplace1Layout = new javax.swing.GroupLayout(greenpionplace1);
        greenpionplace1.setLayout(greenpionplace1Layout);
        greenpionplace1Layout.setHorizontalGroup(
            greenpionplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        greenpionplace1Layout.setVerticalGroup(
            greenpionplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("PLAYER 2");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(greenpionplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel86Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel86Layout.createSequentialGroup()
                        .addComponent(greenpionplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel86Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())))
            .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel86Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(greenpionplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(greenpionplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel86Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        place20.setBackground(new java.awt.Color(255, 255, 255));
        place20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place20Layout = new javax.swing.GroupLayout(place20);
        place20.setLayout(place20Layout);
        place20Layout.setHorizontalGroup(
            place20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        place20Layout.setVerticalGroup(
            place20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place27.setBackground(new java.awt.Color(255, 255, 255));
        place27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place27Layout = new javax.swing.GroupLayout(place27);
        place27.setLayout(place27Layout);
        place27Layout.setHorizontalGroup(
            place27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place27Layout.setVerticalGroup(
            place27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place21.setBackground(new java.awt.Color(255, 255, 255));
        place21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place21Layout = new javax.swing.GroupLayout(place21);
        place21.setLayout(place21Layout);
        place21Layout.setHorizontalGroup(
            place21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place21Layout.setVerticalGroup(
            place21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        yellowplace5.setBackground(new java.awt.Color(255, 255, 255));
        yellowplace5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout yellowplace5Layout = new javax.swing.GroupLayout(yellowplace5);
        yellowplace5.setLayout(yellowplace5Layout);
        yellowplace5Layout.setHorizontalGroup(
            yellowplace5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        yellowplace5Layout.setVerticalGroup(
            yellowplace5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place32.setBackground(new java.awt.Color(255, 255, 255));
        place32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place32Layout = new javax.swing.GroupLayout(place32);
        place32.setLayout(place32Layout);
        place32Layout.setHorizontalGroup(
            place32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );
        place32Layout.setVerticalGroup(
            place32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place31.setBackground(new java.awt.Color(255, 255, 255));
        place31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place31Layout = new javax.swing.GroupLayout(place31);
        place31.setLayout(place31Layout);
        place31Layout.setHorizontalGroup(
            place31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place31Layout.setVerticalGroup(
            place31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        yellowplace4.setBackground(new java.awt.Color(255, 255, 255));
        yellowplace4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout yellowplace4Layout = new javax.swing.GroupLayout(yellowplace4);
        yellowplace4.setLayout(yellowplace4Layout);
        yellowplace4Layout.setHorizontalGroup(
            yellowplace4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        yellowplace4Layout.setVerticalGroup(
            yellowplace4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        yellowplace3.setBackground(new java.awt.Color(255, 255, 255));
        yellowplace3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout yellowplace3Layout = new javax.swing.GroupLayout(yellowplace3);
        yellowplace3.setLayout(yellowplace3Layout);
        yellowplace3Layout.setHorizontalGroup(
            yellowplace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        yellowplace3Layout.setVerticalGroup(
            yellowplace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place22.setBackground(new java.awt.Color(255, 255, 255));
        place22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place22Layout = new javax.swing.GroupLayout(place22);
        place22.setLayout(place22Layout);
        place22Layout.setHorizontalGroup(
            place22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place22Layout.setVerticalGroup(
            place22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place23.setBackground(new java.awt.Color(0, 0, 0));
        place23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place23Layout = new javax.swing.GroupLayout(place23);
        place23.setLayout(place23Layout);
        place23Layout.setHorizontalGroup(
            place23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place23Layout.setVerticalGroup(
            place23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        yellowplace2.setBackground(new java.awt.Color(255, 255, 255));
        yellowplace2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout yellowplace2Layout = new javax.swing.GroupLayout(yellowplace2);
        yellowplace2.setLayout(yellowplace2Layout);
        yellowplace2Layout.setHorizontalGroup(
            yellowplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        yellowplace2Layout.setVerticalGroup(
            yellowplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place29.setBackground(new java.awt.Color(255, 255, 255));
        place29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place29Layout = new javax.swing.GroupLayout(place29);
        place29.setLayout(place29Layout);
        place29Layout.setHorizontalGroup(
            place29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place29Layout.setVerticalGroup(
            place29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place30.setBackground(new java.awt.Color(255, 255, 255));
        place30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place30Layout = new javax.swing.GroupLayout(place30);
        place30.setLayout(place30Layout);
        place30Layout.setHorizontalGroup(
            place30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place30Layout.setVerticalGroup(
            place30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place28.setBackground(new java.awt.Color(255, 255, 255));
        place28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout place28Layout = new javax.swing.GroupLayout(place28);
        place28.setLayout(place28Layout);
        place28Layout.setHorizontalGroup(
            place28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place28Layout.setVerticalGroup(
            place28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        yellowplace1.setBackground(new java.awt.Color(255, 255, 255));
        yellowplace1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout yellowplace1Layout = new javax.swing.GroupLayout(yellowplace1);
        yellowplace1.setLayout(yellowplace1Layout);
        yellowplace1Layout.setHorizontalGroup(
            yellowplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        yellowplace1Layout.setVerticalGroup(
            yellowplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place24.setBackground(new java.awt.Color(255, 255, 255));
        place24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place24Layout = new javax.swing.GroupLayout(place24);
        place24.setLayout(place24Layout);
        place24Layout.setHorizontalGroup(
            place24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place24Layout.setVerticalGroup(
            place24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place25.setBackground(new java.awt.Color(255, 255, 255));
        place25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place25Layout = new javax.swing.GroupLayout(place25);
        place25.setLayout(place25Layout);
        place25Layout.setHorizontalGroup(
            place25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place25Layout.setVerticalGroup(
            place25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place26.setBackground(new java.awt.Color(255, 255, 255));
        place26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place26Layout = new javax.swing.GroupLayout(place26);
        place26.setLayout(place26Layout);
        place26Layout.setHorizontalGroup(
            place26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place26Layout.setVerticalGroup(
            place26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel61.setBackground(new java.awt.Color(0, 0, 255));
        jPanel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel88.setBackground(new java.awt.Color(0, 0, 0));

        jPanel92.setBackground(new java.awt.Color(0, 0, 0));
        jPanel92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        bluepionplace1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        javax.swing.GroupLayout bluepionplace1Layout = new javax.swing.GroupLayout(bluepionplace1);
        bluepionplace1.setLayout(bluepionplace1Layout);
        bluepionplace1Layout.setHorizontalGroup(
            bluepionplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        bluepionplace1Layout.setVerticalGroup(
            bluepionplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        bluepionplace2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        javax.swing.GroupLayout bluepionplace2Layout = new javax.swing.GroupLayout(bluepionplace2);
        bluepionplace2.setLayout(bluepionplace2Layout);
        bluepionplace2Layout.setHorizontalGroup(
            bluepionplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        bluepionplace2Layout.setVerticalGroup(
            bluepionplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("PLAYER 4");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel88Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(bluepionplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel88Layout.createSequentialGroup()
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel88Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(bluepionplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel88Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel88Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel88Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(bluepionplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bluepionplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel88Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel62.setBackground(new java.awt.Color(255, 255, 0));
        jPanel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel87.setBackground(new java.awt.Color(0, 0, 0));

        jPanel91.setBackground(new java.awt.Color(0, 0, 0));
        jPanel91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        yellowpionplace2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout yellowpionplace2Layout = new javax.swing.GroupLayout(yellowpionplace2);
        yellowpionplace2.setLayout(yellowpionplace2Layout);
        yellowpionplace2Layout.setHorizontalGroup(
            yellowpionplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        yellowpionplace2Layout.setVerticalGroup(
            yellowpionplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        yellowpionplace1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout yellowpionplace1Layout = new javax.swing.GroupLayout(yellowpionplace1);
        yellowpionplace1.setLayout(yellowpionplace1Layout);
        yellowpionplace1Layout.setHorizontalGroup(
            yellowpionplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        yellowpionplace1Layout.setVerticalGroup(
            yellowpionplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("PLAYER 3");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(yellowpionplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel87Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel87Layout.createSequentialGroup()
                        .addComponent(yellowpionplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel87Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())))
            .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel87Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel87Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(yellowpionplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(yellowpionplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel87Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        place45.setBackground(new java.awt.Color(255, 255, 255));
        place45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place45Layout = new javax.swing.GroupLayout(place45);
        place45.setLayout(place45Layout);
        place45Layout.setHorizontalGroup(
            place45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place45Layout.setVerticalGroup(
            place45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        blueplace5.setBackground(new java.awt.Color(255, 255, 255));
        blueplace5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        javax.swing.GroupLayout blueplace5Layout = new javax.swing.GroupLayout(blueplace5);
        blueplace5.setLayout(blueplace5Layout);
        blueplace5Layout.setHorizontalGroup(
            blueplace5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        blueplace5Layout.setVerticalGroup(
            blueplace5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place33.setBackground(new java.awt.Color(255, 255, 255));
        place33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place33Layout = new javax.swing.GroupLayout(place33);
        place33.setLayout(place33Layout);
        place33Layout.setHorizontalGroup(
            place33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place33Layout.setVerticalGroup(
            place33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place44.setBackground(new java.awt.Color(255, 255, 255));
        place44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place44Layout = new javax.swing.GroupLayout(place44);
        place44.setLayout(place44Layout);
        place44Layout.setHorizontalGroup(
            place44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place44Layout.setVerticalGroup(
            place44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        blueplace4.setBackground(new java.awt.Color(255, 255, 255));
        blueplace4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        javax.swing.GroupLayout blueplace4Layout = new javax.swing.GroupLayout(blueplace4);
        blueplace4.setLayout(blueplace4Layout);
        blueplace4Layout.setHorizontalGroup(
            blueplace4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        blueplace4Layout.setVerticalGroup(
            blueplace4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place34.setBackground(new java.awt.Color(255, 255, 255));
        place34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place34Layout = new javax.swing.GroupLayout(place34);
        place34.setLayout(place34Layout);
        place34Layout.setHorizontalGroup(
            place34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place34Layout.setVerticalGroup(
            place34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place43.setBackground(new java.awt.Color(255, 255, 255));
        place43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place43Layout = new javax.swing.GroupLayout(place43);
        place43.setLayout(place43Layout);
        place43Layout.setHorizontalGroup(
            place43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place43Layout.setVerticalGroup(
            place43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        blueplace3.setBackground(new java.awt.Color(255, 255, 255));
        blueplace3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        javax.swing.GroupLayout blueplace3Layout = new javax.swing.GroupLayout(blueplace3);
        blueplace3.setLayout(blueplace3Layout);
        blueplace3Layout.setHorizontalGroup(
            blueplace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        blueplace3Layout.setVerticalGroup(
            blueplace3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place35.setBackground(new java.awt.Color(255, 255, 255));
        place35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place35Layout = new javax.swing.GroupLayout(place35);
        place35.setLayout(place35Layout);
        place35Layout.setHorizontalGroup(
            place35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place35Layout.setVerticalGroup(
            place35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place42.setBackground(new java.awt.Color(255, 255, 255));
        place42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place42Layout = new javax.swing.GroupLayout(place42);
        place42.setLayout(place42Layout);
        place42Layout.setHorizontalGroup(
            place42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place42Layout.setVerticalGroup(
            place42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        blueplace2.setBackground(new java.awt.Color(255, 255, 255));
        blueplace2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        javax.swing.GroupLayout blueplace2Layout = new javax.swing.GroupLayout(blueplace2);
        blueplace2.setLayout(blueplace2Layout);
        blueplace2Layout.setHorizontalGroup(
            blueplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        blueplace2Layout.setVerticalGroup(
            blueplace2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place36.setBackground(new java.awt.Color(0, 0, 0));
        place36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place36Layout = new javax.swing.GroupLayout(place36);
        place36.setLayout(place36Layout);
        place36Layout.setHorizontalGroup(
            place36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place36Layout.setVerticalGroup(
            place36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place41.setBackground(new java.awt.Color(255, 255, 255));
        place41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        javax.swing.GroupLayout place41Layout = new javax.swing.GroupLayout(place41);
        place41.setLayout(place41Layout);
        place41Layout.setHorizontalGroup(
            place41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place41Layout.setVerticalGroup(
            place41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        blueplace1.setBackground(new java.awt.Color(255, 255, 255));
        blueplace1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        javax.swing.GroupLayout blueplace1Layout = new javax.swing.GroupLayout(blueplace1);
        blueplace1.setLayout(blueplace1Layout);
        blueplace1Layout.setHorizontalGroup(
            blueplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        blueplace1Layout.setVerticalGroup(
            blueplace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place37.setBackground(new java.awt.Color(255, 255, 255));
        place37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place37Layout = new javax.swing.GroupLayout(place37);
        place37.setLayout(place37Layout);
        place37Layout.setHorizontalGroup(
            place37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place37Layout.setVerticalGroup(
            place37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place40.setBackground(new java.awt.Color(255, 255, 255));
        place40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place40Layout = new javax.swing.GroupLayout(place40);
        place40.setLayout(place40Layout);
        place40Layout.setHorizontalGroup(
            place40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place40Layout.setVerticalGroup(
            place40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place39.setBackground(new java.awt.Color(255, 255, 255));
        place39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place39Layout = new javax.swing.GroupLayout(place39);
        place39.setLayout(place39Layout);
        place39Layout.setHorizontalGroup(
            place39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place39Layout.setVerticalGroup(
            place39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        place38.setBackground(new java.awt.Color(255, 255, 255));
        place38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout place38Layout = new javax.swing.GroupLayout(place38);
        place38.setLayout(place38Layout);
        place38Layout.setHorizontalGroup(
            place38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        place38Layout.setVerticalGroup(
            place38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        blueplace6.setBackground(new java.awt.Color(255, 255, 255));
        blueplace6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        javax.swing.GroupLayout blueplace6Layout = new javax.swing.GroupLayout(blueplace6);
        blueplace6.setLayout(blueplace6Layout);
        blueplace6Layout.setHorizontalGroup(
            blueplace6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        blueplace6Layout.setVerticalGroup(
            blueplace6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        greenplace6.setBackground(new java.awt.Color(255, 255, 255));
        greenplace6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        javax.swing.GroupLayout greenplace6Layout = new javax.swing.GroupLayout(greenplace6);
        greenplace6.setLayout(greenplace6Layout);
        greenplace6Layout.setHorizontalGroup(
            greenplace6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        greenplace6Layout.setVerticalGroup(
            greenplace6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        yellowplace6.setBackground(new java.awt.Color(255, 255, 255));
        yellowplace6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout yellowplace6Layout = new javax.swing.GroupLayout(yellowplace6);
        yellowplace6.setLayout(yellowplace6Layout);
        yellowplace6Layout.setHorizontalGroup(
            yellowplace6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        yellowplace6Layout.setVerticalGroup(
            yellowplace6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        redplace6.setBackground(new java.awt.Color(255, 255, 255));
        redplace6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout redplace6Layout = new javax.swing.GroupLayout(redplace6);
        redplace6.setLayout(redplace6Layout);
        redplace6Layout.setHorizontalGroup(
            redplace6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        redplace6Layout.setVerticalGroup(
            redplace6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        mousebutton.setBackground(new java.awt.Color(0, 0, 0));
        mousebutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mousebutton.setForeground(new java.awt.Color(255, 255, 255));
        mousebutton.setText("Acak Dadu");
        mousebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mousebuttonActionPerformed(evt);
            }
        });

        redLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        redLabel.setForeground(new java.awt.Color(255, 0, 0));
        redLabel.setText("NEXT: PLAYER 1");

        greenLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        greenLabel.setForeground(new java.awt.Color(0, 255, 0));
        greenLabel.setText("NEXT: PLAYER 2");

        yellowLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        yellowLabel.setForeground(new java.awt.Color(255, 255, 0));
        yellowLabel.setText("NEXT: PLAYER 3");

        blueLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        blueLabel.setForeground(new java.awt.Color(0, 0, 255));
        blueLabel.setText("NEXT: PLAYER 4");

        diceplace.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        diceplace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        diceplace.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        redMv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        redMv.setForeground(new java.awt.Color(255, 0, 0));
        redMv.setText("PLAYER 1");

        greenMv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        greenMv.setForeground(new java.awt.Color(0, 255, 0));
        greenMv.setText("PLAYER 2");

        yellowMv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        yellowMv.setForeground(new java.awt.Color(255, 255, 0));
        yellowMv.setText("PLAYER 3");

        blueMv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        blueMv.setForeground(new java.awt.Color(0, 0, 255));
        blueMv.setText("PLAYER 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(place1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(place2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(place3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(place4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(place5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(place6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(place52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(redplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(redplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(redplace3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(redplace4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(redplace5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(place51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redLabel)
                            .addComponent(greenLabel)
                            .addComponent(yellowLabel)
                            .addComponent(blueLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(blueplace6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(place45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(blueplace5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(blueplace4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(blueplace3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(blueplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(blueplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(place33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(place34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(place35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(place36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(place37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(place38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(place12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redplace6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(greenplace6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(place13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(greenplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(greenplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(greenplace3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(greenplace4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(greenplace5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(place14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(yellowplace6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(place20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yellowplace5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yellowplace4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yellowplace3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yellowplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yellowplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(place32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(diceplace, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(mousebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redMv)
                            .addComponent(greenMv)
                            .addComponent(yellowMv)
                            .addComponent(blueMv)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(place12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(place8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(place7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(place2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(redplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redplace3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redplace4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(redplace5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(redplace6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(place50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(place46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueplace6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(place14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(place15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(place16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(place17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(place18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(place19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(place21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(place13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(greenplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(greenplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(greenplace3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(greenplace4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(greenplace5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(greenplace6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yellowplace4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yellowplace5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yellowplace3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yellowplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yellowplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(place31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(place27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(yellowplace6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel61, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(place45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(place44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(place43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(place42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(place41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(place40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(blueplace5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(blueplace4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(blueplace3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(blueplace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(blueplace1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(place39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(place33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(place34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(place35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(place36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(place37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(place38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(mousebutton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(diceplace, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(30, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(redMv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(greenMv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yellowMv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(blueMv))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(redLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(greenLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yellowLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(blueLabel)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mousebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mousebuttonActionPerformed
        // TODO add your handling code here:
        resultDice = random.getRandom(1, 6);
        diceplace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dice" + resultDice + ".png")));
  
        if (resultDice != 6) {
            if (current == (currentPlayer.length - 1)) {
                switch (current) {
                    case 0:
                        if (redStart1 == false && redStart2 == false) {
                            if (helpRedNow2 == 0) {
                                helpRedNow2 = resultDice;
                                redNow2 = redTrack[helpRedNow2];
                                place2.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        redSetBg(redNow2);
                                        whiteSetBg("place2");
                                    }
                                });
                            } else {
                                int n1 = (helpRedNow1 + resultDice);
                                int n2 = (helpRedNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = redTrack[helpRedNow1];
                                    helpRedNow1 = (helpRedNow1 + resultDice);
                                    redNow1 = redTrack[helpRedNow1];
                                    redAddList(n, redNow1);
                                    if (helpRedNow1 == 57) {
                                        idxWinRed += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    String n = redTrack[helpRedNow2];
                                    helpRedNow2 = (helpRedNow2 + resultDice);
                                    redNow2 = redTrack[helpRedNow2];
                                    redAddList(n, redNow2);
                                    if (helpRedNow2 == 57) {
                                        idxWinRed += 1;
                                        win();
                                    }
                                }
                            }
                        } else if (redStart1 == false) {
                            if (helpRedNow1 == 0) {
                                helpRedNow1 = resultDice;
                                redNow1 = redTrack[helpRedNow1];
                                place2.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        redSetBg(redNow1);
                                        whiteSetBg("place2");
                                    }
                                });
                            } else {
                                int n1 = (helpRedNow1 + resultDice);
                                int n2 = (helpRedNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = redTrack[helpRedNow1];
                                    helpRedNow1 = (helpRedNow1 + resultDice);
                                    redNow1 = redTrack[helpRedNow1];
                                    redAddList(n, redNow1);
                                    if (helpRedNow1 == 57) {
                                        idxWinRed += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    redpionplace2.setBackground(Color.white);
                                    place2.setBackground(Color.red);
                                    redStart2 = false;
                                }
                            }
                        }
                        break;
                    case 1:
                        if (greenStart1 == false && greenStart2 == false) {
                            if (helpGreenNow2 == 0) {
                                helpGreenNow2 = resultDice;
                                greenNow2 = greenTrack[helpGreenNow2];
                                place15.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        greenSetBg(greenNow2);
                                        whiteSetBg("place15");
                                    }
                                });
                            } else {
                                int n1 = (helpGreenNow1 + resultDice);
                                int n2 = (helpGreenNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = greenTrack[helpGreenNow1];
                                    helpGreenNow1 = (helpGreenNow1 + resultDice);
                                    greenNow1 = greenTrack[helpGreenNow1];
                                    greenAddList(n, greenNow1);
                                    if (helpGreenNow1 == 57) {
                                        idxWinGreen += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    String n = greenTrack[helpGreenNow2];
                                    helpGreenNow2 = (helpGreenNow2 + resultDice);
                                    greenNow2 = greenTrack[helpGreenNow2];
                                    greenAddList(n, greenNow2);
                                    if (helpGreenNow2 == 57) {
                                        idxWinGreen += 1;
                                        win();
                                    }
                                }
                            }
                        } else if (greenStart1 == false) {
                            if (helpGreenNow1 == 0) {
                                helpGreenNow1 = resultDice;
                                greenNow1 = greenTrack[helpGreenNow1];
                                place15.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        greenSetBg(greenNow1);
                                        whiteSetBg("place15");
                                    }
                                });
                            } else {
                                int n1 = (helpGreenNow1 + resultDice);
                                int n2 = (helpGreenNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = greenTrack[helpGreenNow1];
                                    helpGreenNow1 = (helpGreenNow1 + resultDice);
                                    greenNow1 = greenTrack[helpGreenNow1];
                                    greenAddList(n, greenNow1);
                                    if (helpGreenNow1 == 57) {
                                        idxWinGreen += 1;
                                        win();

                                    }
                                } else if (n2 <= 57) {
                                    greenpionplace2.setBackground(Color.white);
                                    place15.setBackground(Color.green);
                                    greenStart2 = false;
                                }
                            }
                        }
                        break;
                    case 2:
                        if (yellowStart1 == false && yellowStart2 == false) {
                            if (helpYellowNow2 == 0) {
                                helpYellowNow2 = resultDice;
                                yellowNow2 = yellowTrack[helpYellowNow2];
                                place28.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        yellowSetBg(yellowNow2);
                                        whiteSetBg("place28");
                                    }
                                });
                            } else {
                                int n1 = (helpYellowNow1 + resultDice);
                                int n2 = (helpYellowNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = yellowTrack[helpYellowNow1];
                                    helpYellowNow1 = (helpYellowNow1 + resultDice);
                                    yellowNow1 = yellowTrack[helpYellowNow1];
                                    yellowAddList(n, yellowNow1);
                                    if (helpYellowNow1 == 57) {
                                        idxWinYellow += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    String n = yellowTrack[helpYellowNow2];
                                    helpYellowNow2 = (helpYellowNow2 + resultDice);
                                    yellowNow2 = yellowTrack[helpYellowNow2];
                                    yellowAddList(n, yellowNow2);
                                    if (helpYellowNow2 == 57) {
                                        idxWinYellow += 1;
                                        win();
                                    }
                                }
                            }
                        } else if (yellowStart1 == false) {
                            if (helpYellowNow1 == 0) {
                                helpYellowNow1 = resultDice;
                                yellowNow1 = yellowTrack[helpYellowNow1];
                                place28.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        yellowSetBg(yellowNow1);
                                        whiteSetBg("place28");
                                    }
                                });
                            } else {
                                int n1 = (helpYellowNow1 + resultDice);
                                int n2 = (helpYellowNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = yellowTrack[helpYellowNow1];
                                    helpYellowNow1 = (helpYellowNow1 + resultDice);
                                    yellowNow1 = yellowTrack[helpYellowNow1];
                                    yellowAddList(n, yellowNow1);
                                    if (helpYellowNow1 == 57) {
                                        idxWinYellow += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    yellowpionplace2.setBackground(Color.white);
                                    place28.setBackground(Color.yellow);
                                    yellowStart2 = false;
                                }
                            }
                        }
                        break;
                    case 3:
                        if (blueStart1 == false && blueStart2 == false) {
                            if (helpBlueNow2 == 0) {
                                helpBlueNow2 = resultDice;
                                blueNow2 = blueTrack[helpBlueNow2];
                                place41.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        blueSetBg(blueNow2);
                                        whiteSetBg("place41");
                                    }
                                });
                            } else {
                                int n1 = (helpBlueNow1 + resultDice);
                                int n2 = (helpBlueNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = blueTrack[helpBlueNow1];
                                    helpBlueNow1 = (helpBlueNow1 + resultDice);
                                    blueNow1 = blueTrack[helpBlueNow1];
                                    blueAddList(n, blueNow1);
                                    if (helpBlueNow1 == 57) {
                                        idxWinBlue += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    String n = blueTrack[helpBlueNow2];
                                    helpBlueNow2 = (helpBlueNow2 + resultDice);
                                    blueNow2 = blueTrack[helpBlueNow2];
                                    blueAddList(n, blueNow2);
                                    if (helpBlueNow2 == 57) {
                                        idxWinBlue += 1;
                                        win();
                                    }
                                }
                            }
                        } else if (blueStart1 == false) {
                            if (helpBlueNow1 == 0) {
                                helpBlueNow1 = resultDice;
                                blueNow1 = blueTrack[helpBlueNow1];
                                place41.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        blueSetBg(blueNow1);
                                        whiteSetBg("place41");
                                    }
                                });
                            } else {
                                int n1 = (helpBlueNow1 + resultDice);
                                int n2 = (helpBlueNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = blueTrack[helpBlueNow1];
                                    helpBlueNow1 = (helpBlueNow1 + resultDice);
                                    blueNow1 = blueTrack[helpBlueNow1];
                                    blueAddList(n, blueNow1);
                                    if (helpBlueNow1 == 57) {
                                        idxWinBlue += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    bluepionplace2.setBackground(Color.white);
                                    place41.setBackground(Color.blue);
                                    blueStart2 = false;
                                }
                            }
                        }
                        break;
                }

                current = 0;
            } else {
                switch (current) {
                    case 0:
                        if (redStart1 == false && redStart2 == false) {
                            if (helpRedNow2 == 0) {
                                helpRedNow2 = resultDice;
                                redNow2 = redTrack[helpRedNow2];
                                place2.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        redSetBg(redNow2);
                                        whiteSetBg("place2");
                                    }
                                });
                            } else {
                                int n1 = (helpRedNow1 + resultDice);
                                int n2 = (helpRedNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = redTrack[helpRedNow1];
                                    helpRedNow1 = (helpRedNow1 + resultDice);
                                    redNow1 = redTrack[helpRedNow1];
                                    redAddList(n, redNow1);
                                    if (helpRedNow1 == 57) {
                                        idxWinRed += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    String n = redTrack[helpRedNow2];
                                    helpRedNow2 = (helpRedNow2 + resultDice);
                                    redNow2 = redTrack[helpRedNow2];
                                    redAddList(n, redNow2);
                                    if (helpRedNow2 == 57) {
                                        idxWinRed += 1;
                                        win();
                                    }
                                }
                            }
                        } else if (redStart1 == false) {
                            if (helpRedNow1 == 0) {
                                helpRedNow1 = resultDice;
                                redNow1 = redTrack[helpRedNow1];
                                place2.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        redSetBg(redNow1);
                                        whiteSetBg("place2");
                                    }
                                });
                            } else {
                                int n1 = (helpRedNow1 + resultDice);
                                int n2 = (helpRedNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = redTrack[helpRedNow1];
                                    helpRedNow1 = (helpRedNow1 + resultDice);
                                    redNow1 = redTrack[helpRedNow1];
                                    redAddList(n, redNow1);
                                    if (helpRedNow1 == 57) {
                                        idxWinRed += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    redpionplace2.setBackground(Color.white);
                                    place2.setBackground(Color.red);
                                    redStart2 = false;
                                }
                            }
                        }
                        break;
                    case 1:
                        if (greenStart1 == false && greenStart2 == false) {
                            if (helpGreenNow2 == 0) {
                                helpGreenNow2 = resultDice;
                                greenNow2 = greenTrack[helpGreenNow2];
                                place15.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        greenSetBg(greenNow2);
                                        whiteSetBg("place15");
                                    }
                                });
                            } else {
                                int n1 = (helpGreenNow1 + resultDice);
                                int n2 = (helpGreenNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = greenTrack[helpGreenNow1];
                                    helpGreenNow1 = (helpGreenNow1 + resultDice);
                                    greenNow1 = greenTrack[helpGreenNow1];
                                    greenAddList(n, greenNow1);
                                    if (helpGreenNow1 == 57) {
                                        idxWinGreen += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    String n = greenTrack[helpGreenNow2];
                                    helpGreenNow2 = (helpGreenNow2 + resultDice);
                                    greenNow2 = greenTrack[helpGreenNow2];
                                    greenAddList(n, greenNow2);
                                    if (helpGreenNow2 == 57) {
                                        idxWinGreen += 1;
                                        win();
                                    }
                                }
                            }
                        } else if (greenStart1 == false) {
                            if (helpGreenNow1 == 0) {
                                helpGreenNow1 = resultDice;
                                greenNow1 = greenTrack[helpGreenNow1];
                                place15.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        greenSetBg(greenNow1);
                                        whiteSetBg("place15");
                                    }
                                });
                            } else {
                                int n1 = (helpGreenNow1 + resultDice);
                                int n2 = (helpGreenNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = greenTrack[helpGreenNow1];
                                    helpGreenNow1 = (helpGreenNow1 + resultDice);
                                    greenNow1 = greenTrack[helpGreenNow1];
                                    greenAddList(n, greenNow1);
                                    if (helpGreenNow1 == 57) {
                                        idxWinGreen += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    greenpionplace2.setBackground(Color.white);
                                    place15.setBackground(Color.green);
                                    greenStart2 = false;
                                }
                            }
                        }
                        break;
                    case 2:
                        if (yellowStart1 == false && yellowStart2 == false) {
                            if (helpYellowNow2 == 0) {
                                helpYellowNow2 = resultDice;
                                yellowNow2 = yellowTrack[helpYellowNow2];
                                place28.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        yellowSetBg(yellowNow2);
                                        whiteSetBg("place28");
                                    }
                                });
                            } else {
                                int n1 = (helpYellowNow1 + resultDice);
                                int n2 = (helpYellowNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = yellowTrack[helpYellowNow1];
                                    helpYellowNow1 = (helpYellowNow1 + resultDice);
                                    yellowNow1 = yellowTrack[helpYellowNow1];
                                    yellowAddList(n, yellowNow1);
                                    if (helpYellowNow1 == 57) {
                                        idxWinYellow += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    String n = yellowTrack[helpYellowNow2];
                                    helpYellowNow2 = (helpYellowNow2 + resultDice);
                                    yellowNow2 = yellowTrack[helpYellowNow2];
                                    yellowAddList(n, yellowNow2);
                                    if (helpYellowNow2 == 57) {
                                        idxWinYellow += 1;
                                        win();
                                    }
                                }
                            }
                        } else if (yellowStart1 == false) {
                            if (helpYellowNow1 == 0) {
                                helpYellowNow1 = resultDice;
                                yellowNow1 = yellowTrack[helpYellowNow1];
                                place28.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        yellowSetBg(yellowNow1);
                                        whiteSetBg("place28");
                                    }
                                });
                            } else {
                                int n1 = (helpYellowNow1 + resultDice);
                                int n2 = (helpYellowNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = yellowTrack[helpYellowNow1];
                                    helpYellowNow1 = (helpYellowNow1 + resultDice);
                                    yellowNow1 = yellowTrack[helpYellowNow1];
                                    yellowAddList(n, yellowNow1);
                                    if (helpYellowNow1 == 57) {
                                        idxWinYellow += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    yellowpionplace2.setBackground(Color.white);
                                    place28.setBackground(Color.yellow);
                                    yellowStart2 = false;
                                }
                            }
                        }
                        break;
                    case 3:
                        if (blueStart1 == false && blueStart2 == false) {
                            if (helpBlueNow2 == 0) {
                                helpBlueNow2 = resultDice;
                                blueNow2 = blueTrack[helpBlueNow2];
                                place41.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        blueSetBg(blueNow2);
                                        whiteSetBg("place41");
                                    }
                                });
                            } else {
                                int n1 = (helpBlueNow1 + resultDice);
                                int n2 = (helpBlueNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = blueTrack[helpBlueNow1];
                                    helpBlueNow1 = (helpBlueNow1 + resultDice);
                                    blueNow1 = blueTrack[helpBlueNow1];
                                    blueAddList(n, blueNow1);
                                    if (helpBlueNow1 == 57) {
                                        idxWinBlue += 1;
                                    }
                                } else if (n2 <= 57) {
                                    String n = blueTrack[helpBlueNow2];
                                    helpBlueNow2 = (helpBlueNow2 + resultDice);
                                    blueNow2 = blueTrack[helpBlueNow2];
                                    blueAddList(n, blueNow2);
                                    if (helpBlueNow2 == 57) {
                                        idxWinBlue += 1;
                                        win();
                                    }
                                }
                            }
                        } else if (blueStart1 == false) {
                            if (helpBlueNow1 == 0) {
                                helpBlueNow1 = resultDice;
                                blueNow1 = blueTrack[helpBlueNow1];
                                place41.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        blueSetBg(blueNow1);
                                        whiteSetBg("place41");
                                    }
                                });
                            } else {
                                int n1 = (helpBlueNow1 + resultDice);
                                int n2 = (helpBlueNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = blueTrack[helpBlueNow1];
                                    helpBlueNow1 = (helpBlueNow1 + resultDice);
                                    blueNow1 = blueTrack[helpBlueNow1];
                                    blueAddList(n, blueNow1);
                                    if (helpBlueNow1 == 57) {
                                        idxWinBlue += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    bluepionplace2.setBackground(Color.white);
                                    place41.setBackground(Color.blue);
                                    blueStart2 = false;
                                }
                            }
                        }
                        break;
                }

                current += 1;
            }
        } else {
            current = current;

            switch (current) {
                case 0:
                    if (redStart1 == true) {
                        redpionplace1.setBackground(Color.white);
                        //place2.setBorder(BorderFactory.createLineBorder(Color.red));
                        place2.setBackground(Color.red);
                        redStart1 = false;
//                    } else if(redStart2==true){
//                        redpionplace2.setBackground(Color.white);
//                        //place2.setBorder(BorderFactory.createLineBorder(Color.red));
//                        place2.setBackground(Color.red);
//                        redStart2 = false;
                    } else {
                        if (redStart1 == false && redStart2 == false) {
                            if (helpRedNow2 == 0) {
                                helpRedNow2 = resultDice;
                                redNow2 = redTrack[helpRedNow2];
                                place2.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        redSetBg(redNow2);
                                        whiteSetBg("place2");
                                    }
                                });
                            } else {
                                int n1 = (helpRedNow1 + resultDice);
                                int n2 = (helpRedNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = redTrack[helpRedNow1];
                                    helpRedNow1 = (helpRedNow1 + resultDice);
                                    redNow1 = redTrack[helpRedNow1];
                                    redAddList(n, redNow1);
                                    if (helpRedNow1 == 57) {
                                        idxWinRed += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    String n = redTrack[helpRedNow2];
                                    helpRedNow2 = (helpRedNow2 + resultDice);
                                    redNow2 = redTrack[helpRedNow2];
                                    redAddList(n, redNow2);
                                    if (helpRedNow2 == 57) {
                                        idxWinRed += 1;
                                        win();
                                    }
                                }
                            }
                        } else if (redStart1 == false) {
                            if (helpRedNow1 == 0) {
                                helpRedNow1 = resultDice;
                                redNow1 = redTrack[helpRedNow1];
                                place2.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        redSetBg(redNow1);
                                        whiteSetBg("place2");
                                    }
                                });
                            } else {
                                int n1 = (helpRedNow1 + resultDice);
                                int n2 = (helpRedNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = redTrack[helpRedNow1];
                                    helpRedNow1 = (helpRedNow1 + resultDice);
                                    redNow1 = redTrack[helpRedNow1];
                                    redAddList(n, redNow1);
                                    if (helpRedNow1 == 57) {
                                        idxWinRed += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    redpionplace2.setBackground(Color.white);
                                    place2.setBackground(Color.red);
                                    redStart2 = false;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (greenStart1 == true) {
                        greenpionplace1.setBackground(Color.white);
                        //place15.setBorder(BorderFactory.createLineBorder(Color.green));
                        place15.setBackground(Color.green);
                        greenStart1 = false;
//                    } else if(greenStart2==true){
//                        greenpionplace2.setBackground(Color.white);
//                        //place15.setBorder(BorderFactory.createLineBorder(Color.green));
//                        place15.setBackground(Color.green);
//                        greenStart2 = false;
                    } else {
                        if (greenStart1 == false && greenStart2 == false) {
                            if (helpGreenNow2 == 0) {
                                helpGreenNow2 = resultDice;
                                greenNow2 = greenTrack[helpGreenNow2];
                                place15.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        greenSetBg(greenNow2);
                                        whiteSetBg("place15");
                                    }
                                });
                            } else {
                                int n1 = (helpGreenNow1 + resultDice);
                                int n2 = (helpGreenNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = greenTrack[helpGreenNow1];
                                    helpGreenNow1 = (helpGreenNow1 + resultDice);
                                    greenNow1 = greenTrack[helpGreenNow1];
                                    greenAddList(n, greenNow1);
                                    if (helpGreenNow1 == 57) {
                                        idxWinGreen += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    String n = greenTrack[helpGreenNow2];
                                    helpGreenNow2 = (helpGreenNow2 + resultDice);
                                    greenNow2 = greenTrack[helpGreenNow2];
                                    greenAddList(n, greenNow2);
                                    if (helpGreenNow2 == 57) {
                                        idxWinGreen += 1;
                                        win();
                                    }
                                }
                            }
                        } else if (greenStart1 == false) {
                            if (helpGreenNow1 == 0) {
                                helpGreenNow1 = resultDice;
                                greenNow1 = greenTrack[helpGreenNow1];
                                place15.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        greenSetBg(greenNow1);
                                        whiteSetBg("place15");
                                    }
                                });
                            } else {
                                int n1 = (helpGreenNow1 + resultDice);
                                int n2 = (helpGreenNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = greenTrack[helpGreenNow1];
                                    helpGreenNow1 = (helpGreenNow1 + resultDice);
                                    greenNow1 = greenTrack[helpGreenNow1];
                                    greenAddList(n, greenNow1);
                                    if (helpGreenNow1 == 57) {
                                        idxWinGreen += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    greenpionplace2.setBackground(Color.white);
                                    place15.setBackground(Color.green);
                                    greenStart2 = false;
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    if (yellowStart1 == true) {
                        yellowpionplace1.setBackground(Color.white);
                        //place28.setBorder(BorderFactory.createLineBorder(Color.yellow));
                        place28.setBackground(Color.yellow);
                        yellowStart1 = false;
//                    } else if(yellowStart2==true){
//                        yellowpionplace2.setBackground(Color.white);
//                        //place28.setBorder(BorderFactory.createLineBorder(Color.yellow));
//                        place28.setBackground(Color.yellow);
//                        yellowStart2 = false;
                    } else {
                        if (yellowStart1 == false && yellowStart2 == false) {
                            if (helpYellowNow2 == 0) {
                                helpYellowNow2 = resultDice;
                                yellowNow2 = yellowTrack[helpYellowNow2];
                                place28.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        yellowSetBg(yellowNow2);
                                        whiteSetBg("place28");
                                    }
                                });
                            } else {
                                int n1 = (helpYellowNow1 + resultDice);
                                int n2 = (helpYellowNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = yellowTrack[helpYellowNow1];
                                    helpYellowNow1 = (helpYellowNow1 + resultDice);
                                    yellowNow1 = yellowTrack[helpYellowNow1];
                                    yellowAddList(n, yellowNow1);
                                    if (helpYellowNow1 == 57) {
                                        idxWinYellow += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    String n = yellowTrack[helpYellowNow2];
                                    helpYellowNow2 = (helpYellowNow2 + resultDice);
                                    yellowNow2 = yellowTrack[helpYellowNow2];
                                    yellowAddList(n, yellowNow2);
                                    if (helpYellowNow2 == 57) {
                                        idxWinYellow += 1;
                                        win();
                                    }
                                }
                            }
                        } else if (yellowStart1 == false) {
                            if (helpYellowNow1 == 0) {
                                helpYellowNow1 = resultDice;
                                yellowNow1 = yellowTrack[helpYellowNow1];
                                place28.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        yellowSetBg(yellowNow1);
                                        whiteSetBg("place28");
                                    }
                                });
                            } else {
                                int n1 = (helpYellowNow1 + resultDice);
                                int n2 = (helpYellowNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = yellowTrack[helpYellowNow1];
                                    helpYellowNow1 = (helpYellowNow1 + resultDice);
                                    yellowNow1 = yellowTrack[helpYellowNow1];
                                    yellowAddList(n, yellowNow1);
                                    if (helpYellowNow1 == 57) {
                                        idxWinYellow += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    yellowpionplace2.setBackground(Color.white);
                                    place28.setBackground(Color.yellow);
                                    yellowStart2 = false;
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    if (blueStart1 == true) {
                        bluepionplace1.setBackground(Color.white);
                        //place41.setBorder(BorderFactory.createLineBorder(Color.blue));
                        place41.setBackground(Color.blue);
                        blueStart1 = false;
//                    } else if(blueStart2==true){
//                        bluepionplace2.setBackground(Color.white);
//                        //place41.setBorder(BorderFactory.createLineBorder(Color.blue));
//                        place41.setBackground(Color.blue);
//                        blueStart2 = false;
                    } else {
                        if (blueStart1 == false && blueStart2 == false) {
                            if (helpBlueNow2 == 0) {
                                helpBlueNow2 = resultDice;
                                blueNow2 = blueTrack[helpBlueNow2];
                                place41.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        blueSetBg(blueNow2);
                                        whiteSetBg("place41");
                                    }
                                });
                            } else {
                                int n1 = (helpBlueNow1 + resultDice);
                                int n2 = (helpBlueNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = blueTrack[helpBlueNow1];
                                    helpBlueNow1 = (helpBlueNow1 + resultDice);
                                    blueNow1 = blueTrack[helpBlueNow1];
                                    blueAddList(n, blueNow1);
                                    if (helpBlueNow1 == 57) {
                                        idxWinBlue += 1;
                                    }
                                } else if (n2 <= 57) {
                                    String n = blueTrack[helpBlueNow2];
                                    helpBlueNow2 = (helpBlueNow2 + resultDice);
                                    blueNow2 = blueTrack[helpBlueNow2];
                                    blueAddList(n, blueNow2);
                                    if (helpBlueNow2 == 57) {
                                        idxWinBlue += 1;
                                        win();
                                    }
                                }
                            }
                        } else if (blueStart1 == false) {
                            if (helpBlueNow1 == 0) {
                                helpBlueNow1 = resultDice;
                                blueNow1 = blueTrack[helpBlueNow1];
                                place41.addMouseListener(new java.awt.event.MouseAdapter() {
                                    @Override
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        placeMouseClicked(evt);
                                    }

                                    private void placeMouseClicked(MouseEvent evt) {
                                        blueSetBg(blueNow1);
                                        whiteSetBg("place41");
                                    }
                                });
                            } else {
                                int n1 = (helpBlueNow1 + resultDice);
                                int n2 = (helpBlueNow2 + resultDice);
                                if (n1 <= 57) {
                                    String n = blueTrack[helpBlueNow1];
                                    helpBlueNow1 = (helpBlueNow1 + resultDice);
                                    blueNow1 = blueTrack[helpBlueNow1];
                                    blueAddList(n, blueNow1);
                                    if (helpBlueNow1 == 57) {
                                        idxWinBlue += 1;
                                        win();
                                    }
                                } else if (n2 <= 57) {
                                    bluepionplace2.setBackground(Color.white);
                                    place41.setBackground(Color.blue);
                                    blueStart2 = false;
                                }
                            }
                        }
                    }
                    break;
            }
        }

        System.out.println(currentPlayer[current]);

        switch (current) {
            case 0:
                redLabel.setVisible(true);
                greenLabel.setVisible(false);
                yellowLabel.setVisible(false);
                blueLabel.setVisible(false);

                if (resultDice == 6) {
                    redMv.setVisible(true);
                    greenMv.setVisible(false);
                    yellowMv.setVisible(false);
                    blueMv.setVisible(false);
                } else {
                    redMv.setVisible(false);
                    greenMv.setVisible(false);
                    yellowMv.setVisible(false);
                    blueMv.setVisible(true);
                }

                break;
            case 1:
                redLabel.setVisible(false);
                greenLabel.setVisible(true);
                yellowLabel.setVisible(false);
                blueLabel.setVisible(false);

                if (resultDice == 6) {
                    redMv.setVisible(false);
                    greenMv.setVisible(true);
                    yellowMv.setVisible(false);
                    blueMv.setVisible(false);
                } else {
                    redMv.setVisible(true);
                    greenMv.setVisible(false);
                    yellowMv.setVisible(false);
                    blueMv.setVisible(false);
                }
                break;
            case 2:
                redLabel.setVisible(false);
                greenLabel.setVisible(false);
                yellowLabel.setVisible(true);
                blueLabel.setVisible(false);

                if (resultDice == 6) {
                    redMv.setVisible(false);
                    greenMv.setVisible(false);
                    yellowMv.setVisible(true);
                    blueMv.setVisible(false);
                } else {
                    redMv.setVisible(false);
                    greenMv.setVisible(true);
                    yellowMv.setVisible(false);
                    blueMv.setVisible(false);
                }
                break;
            case 3:
                redLabel.setVisible(false);
                greenLabel.setVisible(false);
                yellowLabel.setVisible(false);
                blueLabel.setVisible(true);

                if (resultDice == 6) {
                    redMv.setVisible(false);
                    greenMv.setVisible(false);
                    yellowMv.setVisible(false);
                    blueMv.setVisible(true);
                } else {
                    redMv.setVisible(false);
                    greenMv.setVisible(false);
                    yellowMv.setVisible(true);
                    blueMv.setVisible(false);
                }
                break;
        }
    }//GEN-LAST:event_mousebuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(layout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LANMenu().setVisible(true);
            }
        });

    }

    public void kickRed(){
        if (redStart1 == false){
            redpionplace1.setBackground(Color.red);
            redStart1 = true;
            helpRedNow1 = 0;
        } else if (redStart2 == false){
            redpionplace2.setBackground(Color.red);
            redStart2 = true;
            helpRedNow2 = 0;
        }
    }
    
    public void kickGreen(){
        if (greenStart1 == false){
            greenpionplace1.setBackground(Color.green);
            greenStart1 = true;
            helpGreenNow1 = 0;
        } else if (greenStart2 == false){
            greenpionplace2.setBackground(Color.green);
            greenStart2 = true;
            helpGreenNow2 = 0;
        }
    }
    
    public void kickYellow(){
        if (yellowStart1 == false){
            yellowpionplace1.setBackground(Color.yellow);
            yellowStart1 = true;
            helpYellowNow1 = 0;
        } else if (yellowStart2 == false){
            yellowpionplace2.setBackground(Color.yellow);
            yellowStart2 = true;
            helpYellowNow2 = 0;
        }
    }
    
    public void kickBlue(){
        if (blueStart1 == false){
            bluepionplace1.setBackground(Color.blue);
            blueStart1 = true;
            helpBlueNow1 = 0;
        } else if (blueStart2 == false){
            bluepionplace2.setBackground(Color.blue);
            blueStart2 = true;
            helpBlueNow2 = 0;
        }
    }
    
    public void redSetBg(String name) {
        switch (name) {
            case "place1":
                if (place1.getBackground() == Color.green) {
                    kickGreen();
                } else if (place1.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place1.getBackground() == Color.blue) {
                    kickBlue();
                }
                place1.setBackground(Color.red);
                break;
            case "place2":
                if (place2.getBackground() == Color.green) {
                    kickGreen();
                } else if (place2.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place2.getBackground() == Color.blue) {
                    kickBlue();
                }
                place2.setBackground(Color.red);
                break;
            case "place3":
                if (place3.getBackground() == Color.green) {
                    kickGreen();
                } else if (place3.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place3.getBackground() == Color.blue) {
                    kickBlue();
                }
                place3.setBackground(Color.red);
                break;
            case "place4":
                if (place4.getBackground() == Color.green) {
                    kickGreen();
                } else if (place4.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place4.getBackground() == Color.blue) {
                    kickBlue();
                }
                place4.setBackground(Color.red);
                break;
            case "place5":
                if (place5.getBackground() == Color.green) {
                    kickGreen();
                } else if (place5.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place5.getBackground() == Color.blue) {
                    kickBlue();
                }
                place5.setBackground(Color.red);
                break;
            case "place6":
                if (place6.getBackground() == Color.green) {
                    kickGreen();
                } else if (place6.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place6.getBackground() == Color.blue) {
                    kickBlue();
                }
                place6.setBackground(Color.red);
                break;
            case "place7":
                if (place7.getBackground() == Color.green) {
                    kickGreen();
                } else if (place7.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place7.getBackground() == Color.blue) {
                    kickBlue();
                }
                place7.setBackground(Color.red);
                break;
            case "place8":
                if (place8.getBackground() == Color.green) {
                    kickGreen();
                } else if (place8.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place8.getBackground() == Color.blue) {
                    kickBlue();
                }
                place8.setBackground(Color.red);
                break;
            case "place9":
                if (place9.getBackground() == Color.green) {
                    kickGreen();
                } else if (place9.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place9.getBackground() == Color.blue) {
                    kickBlue();
                }
                place9.setBackground(Color.red);
                break;
            case "place10":
                if (place10.getBackground() == Color.green) {
                    kickGreen();
                } else if (place10.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place10.getBackground() == Color.blue) {
                    kickBlue();
                }
                place10.setBackground(Color.red);
                break;
            case "place11":
                if (place11.getBackground() == Color.green) {
                    kickGreen();
                } else if (place11.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place11.getBackground() == Color.blue) {
                    kickBlue();
                }
                place11.setBackground(Color.red);
                break;
            case "place12":
                if (place12.getBackground() == Color.green) {
                    kickGreen();
                } else if (place12.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place12.getBackground() == Color.blue) {
                    kickBlue();
                }
                place12.setBackground(Color.red);
                break;
            case "place13":
                if (place13.getBackground() == Color.green) {
                    kickGreen();
                } else if (place13.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place13.getBackground() == Color.blue) {
                    kickBlue();
                }
                place13.setBackground(Color.red);
                break;
            case "place14":
                if (place14.getBackground() == Color.green) {
                    kickGreen();
                } else if (place14.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place14.getBackground() == Color.blue) {
                    kickBlue();
                }
                place14.setBackground(Color.red);
                break;
            case "place15":
                if (place15.getBackground() == Color.green) {
                    kickGreen();
                } else if (place15.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place15.getBackground() == Color.blue) {
                    kickBlue();
                }
                place15.setBackground(Color.red);
                break;
            case "place16":
                if (place16.getBackground() == Color.green) {
                    kickGreen();
                } else if (place16.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place16.getBackground() == Color.blue) {
                    kickBlue();
                }
                place16.setBackground(Color.red);
                break;
            case "place17":
                if (place17.getBackground() == Color.green) {
                    kickGreen();
                } else if (place17.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place17.getBackground() == Color.blue) {
                    kickBlue();
                }
                place17.setBackground(Color.red);
                break;
            case "place18":
                if (place18.getBackground() == Color.green) {
                    kickGreen();
                } else if (place18.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place18.getBackground() == Color.blue) {
                    kickBlue();
                }
                place18.setBackground(Color.red);
                break;
            case "place19":
                if (place19.getBackground() == Color.green) {
                    kickGreen();
                } else if (place19.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place19.getBackground() == Color.blue) {
                    kickBlue();
                }
                place19.setBackground(Color.red);
                break;
            case "place20":
                if (place20.getBackground() == Color.green) {
                    kickGreen();
                } else if (place20.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place20.getBackground() == Color.blue) {
                    kickBlue();
                }
                place20.setBackground(Color.red);
                break;
            case "place21":
                if (place21.getBackground() == Color.green) {
                    kickGreen();
                } else if (place21.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place21.getBackground() == Color.blue) {
                    kickBlue();
                }
                place21.setBackground(Color.red);
                break;
            case "place22":
                if (place22.getBackground() == Color.green) {
                    kickGreen();
                } else if (place22.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place22.getBackground() == Color.blue) {
                    kickBlue();
                }
                place22.setBackground(Color.red);
                break;
            case "place23":
                if (place23.getBackground() == Color.green) {
                    kickGreen();
                } else if (place23.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place23.getBackground() == Color.blue) {
                    kickBlue();
                }
                place23.setBackground(Color.red);
                break;
            case "place24":
                if (place24.getBackground() == Color.green) {
                    kickGreen();
                } else if (place24.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place24.getBackground() == Color.blue) {
                    kickBlue();
                }
                place24.setBackground(Color.red);
                break;
            case "place25":
                if (place25.getBackground() == Color.green) {
                    kickGreen();
                } else if (place25.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place25.getBackground() == Color.blue) {
                    kickBlue();
                }
                place25.setBackground(Color.red);
                break;
            case "place26":
                if (place26.getBackground() == Color.green) {
                    kickGreen();
                } else if (place26.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place26.getBackground() == Color.blue) {
                    kickBlue();
                }
                place26.setBackground(Color.red);
                break;
            case "place27":
                if (place27.getBackground() == Color.green) {
                    kickGreen();
                } else if (place27.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place27.getBackground() == Color.blue) {
                    kickBlue();
                }
                place27.setBackground(Color.red);
                break;
            case "place28":
                if (place28.getBackground() == Color.green) {
                    kickGreen();
                } else if (place28.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place28.getBackground() == Color.blue) {
                    kickBlue();
                }
                place28.setBackground(Color.red);
                break;
            case "place29":
                if (place29.getBackground() == Color.green) {
                    kickGreen();
                } else if (place29.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place29.getBackground() == Color.blue) {
                    kickBlue();
                }
                place29.setBackground(Color.red);
                break;
            case "place30":
                if (place30.getBackground() == Color.green) {
                    kickGreen();
                } else if (place30.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place30.getBackground() == Color.blue) {
                    kickBlue();
                }
                place30.setBackground(Color.red);
                break;
            case "place31":
                if (place31.getBackground() == Color.green) {
                    kickGreen();
                } else if (place31.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place31.getBackground() == Color.blue) {
                    kickBlue();
                }
                place31.setBackground(Color.red);
                break;
            case "place32":
                if (place32.getBackground() == Color.green) {
                    kickGreen();
                } else if (place32.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place32.getBackground() == Color.blue) {
                    kickBlue();
                }
                place32.setBackground(Color.red);
                break;
            case "place33":
                if (place33.getBackground() == Color.green) {
                    kickGreen();
                } else if (place33.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place33.getBackground() == Color.blue) {
                    kickBlue();
                }
                place33.setBackground(Color.red);
                break;
            case "place34":
                if (place34.getBackground() == Color.green) {
                    kickGreen();
                } else if (place34.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place34.getBackground() == Color.blue) {
                    kickBlue();
                }
                place34.setBackground(Color.red);
                break;
            case "place35":
                if (place35.getBackground() == Color.green) {
                    kickGreen();
                } else if (place35.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place35.getBackground() == Color.blue) {
                    kickBlue();
                }
                place35.setBackground(Color.red);
                break;
            case "place36":
                if (place36.getBackground() == Color.green) {
                    kickGreen();
                } else if (place36.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place36.getBackground() == Color.blue) {
                    kickBlue();
                }
                place36.setBackground(Color.red);
                break;
            case "place37":
                if (place37.getBackground() == Color.green) {
                    kickGreen();
                } else if (place37.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place37.getBackground() == Color.blue) {
                    kickBlue();
                }
                place37.setBackground(Color.red);
                break;
            case "place38":
                if (place38.getBackground() == Color.green) {
                    kickGreen();
                } else if (place38.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place38.getBackground() == Color.blue) {
                    kickBlue();
                }
                place38.setBackground(Color.red);
                break;
            case "place39":
                if (place39.getBackground() == Color.green) {
                    kickGreen();
                } else if (place39.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place39.getBackground() == Color.blue) {
                    kickBlue();
                }
                place39.setBackground(Color.red);
                break;
            case "place40":
                if (place40.getBackground() == Color.green) {
                    kickGreen();
                } else if (place40.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place40.getBackground() == Color.blue) {
                    kickBlue();
                }
                place40.setBackground(Color.red);
                break;
            case "place41":
                if (place41.getBackground() == Color.green) {
                    kickGreen();
                } else if (place41.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place41.getBackground() == Color.blue) {
                    kickBlue();
                }
                place41.setBackground(Color.red);
                break;
            case "place42":
                if (place42.getBackground() == Color.green) {
                    kickGreen();
                } else if (place42.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place42.getBackground() == Color.blue) {
                    kickBlue();
                }
                place42.setBackground(Color.red);
                break;
            case "place43":
                if (place43.getBackground() == Color.green) {
                    kickGreen();
                } else if (place43.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place43.getBackground() == Color.blue) {
                    kickBlue();
                }
                place43.setBackground(Color.red);
                break;
            case "place44":
                if (place44.getBackground() == Color.green) {
                    kickGreen();
                } else if (place44.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place44.getBackground() == Color.blue) {
                    kickBlue();
                }
                place44.setBackground(Color.red);
                break;
            case "place45":
                if (place45.getBackground() == Color.green) {
                    kickGreen();
                } else if (place45.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place45.getBackground() == Color.blue) {
                    kickBlue();
                }
                place45.setBackground(Color.red);
                break;
            case "place46":
                if (place46.getBackground() == Color.green) {
                    kickGreen();
                } else if (place46.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place46.getBackground() == Color.blue) {
                    kickBlue();
                }
                place46.setBackground(Color.red);
                break;
            case "place47":
                if (place47.getBackground() == Color.green) {
                    kickGreen();
                } else if (place47.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place47.getBackground() == Color.blue) {
                    kickBlue();
                }
                place47.setBackground(Color.red);
                break;
            case "place48":
                if (place48.getBackground() == Color.green) {
                    kickGreen();
                } else if (place48.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place48.getBackground() == Color.blue) {
                    kickBlue();
                }
                place48.setBackground(Color.red);
                break;
            case "place49":
                if (place49.getBackground() == Color.green) {
                    kickGreen();
                } else if (place49.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place49.getBackground() == Color.blue) {
                    kickBlue();
                }
                place49.setBackground(Color.red);
                break;
            case "place50":
                if (place50.getBackground() == Color.green) {
                    kickGreen();
                } else if (place50.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place50.getBackground() == Color.blue) {
                    kickBlue();
                }
                place50.setBackground(Color.red);
                break;
            case "place51":
                if (place51.getBackground() == Color.green) {
                    kickGreen();
                } else if (place51.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place51.getBackground() == Color.blue) {
                    kickBlue();
                }
                place51.setBackground(Color.red);
                break;
            case "place52":
                if (place52.getBackground() == Color.green) {
                    kickGreen();
                } else if (place52.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place52.getBackground() == Color.blue) {
                    kickBlue();
                }
                place52.setBackground(Color.red);
                break;
            case "redplace1":
                redplace1.setBackground(Color.red);
                break;
            case "redplace2":
                redplace2.setBackground(Color.red);
                break;
            case "redplace3":
                redplace3.setBackground(Color.red);
                break;
            case "redplace4":
                redplace4.setBackground(Color.red);
                break;
            case "redplace5":
                redplace5.setBackground(Color.red);
                break;
            case "redplace6":
                redplace6.setBackground(Color.red);
                break;
        }
    }

    public void greenSetBg(String name) {
        switch (name) {
            case "place1":
                if (place1.getBackground() == Color.red) {
                    kickRed();
                } else if (place1.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place1.getBackground() == Color.blue) {
                    kickBlue();
                }
                place1.setBackground(Color.green);
                break;
            case "place2":
                if (place2.getBackground() == Color.red) {
                    kickRed();
                } else if (place2.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place2.getBackground() == Color.blue) {
                    kickBlue();
                }
                place2.setBackground(Color.green);
                break;
            case "place3":
                if (place3.getBackground() == Color.red) {
                    kickRed();
                } else if (place3.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place3.getBackground() == Color.blue) {
                    kickBlue();
                }
                place3.setBackground(Color.green);
                break;
            case "place4":
                if (place4.getBackground() == Color.red) {
                    kickRed();
                } else if (place4.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place4.getBackground() == Color.blue) {
                    kickBlue();
                }
                place4.setBackground(Color.green);
                break;
            case "place5":
                if (place5.getBackground() == Color.red) {
                    kickRed();
                } else if (place5.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place5.getBackground() == Color.blue) {
                    kickBlue();
                }
                place5.setBackground(Color.green);
                break;
            case "place6":
                if (place6.getBackground() == Color.red) {
                    kickRed();
                } else if (place6.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place6.getBackground() == Color.blue) {
                    kickBlue();
                }
                place6.setBackground(Color.green);
                break;
            case "place7":
                if (place7.getBackground() == Color.red) {
                    kickRed();
                } else if (place7.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place7.getBackground() == Color.blue) {
                    kickBlue();
                }
                place7.setBackground(Color.green);
                break;
            case "place8":
                if (place8.getBackground() == Color.red) {
                    kickRed();
                } else if (place8.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place8.getBackground() == Color.blue) {
                    kickBlue();
                }
                place8.setBackground(Color.green);
                break;
            case "place9":
                if (place9.getBackground() == Color.red) {
                    kickRed();
                } else if (place9.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place9.getBackground() == Color.blue) {
                    kickBlue();
                }
                place9.setBackground(Color.green);
                break;
            case "place10":
                if (place10.getBackground() == Color.red) {
                    kickRed();
                } else if (place10.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place10.getBackground() == Color.blue) {
                    kickBlue();
                }
                place10.setBackground(Color.green);
                break;
            case "place11":
                if (place11.getBackground() == Color.red) {
                    kickRed();
                } else if (place11.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place11.getBackground() == Color.blue) {
                    kickBlue();
                }
                place11.setBackground(Color.green);
                break;
            case "place12":
                if (place12.getBackground() == Color.red) {
                    kickRed();
                } else if (place12.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place12.getBackground() == Color.blue) {
                    kickBlue();
                }
                place12.setBackground(Color.green);
                break;
            case "place13":
                if (place13.getBackground() == Color.red) {
                    kickRed();
                } else if (place13.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place13.getBackground() == Color.blue) {
                    kickBlue();
                }
                place13.setBackground(Color.green);
                break;
            case "place14":
                if (place14.getBackground() == Color.red) {
                    kickRed();
                } else if (place14.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place14.getBackground() == Color.blue) {
                    kickBlue();
                }
                place14.setBackground(Color.green);
                break;
            case "place15":
                if (place15.getBackground() == Color.red) {
                    kickRed();
                } else if (place15.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place15.getBackground() == Color.blue) {
                    kickBlue();
                }
                place15.setBackground(Color.green);
                break;
            case "place16":
                if (place16.getBackground() == Color.red) {
                    kickRed();
                } else if (place16.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place16.getBackground() == Color.blue) {
                    kickBlue();
                }
                place16.setBackground(Color.green);
                break;
            case "place17":
                if (place17.getBackground() == Color.red) {
                    kickRed();
                } else if (place17.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place17.getBackground() == Color.blue) {
                    kickBlue();
                }
                place17.setBackground(Color.green);
                break;
            case "place18":
                if (place18.getBackground() == Color.red) {
                    kickRed();
                } else if (place18.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place18.getBackground() == Color.blue) {
                    kickBlue();
                }
                place18.setBackground(Color.green);
                break;
            case "place19":
                if (place19.getBackground() == Color.red) {
                    kickRed();
                } else if (place19.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place19.getBackground() == Color.blue) {
                    kickBlue();
                }
                place19.setBackground(Color.green);
                break;
            case "place20":
                if (place20.getBackground() == Color.red) {
                    kickRed();
                } else if (place20.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place20.getBackground() == Color.blue) {
                    kickBlue();
                }
                place20.setBackground(Color.green);
                break;
            case "place21":
                if (place21.getBackground() == Color.red) {
                    kickRed();
                } else if (place21.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place21.getBackground() == Color.blue) {
                    kickBlue();
                }
                place21.setBackground(Color.green);
                break;
            case "place22":
                if (place22.getBackground() == Color.red) {
                    kickRed();
                } else if (place22.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place22.getBackground() == Color.blue) {
                    kickBlue();
                }
                place22.setBackground(Color.green);
                break;
            case "place23":
                if (place23.getBackground() == Color.red) {
                    kickRed();
                } else if (place23.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place23.getBackground() == Color.blue) {
                    kickBlue();
                }
                place23.setBackground(Color.green);
                break;
            case "place24":
                if (place24.getBackground() == Color.red) {
                    kickRed();
                } else if (place24.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place24.getBackground() == Color.blue) {
                    kickBlue();
                }
                place24.setBackground(Color.green);
                break;
            case "place25":
                if (place25.getBackground() == Color.red) {
                    kickRed();
                } else if (place25.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place25.getBackground() == Color.blue) {
                    kickBlue();
                }
                place25.setBackground(Color.green);
                break;
            case "place26":
                if (place26.getBackground() == Color.red) {
                    kickRed();
                } else if (place26.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place26.getBackground() == Color.blue) {
                    kickBlue();
                }
                place26.setBackground(Color.green);
                break;
            case "place27":
                if (place27.getBackground() == Color.red) {
                    kickRed();
                } else if (place27.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place27.getBackground() == Color.blue) {
                    kickBlue();
                }
                place27.setBackground(Color.green);
                break;
            case "place28":
                if (place28.getBackground() == Color.red) {
                    kickRed();
                } else if (place28.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place28.getBackground() == Color.blue) {
                    kickBlue();
                }
                place28.setBackground(Color.green);
                break;
            case "place29":
                if (place29.getBackground() == Color.red) {
                    kickRed();
                } else if (place29.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place29.getBackground() == Color.blue) {
                    kickBlue();
                }
                place29.setBackground(Color.green);
                break;
            case "place30":
                if (place30.getBackground() == Color.red) {
                    kickRed();
                } else if (place30.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place30.getBackground() == Color.blue) {
                    kickBlue();
                }
                place30.setBackground(Color.green);
                break;
            case "place31":
                if (place31.getBackground() == Color.red) {
                    kickRed();
                } else if (place31.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place31.getBackground() == Color.blue) {
                    kickBlue();
                }
                place31.setBackground(Color.green);
                break;
            case "place32":
                if (place32.getBackground() == Color.red) {
                    kickRed();
                } else if (place32.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place32.getBackground() == Color.blue) {
                    kickBlue();
                }
                place32.setBackground(Color.green);
                break;
            case "place33":
                if (place33.getBackground() == Color.red) {
                    kickRed();
                } else if (place33.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place33.getBackground() == Color.blue) {
                    kickBlue();
                }
                place33.setBackground(Color.green);
                break;
            case "place34":
                if (place34.getBackground() == Color.red) {
                    kickRed();
                } else if (place34.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place34.getBackground() == Color.blue) {
                    kickBlue();
                }
                place34.setBackground(Color.green);
                break;
            case "place35":
                if (place35.getBackground() == Color.red) {
                    kickRed();
                } else if (place35.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place35.getBackground() == Color.blue) {
                    kickBlue();
                }
                place35.setBackground(Color.green);
                break;
            case "place36":
                if (place36.getBackground() == Color.red) {
                    kickRed();
                } else if (place36.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place36.getBackground() == Color.blue) {
                    kickBlue();
                }
                place36.setBackground(Color.green);
                break;
            case "place37":
                if (place37.getBackground() == Color.red) {
                    kickRed();
                } else if (place37.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place37.getBackground() == Color.blue) {
                    kickBlue();
                }
                place37.setBackground(Color.green);
                break;
            case "place38":
                if (place38.getBackground() == Color.red) {
                    kickRed();
                } else if (place38.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place38.getBackground() == Color.blue) {
                    kickBlue();
                }
                place38.setBackground(Color.green);
                break;
            case "place39":
                if (place39.getBackground() == Color.red) {
                    kickRed();
                } else if (place39.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place39.getBackground() == Color.blue) {
                    kickBlue();
                }
                place39.setBackground(Color.green);
                break;
            case "place40":
                if (place40.getBackground() == Color.red) {
                    kickRed();
                } else if (place40.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place40.getBackground() == Color.blue) {
                    kickBlue();
                }
                place40.setBackground(Color.green);
                break;
            case "place41":
                if (place41.getBackground() == Color.red) {
                    kickRed();
                } else if (place41.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place41.getBackground() == Color.blue) {
                    kickBlue();
                }
                place41.setBackground(Color.green);
                break;
            case "place42":
                if (place42.getBackground() == Color.red) {
                    kickRed();
                } else if (place42.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place42.getBackground() == Color.blue) {
                    kickBlue();
                }
                place42.setBackground(Color.green);
                break;
            case "place43":
                if (place43.getBackground() == Color.red) {
                    kickRed();
                } else if (place43.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place43.getBackground() == Color.blue) {
                    kickBlue();
                }
                place43.setBackground(Color.green);
                break;
            case "place44":
                if (place44.getBackground() == Color.red) {
                    kickRed();
                } else if (place44.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place44.getBackground() == Color.blue) {
                    kickBlue();
                }
                place44.setBackground(Color.green);
                break;
            case "place45":
                if (place45.getBackground() == Color.red) {
                    kickRed();
                } else if (place45.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place45.getBackground() == Color.blue) {
                    kickBlue();
                }
                place45.setBackground(Color.green);
                break;
            case "place46":
                if (place46.getBackground() == Color.red) {
                    kickRed();
                } else if (place46.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place46.getBackground() == Color.blue) {
                    kickBlue();
                }
                place46.setBackground(Color.green);
                break;
            case "place47":
                if (place47.getBackground() == Color.red) {
                    kickRed();
                } else if (place47.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place47.getBackground() == Color.blue) {
                    kickBlue();
                }
                place47.setBackground(Color.green);
                break;
            case "place48":
                if (place48.getBackground() == Color.red) {
                    kickRed();
                } else if (place48.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place48.getBackground() == Color.blue) {
                    kickBlue();
                }
                place48.setBackground(Color.green);
                break;
            case "place49":
                if (place49.getBackground() == Color.red) {
                    kickRed();
                } else if (place49.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place49.getBackground() == Color.blue) {
                    kickBlue();
                }
                place49.setBackground(Color.green);
                break;
            case "place50":
                if (place50.getBackground() == Color.red) {
                    kickRed();
                } else if (place50.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place50.getBackground() == Color.blue) {
                    kickBlue();
                }
                place50.setBackground(Color.green);
                break;
            case "place51":
                if (place51.getBackground() == Color.red) {
                    kickRed();
                } else if (place51.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place51.getBackground() == Color.blue) {
                    kickBlue();
                }
                place51.setBackground(Color.green);
                break;
            case "place52":
                if (place52.getBackground() == Color.red) {
                    kickRed();
                } else if (place52.getBackground() == Color.yellow) {
                    kickYellow();
                } else if (place52.getBackground() == Color.blue) {
                    kickBlue();
                }
                place52.setBackground(Color.green);
                break;
            case "greenplace1":
                greenplace1.setBackground(Color.green);
                break;
            case "greenplace2":
                greenplace2.setBackground(Color.green);
                break;
            case "greenplace3":
                greenplace3.setBackground(Color.green);
                break;
            case "greenplace4":
                greenplace4.setBackground(Color.green);
                break;
            case "greenplace5":
                greenplace5.setBackground(Color.green);
                break;
            case "greenplace6":
                greenplace6.setBackground(Color.green);
                break;
        }
    }

    public void yellowSetBg(String name) {
        switch (name) {
            case "place1":
                if (place1.getBackground() == Color.red) {
                    kickRed();
                } else if (place1.getBackground() == Color.green) {
                    kickGreen();
                } else if (place1.getBackground() == Color.blue) {
                    kickBlue();
                }
                place1.setBackground(Color.yellow);
                break;
            case "place2":
                if (place2.getBackground() == Color.red) {
                    kickRed();
                } else if (place2.getBackground() == Color.green) {
                    kickGreen();
                } else if (place2.getBackground() == Color.blue) {
                    kickBlue();
                }
                place2.setBackground(Color.yellow);
                break;
            case "place3":
                if (place3.getBackground() == Color.red) {
                    kickRed();
                } else if (place3.getBackground() == Color.green) {
                    kickGreen();
                } else if (place3.getBackground() == Color.blue) {
                    kickBlue();
                }
                place3.setBackground(Color.yellow);
                break;
            case "place4":
                if (place4.getBackground() == Color.red) {
                    kickRed();
                } else if (place4.getBackground() == Color.green) {
                    kickGreen();
                } else if (place4.getBackground() == Color.blue) {
                    kickBlue();
                }
                place4.setBackground(Color.yellow);
                break;
            case "place5":
                if (place5.getBackground() == Color.red) {
                    kickRed();
                } else if (place5.getBackground() == Color.green) {
                    kickGreen();
                } else if (place5.getBackground() == Color.blue) {
                    kickBlue();
                }
                place5.setBackground(Color.yellow);
                break;
            case "place6":
                if (place6.getBackground() == Color.red) {
                    kickRed();
                } else if (place6.getBackground() == Color.green) {
                    kickGreen();
                } else if (place6.getBackground() == Color.blue) {
                    kickBlue();
                }
                place6.setBackground(Color.yellow);
                break;
            case "place7":
                if (place7.getBackground() == Color.red) {
                    kickRed();
                } else if (place7.getBackground() == Color.green) {
                    kickGreen();
                } else if (place7.getBackground() == Color.blue) {
                    kickBlue();
                }
                place7.setBackground(Color.yellow);
                break;
            case "place8":
                if (place8.getBackground() == Color.red) {
                    kickRed();
                } else if (place8.getBackground() == Color.green) {
                    kickGreen();
                } else if (place8.getBackground() == Color.blue) {
                    kickBlue();
                }
                place8.setBackground(Color.yellow);
                break;
            case "place9":
                if (place9.getBackground() == Color.red) {
                    kickRed();
                } else if (place9.getBackground() == Color.green) {
                    kickGreen();
                } else if (place9.getBackground() == Color.blue) {
                    kickBlue();
                }
                place9.setBackground(Color.yellow);
                break;
            case "place10":
                if (place10.getBackground() == Color.red) {
                    kickRed();
                } else if (place10.getBackground() == Color.green) {
                    kickGreen();
                } else if (place10.getBackground() == Color.blue) {
                    kickBlue();
                }
                place10.setBackground(Color.yellow);
                break;
            case "place11":
                if (place11.getBackground() == Color.red) {
                    kickRed();
                } else if (place11.getBackground() == Color.green) {
                    kickGreen();
                } else if (place11.getBackground() == Color.blue) {
                    kickBlue();
                }
                place11.setBackground(Color.yellow);
                break;
            case "place12":
                if (place12.getBackground() == Color.red) {
                    kickRed();
                } else if (place12.getBackground() == Color.green) {
                    kickGreen();
                } else if (place12.getBackground() == Color.blue) {
                    kickBlue();
                }
                place12.setBackground(Color.yellow);
                break;
            case "place13":
                if (place13.getBackground() == Color.red) {
                    kickRed();
                } else if (place13.getBackground() == Color.green) {
                    kickGreen();
                } else if (place13.getBackground() == Color.blue) {
                    kickBlue();
                }
                place13.setBackground(Color.yellow);
                break;
            case "place14":
                if (place14.getBackground() == Color.red) {
                    kickRed();
                } else if (place14.getBackground() == Color.green) {
                    kickGreen();
                } else if (place14.getBackground() == Color.blue) {
                    kickBlue();
                }
                place14.setBackground(Color.yellow);
                break;
            case "place15":
                if (place15.getBackground() == Color.red) {
                    kickRed();
                } else if (place15.getBackground() == Color.green) {
                    kickGreen();
                } else if (place15.getBackground() == Color.blue) {
                    kickBlue();
                }
                place15.setBackground(Color.yellow);
                break;
            case "place16":
                if (place16.getBackground() == Color.red) {
                    kickRed();
                } else if (place16.getBackground() == Color.green) {
                    kickGreen();
                } else if (place16.getBackground() == Color.blue) {
                    kickBlue();
                }
                place16.setBackground(Color.yellow);
                break;
            case "place17":
                if (place17.getBackground() == Color.red) {
                    kickRed();
                } else if (place17.getBackground() == Color.green) {
                    kickGreen();
                } else if (place17.getBackground() == Color.blue) {
                    kickBlue();
                }
                place17.setBackground(Color.yellow);
                break;
            case "place18":
                if (place18.getBackground() == Color.red) {
                    kickRed();
                } else if (place18.getBackground() == Color.green) {
                    kickGreen();
                } else if (place18.getBackground() == Color.blue) {
                    kickBlue();
                }
                place18.setBackground(Color.yellow);
                break;
            case "place19":
                if (place19.getBackground() == Color.red) {
                    kickRed();
                } else if (place19.getBackground() == Color.green) {
                    kickGreen();
                } else if (place19.getBackground() == Color.blue) {
                    kickBlue();
                }
                place19.setBackground(Color.yellow);
                break;
            case "place20":
                if (place20.getBackground() == Color.red) {
                    kickRed();
                } else if (place20.getBackground() == Color.green) {
                    kickGreen();
                } else if (place20.getBackground() == Color.blue) {
                    kickBlue();
                }
                place20.setBackground(Color.yellow);
                break;
            case "place21":
                if (place21.getBackground() == Color.red) {
                    kickRed();
                } else if (place21.getBackground() == Color.green) {
                    kickGreen();
                } else if (place21.getBackground() == Color.blue) {
                    kickBlue();
                }
                place21.setBackground(Color.yellow);
                break;
            case "place22":
                if (place22.getBackground() == Color.red) {
                    kickRed();
                } else if (place22.getBackground() == Color.green) {
                    kickGreen();
                } else if (place22.getBackground() == Color.blue) {
                    kickBlue();
                }
                place22.setBackground(Color.yellow);
                break;
            case "place23":
                if (place23.getBackground() == Color.red) {
                    kickRed();
                } else if (place23.getBackground() == Color.green) {
                    kickGreen();
                } else if (place23.getBackground() == Color.blue) {
                    kickBlue();
                }
                place23.setBackground(Color.yellow);
                break;
            case "place24":
                if (place24.getBackground() == Color.red) {
                    kickRed();
                } else if (place24.getBackground() == Color.green) {
                    kickGreen();
                } else if (place24.getBackground() == Color.blue) {
                    kickBlue();
                }
                place24.setBackground(Color.yellow);
                break;
            case "place25":
                if (place25.getBackground() == Color.red) {
                    kickRed();
                } else if (place25.getBackground() == Color.green) {
                    kickGreen();
                } else if (place25.getBackground() == Color.blue) {
                    kickBlue();
                }
                place25.setBackground(Color.yellow);
                break;
            case "place26":
                if (place26.getBackground() == Color.red) {
                    kickRed();
                } else if (place26.getBackground() == Color.green) {
                    kickGreen();
                } else if (place26.getBackground() == Color.blue) {
                    kickBlue();
                }
                place26.setBackground(Color.yellow);
                break;
            case "place27":
                if (place27.getBackground() == Color.red) {
                    kickRed();
                } else if (place27.getBackground() == Color.green) {
                    kickGreen();
                } else if (place27.getBackground() == Color.blue) {
                    kickBlue();
                }
                place27.setBackground(Color.yellow);
                break;
            case "place28":
                if (place28.getBackground() == Color.red) {
                    kickRed();
                } else if (place28.getBackground() == Color.green) {
                    kickGreen();
                } else if (place28.getBackground() == Color.blue) {
                    kickBlue();
                }
                place28.setBackground(Color.yellow);
                break;
            case "place29":
                if (place29.getBackground() == Color.red) {
                    kickRed();
                } else if (place29.getBackground() == Color.green) {
                    kickGreen();
                } else if (place29.getBackground() == Color.blue) {
                    kickBlue();
                }
                place29.setBackground(Color.yellow);
                break;
            case "place30":
                if (place30.getBackground() == Color.red) {
                    kickRed();
                } else if (place30.getBackground() == Color.green) {
                    kickGreen();
                } else if (place30.getBackground() == Color.blue) {
                    kickBlue();
                }
                place30.setBackground(Color.yellow);
                break;
            case "place31":
                if (place31.getBackground() == Color.red) {
                    kickRed();
                } else if (place31.getBackground() == Color.green) {
                    kickGreen();
                } else if (place31.getBackground() == Color.blue) {
                    kickBlue();
                }
                place31.setBackground(Color.yellow);
                break;
            case "place32":
                if (place32.getBackground() == Color.red) {
                    kickRed();
                } else if (place32.getBackground() == Color.green) {
                    kickGreen();
                } else if (place32.getBackground() == Color.blue) {
                    kickBlue();
                }
                place32.setBackground(Color.yellow);
                break;
            case "place33":
                if (place33.getBackground() == Color.red) {
                    kickRed();
                } else if (place33.getBackground() == Color.green) {
                    kickGreen();
                } else if (place33.getBackground() == Color.blue) {
                    kickBlue();
                }
                place33.setBackground(Color.yellow);
                break;
            case "place34":
                if (place34.getBackground() == Color.red) {
                    kickRed();
                } else if (place34.getBackground() == Color.green) {
                    kickGreen();
                } else if (place34.getBackground() == Color.blue) {
                    kickBlue();
                }
                place34.setBackground(Color.yellow);
                break;
            case "place35":
                if (place35.getBackground() == Color.red) {
                    kickRed();
                } else if (place35.getBackground() == Color.green) {
                    kickGreen();
                } else if (place35.getBackground() == Color.blue) {
                    kickBlue();
                }
                place35.setBackground(Color.yellow);
                break;
            case "place36":
                if (place36.getBackground() == Color.red) {
                    kickRed();
                } else if (place36.getBackground() == Color.green) {
                    kickGreen();
                } else if (place36.getBackground() == Color.blue) {
                    kickBlue();
                }
                place36.setBackground(Color.yellow);
                break;
            case "place37":
                if (place37.getBackground() == Color.red) {
                    kickRed();
                } else if (place37.getBackground() == Color.green) {
                    kickGreen();
                } else if (place37.getBackground() == Color.blue) {
                    kickBlue();
                }
                place37.setBackground(Color.yellow);
                break;
            case "place38":
                if (place38.getBackground() == Color.red) {
                    kickRed();
                } else if (place38.getBackground() == Color.green) {
                    kickGreen();
                } else if (place38.getBackground() == Color.blue) {
                    kickBlue();
                }
                place38.setBackground(Color.yellow);
                break;
            case "place39":
                if (place39.getBackground() == Color.red) {
                    kickRed();
                } else if (place39.getBackground() == Color.green) {
                    kickGreen();
                } else if (place39.getBackground() == Color.blue) {
                    kickBlue();
                }
                place39.setBackground(Color.yellow);
                break;
            case "place40":
                if (place40.getBackground() == Color.red) {
                    kickRed();
                } else if (place40.getBackground() == Color.green) {
                    kickGreen();
                } else if (place40.getBackground() == Color.blue) {
                    kickBlue();
                }
                place40.setBackground(Color.yellow);
                break;
            case "place41":
                if (place41.getBackground() == Color.red) {
                    kickRed();
                } else if (place41.getBackground() == Color.green) {
                    kickGreen();
                } else if (place41.getBackground() == Color.blue) {
                    kickBlue();
                }
                place41.setBackground(Color.yellow);
                break;
            case "place42":
                if (place42.getBackground() == Color.red) {
                    kickRed();
                } else if (place42.getBackground() == Color.green) {
                    kickGreen();
                } else if (place42.getBackground() == Color.blue) {
                    kickBlue();
                }
                place42.setBackground(Color.yellow);
                break;
            case "place43":
                if (place43.getBackground() == Color.red) {
                    kickRed();
                } else if (place43.getBackground() == Color.green) {
                    kickGreen();
                } else if (place43.getBackground() == Color.blue) {
                    kickBlue();
                }
                place43.setBackground(Color.yellow);
                break;
            case "place44":
                if (place44.getBackground() == Color.red) {
                    kickRed();
                } else if (place44.getBackground() == Color.green) {
                    kickGreen();
                } else if (place44.getBackground() == Color.blue) {
                    kickBlue();
                }
                place44.setBackground(Color.yellow);
                break;
            case "place45":
                if (place45.getBackground() == Color.red) {
                    kickRed();
                } else if (place45.getBackground() == Color.green) {
                    kickGreen();
                } else if (place45.getBackground() == Color.blue) {
                    kickBlue();
                }
                place45.setBackground(Color.yellow);
                break;
            case "place46":
                if (place46.getBackground() == Color.red) {
                    kickRed();
                } else if (place46.getBackground() == Color.green) {
                    kickGreen();
                } else if (place46.getBackground() == Color.blue) {
                    kickBlue();
                }
                place46.setBackground(Color.yellow);
                break;
            case "place47":
                if (place47.getBackground() == Color.red) {
                    kickRed();
                } else if (place47.getBackground() == Color.green) {
                    kickGreen();
                } else if (place47.getBackground() == Color.blue) {
                    kickBlue();
                }
                place47.setBackground(Color.yellow);
                break;
            case "place48":
                if (place48.getBackground() == Color.red) {
                    kickRed();
                } else if (place48.getBackground() == Color.green) {
                    kickGreen();
                } else if (place48.getBackground() == Color.blue) {
                    kickBlue();
                }
                place48.setBackground(Color.yellow);
                break;
            case "place49":
                if (place49.getBackground() == Color.red) {
                    kickRed();
                } else if (place49.getBackground() == Color.green) {
                    kickGreen();
                } else if (place49.getBackground() == Color.blue) {
                    kickBlue();
                }
                place49.setBackground(Color.yellow);
                break;
            case "place50":
                if (place50.getBackground() == Color.red) {
                    kickRed();
                } else if (place50.getBackground() == Color.green) {
                    kickGreen();
                } else if (place50.getBackground() == Color.blue) {
                    kickBlue();
                }
                place50.setBackground(Color.yellow);
                break;
            case "place51":
                if (place51.getBackground() == Color.red) {
                    kickRed();
                } else if (place51.getBackground() == Color.green) {
                    kickGreen();
                } else if (place51.getBackground() == Color.blue) {
                    kickBlue();
                }
                place51.setBackground(Color.yellow);
                break;
            case "place52":
                if (place52.getBackground() == Color.red) {
                    kickRed();
                } else if (place52.getBackground() == Color.green) {
                    kickGreen();
                } else if (place52.getBackground() == Color.blue) {
                    kickBlue();
                }
                place52.setBackground(Color.yellow);
                break;
            case "yellowplace1":
                yellowplace1.setBackground(Color.yellow);
                break;
            case "yellowplace2":
                yellowplace2.setBackground(Color.yellow);
                break;
            case "yellowplace3":
                yellowplace3.setBackground(Color.yellow);
                break;
            case "yellowplace4":
                yellowplace4.setBackground(Color.yellow);
                break;
            case "yellowplace5":
                yellowplace5.setBackground(Color.yellow);
                break;
            case "yellowplace6":
                yellowplace6.setBackground(Color.yellow);
                break;
        }
    }

    public void blueSetBg(String name) {
        switch (name) {
            case "place1":
                if (place1.getBackground() == Color.red) {
                    kickRed();
                } else if (place1.getBackground() == Color.green) {
                    kickGreen();
                } else if (place1.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place1.setBackground(Color.blue);
                break;
            case "place2":
                if (place2.getBackground() == Color.red) {
                    kickRed();
                } else if (place2.getBackground() == Color.green) {
                    kickGreen();
                } else if (place2.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place2.setBackground(Color.blue);
                break;
            case "place3":
                if (place3.getBackground() == Color.red) {
                    kickRed();
                } else if (place3.getBackground() == Color.green) {
                    kickGreen();
                } else if (place3.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place3.setBackground(Color.blue);
                break;
            case "place4":
                if (place4.getBackground() == Color.red) {
                    kickRed();
                } else if (place4.getBackground() == Color.green) {
                    kickGreen();
                } else if (place4.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place4.setBackground(Color.blue);
                break;
            case "place5":
                if (place5.getBackground() == Color.red) {
                    kickRed();
                } else if (place5.getBackground() == Color.green) {
                    kickGreen();
                } else if (place5.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place5.setBackground(Color.blue);
                break;
            case "place6":
                if (place6.getBackground() == Color.red) {
                    kickRed();
                } else if (place6.getBackground() == Color.green) {
                    kickGreen();
                } else if (place6.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place6.setBackground(Color.blue);
                break;
            case "place7":
                if (place7.getBackground() == Color.red) {
                    kickRed();
                } else if (place7.getBackground() == Color.green) {
                    kickGreen();
                } else if (place7.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place7.setBackground(Color.blue);
                break;
            case "place8":
                if (place8.getBackground() == Color.red) {
                    kickRed();
                } else if (place8.getBackground() == Color.green) {
                    kickGreen();
                } else if (place8.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place8.setBackground(Color.blue);
                break;
            case "place9":
                if (place9.getBackground() == Color.red) {
                    kickRed();
                } else if (place9.getBackground() == Color.green) {
                    kickGreen();
                } else if (place9.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place9.setBackground(Color.blue);
                break;
            case "place10":
                if (place10.getBackground() == Color.red) {
                    kickRed();
                } else if (place10.getBackground() == Color.green) {
                    kickGreen();
                } else if (place10.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place10.setBackground(Color.blue);
                break;
            case "place11":
                if (place11.getBackground() == Color.red) {
                    kickRed();
                } else if (place11.getBackground() == Color.green) {
                    kickGreen();
                } else if (place11.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place11.setBackground(Color.blue);
                break;
            case "place12":
                if (place12.getBackground() == Color.red) {
                    kickRed();
                } else if (place12.getBackground() == Color.green) {
                    kickGreen();
                } else if (place12.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place12.setBackground(Color.blue);
                break;
            case "place13":
                if (place13.getBackground() == Color.red) {
                    kickRed();
                } else if (place13.getBackground() == Color.green) {
                    kickGreen();
                } else if (place13.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place13.setBackground(Color.blue);
                break;
            case "place14":
                if (place14.getBackground() == Color.red) {
                    kickRed();
                } else if (place14.getBackground() == Color.green) {
                    kickGreen();
                } else if (place14.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place14.setBackground(Color.blue);
                break;
            case "place15":
                if (place15.getBackground() == Color.red) {
                    kickRed();
                } else if (place15.getBackground() == Color.green) {
                    kickGreen();
                } else if (place15.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place15.setBackground(Color.blue);
                break;
            case "place16":
                if (place16.getBackground() == Color.red) {
                    kickRed();
                } else if (place16.getBackground() == Color.green) {
                    kickGreen();
                } else if (place16.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place16.setBackground(Color.blue);
                break;
            case "place17":
                if (place17.getBackground() == Color.red) {
                    kickRed();
                } else if (place17.getBackground() == Color.green) {
                    kickGreen();
                } else if (place17.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place17.setBackground(Color.blue);
                break;
            case "place18":
                if (place18.getBackground() == Color.red) {
                    kickRed();
                } else if (place18.getBackground() == Color.green) {
                    kickGreen();
                } else if (place18.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place18.setBackground(Color.blue);
                break;
            case "place19":
                if (place19.getBackground() == Color.red) {
                    kickRed();
                } else if (place19.getBackground() == Color.green) {
                    kickGreen();
                } else if (place19.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place19.setBackground(Color.blue);
                break;
            case "place20":
                if (place20.getBackground() == Color.red) {
                    kickRed();
                } else if (place20.getBackground() == Color.green) {
                    kickGreen();
                } else if (place20.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place20.setBackground(Color.blue);
                break;
            case "place21":
                if (place21.getBackground() == Color.red) {
                    kickRed();
                } else if (place21.getBackground() == Color.green) {
                    kickGreen();
                } else if (place21.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place21.setBackground(Color.blue);
                break;
            case "place22":
                if (place22.getBackground() == Color.red) {
                    kickRed();
                } else if (place22.getBackground() == Color.green) {
                    kickGreen();
                } else if (place22.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place22.setBackground(Color.blue);
                break;
            case "place23":
                if (place23.getBackground() == Color.red) {
                    kickRed();
                } else if (place23.getBackground() == Color.green) {
                    kickGreen();
                } else if (place23.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place23.setBackground(Color.blue);
                break;
            case "place24":
                if (place24.getBackground() == Color.red) {
                    kickRed();
                } else if (place24.getBackground() == Color.green) {
                    kickGreen();
                } else if (place24.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place24.setBackground(Color.blue);
                break;
            case "place25":
                if (place25.getBackground() == Color.red) {
                    kickRed();
                } else if (place25.getBackground() == Color.green) {
                    kickGreen();
                } else if (place25.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place25.setBackground(Color.blue);
                break;
            case "place26":
                if (place26.getBackground() == Color.red) {
                    kickRed();
                } else if (place26.getBackground() == Color.green) {
                    kickGreen();
                } else if (place26.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place26.setBackground(Color.blue);
                break;
            case "place27":
                if (place27.getBackground() == Color.red) {
                    kickRed();
                } else if (place27.getBackground() == Color.green) {
                    kickGreen();
                } else if (place27.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place27.setBackground(Color.blue);
                break;
            case "place28":
                if (place28.getBackground() == Color.red) {
                    kickRed();
                } else if (place28.getBackground() == Color.green) {
                    kickGreen();
                } else if (place28.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place28.setBackground(Color.blue);
                break;
            case "place29":
                if (place29.getBackground() == Color.red) {
                    kickRed();
                } else if (place29.getBackground() == Color.green) {
                    kickGreen();
                } else if (place29.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place29.setBackground(Color.blue);
                break;
            case "place30":
                if (place30.getBackground() == Color.red) {
                    kickRed();
                } else if (place30.getBackground() == Color.green) {
                    kickGreen();
                } else if (place30.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place30.setBackground(Color.blue);
                break;
            case "place31":
                if (place31.getBackground() == Color.red) {
                    kickRed();
                } else if (place31.getBackground() == Color.green) {
                    kickGreen();
                } else if (place31.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place31.setBackground(Color.blue);
                break;
            case "place32":
                if (place32.getBackground() == Color.red) {
                    kickRed();
                } else if (place32.getBackground() == Color.green) {
                    kickGreen();
                } else if (place32.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place32.setBackground(Color.blue);
                break;
            case "place33":
                if (place33.getBackground() == Color.red) {
                    kickRed();
                } else if (place33.getBackground() == Color.green) {
                    kickGreen();
                } else if (place33.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place33.setBackground(Color.blue);
                break;
            case "place34":
                if (place34.getBackground() == Color.red) {
                    kickRed();
                } else if (place34.getBackground() == Color.green) {
                    kickGreen();
                } else if (place34.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place34.setBackground(Color.blue);
                break;
            case "place35":
                if (place35.getBackground() == Color.red) {
                    kickRed();
                } else if (place35.getBackground() == Color.green) {
                    kickGreen();
                } else if (place35.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place35.setBackground(Color.blue);
                break;
            case "place36":
                if (place36.getBackground() == Color.red) {
                    kickRed();
                } else if (place36.getBackground() == Color.green) {
                    kickGreen();
                } else if (place36.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place36.setBackground(Color.blue);
                break;
            case "place37":
                if (place37.getBackground() == Color.red) {
                    kickRed();
                } else if (place37.getBackground() == Color.green) {
                    kickGreen();
                } else if (place37.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place37.setBackground(Color.blue);
                break;
            case "place38":
                if (place38.getBackground() == Color.red) {
                    kickRed();
                } else if (place38.getBackground() == Color.green) {
                    kickGreen();
                } else if (place38.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place38.setBackground(Color.blue);
                break;
            case "place39":
                if (place39.getBackground() == Color.red) {
                    kickRed();
                } else if (place39.getBackground() == Color.green) {
                    kickGreen();
                } else if (place39.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place39.setBackground(Color.blue);
                break;
            case "place40":
                if (place40.getBackground() == Color.red) {
                    kickRed();
                } else if (place40.getBackground() == Color.green) {
                    kickGreen();
                } else if (place40.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place40.setBackground(Color.blue);
                break;
            case "place41":
                if (place41.getBackground() == Color.red) {
                    kickRed();
                } else if (place41.getBackground() == Color.green) {
                    kickGreen();
                } else if (place41.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place41.setBackground(Color.blue);
                break;
            case "place42":
                if (place42.getBackground() == Color.red) {
                    kickRed();
                } else if (place42.getBackground() == Color.green) {
                    kickGreen();
                } else if (place42.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place42.setBackground(Color.blue);
                break;
            case "place43":
                if (place43.getBackground() == Color.red) {
                    kickRed();
                } else if (place43.getBackground() == Color.green) {
                    kickGreen();
                } else if (place43.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place43.setBackground(Color.blue);
                break;
            case "place44":
                if (place44.getBackground() == Color.red) {
                    kickRed();
                } else if (place44.getBackground() == Color.green) {
                    kickGreen();
                } else if (place44.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place44.setBackground(Color.blue);
                break;
            case "place45":
                if (place45.getBackground() == Color.red) {
                    kickRed();
                } else if (place45.getBackground() == Color.green) {
                    kickGreen();
                } else if (place45.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place45.setBackground(Color.blue);
                break;
            case "place46":
                if (place46.getBackground() == Color.red) {
                    kickRed();
                } else if (place46.getBackground() == Color.green) {
                    kickGreen();
                } else if (place46.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place46.setBackground(Color.blue);
                break;
            case "place47":
                if (place47.getBackground() == Color.red) {
                    kickRed();
                } else if (place47.getBackground() == Color.green) {
                    kickGreen();
                } else if (place47.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place47.setBackground(Color.blue);
                break;
            case "place48":
                if (place48.getBackground() == Color.red) {
                    kickRed();
                } else if (place48.getBackground() == Color.green) {
                    kickGreen();
                } else if (place48.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place48.setBackground(Color.blue);
                break;
            case "place49":
                if (place49.getBackground() == Color.red) {
                    kickRed();
                } else if (place49.getBackground() == Color.green) {
                    kickGreen();
                } else if (place49.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place49.setBackground(Color.blue);
                break;
            case "place50":
                if (place50.getBackground() == Color.red) {
                    kickRed();
                } else if (place50.getBackground() == Color.green) {
                    kickGreen();
                } else if (place50.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place50.setBackground(Color.blue);
                break;
            case "place51":
                
                if (place51.getBackground() == Color.red) {
                    kickRed();
                } else if (place51.getBackground() == Color.green) {
                    kickGreen();
                } else if (place51.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place51.setBackground(Color.blue);
                break;
            case "place52":
                if (place52.getBackground() == Color.red) {
                    kickRed();
                } else if (place52.getBackground() == Color.green) {
                    kickGreen();
                } else if (place52.getBackground() == Color.yellow) {
                    kickYellow();
                }
                place52.setBackground(Color.blue);
                break;
            case "blueplace1":
                blueplace1.setBackground(Color.blue);
                break;
            case "blueplace2":
                blueplace2.setBackground(Color.blue);
                break;
            case "blueplace3":
                blueplace3.setBackground(Color.blue);
                break;
            case "blueplace4":
                blueplace4.setBackground(Color.blue);
                break;
            case "blueplace5":
                blueplace5.setBackground(Color.blue);
                break;
            case "blueplace6":
                blueplace6.setBackground(Color.blue);
                break;
        }
    }

    public void whiteSetBg(String name) {
        switch (name) {
            case "place1":
                place1.setBackground(Color.white);
                break;
            case "place2":
                place2.setBackground(Color.white);
                break;
            case "place3":
                place3.setBackground(Color.white);
                break;
            case "place4":
                place4.setBackground(Color.white);
                break;
            case "place5":
                place5.setBackground(Color.white);
                break;
            case "place6":
                place6.setBackground(Color.white);
                break;
            case "place7":
                place7.setBackground(Color.white);
                break;
            case "place8":
                place8.setBackground(Color.white);
                break;
            case "place9":
                place9.setBackground(Color.white);
                break;
            case "place10":
                place10.setBackground(Color.white);
                break;
            case "place11":
                place11.setBackground(Color.white);
                break;
            case "place12":
                place12.setBackground(Color.white);
                break;
            case "place13":
                place13.setBackground(Color.white);
                break;
            case "place14":
                place14.setBackground(Color.white);
                break;
            case "place15":
                place15.setBackground(Color.white);
                break;
            case "place16":
                place16.setBackground(Color.white);
                break;
            case "place17":
                place17.setBackground(Color.white);
                break;
            case "place18":
                place18.setBackground(Color.white);
                break;
            case "place19":
                place19.setBackground(Color.white);
                break;
            case "place20":
                place20.setBackground(Color.white);
                break;
            case "place21":
                place21.setBackground(Color.white);
                break;
            case "place22":
                place22.setBackground(Color.white);
                break;
            case "place23":
                place23.setBackground(Color.white);
                break;
            case "place24":
                place24.setBackground(Color.white);
                break;
            case "place25":
                place25.setBackground(Color.white);
                break;
            case "place26":
                place26.setBackground(Color.white);
                break;
            case "place27":
                place27.setBackground(Color.white);
                break;
            case "place28":
                place28.setBackground(Color.white);
                break;
            case "place29":
                place29.setBackground(Color.white);
                break;
            case "place30":
                place30.setBackground(Color.white);
                break;
            case "place31":
                place31.setBackground(Color.white);
                break;
            case "place32":
                place32.setBackground(Color.white);
                break;
            case "place33":
                place33.setBackground(Color.white);
                break;
            case "place34":
                place34.setBackground(Color.white);
                break;
            case "place35":
                place35.setBackground(Color.white);
                break;
            case "place36":
                place36.setBackground(Color.white);
                break;
            case "place37":
                place37.setBackground(Color.white);
                break;
            case "place38":
                place38.setBackground(Color.white);
                break;
            case "place39":
                place39.setBackground(Color.white);
                break;
            case "place40":
                place40.setBackground(Color.white);
                break;
            case "place41":
                place41.setBackground(Color.white);
                break;
            case "place42":
                place42.setBackground(Color.white);
                break;
            case "place43":
                place43.setBackground(Color.white);
                break;
            case "place44":
                place44.setBackground(Color.white);
                break;
            case "place45":
                place45.setBackground(Color.white);
                break;
            case "place46":
                place46.setBackground(Color.white);
                break;
            case "place47":
                place47.setBackground(Color.white);
                break;
            case "place48":
                place48.setBackground(Color.white);
                break;
            case "place49":
                place49.setBackground(Color.white);
                break;
            case "place50":
                place50.setBackground(Color.white);
                break;
            case "place51":
                place51.setBackground(Color.white);
                break;
            case "place52":
                place52.setBackground(Color.white);
                break;
            case "redplace1":
                redplace1.setBackground(Color.white);
                break;
            case "redplace2":
                redplace2.setBackground(Color.white);
                break;
            case "redplace3":
                redplace3.setBackground(Color.white);
                break;
            case "redplace4":
                redplace4.setBackground(Color.white);
                break;
            case "redplace5":
                redplace5.setBackground(Color.white);
                break;
            case "redplace6":
                redplace6.setBackground(Color.white);
                break;
            case "greenplace1":
                greenplace1.setBackground(Color.white);
                break;
            case "greenplace2":
                greenplace2.setBackground(Color.white);
                break;
            case "greenplace3":
                greenplace3.setBackground(Color.white);
                break;
            case "greenplace4":
                greenplace4.setBackground(Color.white);
                break;
            case "greenplace5":
                greenplace5.setBackground(Color.white);
                break;
            case "greenplace6":
                greenplace6.setBackground(Color.white);
                break;
            case "yellowplace1":
                yellowplace1.setBackground(Color.white);
                break;
            case "yellowplace2":
                yellowplace2.setBackground(Color.white);
                break;
            case "yellowplace3":
                yellowplace3.setBackground(Color.white);
                break;
            case "yellowplace4":
                yellowplace4.setBackground(Color.white);
                break;
            case "yellowplace5":
                yellowplace5.setBackground(Color.white);
                break;
            case "yellowplace6":
                yellowplace6.setBackground(Color.white);
                break;
            case "blueplace1":
                blueplace1.setBackground(Color.white);
                break;
            case "blueplace2":
                blueplace2.setBackground(Color.white);
                break;
            case "blueplace3":
                blueplace3.setBackground(Color.white);
                break;
            case "blueplace4":
                blueplace4.setBackground(Color.white);
                break;
            case "blueplace5":
                blueplace5.setBackground(Color.white);
                break;
            case "blueplace6":
                blueplace6.setBackground(Color.white);
                break;
        }
    }

    public void redAddList(String name1, String name2) {
        switch (name1) {
            case "place1":
                place1.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place2":
                place2.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place3":
                place3.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place4":
                place4.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place5":
                place5.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place6":
                place6.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place7":
                place7.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place8":
                place8.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place9":
                place9.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place10":
                place10.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place11":
                place11.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place12":
                place12.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place13":
                place13.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place14":
                place14.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place15":
                place15.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place16":
                place16.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place17":
                place17.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place18":
                place18.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place19":
                place19.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place20":
                place20.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place21":
                place21.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place22":
                place22.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place23":
                place23.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place24":
                place24.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place25":
                place25.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place26":
                place26.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place27":
                place27.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place28":
                place28.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place29":
                place29.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place30":
                place30.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place31":
                place31.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place32":
                place32.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place33":
                place33.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place34":
                place34.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place35":
                place35.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place36":
                place36.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place37":
                place37.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place38":
                place38.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place39":
                place39.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place40":
                place40.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place41":
                place41.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place42":
                place42.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place43":
                place43.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place44":
                place44.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place45":
                place45.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place46":
                place46.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place47":
                place47.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place48":
                place48.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place49":
                place49.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place50":
                place50.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place51":
                place51.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place52":
                place52.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "redplace1":
                redplace1.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "redplace2":
                redplace2.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "redplace3":
                redplace3.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "redplace4":
                redplace4.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "redplace5":
                redplace5.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "redplace6":
                redplace6.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        redSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
        }
    }

    public void greenAddList(String name1, String name2) {
        switch (name1) {
            case "place1":
                place1.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place2":
                place2.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place3":
                place3.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place4":
                place4.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place5":
                place5.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place6":
                place6.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place7":
                place7.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place8":
                place8.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place9":
                place9.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place10":
                place10.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place11":
                place11.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place12":
                place12.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place13":
                place13.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place14":
                place14.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place15":
                place15.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place16":
                place16.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place17":
                place17.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place18":
                place18.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place19":
                place19.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place20":
                place20.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place21":
                place21.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place22":
                place22.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place23":
                place23.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place24":
                place24.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place25":
                place25.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place26":
                place26.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place27":
                place27.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place28":
                place28.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place29":
                place29.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place30":
                place30.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place31":
                place31.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place32":
                place32.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place33":
                place33.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place34":
                place34.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place35":
                place35.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place36":
                place36.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place37":
                place37.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place38":
                place38.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place39":
                place39.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place40":
                place40.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place41":
                place41.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place42":
                place42.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place43":
                place43.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place44":
                place44.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place45":
                place45.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place46":
                place46.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place47":
                place47.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place48":
                place48.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place49":
                place49.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place50":
                place50.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place51":
                place51.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place52":
                place52.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "greenplace1":
                greenplace1.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "greenplace2":
                greenplace2.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "greenplace3":
                greenplace3.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "greenplace4":
                greenplace4.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "greenplace5":
                greenplace5.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "greenplace6":
                greenplace6.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        greenSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
        }
    }

    public void yellowAddList(String name1, String name2) {
        switch (name1) {
            case "place1":
                place1.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place2":
                place2.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place3":
                place3.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place4":
                place4.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place5":
                place5.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place6":
                place6.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place7":
                place7.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place8":
                place8.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place9":
                place9.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place10":
                place10.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place11":
                place11.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place12":
                place12.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place13":
                place13.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place14":
                place14.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place15":
                place15.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place16":
                place16.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place17":
                place17.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place18":
                place18.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place19":
                place19.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place20":
                place20.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place21":
                place21.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place22":
                place22.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place23":
                place23.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place24":
                place24.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place25":
                place25.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place26":
                place26.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place27":
                place27.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place28":
                place28.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place29":
                place29.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place30":
                place30.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place31":
                place31.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place32":
                place32.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place33":
                place33.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place34":
                place34.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place35":
                place35.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place36":
                place36.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place37":
                place37.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place38":
                place38.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place39":
                place39.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place40":
                place40.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place41":
                place41.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place42":
                place42.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place43":
                place43.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place44":
                place44.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place45":
                place45.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place46":
                place46.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place47":
                place47.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place48":
                place48.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place49":
                place49.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place50":
                place50.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place51":
                place51.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place52":
                place52.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "yellowplace1":
                yellowplace1.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "yellowplace2":
                yellowplace2.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "yellowplace3":
                yellowplace3.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "yellowplace4":
                yellowplace4.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "yellowplace5":
                yellowplace5.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "yellowplace6":
                yellowplace6.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        yellowSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
        }
    }

    public void blueAddList(String name1, String name2) {
        switch (name1) {
            case "place1":
                place1.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place2":
                place2.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place3":
                place3.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place4":
                place4.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place5":
                place5.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place6":
                place6.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place7":
                place7.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place8":
                place8.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place9":
                place9.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place10":
                place10.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place11":
                place11.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place12":
                place12.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place13":
                place13.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place14":
                place14.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place15":
                place15.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place16":
                place16.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place17":
                place17.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place18":
                place18.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place19":
                place19.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place20":
                place20.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place21":
                place21.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place22":
                place22.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place23":
                place23.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place24":
                place24.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place25":
                place25.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place26":
                place26.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place27":
                place27.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place28":
                place28.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place29":
                place29.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place30":
                place30.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place31":
                place31.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place32":
                place32.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place33":
                place33.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place34":
                place34.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place35":
                place35.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place36":
                place36.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place37":
                place37.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place38":
                place38.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place39":
                place39.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place40":
                place40.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place41":
                place41.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place42":
                place42.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place43":
                place43.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place44":
                place44.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place45":
                place45.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place46":
                place46.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place47":
                place47.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place48":
                place48.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place49":
                place49.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place50":
                place50.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place51":
                place51.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "place52":
                place52.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "blueplace1":
                blueplace1.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "blueplace2":
                blueplace2.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "blueplace3":
                blueplace3.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "blueplace4":
                blueplace4.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "blueplace5":
                blueplace5.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
            case "blueplace6":
                blueplace6.addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        placeMouseClicked(evt);
                    }

                    private void placeMouseClicked(MouseEvent evt) {
                        blueSetBg(name2);
                        whiteSetBg(name1);
                    }
                });
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blueLabel;
    private javax.swing.JLabel blueMv;
    private javax.swing.JPanel bluepionplace1;
    private javax.swing.JPanel bluepionplace2;
    private javax.swing.JPanel blueplace1;
    private javax.swing.JPanel blueplace2;
    private javax.swing.JPanel blueplace3;
    private javax.swing.JPanel blueplace4;
    private javax.swing.JPanel blueplace5;
    private javax.swing.JPanel blueplace6;
    private javax.swing.JLabel diceplace;
    private javax.swing.JLabel greenLabel;
    private javax.swing.JLabel greenMv;
    private javax.swing.JPanel greenpionplace1;
    private javax.swing.JPanel greenpionplace2;
    private javax.swing.JPanel greenplace1;
    private javax.swing.JPanel greenplace2;
    private javax.swing.JPanel greenplace3;
    private javax.swing.JPanel greenplace4;
    private javax.swing.JPanel greenplace5;
    private javax.swing.JPanel greenplace6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JButton mousebutton;
    private javax.swing.JPanel place1;
    private javax.swing.JPanel place10;
    private javax.swing.JPanel place11;
    private javax.swing.JPanel place12;
    private javax.swing.JPanel place13;
    private javax.swing.JPanel place14;
    private javax.swing.JPanel place15;
    private javax.swing.JPanel place16;
    private javax.swing.JPanel place17;
    private javax.swing.JPanel place18;
    private javax.swing.JPanel place19;
    private javax.swing.JPanel place2;
    private javax.swing.JPanel place20;
    private javax.swing.JPanel place21;
    private javax.swing.JPanel place22;
    private javax.swing.JPanel place23;
    private javax.swing.JPanel place24;
    private javax.swing.JPanel place25;
    private javax.swing.JPanel place26;
    private javax.swing.JPanel place27;
    private javax.swing.JPanel place28;
    private javax.swing.JPanel place29;
    private javax.swing.JPanel place3;
    private javax.swing.JPanel place30;
    private javax.swing.JPanel place31;
    private javax.swing.JPanel place32;
    private javax.swing.JPanel place33;
    private javax.swing.JPanel place34;
    private javax.swing.JPanel place35;
    private javax.swing.JPanel place36;
    private javax.swing.JPanel place37;
    private javax.swing.JPanel place38;
    private javax.swing.JPanel place39;
    private javax.swing.JPanel place4;
    private javax.swing.JPanel place40;
    private javax.swing.JPanel place41;
    private javax.swing.JPanel place42;
    private javax.swing.JPanel place43;
    private javax.swing.JPanel place44;
    private javax.swing.JPanel place45;
    private javax.swing.JPanel place46;
    private javax.swing.JPanel place47;
    private javax.swing.JPanel place48;
    private javax.swing.JPanel place49;
    private javax.swing.JPanel place5;
    private javax.swing.JPanel place50;
    private javax.swing.JPanel place51;
    private javax.swing.JPanel place52;
    private javax.swing.JPanel place6;
    private javax.swing.JPanel place7;
    private javax.swing.JPanel place8;
    private javax.swing.JPanel place9;
    private javax.swing.JLabel redLabel;
    private javax.swing.JLabel redMv;
    private javax.swing.JPanel redpionplace1;
    private javax.swing.JPanel redpionplace2;
    private javax.swing.JPanel redplace1;
    private javax.swing.JPanel redplace2;
    private javax.swing.JPanel redplace3;
    private javax.swing.JPanel redplace4;
    private javax.swing.JPanel redplace5;
    private javax.swing.JPanel redplace6;
    private javax.swing.JLabel yellowLabel;
    private javax.swing.JLabel yellowMv;
    private javax.swing.JPanel yellowpionplace1;
    private javax.swing.JPanel yellowpionplace2;
    private javax.swing.JPanel yellowplace1;
    private javax.swing.JPanel yellowplace2;
    private javax.swing.JPanel yellowplace3;
    private javax.swing.JPanel yellowplace4;
    private javax.swing.JPanel yellowplace5;
    private javax.swing.JPanel yellowplace6;
    // End of variables declaration//GEN-END:variables
}
