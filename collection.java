import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class collection {
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<>();

        al.add("sanju");
        al.add("gill");
        al.add("vaibav");

        System.out.println("array waiting list: ");
        System.out.println(al);

        al.remove("sanju");
        System.out.println(al);

        LinkedList<String> Ll=new  LinkedList<>();

        Ll.add("mahesh");
        Ll.add("prabas");
        Ll.add("nani");

        System.out.println("Linkedlist waiting List :");
        System.out.println(Ll);

        Ll.remove("prabas");
        
        System.out.println(Ll);
// array waiting list: 
// [sanju, gill, vaibav]
// [gill, vaibav]
// Linkedlist waiting List :
// [mahesh, prabas, nani]
// [mahesh, nani]

    }
}
