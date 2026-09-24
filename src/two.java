import java.util.Scanner;

public class two {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int v = input.nextInt();
        int t = input.nextInt();

        int position = (v * t) % 109;


            if (v<0) {
                position = position + 109;
            }

        System.out.println(position);





    }
}
