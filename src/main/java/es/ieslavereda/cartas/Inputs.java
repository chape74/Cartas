package es.ieslavereda.cartas;

import java.util.Scanner;

public class Inputs {

    public static boolean pedir(){
        Scanner sc = new Scanner(System.in);
        String pedir = sc.nextLine().toLowerCase();
        return pedir.equals("si");
    }

    public static int askNum() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()){
            System.out.println("por favor, introduce un numero");
            sc.next();
        }
        return sc.nextInt();
    }

    public static String askName() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
