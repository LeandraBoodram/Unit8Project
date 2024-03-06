public class MazeSolver {
    private int row;
    private int col;
    private String[][] maze;

    public MazeSolver(String[][] m){
        this.row = 0;
        this.col = 0;
        this.maze = m;
    }

    public boolean checkNorth(){
        boolean canGo = false;
        if (row > 0) {
            if ((maze[row - 1][col].equals("#")) || (maze[row - 1][col].equals("x"))) {
                canGo = false;
            } else if (maze[row - 1][col].equals(".")) {
                canGo = true;
            }
        }
        return canGo;
    }

    public boolean checkEast(){
        boolean canGo = false;
        if(col < maze[0].length - 1) {
            if ((maze[row][col + 1].equals("#")) || (maze[row][col + 1].equals("x"))){
                canGo = false;
            } else if (maze[row][col + 1].equals(".")) {
                canGo = true;
            }
        }
        return canGo;
    }
    public boolean checkSouth(){
        boolean canGo = false;
        if (row < maze.length - 1) {
            if ((maze[row + 1][col].equals("#")) || (maze[row + 1][col].equals("x"))) {
                canGo = false;
            } else if (maze[row + 1][col].equals(".")) {
                canGo = true;
            }
        }
        return canGo;
    }
    public boolean checkWest() {
        boolean canGo = false;
        if (col > 0){
            if ((maze[row][col - 1].equals("#")) || (maze[row][col - 1].equals("x"))) {
                canGo = false;
            } else if (maze[row][col - 1].equals(".")) {
                canGo = true;
            }
    }
        return canGo;
    }

    public void walk() {
        while ((row < maze.length) && (col < maze[0].length)) {
            if (checkEast()){
                maze[row][col] = "x";
                col = col + 1;
                System.out.print(" --> " + row + ", " + col);

            }
            if (checkSouth()){
                maze[row][col] = "x";
                row = row + 1;
                System.out.print(" --> " + row + ", " + col);
            }
            if (checkWest()){
                maze[row][col] = "x";
                col = col - 1;
                System.out.print(" --> " + row + ", " + col);
            }
        }
    }

}
