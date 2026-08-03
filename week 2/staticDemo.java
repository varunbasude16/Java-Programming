class demo{
    static int count;
    demo(){
        count++;
    }

    void Show(){
        System.out.println(count);
    }
}

public class staticDemo {
    public static void main(String[] args) {
        demo obj=new demo();
        demo obj2=new demo();
        demo obj3=new demo();
        
        obj.Show();

    }

}
