package EX_28072025;

public class SwappingNumbers {
    public static void main(String[] args) {
        int a = 40;
        int b=100;
        a=b-a;
        b=b-a;
        a=b+a;
        System.out.println("A value is "+a );
        System.out.println("B value is "+b);
    }
}
