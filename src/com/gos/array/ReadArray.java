package com.gos.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadArray {

    public static void main(String[] args) throws IOException {

        /*
        1D array
         */

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        System.out.println("How many numbers?");
        int count = Integer.parseInt(br.readLine());
        int data[] = new int[count];

        for(int i = 0; i < count; i++){
            System.out.println("Enter number for position "+i);
            data[i] = Integer.parseInt(br.readLine());
        }


        System.out.println("You have created following array ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] +" ");
        }


    }

}
