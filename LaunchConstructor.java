class Tiger {
    private String name;
    private String color;
    private int age;

    public Tiger(String name, String color, int age){
     
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getAge(){
        return age;
    }

    void getData(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(age);
    }
    }

public class LaunchConstructor {
    public static void main(String[] args) {
        Tiger t1 = new Tiger("Ramu", "Orange", 4);
        System.out.println(t1.getName());
        System.out.println(t1.getColor());
        System.out.println(t1.getAge());
    }
    
}
