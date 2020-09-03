import java.util.Random;

public class day6zuoye {

    public static void main(String[] args) {

        Random random = new Random();

        int red, blue;

        for (int i = 1; i <= 6; i++) {

            red = random.nextInt(33) + 1;

            System.out.print(red+"  ");

        }

        blue = random.nextInt(16) + 1;

        System.out.println(blue);
    }
}
