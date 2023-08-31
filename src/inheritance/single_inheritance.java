package inheritance;

class a{
    public void feature(){
        System.out.println("speed");
    }
}
class b extends a{
    public void car(){

        System.out.println("Audi");
    }
}
public class single_inheritance {
    public static void main(String[] args) {
        b b1 = new b();
        b1.feature();
        //b1.car();
    }
}

