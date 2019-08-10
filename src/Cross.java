import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;

public class Cross {
    public static void main(String []args) throws Exception {
        PrintWriter fw = new PrintWriter("output.txt");
        FileReader fileReader = new FileReader("input.txt");

        String A = "0010100";
        String B = "0001000";
        String C = "1000001";

        System.out.println(C + " " + C + "\n"
                + A + " " + A + "\n"
                + B + " " + B + "\n"
                + A + " " + A + "\n"
                + C + " " + C);

        fw.println(C + " " + C);
        fw.println(A + " " + A);
        fw.println(B + " " + B);
        fw.println(A + " " + A);
        fw.println(C + " " + C);

        Scanner scan = new Scanner(fileReader);

        char new1 = scan.nextLine().charAt(0);
        char new2 = scan.nextLine().charAt(0);

        fw.println ("Символ на що замінити 1 = " + new1);
        fw.println ("Символ на що замінити 2 = " + new2);

        A = A.replace('1', new1);
        A = A.replace('0', new2);
        B = B.replace('1', new1);
        B = B.replace('0', new2);
        C = C.replace('1', new1);
        C = C.replace('0', new2);

        System.out.println(C + " " + C + "\n"
                + A + " " + A + "\n"
                + B + " " + B + "\n"
                + A + " " + A + "\n"
                + C + " " + C);

        fw.println(C + " " + C);
        fw.println(A + " " + A);
        fw.println(B + " " + B);
        fw.println(A + " " + A);
        fw.println(C + " " + C);

        fw.close();
        fileReader.close();
    }
}





