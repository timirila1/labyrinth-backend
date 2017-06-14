package main;


import builder.Labyrinth;

import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName = "test.txt";

        Scanner input = new Scanner(System.in);

        try {
            FileReader fileReader = new FileReader(fileName);
        }
        catch ()


        int dimensionX = input.nextInt();
        int dimensionY = input.nextInt();

        Labyrinth labyrinth = new Labyrinth();

        System.out.println(labyrinth.getMatrix(dimensionX, dimensionY));
    }

}
