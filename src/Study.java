import java.util.Scanner;

public class Study {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int answer = k % n;

        System.out.println(answer);

    }
}


