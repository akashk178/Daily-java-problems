class Tiger extends Object{
    private String name;
    private int age;

    public Tiger(){
        super();
        name = "Ramu";
        age = 8;
    }

    public Tiger(String name){
        this(5);
        this.name= name;
    }
     
    public Tiger(int age){
        this("zoozoo", 6);
        this.age = age;
    }

    public Tiger(String name, int age){
        super();
        this.name=name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class LaunchT {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        System.out.println(t.getName());
        System.out.println(t.getAge());

        Tiger t1 = new Tiger("Rocky");
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
    }
}
