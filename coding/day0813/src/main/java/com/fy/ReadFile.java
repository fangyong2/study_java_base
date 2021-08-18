package com.fy;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class ReadFile {
    public static void main(String[] args) {
        Scanner myReader=null;
        try {
            File myObj = new File("filename.txt");
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException e) {
            System.out.println("文件没有找到。。。。");
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            myReader.close();
        }
    }
}
