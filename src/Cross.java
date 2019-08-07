import java.util.Scanner;
public class Cross {
    public static void main(String []args){
        String A = "0010100";
        String B = "0001000";
        String C = "1000001";

        System.out.println(C + " " + C + "\n"
                + A + " " + A + "\n"
                + B + " " + B + "\n"
                + A + " " + A + "\n"
                + C + " " + C );

        Scanner s = new Scanner(System.in);
        System.out.print("Введіть символ що замінити 1 = ");
        char old1 = s.next().charAt(0);
        System.out.print("Введіть символ що замінити 2 = ");
        char old2 = s.next().charAt(0);
        System.out.print("Введіть символ на що замінити 1 = ");
        char new1 = s.next().charAt(0);
        System.out.print("Введіть символ на що замінити 2 = ");
        char new2 = s.next().charAt(0);

        A = A.replace(old1, new1);
        A = A.replace(old2, new2);
        B = B.replace(old1, new1);
        B = B.replace(old2, new2);
        C = C.replace(old1, new1);
        C = C.replace(old2, new2);

        System.out.println(C + " " + C + "\n"
                + A + " " + A + "\n"
                + B + " " + B + "\n"
                + A + " " + A + "\n"
                + C + " " + C );
    }
}
