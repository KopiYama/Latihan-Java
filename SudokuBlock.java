import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class SudokuBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] blokSudoku = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                blokSudoku[i][j] = scanner.nextInt();
            }
        }

        String hasil = periksaValiditas(blokSudoku);
        System.out.println(hasil);
    }

    public static String periksaValiditas(int[][] blokSudoku) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!set.add(blokSudoku[i][j])) {
                    return "tidak valid";
                }
            }
        }
        return "valid";
    }
}
