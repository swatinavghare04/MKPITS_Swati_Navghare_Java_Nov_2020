// Downward Triangle Star Pattern

class DownwardTriangleStarPattern {

    public static void main(String[] args) {

        int row, column;

        for (row = 1; row <= 5; row++) {

            for (column = 5; column >= row; column--) {

                System.out.print("*");
            }

            System.out.println();

        }
    }
}
