package class2;

public class E10Quiz {
    public static void main(String[] args) {
        System.out.println(2+2*2); // 6
        System.out.println((2+2)*2); // 8
        System.out.println("10"+10); // 1010
        /*
        When ever they are more than 2 operators on a single line java executes from left to right
        for example in below line "10"+10 will be 1010 and "1010"+10 will be 101010
         */
        System.out.println("10"+10+10); // 101010
        //10+10=>20+"10"=>2010
        System.out.println(10+10+"10"); //2010
    }
}
