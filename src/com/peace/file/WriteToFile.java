package com.peace.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        //creating a file that will be in our source code
        File file = new File("src/MyFile.txt");
        try(FileReader fileReader = new FileReader(file)) {
            //instantiate another class called buffered reader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) !=null){
                System.out.println(line);
            }


          }catch (Exception e){

           }




//        try(FileWriter fileWriter = new FileWriter(file)){
//            fileWriter.write("So help me GOD.....");
//
//            //close our file writer to prevent wastage of memory
//            fileWriter.close();
//            // read it all back to us
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null)  {
//                System.out.println(line);
//            }
//        }catch (IOException e){
//                e.printStackTrace();
//        }






    }
}
