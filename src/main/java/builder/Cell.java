package builder;


class Cell {
    private int x;
    private int y;
    private boolean isWall = false;
    private boolean isVisited = false;

    Cell(int xPos, int yPos, boolean wall, boolean visited) {
        x = xPos;
        y = yPos;
        isWall = wall;
        isVisited = visited;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public boolean isWall() {
        return isWall;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public void setWall(boolean wall) {
        isWall = wall;
    }
}
