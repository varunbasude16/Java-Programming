

class animal{
    int x=10;
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class dog extends animal{
    int x=20;
    void display(){
        System.out.println(" parent ka x="+super.x);
        System.out.println("child ka x= "+x);
        sound();
        super.sound();
    }
    void sound(){
        System.out.println("Dog is barking ");
    }
}

public class Super {
    public static void main(String[] args) {
        dog d=new dog();
        d.display();
    }
}
