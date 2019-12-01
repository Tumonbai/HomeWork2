package com.company;

import java.util.Random;
import java.util.RandomAccess;

public class Main {

    public static void main(String[] args) {

        String name = "Tumonbai";
        switch (name){
            case "Tumonbai":
                System.out.println("Tumonbai");
                break;
            case "29YearsOld":
                System.out.println("29YearsOld");
                break;
            case "temperature+4":
                System.out.println("temperature+4");
                break;
        }

        int num = 7;
        switch (num) {
            case 1:
                System.out.println("Azamat");
                break;
            case 2:
                System.out.println("55");
            case 3:
                System.out.println("window");
            default:
                System.out.println("29YearsOld");
        }
        int temperature = 25;
        int age = generateRandomAge();
        System.out.println("age = " + age);

        boolean isDay = true;

        if (isDay && age > 20 && age < 45 && temperature < 30  && temperature > -20){
            System.out.println("Можно выходить гулять");
        }
        if (age < 20 && temperature >0 && temperature <28){
            System.out.println("Можно выходить гулять");
        }
        if (age > 45 && temperature > -10 && temperature < 25){
            System.out.println("Можно выходить гулять");
        }

        }

    public static int generateRandomAge(){
     int min = 0;
     int max = 107;
     int num = max -min;
        Random random = new Random();
        int i = random.nextInt(num);
        return i;
    }


    }
