package com.metanit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //(-1)^n*x^(n+1)/(n+1)
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество шагов, если оно будет отрицательным, то программа закроется");
        int a = in.nextInt();
        System.out.println("Введите число x");
        double D = in.nextDouble();
        double S = 0;
        for (int i = 0; i <= a; i++) {
            if (a < 0){
                System.out.println("Вы ввели отрицательное число шагов");
                break;
            }
            else{
                D = (Math.pow(-1,i)) * (Math.pow(D, (i+1))) / (i+1);
                S += D;
                System.out.println(S);
            }
        }
    }
}