import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        int[] heights = new int[5];
        int sum = 0;
        double average;
        for (int i = 0; i < heights.length; i++ ){
            Scanner input = new Scanner(System.in);
            heights[i] = input.nextInt();
            sum+=heights[i];
        }
        average=sum/5.0;
        System.out.println(+average);
    }
}