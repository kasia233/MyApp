package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



    Scanner odczyt = new Scanner(System.in);
    int zegar;

    System.out.println("POdaj czas do wybuchu bomby: ");
    zegar = odczyt.nextInt();

    while(zegar>0){

        System.out.println("Bomba wybuchnie za" + zegar);
        zegar--;
    }
    System.out.println("BUM SZAKALAKA!");

   }
    {
   Scanner odczyt = new Scanner(System.in);
    int zegar;
    System.out.println("Z kim masz bazy danych: ");
    zegar = odczyt.nextInt();
    while(zegar>0) {
        System.out.println("nie zdasz" + zegar);
        zegar--;
    }
    System.out.println("hahahahaha dwa");
    }








}
