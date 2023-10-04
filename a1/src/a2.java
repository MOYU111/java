import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentIds = new String[5];
        int i;
        for (i = 0; i < studentIds.length; i++) {
            studentIds[i] = scanner.nextLine();
        }
        String sId = scanner.nextLine();
        for (i = 0; i < studentIds.length; i++) {
            if (sId.equals(studentIds[i])) {
                System.out.println(+i);
                break;
            }
        }
        if (i == studentIds.length) System.out.println("-1");
    }
}
