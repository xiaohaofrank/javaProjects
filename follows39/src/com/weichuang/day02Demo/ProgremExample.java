package com.weichuang.day02Demo;

import org.junit.Test;

public class ProgremExample {
    private int b;

    /*方法01*/
    @Test
    public void testFn(){
        int getMenu = getMenu(3);
        String order1 = getOrder(1);
        String order2 = getOrder(2);
        System.out.println(order1 + '\n' + order2);
        System.out.println(getMenu);
    }

    public static int getMenu(int a){
        System.out.println("1,锅包肉");
        System.out.println("2,鱼香肉丝");
        System.out.println("3，剁椒鱼头");
       /* if(a == 3){
            System.out.println("这是3");
        }*/
        return 3;
    }
    public String getOrder(int a){
        String str = "";
        switch (a){
            case 1:
                str += "1,锅包肉";
                break;
            case 2:
                str += "2,鱼香肉丝";
                break;
            case 3:
                str += "3，剁椒鱼头";
                break;
        }
        return str;
    }
//    重载
    /*public String getAn(int num){

    }*/
    @Test
    public void testFn1(){
        int s1 = 20180206;
        int s2 = 20180305;
        //1，静态初始化,定义数组length为50
        int[] students = new int[50];
        students[0] = 20180206;
        students[1] = 20180305;
        int len = students.length;
        System.out.println("len:"+len);
        int[] student2;
        student2 = new int[50];
        System.out.println(student2[0]);
        //2，先定义，后分配空间
        int[] students3 = new int[]{1,2,3,4,5};
        System.out.println(students3[1]);
        int[] students4 = {1,2,3,4};
        System.out.println(students4.length);
        System.out.println(students4[students4.length - 1]);
        /*for (int i = 0;i<len;i++){
            students[i] = s1 +i;
            System.out.println(students[i]);
        }*/
    }
    @Test
    public void testFn2(){
        int[] array = {43,22,11,33,22};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
//        foreach语法 int x:x的类型必须是你数组封装类型，场景，不需要数组索引的时候。
        for (int x: array) {
            System.out.println(x);
        }
    }
    /*
    *可变参数
    */
    @Test
    public void testFn3(){
        soutArray(10 ,11,22,33);
    }
    public void soutArray(int b,int... a){
        System.out.println(b);//10
        //11,22,33
        for (int x:a
             ) {
            System.out.println(x);
        }
    }
    /*数组越界异常*/
    /*
    *
    * */
    @Test
    public void testFn5(){
        int[] arr = {22,33,44,55,66};
        boolean b = findX(arr,22);
        if(b){
            System.out.println("找到了！");
        }else{
            System.out.println("sorry,没找到");
        }
    }

    private boolean findX(int[] arr, int X) {
        for (int i : arr){
            if(i == X)
                return true;
        }
        return false;
    }

}
