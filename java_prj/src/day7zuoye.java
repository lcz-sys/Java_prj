import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class day7zuoye {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        Random random = new Random();

        int sum = 0;

        for(int i = random.nextInt(100); arr.size() - 1 < 6; i = random.nextInt(100)){

            arr.add(i);

            sum += i;

        }

        System.out.println("总和为:" + sum);

    }
}
