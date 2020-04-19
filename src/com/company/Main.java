package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ticket=110;
        Scanner numb = new Scanner(System.in);
        System.out.print("Ввыедите количество билетов: ");
        int num = numb.nextInt();
        int mile=(int)Math.floor(num*ticket/20);
        System.out.printf("Количество миль - %d", mile);
	    numb.close();
    }
}
