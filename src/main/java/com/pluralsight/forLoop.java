package com.pluralsight;

public class forLoop {
    public static void main (String [] args){

        for (int i = 10; i > 0; i--) {
            System.out.println(i);


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
            }
        
        System.out.println("LAUNCH!");

    }



}
