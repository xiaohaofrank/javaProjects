public class Main {
    public static void main(String[] args) {
        System.out.println("sdfsd");
//        一些基本操作
        int i = 22;
//        i= ++i;
//        System.out.println(i);
        if(23 == ++i){
            System.out.println("真");
        }else{
            System.out.println("假");
        }
        int a = 14;
        int b = 17;
        if(a < b){
            System.out.println(a-=b);
        }
        if (a < 10 | b < 12) {
            System.out.println(a + "\n" + b);
            System.out.println(b%=a);
        }else{
            System.out.println(a*=b);
        }
    }
}
