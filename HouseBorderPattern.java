class HouseBorderPattern {
    public static void main(String[] args) {

        int rows = 9;   // total height
        int cols = 9;   // total width

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                // Roof peak
                if (i == 1 && j == 5)
                    System.out.print("*");

                // Roof (left and right slopes)
                else if (i == 2 && (j == 4 || j == 6))
                    System.out.print("*");
                else if (i == 3 && (j == 3 || j == 7))
                    System.out.print("*");
                else if (i == 4 && (j == 2 || j == 8))
                    System.out.print("*");

                // Top border of the square body
                else if (i == 5 && (j >= 2 && j <= 8))
                    System.out.print("*");

                // Left and right side borders
                else if ((i >= 6 && i <= 8) && (j == 2 || j == 8))
                    System.out.print("*");

                // Bottom border
                else if (i == 9 && (j >= 2 && j <= 8))
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
