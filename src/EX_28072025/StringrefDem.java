package EX_28072025;

public class StringrefDem {
    public static void main(String[] args) {
        String name = "Vamshi Krishna";// Heap area
        String name1 = "Vamshi Krishna";
        String name2 = new String("Vamshi Krishna");// Object Area
        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
    }
}
