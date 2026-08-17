interface Animal{
     void eat();
}
class dog implements Animal{
   public void eat(){
        System.out.println("Dog is eating ");
    }
    void bark(){
        System.out.println("Barking");
    }
}
public class SingleInherit{
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.bark();
    }
}