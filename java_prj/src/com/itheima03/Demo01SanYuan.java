package com.itheima03;

/*
    需求：
        动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
        请用程序实现计算两只老虎的体重的最大值。

    实现步骤:
        1.定义2个int变量w1和w2,分别代表两只老虎的体重,根据题目需求进行初始化
        2.使用三元运算符计算w1和w2的最大值,把结果数据保存到int变量max中
        3.打印max中的值
 */
public class Demo01SanYuan {
    public static void main(String[] args) {
        //1.定义2个int变量w1和w2,分别代表两只老虎的体重,根据题目需求进行初始化
        int w1 = 180, w2 = 200;

        //2.使用三元运算符计算w1和w2的最大值,把结果数据保存到int变量max中
                //200>180:true 三元运算符会取?号后面的式子w2赋值给左侧的变量max
        int max = (w2 > w1) ? w2 : w1;

        //3.打印max中的值
        System.out.println("最大值: "+max);//200
    }
}
