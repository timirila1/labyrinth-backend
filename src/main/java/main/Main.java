package main;


import builder.Labyrinth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filePath = "./external/test.txt";


        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int numberOfLines = 2;
            String[] textData = new String[numberOfLines];

            for (int i = 0; i < numberOfLines; i++) {
                textData[i] = bufferedReader.readLine();
            }

            bufferedReader.close();
        }
        catch (IOException exception) {
            System.out.println("Error reading file '" + filePath + "'");
        }


//        int dimensionX = input.nextInt();
//        int dimensionY = input.nextInt();

        Labyrinth labyrinth = new Labyrinth();

//        System.out.println(labyrinth.getMatrix(dimensionX, dimensionY));
    }

}
