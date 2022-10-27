package Chapter5;

import java.io.File;
/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: October 25, 2022
 * Description: In this class, Book1.csv is read, and it consists of numbers separated by commas. This program established
 * the comma as a delimiter and parses the input into integer value. Then from this information, the sum,average, minimum
 * and maximum are determined and then written on a new separate file titled stats.txt.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[]args){
        Scanner myFile = null;
        int sum = 0;
        int average = 0;
        int min = 0;
        int max = 10;
        String regex = ",";

        try{
            myFile = new Scanner(new File("/Users/amyvgs/IdeaProjects/Chapter5/src/Chapter5/Book1.csv"));
            myFile.useDelimiter(regex);
            while(myFile.hasNext()){
                String numString = myFile.next();
                int num = Integer.parseInt(numString);
                sum = sum + num;
                average = sum/10;
                if(num > max){
                    max = num;
                }
                if(num < min){
                    min = num;
                }
                File newFile = new File("/Users/amyvgs/IdeaProjects/Chapter5/src/Chapter5/stats.txt");
                newFile.createNewFile();
                try (FileWriter output = new FileWriter(newFile))
                {
                    output.write("The sum of the numbers is: " + sum + "\n");
                    output.write("The lowest number is: " + min + "\n");
                    output.write("The highest number is: " + max + "\n");
                    output.write("The average of the numbers is: " + average);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            myFile.close();
        }
    }
}
