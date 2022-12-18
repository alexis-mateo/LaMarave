package fr.epsi.marave.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadInput {

    public static String readLine(){
        try{
            BufferedReader clavier = new BufferedReader(new InputStreamReader(System.in));
            return clavier.readLine();
        }
        catch(IOException e){
            e.printStackTrace();
            System.exit(0);
            return null;
        }
    }

    public static int readInt(String message) {
        do {
            try {
                System.out.print(message);
                return Integer.parseInt(readLine());
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre !");
            }
        } while (true);
    }

}
