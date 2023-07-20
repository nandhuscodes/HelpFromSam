import java.util.Scanner;

public class HelpFromSam {
    static int takeHelpFromSam(int A){
        int score = 1;
        if((A&1)==0){
            return 0;
        }
        while (score*2<=A){
            score*=2;
        }
        return A-(score-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println(takeHelpFromSam(target));
    }
}
