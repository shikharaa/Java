package com.shikhara.EH;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
    	
        try {
        	
            File file = new File("shikhara.txt");
            FileReader fileReader = new FileReader(file);
            System.out.println("File successfully opened.");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

