import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans =0;
        while (true){
            System.out.println("Enter the operator");
            char ch = in.next().trim().charAt(0);

            if(ch == '%' || ch == '+' || ch =='-' || ch =='*' || ch =='/'){
                System.out.println("Enter two numbers");
                int num1 =in.nextInt();
                int num2 = in.nextInt();

                if(ch == '+'){
                    ans = num1 + num2;
                }else if (ch == '-'){
                    ans = num1 - num2;
                }else if (ch == '*'){
                    ans = num1 * num2;
                }else if (ch == '/'){
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }else {
                        System.out.println("Cannot be divided by 0");
                    }
                }else if (ch == '%'){
                    ans = num1 % num2;
                }
                else {
                    System.out.println("Invalid Number");
                }
            }System.out.println("Answer:" + ans);
            break;
        }
    }
}
//By Tejas Nopany
