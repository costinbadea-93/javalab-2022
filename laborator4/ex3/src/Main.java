import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //clasa String este o clasa imutabila
        String s1 = "data";
        String s2 = "data";

        String s3 = new String("data");
        String s4 = new String("data");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

        String s5 = "some string";
        s5 = s5.toUpperCase();
        System.out.println(s5);

        Scanner scanner = new Scanner(System.in);
//        String initial = "";
//        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
//        while (true){
//            System.out.println("Intorduceti un string: ");
//            String value = scanner.nextLine();
//            if(value.equalsIgnoreCase("0")){
//                break;
//            }
//            stringBuffer.append(value);
//        }

//        System.out.println("Rezultatul este : " + initial.toUpperCase());
        System.out.println("Rezultatul este : " + stringBuffer.toString().toUpperCase());

        //StringBuilder(nu este thread safe)
        //StringBuffer(thread safe)

        //Regular expresion
        String s6 = "abc0002uuuu";
        System.out.println(s6.matches("^[a-zA-Z0-9]{1,10}+$"));
    }
}
