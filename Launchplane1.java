class plane{
    void fly(){
        System.out.println("Plane is flying");
    }
    void takeoff(){
        System.out.println("Plane takes off");
    }
    void land(){
        System.out.println("Plane landed");
    }
}
class Cargoplane extends plane{
    void fly(){
        System.out.println("Cargoplane flies at low height");
    }
    void goods(){
        System.out.println("Cargo plane carry goods");
    }
}

class Fighterplane extends plane{
    void fly(){
        System.out.println("Fighter plane flies at great height");
    }
    void weapons(){
        System.out.println("Fighter plane carry weapons");
    }
}

class Airport{
    void permit (plane ref){
        ref.takeoff();
        ref.land();
        ref.fly();
    }
}

public class Launchplane1 {
    public static void main(String[] args) {
        Cargoplane cp = new Cargoplane();
        Fighterplane fp = new Fighterplane();
        Airport a = new Airport();

        a.permit(cp);
        cp.goods();
        a.permit(fp);
        fp.weapons();
    }
    
}
