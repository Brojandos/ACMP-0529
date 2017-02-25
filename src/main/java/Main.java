import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 25.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x0 = input.nextInt(), y0 = input.nextInt();
        double x = Math.abs(input.nextInt() - x0), y = Math.abs(input.nextInt() - y0);
        System.out.println(Math.sqrt(x * x + y * y));
    }
}