package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Whats your character's name? ");
        String name = keyboard.nextLine();

        Character basicCharacter = new BasicCharacter(name);
        do{
            System.out.println("Enter a number to choose your weapon: \n" +
                    "1. Spear/shield \n" +
                    "2. Sword/shield");
            int weapon = keyboard.nextInt();

            switch(weapon){
                case 1:
                    basicCharacter = new Shield(new Spear(new BasicCharacter(name)));
                    break;
                case 2:
                    basicCharacter = new Shield(new Sword(new BasicCharacter(name)));
                    break;
            }
            System.out.println("Name: " + basicCharacter.getName());
            System.out.println("Health: " + basicCharacter.getHealth());

            while(basicCharacter.getHealth() > 0){
                System.out.println("Select a treasure chest: \n" +
                        "1. Bronze Chest\n" +
                        "2. Silver Chest");
                int treasure = keyboard.nextInt();

                switch (treasure){
                    case 1:
                        System.out.println("You fought a mimic.");
                        basicCharacter = new Starving(basicCharacter);
                        System.out.println("Name: " + basicCharacter.getName());
                        System.out.println("Health: " + basicCharacter.getHealth());
                        break;
                    case 2:
                        System.out.println("You fought a Wurm.");
                        basicCharacter = new Starving(basicCharacter);
                        System.out.println("Name: " + basicCharacter.getName());
                        System.out.println("Health: " + basicCharacter.getHealth());
                        break;
                }
            }

            System.out.println("Name: " + basicCharacter.getName() + "has died.");

        }while(basicCharacter.getHealth() > 0);

    }
}
