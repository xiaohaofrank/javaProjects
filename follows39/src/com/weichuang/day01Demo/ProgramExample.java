package com.weichuang.day01Demo;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

public class ProgramExample {
    public static void main(String[] args) {
        /*
         * 圆柱体例子，求圆柱体的体积 Π（r^2）h
         * */
//        Scanner sc = new Scanner(System.in);//输入流只认主函数，测试类还不行。
//        System.out.println("请输入半径r=:");
//        int r = sc.nextInt();
//        System.out.println("请输入高度h:" );
//        int h = sc.nextInt();
//        double pai = 3.14;
//        System.out.println("圆柱体的体积为：" + pai*r*r*h);

        /*
         * 根据天数计算周数和剩余天数，天数是通过键盘键入
         * @param args
         * */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入天数d=:");
//        int d = sc.nextInt();
//        int z = d / 7;
//        int t = d % 7;
//        System.out.println("剩余周数：" + z + "剩余天数" + t);
       /*
       通过键盘输入，初始化两个数，交换位置后，输出显示交换位置后的数据
       */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int d = sc.nextInt();
        System.out.println("请输入第二个数:");
        int r = sc.nextInt();
        int temp;
        temp = d;
        d = r;
        r = temp;
        System.out.println("第一个数" + d + "第二个数" + r);

        //
        Date date = new Date();
        System.out.println(date);
        //这里是一个修改bug的分支
        //在不干涉修改bug分支的情况下，做需求001。
        //修改一个002号bug.

    }

    //@Test注解，点灯的第二个
    @Test
    public void testFn() {
        /*
         * 定义一个五位证书，求各个位上的数的和
         * */
        int l = 54321;
        int w = l / 10000;//整型
        int q = l / 1000 % 10;
        int b = l / 100 % 10;
        int s = l / 10 % 10;
        int g = l % 10;
        System.out.println("五位数之和：" + (w + q + b + s + g));//此处注意字符串和数字拼接问题。
    }

    @Test
    public void testFn1() {

    }

    /*
    三目运算符
    */
    @Test
    public void testFn2() {
        int a = 10;
        System.out.println(a > 11 ? 4 : 2);
    }

    //    运算符与优先级
    @Test
    public void testFn3() {
        int i = 30;
        if (i-- > 28) {
            System.out.println(i);
        }
    }

    @Test
    public void testFn4() {
        int x = 30;
        if (x-- > 30) {//先比较，再执行++操作。
            System.out.println("一：" + x);
        } else if (x++ < 31) {
            System.out.println("二" + x);
        } else {
            System.out.println("三" + x);
        }
    }

    /*
    判断一个字符，是大写字母还是小写字母
    */
    @Test
    public void testFn5() {
        char a = 'g';//System.in.rend()
        if (a >= 'a' && a <= 'z') {//ASC码顺序，utf-8
            System.out.println("小写字母");
        } else if (a >= 'A' && a <= 'Z') {
            System.out.println("大写字母");
        } else {
            System.out.println("其他字母");
        }
    }

    /*
    判断一年是否为闰年
    */
    @Test
    public void testFn6() {
        int y = 2000;
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println("这是闰年");
        } else {
            System.out.println("这是平年");
        }
    }
    /*

    */
    @Test
    public void testFn7() {
        final int a = 3;//因为final修饰的为不可变量
        switch(a){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("默认");
                break;
        }
    }
    /*
    输入一个月数，然后输出多少天。
    */
    @Test
    public void testFn8(){
        int d = 1;
        switch (d){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31天");
                break;
            case 2:
                System.out.println("28天");
                break;
            default:
                System.out.println("30天");
                break;
        }
    }
    /*
    * 循环语句
    * */
    @Test
    public void testFn9(){
        int i = 10;
        while (true){
            if(--i < 4){
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
    }
    /*
    * 计算1-100之间所有整数之和，5050。哦哦。
    * */
    @Test
    public void testFn10(){
        int i =1;
        int sum = 0;
        while (i<=100){
            sum += i ++;
        }
        System.out.println(sum);
    }
   /*
   计算10的阶乘。.。。，
   */
    @Test
    public void testFn11(){
        int i = 1;
        int mul = 1;
        while (i<=10){
            mul *= i++;
        }
        System.out.println(mul);
    }
    /*逆序输出10到0*/
    @Test
    public void TestFn12(){

    }
    /*java阶乘求和*/
    @Test
    public void TestFn13(){

    }
    /*
    * for循环
    * */
    @Test
    public void TestFn14(){
        for(int i=0;i<=4;i++){
            System.out.println(i);
        }
    }
    /*
     * for循环练习TestFn15~TestFn20
     * */

}
