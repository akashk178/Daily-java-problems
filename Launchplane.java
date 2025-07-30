class plane{
    void takeoff(){
        System.out.println("Plane takesoff");
    }
    void land(){
        System.out.println("Plane landed");
    }
    void fly(){
        System.out.println("Plane Flies");
    }
}
class cargoplane extends plane{
    void fly(){
        System.out.println("Cargo plane flies at low height");
    }
    void goods(){
        System.out.println("CP carry goods");

    }

}
class Fighterplane extends plane{
    void fly(){
        System.out.println("Fighter plane flies at great height");
    }
    void weapons(){
        System.out.println("FP carry weapons");
    }
}
public class Launchplane {
    public static void main(String[] args) {
        cargoplane cp = new cargoplane();
        Fighterplane fp = new Fighterplane();
        cp.takeoff();
        cp.land();
        cp.fly();
        cp.goods();
        fp.takeoff();
        fp.land();
        fp.fly();
        fp.weapons();

    }
    
}
