package class10;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iphone=new Phone();
        iphone.price=1000;
        iphone.model="IPhone";
        iphone.color="Pink";
        System.out.println(iphone.price);
        System.out.println(iphone.model);
        System.out.println(iphone.color);
        iphone.text();
        iphone.call();
        iphone.takingPic();

        Phone samsung=new Phone();
        samsung.price=700;
        samsung.model="S23Ulltra";
        samsung.color="Blue";
        System.out.println(samsung.price);
        System.out.println(samsung.model);
        System.out.println(samsung.color);
        samsung.text();
        samsung.call();
        samsung.takingPic();
    }
}
