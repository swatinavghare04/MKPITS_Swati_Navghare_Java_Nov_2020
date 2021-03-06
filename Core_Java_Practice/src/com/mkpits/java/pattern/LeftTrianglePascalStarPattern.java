// Left Triangle Pascals

class LeftTrianglePascalStarPattern {

    public static void main(String[] args) {

        int row, column;

        for (row = 1; row <= 5; row++) {

            for (column = 4; column >= row; column--) {

                System.out.print(" ");
            }

            for (column = 1; column <= row; column++) {

                System.out.print("*");
            }

            System.out.println();
        }

        for (row = 1; row <= 4; row++) {

            for (column = 1; column <= row; column++) {

                System.out.print(" ");
            }

            for (column = 4; column >= row; column--) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}