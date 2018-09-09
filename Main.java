package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int state;

    public static void main(String[] args) {

        testSort();
        testGarland();
        testMaxMin();
        testSorterMod(new int[]{0, 2, 5, 3, 4});
        testSorter(new int[]{0, 2, 5, 3, 4});
        testSorter1(new int[]{0, 2, 5, 3, 4});
        testInvert(new int[]{3, 4, 5, 7});
        arrayOfChar();
        arrayOfString();
        randomSet();
        arrayOfDays();
        factorial();
        garland(0);
        prihtChar();
        withoutResidue();
        printOfOdder("101");
        getValInt();
        dayOfWeek(0);
        dayOfWeek1(4);
        printTask();

	// write your code here
    }

    private static void testSort() {
        Random rand = new Random(47);
        int[] array = new int[10];
        int[] array1 = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = rand.nextInt(25);
        }
        System.arraycopy(array,0,array1,0,array.length);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        SelectionSorter.sort(array);
        SelectionSorterMod.sort(array1);
    }

    private static void testGarland() {
        int [] array = new int[10];
        for(int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random()*2);
        System.out.println(Arrays.toString(array));
        Garland.flashing(array);
        Garland.runningLine(array);
    }

    private static void testMaxMin() {
        Random rand = new Random(47);
        int [][] array = new int[5][8];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 8; j++) {
                array[i][j] = rand.nextInt(25);
            }
        }
        System.out.println(Arrays.deepToString(array));
        MaxMinInArray.maxMin(array);
    }

    private static void testSorterMod(int[] array) {
        System.out.println(Arrays.toString(array));
        BubbleSorterMod.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void testSorter(int[] array) {
        System.out.println(Arrays.toString(array));
        BubbleSorter.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void testSorter1(int[] array) {
        System.out.println(Arrays.toString(array));
        BubbleSorter1.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void testInvert(int[] array) {
        System.out.println(Arrays.toString(array));
        ArrayInverter.invert(array);
        System.out.println(Arrays.toString(array));
    }

    private static void arrayOfChar() {
        char[][] arrayChar = new char[4][2];
        for (int i = 0; i < 4; i++)  {
            for (int j = 0; j < 2; j++){
                arrayChar[i][j] = (char)(100 + i + j + i*j);
            }
        }
        System.out.println(Arrays.deepToString(arrayChar));
    }

    private static void arrayOfString() {
        String[][] arrayString = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 6; j++) {
                if (i == 0)
                    arrayString[i][j] = "a" + (j + 1);
                        else if (j == 1)
                            arrayString[i][j] = "b" + (j + 1);
                                    else
                                        arrayString[i][j] = "c" + (j + 1);
            }
        }
        System.out.println(Arrays.deepToString(arrayString));
    }

    private static void randomSet() {
        double[] arrayDouble = new double[4];
        for (int i = 0; i < 4; i++) {
            arrayDouble[i] = (Math.random() * 10);
        }
            System.out.println(arrayDouble[0]);
    }

    private static void arrayOfDays() {
        String [] daysOfWeek = new String[7];
        daysOfWeek[0] = "Понедельник";
        daysOfWeek[1] = "Вторник";
        daysOfWeek[2] = "Среда";
        daysOfWeek[3] = "Четверг";
        daysOfWeek[4] = "Пятница";
        daysOfWeek[5] = "Суббота";
        daysOfWeek[6] = "Воскресенье";
        System.out.println(daysOfWeek[6]);
    }

    private static void factorial() {
        int n = (int)(Math.random()*10);
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact = fact*i;
        System.out.println("Factorial " + n + " = " + fact);
    }

    private static void garland(int choise){
        stateOfGarland();
        switch (choise) {
            case 0:
                flashing();
                break;
            case 1:
                runningLine();
                break;
            case 2:
                lastLamp();
                break;
        }


    }

    private static void stateOfGarland() {
        Random rand = new Random();
        state = rand.nextInt(2000000000);
        System.out.println(Integer.toBinaryString(state));
    }

    private static void flashing() {
        System.out.print("Set the number of flashes ");
        Scanner in = new Scanner(System.in);
        int numberOfFlashes = in.nextInt();
        for(int i = 0; i < numberOfFlashes; i++){
            state = ~state;
        }
        System.out.println(Integer.toBinaryString(state));
    }

    private static void runningLine() {
        System.out.println("Running Line ");
        for(int i = 0; i < 10; i++){
            state = state << 1;
            System.out.println(Integer.toBinaryString(state));
        }
    }

    private static void lastLamp() {
        int mask = 1;
        if((state & mask) == 1) {
            System.out.println("Last lamp On");
        }
        else
            System.out.println("Last lamp Off");
    }

    private static void withoutResidue() {
        int i = 1;
        while (i <= 100){
            if(i % 5 == 0){
                System.out.print(" " + i + " ");
            }
            i++;
        }
        System.out.println();
    }

    private static void prihtChar() {
        char x = 'h';
        for(int i = 0; i < 5; i++)
            System.out.println(x++);
    }

    private static void printTask() {
        int i = 1;
        while (i <= 10){
            System.out.println("Task" + i);
            i++;
        }
    }

    private static void printOfOdder (String str) {
        int val = Integer.parseInt(str);
        if (val % 2 != 0)
            System.out.println(val);
    }

    private static void getValInt(){
        System.out.println("Please, get int val ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x > 0 && x < 10) {
            System.out.println("Положительное число меньше 10");
        }
        else
            System.out.println("Положительное число больше 10 или отрицательное");
    }

    private static void dayOfWeek(int x) {
        int day = x;
        if (day == 0)
            System.out.println("Понедельник");
            else if (day == 1)
                System.out.println("Вторник");
                else if (day == 2)
                    System.out.println("Среда");
                        else if (day == 3)
                            System.out.println("Четверг");
                                else if (day == 4)
                                    System.out.println("Пятница");
                                        else if (day == 5)
                                            System.out.println("Суббота");
                                                else if (day == 6)
                                                    System.out.println("Воскресенье");
    }

    private static void dayOfWeek1 (int x) {

        switch (x){
            case 0:
                System.out.println("Понедельник");
                break;
            case 1:
                System.out.println("Вторник");
                break;
            case 2:
                System.out.println("Среда");
                break;
            case 3:
                System.out.println("Четверг");
                break;
            case 4:
                System.out.println("Пятница");
                break;
            case 5:
                System.out.println("Суббта");
                break;
            case 6:
                System.out.println("Воскресенье");
                break;
        }
    }


}
