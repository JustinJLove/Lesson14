
public class TireSales {

    public static void main(String[] args) {
        //Make a tire pole
        Arraystack pole = new Arraystack();
        Tire t;
        System.out.println("Adding 10 Goodyears to the pole");
        for (int i = 0; i < 10; i++) {
            t=new Tire("Goodyear");
            pole.push(t);
        }
        System.out.println("Selling 4 tires");
        for (int i = 0; i < 4; i++) {
            t = (Tire)pole.pop();
            System.out.println(t);
        }
    }
    
}
