package com.itheima04;

import java.util.Scanner;

/*
    需求：
        一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，身高需要使用键盘录入
        请用程序实现获取这三个和尚的最高身高。

    实现步骤:
        1.导包(找到我们要使用的Scanner类): import java.util.Scanner;
        2.创建键盘录入Scanner类的对象: Scanner sc = new Scanner(System.in);
        3.获取键盘录入的代表和尚身高的3个int数字,分别保存到3个int变量h1,h2,h3中
        4.使用三元运算符计算h1和h2的最大值,保存到int变量temp中
        5.使用三元运算符计算temp和h3的最大值,保存到int变量max中
        6.打印max的值

    注意:
        以上键盘录入Scanner类的导包和创建对象两个步骤,可以合成一步完成(不用手动书写导包的代码了)
        1.方式一:      推荐使用这种方式
            正确录入Scanner这个单词的前几个字母,根据提示选定对应的Scanner类回车,会自动完成导包
            说明: 如果没有提示,按快捷键alt + /,如果还没有提示说明,录入错误

        2.方式二:
            正确录入创建键盘录入Scanner类的代码,发现报错了(有红色单词)
            逛遍定位到Scanner当中,按alt + 回车,根据提示选择对应的Scanner类就可以了

 */
public class Demo02ScannerMax {
    public static void main(String[] args) {

        //1.导包(找到我们要使用的Scanner类): import java.util.Scanner;
        //2.创建键盘录入Scanner类的对象: Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        //3.获取键盘录入的代表和尚身高的3个int数字,分别保存到3个int变量h1,h2,h3中
        System.out.println("请输入第一个和尚的身高(整数数字):");
        int h1 = sc.nextInt();

        System.out.println("请输入第二个和尚的身高(整数数字):");
        int h2 = sc.nextInt();

        System.out.println("请输入第三个和尚的身高(整数数字):");
        int h3 = sc.nextInt();

        System.out.println("您输入的三个和尚的身高: " + h1 + ", " + h2 + ", " + h3);

        //4.使用三元运算符计算h1和h2的最大值,保存到int变量temp中
        int temp = (h1 > h2) ? h1 : h2;

        //5.使用三元运算符计算temp和h3的最大值,保存到int变量max中
        int max = (temp > h3) ? temp : h3;

        //6.打印max的值
        System.out.println("三个和尚的最大身高: "+max);
    }
}
