public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] marco = new int[8][6];
        int i = 0;
        while (i < marco.length) {
            int j = 0;
            while (j < marco[i].length) {
                if (i != 0 && i != marco.length - 1 && j != 0 && j != marco[i].length - 1) {
                } else {
                    marco[i][j] = 1;
                }
                System.out.print(marco[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}