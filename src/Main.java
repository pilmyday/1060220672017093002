import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=0;
        System.out.print("輸入英里=");
        x=in.nextDouble();
        System.out.printf("換算公里=%.1f\n",x*1.6);
    }
}
