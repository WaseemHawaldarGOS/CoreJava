package com.gos.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonDetails {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter you id");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter you Gender M/F");
        char gender = (char)br.read();//M\n

        /*
        char gender = (char)br.readLine().charAt(0);
         */

        br.skip(1);

        System.out.println("Enter your name");
        String name = br.readLine();

        System.out.println("ID: "+id);
        System.out.println("Gender: "+gender);
        System.out.println("Name: "+name);
    }
}
