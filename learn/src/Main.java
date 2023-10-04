import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int f,i;
        int c;
        Scanner scan=new Scanner(System.in);
        c=scan.nextInt();
        f=(int)(1.44*c/44.196);
        i=(int)(12*(0.01/0.3048*c-f));
        System.out.println((int)f+" "+(int)i);
    }
} 

