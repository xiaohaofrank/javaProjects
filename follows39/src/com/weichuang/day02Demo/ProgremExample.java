package com.weichuang.day02Demo;

import org.junit.Test;

import java.util.Arrays;

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
   /*
   多维数组
   三个班级各三名学员参赛
   记录每个学员的成绩，计算每个班的平均分
    */
    @Test
    public void testFn6(){
        int[][] c = {{11,22,33},{44,66,77},{88,3,1}};
        for (int i = 0; i < c.length; i++) {
            int totalScore = 0;
            for (int j = 0; j < c[i].length; j++) {
                totalScore += c[i][j];
            }
            System.out.println("第" + (i +1) + "个班级的平均成绩为：" + totalScore/c[i].length) ;
        }
    }
    /*
    * 找出一列数中的最大的数
    * */
    @Test
    public void testFn7(){
        int [] arr = {1,2,3,7,99,2};
        int maxValue = arr[0];
        for (int x: arr
             ) {
            if(x > maxValue){
                maxValue = x;
            }
        }
        System.out.println(maxValue);
    }
    /*
    * 冒泡排序
    * */
    @Test
    public void testFn8(){
        int [] arr = {77,22,33,44,21,32,88};
        for (int i = 0; i < arr.length-1; i++) {//计循环“次数”
            for (int j = 0; j < arr.length -i -1; j++) {//计交换“动作”
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1] ;
                    arr[j+1] = temp;
                }
            }
        }
        //完成冒泡排序，打印arr。
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+",");
        }
    }
    /*
    选择排序
    */
    @Test
    public void testFn9(){
        int [] arr = {87,22,33,44,55,66,77,88,99,101};
        for (int i = 0; i < arr.length; i++) {
            //找到最大的下标
            int maxIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }
            //换
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+",");
        }
    }

}
