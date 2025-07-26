class Tiger{
    private String name; 
    private String color;
    private int age;
    void setData(){
        name = "Ramu";
        color = "color";
        age = 11;
    }
    void getData(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(age);
    }

}
public class LaunchTiger {
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        t1.setData();
        t1.getData();
    }
    
}
