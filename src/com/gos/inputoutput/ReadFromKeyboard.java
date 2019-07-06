package com.gos.inputoutput;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromKeyboard {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = (char)br.read();
        System.out.println("You have Entered "+ch);

    }
}
