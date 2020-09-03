package com.itheima03;
/*
    需求：
        动物园里有两只老虎，已知两只老虎的体重分别为180kg、200kg，
        请用程序实现判断两只老虎的体重是否相同。

    实现步骤:
        1.定义2个int变量w1和w2,分别代表两只老虎的体重,根据题目需求进行初始化
        2.使用三元运算符计算w1和w2是否相同,把结果数据保存到boolean类型的变量result中
        3.打印result的值
 */
public class Demo02SanYuan {
    public static void main(String[] args) {
        //1.定义2个int变量w1和w2,分别代表两只老虎的体重,根据题目需求进行初始化
        int w1 = 180, w2 = 200;

        //2.使用三元运算符计算w1和w2是否相同,把结果数据保存到boolean类型的变量result中
                        //180 == 200: false 三元运算符取:后面的false,赋值给左侧的变量result
        boolean result = (w1 == w2) ? true : false;

        //3.打印result的值
        System.out.println("是否相同呢? "+result);
    }
}
