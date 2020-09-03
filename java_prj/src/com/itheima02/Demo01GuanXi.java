package com.itheima02;

//关系运算符
public class Demo01GuanXi {
    public static void main(String[] args) {
        //定义2个int变量a和b,并初始化
        int a = 10, b = 20;

        boolean result = a > b;//把a>b表达式的结果(10>20 不成立: false)数据赋值给左侧的变量result
        System.out.println(result);//false
        System.out.println(a > b);//直接打印输出a>b表达式的结果(10>20 不成立: false):false
        //t,f
        System.out.println(a >= b);//10 >= 20: false
        System.out.println(a < b);//10 < 20: true
        System.out.println(a <= b);//10 <= 20: true
        System.out.println(a != b);//10 != 20: true
        System.out.println(a == b);//10 == 20: false

        //把变量b的值赋值给变量a,然后再打印输出a的值
        System.out.println(a = b);//20
    }
}
