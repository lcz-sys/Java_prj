
public class day5zuoye {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1000; i <= 9999; i++) {

            if ((i % 10) + (i / 1000) == (i / 100 % 10) + (i / 10 % 10)) {

                count++;

                System.out.println(i);
            }
        }

        System.out.println(" 以上满足条件的四位数总共有 " + count + " 个");

    }
}
