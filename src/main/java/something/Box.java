package something;

public class Box {
    public static void main(String[] args) {
        StringBuilder grid = new StringBuilder();
        int row = 15, column = 15, size = 3;
        var val = new Point[]{new Point(3, 3, 15), new Point(3, 27, 15),
                new Point(27, 3, 15), new Point(18, 18, 9),
                new Point(3, 3, 15), new Point(27, 27, 15)};
        for (int i = 0; i < row * size + 1; i++)
        {
            for (int j = 0; j < column * size + 1; j++)
            {
                int u = 0;
                for (var p : val) {
                    if (((j > p.x() && j < p.x() + p.c()) && (i > p.y() && i < p.y() + p.c()))) {

                        if (j % (p.c() + p.x()) == 0 || i % (p.c() + p.y()) == 0)
                            grid.append("██");
                        u = 1;
                        break;
                    }
                }
                if (u == 0 && (j % size == 0 || i % size == 0))
                    grid.append("██");
                else
                    grid.append("  ");
            }
            grid.append('\n');
        }
        System.out.println(grid);
    }

}

record Point(int x, int y, int c) {

}
