package com.codersbay;

import java.lang.reflect.Array;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        bingocard();
    }

    public static void bingocard() {
        int bingo[][] = new int[5][5];
        ArrayList<Integer> used = new ArrayList<Integer>();
        boolean valid = false;
        int tmp = 0;

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < bingo.length; j++) {
                while (!valid) {
                    tmp = (int) (Math.random() * 15) + 1 + 15 * i;
                    if (!used.contains(tmp)) {
                        valid = true;
                        used.add(tmp);
                    }
                }
                bingo[j][i] = tmp;
                valid = false;
            }
        }
        bingo[2][2] = 0;

        String title[] = {"B", " I", " N", " G", " O"};

        for (int i = 0; i < title.length; i++) {
            System.out.print(title[i] + "\t");
        }

        System.out.println();

        for (int i = 0; i < bingo.length; i++) {
            for (int col = 0; col < bingo[i].length; col++) {
                System.out.print(bingo[i][col] + "\t");
            }
            System.out.println();

        }

    }
}