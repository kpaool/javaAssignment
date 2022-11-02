public class Dog {
    String name="";
    int age=0;

    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }

    protected static void bark(){
        System.out.println("Barking");
    }

    void run(){
        System.out.println("Running");
    }

    String getName(){
        return name;
    }

    String getName(String type){
        return type+name;
    }
}
