import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        StringBuilder str = new StringBuilder();

        while (scanner.hasNext()) {
            str.append(scanner.nextLine());
        }

        System.out.println(str.length());
    }
}
