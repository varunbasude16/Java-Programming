class Animal{

    Animal() {
        System.out.println("Animal constructor");
    }
    
}
class dog extends Animal{
    dog(){
        super();
        System.out.println("Dog Constructor");
    }
}

public class super2 {
        public static void main(String[] args) {
            dog d= new dog();
        
        }
}
