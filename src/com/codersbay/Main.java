package com.codersbay;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("B | I | N | G | O");

        int[][] grid = new int[5][5];

        ArrayList<Integer> used = new ArrayList<>();
        boolean help = false;

        Random random = new Random();

        int randomInt = 0;
        int temp = 1;

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < grid.length; j++) {
                while (!help) {
                    randomInt = random.nextInt(15) + temp;
                    if (!used.contains(randomInt)) {
                        help = true;
                        used.add(randomInt);
                    }
                }
                grid[j][i] = randomInt;
                help = false;
            }
            temp = temp + 15;
        }
        grid[2][2] = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
} 