import java.util.Scanner;

public class SortirJeruk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] nilaiJeruk = new int[N];

        for (int i = 0; i < N; i++) {
            nilaiJeruk[i] = scanner.nextInt();
        }

        int countE = 0;
        int countL = 0;
        int countR = 0;

        for (int nilai : nilaiJeruk) {
            if (nilai >= 85 && nilai <= 100) {
                countE++;
            } else if (nilai >= 60 && nilai <= 84) {
                countL++;
            } else if (nilai >= 0 && nilai < 60) {
                countR++;
            } else {
                System.out.println("error");
                return;
            }
        }

        System.out.println("E " + countE);
        System.out.println("L " + countL);
        System.out.println("R " + countR);
    }
}
