package com.itheima03;
/*
    需求：
        一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
        请用程序实现获取这三个和尚的最高身高。

    实现步骤:
        1.定义3个int变量h1,h2,h3分别代表三个和尚的身高,根据题目需求进行初始化
        2.使用三元运算符计算h1和h2的最大值,保存到int变量temp中
        3.使用三元运算符计算temp和h3的最大值,保存到int变量max中
        4.打印max的值
 */
public class Demo03SanYuanHX {
    public static void main(String[] args) {
        //1.定义3个int变量h1,h2,h3分别代表三个和尚的身高,根据题目需求进行初始化
        int h1 = 150,h2 = 210,h3 = 165;

        //2.使用三元运算符计算h1和h2的最大值,保存到int变量temp中
                   //150 > 210: false,三元运算符取:后面的h2(210),赋值给左侧的变量temp(210)
        int temp = (h1 > h2) ? h1 : h2;//210

        //3.使用三元运算符计算temp和h3的最大值,保存到int变量max中
                 //210 > 165: true,三元运算符取?后面的temp(210),赋值给左侧的变量max(210)
        int max = (temp > h3) ? temp : h3;//210

        //4.打印max的值
        System.out.println("三个和尚的最大身高: "+max);//210
    }
}
