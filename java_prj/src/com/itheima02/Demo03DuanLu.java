package com.itheima02;
/*
    短路的逻辑运算符
        1.基本使用
            (1)短路逻辑与(&&): 左侧如果是false,右侧不再进行计算
            (2)短路逻辑或(||): 左侧如果是true,右侧不再进行计算

        2.特点:
            (1)&&和&: 结果是相同的,但是&&具有短路的效果,可以提高效率
            (2)||和|: 结果是相同的,但是||具有短路的效果,可以提高效率

        3.注意:
            以后开发(写代码)时,建议使用短路的逻辑与(&&)和短路的逻辑或(||),可以提高效率
 */
public class Demo03DuanLu {
    public static void main(String[] args) {
        int a = 2;
        /*
            表达式(3<2) && (++a>2): 从左向右计算
            先计算表达式(3<2)的结果为false,对于&&而言,已经决定了最终的结果为false,
            所以右侧的表达式(++a>2)没有执行,所以a的值没有发生变化,还是2
         */
        System.out.println((3<2) && (++a>2));//false
        System.out.println(a);//2
        System.out.println("---------");

        int b = 2;
        /*
            表达式(3<2) & (++b>2): 从左向右计算
            先计算表达式(3<2)的结果为false,对于&而言,虽然已经决定了最终的结果为false,
            但是&不管左侧是true还是false,必须计算右侧的表达式(++b>2),使得b的值增加1,变成3了
         */
        System.out.println((3<2) & (++b>2));//false
        System.out.println(b);//3
        System.out.println("---------");

        int c = 2;
        /*
            表达式(3>2) || (++c>2): 从左向右计算
            先计算表达式(3>2)的结果为true,对于||而言,已经决定了最终的结果为true,
            所以右侧的表达式(++c>2)没有执行,所以c的值没有发生变化,还是2
         */
        System.out.println((3>2) || (++c>2));//true
        System.out.println(c);//2
        System.out.println("---------");

        int d = 2;
        /*
            表达式(3>2) | (++d>2): 从左向右计算
            先计算表达式(3>2)的结果为true,对于|而言,虽然已经决定了最终的结果为true,
            但是|不管左侧是true还是false,必须计算右侧的表达式(++d>2),使得d的值增加1,变成3了
         */
        System.out.println((3>2) | (++d>2));//true
        System.out.println(d);//3
    }
}
