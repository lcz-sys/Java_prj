package com.itheima02;

//逻辑运算符
public class Demo02LuoJi {
    public static void main(String[] args) {
        //定义3个int变量a和b和c,并初始化
        int a = 10, b = 20, c = 30;
        System.out.println(a > b & a > c);//10 > 20 & 10 > 30 --> false & false -->  false
        System.out.println(a < b & a < c);//10 < 20 & 10 < 30 --> true  & true  -->  true
        System.out.println(a > b & a < c);//10 > 20 & 10 < 30 --> false & true  -->  false
        System.out.println(a < b & a > c);//10 < 20 & 10 > 30 --> true & false  -->  false
        System.out.println("------------");

        System.out.println(a > b | a > c);//10 > 20 | 10 > 30 --> false | false -->  false
        System.out.println(a < b | a < c);//10 < 20 | 10 < 30 --> true  | true  -->  true
        System.out.println(a > b | a < c);//10 > 20 | 10 < 30 --> false | true  -->  true
        System.out.println(a < b | a > c);//10 < 20 | 10 > 30 --> true  | false -->  true
        System.out.println("------------");

        System.out.println(a > b ^ a > c);//10 > 20 ^ 10 > 30 --> false ^ false -->  false
        System.out.println(a < b ^ a < c);//10 < 20 ^ 10 < 30 --> true  ^ true  -->  false
        System.out.println(a > b ^ a < c);//10 > 20 ^ 10 < 30 --> false ^ true  -->  true
        System.out.println(a < b ^ a > c);//10 < 20 ^ 10 > 30 --> true  ^ false -->  true
        System.out.println("------------");

        System.out.println(!true);//false
        System.out.println(!false);//true

        //举例: 判断a和b中的值是否不相同
        System.out.println(a != b);//10 != 20: true
        System.out.println(!(a == b));//!(10 == 20): !false --> true
    }
}
