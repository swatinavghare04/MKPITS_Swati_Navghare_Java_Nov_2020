// WAP in java to search an element in a matrix .

class SearchElementMatrix {
    public static void main(String[] args) {
        int[][] arrayofInts = {{32, 87, 3, 589}, {12, 1076, 2000, 8}, {622, 127, 77, 955}};
        int searchfor = 12;
        int i;
        int j=0;
        boolean foundIt = false;

        for (i = 0; i < arrayofInts.length; i++) {
            for (j = 0; j < arrayofInts[i].length; j++) {
                if (arrayofInts[i][j] == searchfor) {
                    foundIt = true;
                    break;
                }
            }
        }
        if (foundIt) {
            System.out.println("found " + searchfor + " at" + i + "," + j);
        } else {
            System.out.println(searchfor + "not found in array");
        }
    }
}
