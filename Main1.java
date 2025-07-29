class parent {
    String name;
    int age;
    String nationality;

    public parent(String name, int age, String nationality){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public String getNationality(){
        return nationality;
    } 
}
    class child extends parent{
        public child(){
            super("Rohan", 19, "Indian");

        }
    }
public class Main1{
        public static void main(String[] args) {
            child c1 = new child();
            System.out.println(c1.getName());
            System.out.println(c1.getAge());
            System.out.println(c1.getNationality());

        }
    }
    

