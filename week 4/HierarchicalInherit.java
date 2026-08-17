
interface Animal{
    void sound();
}
class dog implements Animal{
    public void sound(){
        System.out.println("Dog makes sound");
    }
    void bark(){
        System.out.println("barking");
    }
}

class cat implements Animal{
    public void sound(){
        System.out.println("cat makes sound ");
    } 
    void meow(){
        System.out.println("Meow");
    }
    
}
public class HierarchicalInherit {
        public static void main(String[] args) {
            dog d=new dog();
            d.sound();
            d.bark();

            cat c=new cat();
            c.sound();
            c.meow();
            
        }    
}
