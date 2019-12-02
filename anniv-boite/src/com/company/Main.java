package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String[] date_act=format.format(date).split("-");
        String file= "humans.txt";
        try {
            InputStream flux = new FileInputStream(file);
            InputStreamReader lecture = new InputStreamReader(flux);
            BufferedReader buff = new BufferedReader(lecture);
            String ligne;
            while ((ligne = buff.readLine()) != null) {

                String[] sousChaines = ligne.split(",");
                String[] date_anniv =sousChaines[2].split("-");
                if ( Integer.parseInt(date_anniv[1])==Integer.parseInt(date_act[1])&& Integer.parseInt(date_anniv[2])==Integer.parseInt(date_act[2])){
                    System.out.println("test");
                    System.out.println("joyeux anniversaire "+sousChaines[0]+" "+sousChaines[1]);
                }

            }
            buff.close();
        } catch (Exception e) {
        }
    }

}
