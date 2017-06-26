package builder;


import java.util.ArrayList;
import java.util.List;

public class Labyrinth {

    List<Cell> matrix = new ArrayList<Cell>();
    private int dimensionX;
    private int dimensionY;

    public static void main(String[] strings) {  }


    public List<Cell> getMatrix(int dimensionX, int dimensionY) {
        matrix = buildInitialMatrix(dimensionX, dimensionY);
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        return buildSimpleMatrix(matrix);
    }

    private List<Cell> buildInitialMatrix(int dimensionX, int dimensionY) {
        List<Cell> matrix = new ArrayList<Cell>();
        for(int x = 0; x < dimensionX; x++)
            for(int y = 0; y < dimensionY; y++) {
                boolean isEvenCell = (x + y) % 2 == 0;
                matrix.add(new Cell(x, y, isEvenCell, false));
            }

        return matrix;
    }

    private  List<Cell> buildSimpleMatrix(List<Cell> matrix) {
        Cell currentCell = matrix.get(0);
        findNotVisitedAndStandOnIt(currentCell, matrix);
        return matrix;
    }

    private void findNotVisitedAndStandOnIt(Cell currentCell, List<Cell> matrix) {

    }

    private List<Cell> getNeighbours(Cell cell, List<Cell> matrix) {
        List<Cell> neighbours = new ArrayList<Cell>();
        int x = cell.getX();
        int y = cell.getY();
        int[] up = {x, y - 1};
        int[] rt = {x + 1, y};
        int[] dn = {x, y + 1};
        int[] lt = {x - 1, y};
        int[][] d = {up, rt, dn, lt};

        for(int i = 0; i < 4; i++) {
            if(d[i][0] > 0 && d[i][1] < this.dimensionX && d[i][1] > 0 && d[i][1] < this.dimensionY) {

                Cell neighbour = getMatrixArrayIndexByCoords(d[i][0], d[i][1], matrix);

                if(!neighbour.isWall() && !neighbour.isVisited()) {
                    neighbours.add(neighbour);
                }
            }
        }

        return neighbours;
    }

    private Cell getMatrixArrayIndexByCoords(int x, int y, List<Cell> matrix) {
        return matrix.get(y * dimensionX + x);
    }

}
