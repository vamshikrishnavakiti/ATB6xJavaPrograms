package EX_28072025;

public class StringDemo {
    public static void main(String[] args) {
        String name= "Vamshi Krishna";
        name = "Krishna";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        String rev = "";
        for( int i =name.length()-1;i>=0 ; i--){
          rev = rev+name.charAt(i);

        }
        System.out.println(rev);
        System.out.println(rev.length());
        for (int i =rev.length()-1;i>=0;i--){
            name=name+rev.charAt(i);

        }
        System.out.println(name);
    }
}
