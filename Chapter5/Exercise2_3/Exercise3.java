/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: October 25, 2022
 * Description: In this exercise, a file titled poems2.txt is read and the following program reads the lines and creates
 * new Poem objects. These objects are then printed out on the console.
 */

package Chapter5.Exercise2_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3 {
    public static void main(String[]args){
        BufferedReader buffer = null;
        try {
            File readFile = new File("src/Chapter5/Exercise2/poems2.txt");
            buffer = new BufferedReader(new FileReader(readFile));
            String strLine;
            while((strLine = buffer.readLine())!= null ){
                if(strLine != null){
                    String poem = strLine;
                    String poet = buffer.readLine();
                    Poem p = new Poem();
                    p.setName(poem);
                    p.setPoet(poet);
                    System.out.println(p);
                }
            }
            buffer.close();


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
