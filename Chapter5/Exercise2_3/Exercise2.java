/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: October 25, 2022
 * Description: In this class, an array of objects from the Poem class are created and receive input from the user. As
 * these objects are being created, they are written into a new file called poems.txt.
 */

package Chapter5.Exercise2_3;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[]args) {
        try {
            File newFile = new File("src/Chapter5/Exercise2/poems.txt");
            newFile.createNewFile();
            FileWriter file = new FileWriter("src/Chapter5/Exercise2/poems.txt");
            Scanner input = new Scanner(System.in);
            Poem[] poems = new Poem[3];
            for (int i = 0; i < poems.length; i++) {
                poems[i] = new Poem();
                System.out.println("Enter a poem: ");
                poems[i].setName(input.nextLine());

                System.out.println("Enter the poet: ");
                poems[i].setPoet(input.nextLine());

                file.write(poems[i].getName() + "\n");
                file.write(poems[i].getPoet() + "\n");

            }
            file.close(); // to save file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
