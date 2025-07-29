class parent{
    void eat(){
        System.out.println("Eating limited is good for health");
    }
}
class child extends parent{
    @Override
    void eat(){
        System.out.println("Eat unlimited food");
    }
}

public class LaunchOverride {
    public static void main(String[] args) {
        child c1 = new child();
        c1.eat();
    }
    
}
