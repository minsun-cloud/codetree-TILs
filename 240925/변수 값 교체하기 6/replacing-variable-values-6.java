public class Main {
    public static void main(String[] args) {
        int a = 2, b = 5;
        int temp = b;
        b=a;
        a=temp;
        System.out.printf("%d\n%d", a,b);
    }
}