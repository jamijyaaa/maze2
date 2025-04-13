public class MazeGenerator {
    private static final int WIDTH = 21;
    private static final int HEIGHT = 21;
    private static char[][] maze;

private static final int[][] DIRECTIONS = {
    {0, -2}, {0, 2}, {-2, 0}, {2, 0}};

public static void main(String[] args) {
    maze = new char[HEIGHT][WIDTH];
    initializeMaze();
    generateMaze(1, 1); // Начинаем с (1,1)
    maze[1][0] = 'S'; // Вход
    maze[HEIGHT - 2][WIDTH - 1] = 'E'; // Выход
    printMaze(); }

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
    
    private static void shuffleDirections(int[][] directions) {
        for (int i = 0; i < directions.length; i++) {
            int r = (int)(Math.random() * directions.length);
            int[] temp = directions[i];
            directions[i] = directions[r];
            directions[r] = temp;
        }
    }

    private static void generateMaze(int x, int y) {
        maze[y][x] = ' ';
        int[][] dirs = DIRECTIONS.clone();
        shuffleDirections(dirs);

        for (int[] dir : dirs) {
            int nx = x + dir[0];
            int ny = y + dir[1];

            if (nx > 0 && nx < WIDTH - 1 && ny > 0 && ny < HEIGHT - 1 && maze[ny][nx] == '#') {
                maze[ny - dir[1] / 2][nx - dir[0] / 2] = ' ';
                generateMaze(nx, ny);
            }
        }
    }
    }