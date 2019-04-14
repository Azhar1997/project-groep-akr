public class printStars {


    public static void rectangle(int y,int x) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void triangle(int y, int x) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
                System.out.println();
        }
    }
    public static void ovale(int y,int x) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (i * 2 + 5 ) ; k++)
                System.out.print("*");
                System.out.println();
                }
            }

        }
