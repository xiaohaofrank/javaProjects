import org.junit.Test;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入天数d=:");
        int d = sc.nextInt();
        int z = d / 7;
        int t = d % 7;
        System.out.println("剩余周数：" + z + "剩余天数" + t);
    }
    //@Test注解，点灯的第二个
    @Test
    public void TestFn(){
        /*
        * 定义一个五位证书，求各个位上的数的和
        * */
        int l = 54321;
        int w = l/10000;//整型
        int q = l/1000 % 10;
        int b = l/100 % 10;
        int s = l/10 % 10;
        int g = l % 10;
        System.out.println("五位数之和：" + (w + q + b + s +g));//此处注意字符串和数字拼接问题。
    }

}
