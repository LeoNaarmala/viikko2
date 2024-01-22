package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Hedgehog hedgehog = new Hedgehog();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma");

            if(sc.hasNext()){
                int i = 0;
                String stringInput = sc.nextLine();
                i=Integer.parseInt(stringInput);

                switch(i){
                    case 1:
                    System.out.println("Mitä siili sanoo:");
                    String puhe= sc.nextLine();
                    hedgehog.speak(" "+puhe);
                    break;
                    case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit=true;
                    break;





                }

            }   
        }

        

        }


    }

