import java.util.Scanner;

public class autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names = sc.nextLine();
        String shortName = "";
        for (int i = 0; i < names.length(); i++) {
            if(names.charAt(i) >64 && names.charAt(i) < 91){
                shortName += names.charAt(i);
            }
        }
        System.out.println(shortName);
    }
}
