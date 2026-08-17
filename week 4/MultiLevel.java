
interface Animal{
    void sound();
}
class dog implements Animal   {
    public void sound(){
        System.out.println("animal makes sound");
    }
    void bark(){
        System.out.println("barking");
    }

}


class puppy extends dog{
    void weep(){
        System.out.println("Puppy weeps");
    }

}
class MultiLevel {
        public static void main(String[] args) {
            puppy p=new puppy();
            p.sound();
            p.bark();
            p.weep();
        }
}
