package fr.epsi.marave.utils;

import java.util.Scanner;

public class ReadInput {

    public static int readInt(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

}
