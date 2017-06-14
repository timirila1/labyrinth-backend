package builder;


import java.util.ArrayList;
import java.util.List;

public class Labyrinth {

    public static void main(String[] strings) {  }


    public List<Cell> getMatrix(int dimensionX, int dimensionY) {
        return buildInitialMatrix(dimensionX, dimensionY);
    }

    private static List<Cell> buildInitialMatrix(int dimensionX, int dimensionY) {
        List<Cell> matrix = new ArrayList<Cell>();
        for(int i = 0; i < dimensionX; i++)
            for(int j = 0; i < dimensionY; j++) {
                boolean isEvenCell = (i + j) % 2 == 0;
                matrix.add(new Cell(i, j, isEvenCell, false));
            }

        return matrix;
    }
}
