import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[][] maze = getMaze("src/maze");
        int pastRow = 0;
        int pastCol = 0;

        for (int row = 0; row < maze.length; row++) {
            pastRow = row;
            for (int col = 0; col < maze[0].length; col++) {
                pastCol = col;
                if (maze[pastRow][col].equals(".")){
                    System.out.print(pastRow + "," + col + " ");
                }
                else if (maze[row][pastCol].equals(".")){
                    System.out.print(row + "," + pastCol + " ");

                }

            }
        }
    }
    public static String[][] getMaze(String fileName) {
        File f = new File(fileName);
        Scanner s = null;
        try {
            s = new Scanner(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(1);
        }

        ArrayList<String> fileData = new ArrayList<String>();
        while (s.hasNextLine())
            fileData.add(s.nextLine());

        int rows = fileData.size();
        int cols = fileData.get(0).length();

        String[][] maze = new String[rows][cols];

        for (int i = 0; i < fileData.size(); i++) {
            String d = fileData.get(i);
            for (int j = 0; j < d.length(); j++) {
                maze[i][j] = d.charAt(j) + "";
            }
        }
        return maze;

    }

}