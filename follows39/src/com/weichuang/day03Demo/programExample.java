package com.weichuang.day03Demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;


public class programExample {
    @Test
    public void TestFn(){
        int[] arrs = {11,13,5,6,8,10};
        int[] arrs2 = {11,13,5,6,8,10};
        //注意，只能对已经排好序的数组
        int index = Arrays.binarySearch(arrs,10);
        System.out.println(index);
        //转成数组字符串
        System.out.println(Arrays.toString(arrs));
        //帮我们将数组排好序并赋值回该数组。
//        Arrays.sort(arrs);
        System.out.println(Arrays.toString(arrs));
        //扩容，扩容的大小就是原数组的长度的2倍。 & 原数组长度的1/2 +1
//        arrs = Arrays.copyOf(arrs,arrs.length*2);
        for (int x:arrs
             ) {
            System.out.println(x+" ");
        }
        //判断数组值是否相等
        System.out.println(Arrays.equals(arrs,arrs2));//false
        //给数组填充值
        Arrays.fill(arrs2,2);
        System.out.println(Arrays.toString(arrs2));

    }
    /*
    * 双色球模拟综合案例
    * */
    @Test
    public void testFn1(){
        String[] pool = getPool();
//        System.out.println(Arrays.toString(getPool()));
        /*
        *机器抽取6个红球操作
        */
        String[] sysRedBalls = getRedBalls(pool);
        System.out.println(Arrays.toString(sysRedBalls));
        //机器随机抽取一个蓝球
        Random r = new Random();
        final int blueBound = 16;
        String sysBlueBall = pool[r.nextInt(blueBound)];
        //用户来了，让你机器随机抽取号码
        String[] userRedBalls = getRedBalls(pool);
        String userBlueBall = pool[r.nextInt(blueBound)];

        String result = getReward(sysRedBalls,sysBlueBall,userRedBalls,userBlueBall);
        System.out.println("抽奖结果："+result);
    }

    /*初始化双色球池子*/
    private String[] getPool(){
        String[] pool = new String[33];
        int len = pool.length;
        for (int i = 1; i <= len; i++) {
            if(i < 10) pool[i-1] = "0" + i;
            else pool[i - 1] = i + "";
        }
        return pool;
    }

    /*
    随机获取6个红球
    */
    private String[] getRedBalls(String[] pool){
        //设定要获取红球的数量为6
        String[] redBalls = new String[6];
        //获取随机数的对象
        Random r = new Random();
        int count = 0;
        //标记位，标记已经抽取过的红球下表为true
        boolean[] isUsed = new boolean[pool.length];
        while (true){
            /*
            * 随机获取相应数量的红球，赋值给redBalls数组，在获取过程中，记得用标记位，标记已经抽取过的求。
            * */
            int index = r.nextInt(pool.length);//随机获取bound-1 ~0
            if(isUsed[index]) continue;//判断是否已经取过红球
            isUsed[index] = true;//将取过的索引，加标志位
            redBalls[count ++] = pool[index];
            if(count == redBalls.length) break;
        }
        return redBalls;
    }
    /*
    * 获得几等奖
    * */
    private String getReward(String[] sysRedBalls,String sysBlueBall,String[] userRedBalls,String userBlueBall){
        int redCount = 0;
        //数组增强型for循环，高级
        for (String sysRed:sysRedBalls) {
            for (String userRed:userRedBalls){
                if(sysRed == userRed) redCount ++;
            }
        }
        int blueCount = 0;
        if(sysBlueBall == userBlueBall) blueCount ++;
        if(blueCount == 1 &&redCount <3)
            return "六等奖";
        else if((blueCount + redCount) == 4)
            return "五等奖";
        else if((blueCount + redCount) == 5)
            return "四等奖";
        else if(redCount == 5 && blueCount == 1)
            return "三等奖";
        else if(redCount == 6 && blueCount == 0)
            return "二等奖";
        else if(redCount + blueCount == 7)
            return "一等奖";
        else
            return "未中奖";
    }

    @Test
    public void testFn2(){
        /*
        * 实例
        * */
        Dog hsq = new Dog();
        hsq.name = "哈士奇";
        hsq.age = 2;
        hsq.color = "黑白相间";
        hsq.eat();

        Dog td = new Dog();
        td.name = "泰迪";
        td.age = 2;
        td.color = "棕色";
        td.eat();

        new Dog().move();//实例化一个对象，匿名对象//null的null在逛公园...
//        Dog dog2 = null;//
//        dog2.eat();//java.lang.NullPointerException
        td = hsq;//对象之间的赋值
        td.name = "嘿嘿";
        System.out.println(hsq.name);
        method(hsq);
        System.out.println(hsq.name);
        //
        Horse horse = new Horse();
        horse.setName("小白马");
        System.out.println(horse);

    }

    /*
    * @参数 对象Dog
    * */
    private void method(Dog dog) {
        dog.name = "白白";
    }
}

class Horse{
    private String name;
    private int age;
    private String color;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
* 面向对象
* 类
* */
class Dog{
    String name;
    int age;
    String color;

    public void eat(){
        System.out.println(color + "的" + name + "在吃...");
    }
    public void move(){
        System.out.println(color + "的" + name + "在逛公园...");
    }
}