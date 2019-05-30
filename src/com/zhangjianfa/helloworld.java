package com.zhangjianfa;
import java.io.*;
import java.util.*;
import java.time.*;
/*
这是一个文档注释,此刻版本变更为2.0.1
 */
public class helloworld {

    public static void main(String args[]) {

        try{
            byte bWrite [] = {10,20,30,40,50};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x = 0; x < bWrite.length ; x++){
                os.write( bWrite[x] ); // writes the bytes
            }
            os.close();


            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for(int i = 0; i< size; i++){
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        } catch(IOException e){
            System.out.print("IOException");
        }
    }
}
