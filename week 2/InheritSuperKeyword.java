

class Parent{
    public String name;
    protected String city;
    private int age;

    public Parent(String name, String city, int age) {
        this.age=age;
        this.city=city;
        this.name=name;
    }
    int getage(){
        return age;
    }
}
class child extends Parent{
    child(String name, String city,int age){
        super(name, city, age);
    }

    void showinheritedAccess(){
        System.out.println(name);
        System.out.println(city);
        // System.out.println(age);
    }

}

class InheritSuperKeyword{
    public static void main(String args[]){ 
        child obj=new child("lol","HYD",32) ;
        
        System.out.println(obj.name);
        // System.out.println(age);
        System.out.println(obj.city);

        obj.showinheritedAccess();
    }
}

