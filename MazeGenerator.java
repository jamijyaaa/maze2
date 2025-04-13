public class MazeGenerator {
    private static final int WIDTH = 21;
    private static final int HEIGHT = 21;
    private static char[][] maze;
}
public static void main(String[] args) {
    maze = new char[HEIGHT][WIDTH]; }
    private static void initializeMaze() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                maze[y][x] = '#';
            }
        }
    }