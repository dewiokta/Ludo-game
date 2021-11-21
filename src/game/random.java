/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;

/**
 *
 * @author User
 */
import java.util.Random;

public class random {
    public static int getRandom(int min, int max) {
        return ((int) (Math.random() * (max))) + min;
    }

    public static void main(String[] args) {

        System.out.println("" + getRandom(1, 6));
    }
}