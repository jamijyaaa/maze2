public class MazeGenerator {
    private static final int WIDTH = 21;
    private static final int HEIGHT = 21;
    private static char[][] maze;

private static final int[][] DIRECTIONS = {
    {0, -2}, {0, 2}, {-2, 0}, {2, 0}
};
public static void main(String[] args) {
    maze = new char[HEIGHT][WIDTH]; }
    private static void initializeMaze() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                maze[y][x] = '#';
            }
        }
    }
    private static void printMaze() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                System.out.print(maze[y][x]);
            }
            System.out.println();
        }
    }
    private static void generateMaze(int x, int y) {
        maze[y][x] = ' '; }
    }