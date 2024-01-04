package com.company.String;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException,FileNotFoundException {

        FileReader fileReader = new FileReader("himanshu.txt");
        BufferedReader br = new BufferedReader(fileReader);

        String str;
        while ((str = br.readLine())!=null)
        {
            System.out.println(str);
        }
        br.close();
    }
}
