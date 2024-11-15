import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 10) {
            System.out.println("Druk op Enter om te tellen: " + (count + 1));
            scanner.nextLine();
            count++;
        }

        System.out.println("Je hebt tot tien geteld. Het programma eindigt nu.");
        scanner.close();
    }
}