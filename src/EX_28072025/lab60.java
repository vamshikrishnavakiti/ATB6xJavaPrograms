package EX_28072025;

public class lab60 {
    public static void main(String[] args) {
        String name = "Vamshi";
        String name1 = new String("Vamshi");
        System.out.println(name==name1);
        name1=name1.toLowerCase();
        System.out.println(name.equals(name1));
        System.out.println(name1.equalsIgnoreCase(name));
        System.out.println(  name.getBytes());
        System.out.println(name.contains("sh0"));
    }
}
