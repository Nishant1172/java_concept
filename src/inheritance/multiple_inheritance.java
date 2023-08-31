package inheritance;

class a1{
    public void feature(){
        System.out.println(" model number");
    }
}
class b1 extends a1{
    public void speed(){
        System.out.println(" car speed testing ");
    }
}
class c extends b1{
    public void design(){
        System.out.println(" car design and colour and front look  ");
    }
}
public class multiple_inheritance {
    public static void main(String[] args) {
        c c1 = new c();
        c1.feature();
        c1.speed();
        c1.design();
    }
}
