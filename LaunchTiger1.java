class Tiger{
    private String name ;
    private String color;
    private int age;

    void setData(String s1, String s2, int i){
        name = s1;
        color = s2;
        age = i;
    }
    void getData(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(age);
    }
}
public class LaunchTiger1 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.setData("Rocky", "White", 4);
        t1.getData();
    }
    
}
