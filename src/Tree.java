public class Tree {
    void gain(){
        System.out.println("Growing!");
    }
}
class Mango extends Tree{
    void gain(){
        System.out.println("Growing slow!");
    }

    public static void main(String[] args) {
        Mango m = new Mango();
        m.gain();
    }
}