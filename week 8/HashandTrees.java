import java.util.HashSet;
import java.util.TreeSet;
public class HashandTrees {
    public static void main(String []args){
        HashSet<String> h=new HashSet<>();
        
        h.add("Apple");
        h.add("Ball");
        h.add("Cat");
        h.add("Apple");
        h.add("Dog");
        h.add("Cat");

        System.out.println(h);
        
        TreeSet<String> t=new TreeSet<>(h);

       System.out.println(t);
        
// [Ball, Apple, Cat, Dog]    - non alphabetical
// [Apple, Ball, Cat, Dog]    - alphabetical
        
    }
}
