import java.util.Scanner;

public class MaksimalBilanganBesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nomor = new int[10];
        for (int i = 0; i < 10; i++) {
            nomor[i] = scanner.nextInt();
        }

        int max = findMax(nomor);

        System.out.println(max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
