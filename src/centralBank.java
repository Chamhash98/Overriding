public class centralBank {
    int getRateofInterest() {
        return 2;

    }
}
class BOC extends centralBank{
    @Override
    int getRateofInterest() {
        return 8;
    }
}
class HNB extends centralBank{
    int getRateofInterest(){
        return 7;
    }
}
class NSB extends centralBank{
    int getRateofInterest(){
        return 9;
    }
}
class testOverride{
    public static void main(String[] args) {
        BOC b = new BOC();
        HNB h = new HNB();
        NSB n = new NSB();
        System.out.println("BOC Rate of Interest: " + b.getRateofInterest());
        System.out.println("HNB Rate of Interest: " + h.getRateofInterest());
        System.out.println("NSB Rate of Interest: " + n.getRateofInterest());
    }
}
