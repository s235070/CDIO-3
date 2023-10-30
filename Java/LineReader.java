import java.util.Scanner;

class LineReader {
    static Scanner scanner = new Scanner(System.in);

    public static String nextLine() {
        return scanner.nextLine();
    }

    public static int nextInt() {
        return scanner.nextInt();
    }

    public static void close() {
        scanner.close();
    }
}