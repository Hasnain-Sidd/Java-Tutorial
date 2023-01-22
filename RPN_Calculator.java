import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class RPN_Calculator{
    public static void main(String[] args) {
        Deque<String> S = new ArrayDeque<String>();
       
        Scanner Sc=new Scanner(System.in);
        while(true){
            String input=Sc.nextLine();
            char c=input.charAt(0);
            if(c=='+' || c=='-' || c=='*' || c=='/'){
                double y=Double.parseDouble((String)S.pop());
                double x=Double.parseDouble((String)S.pop());
                double z=0;
                switch(c){
                    case'+':
                    z=x+y;
                    break;
                    case'-':
                    z=x-y;
                    break;
                    case '*':
                    z=x*y;
                    break;
                    case '/':
                    z=x/y;

                }
                System.out.println(x+" "+c+" "+y+"="+z);
                S.push(new Double(z).toString());
            }
            else if(c=='q'|| c=='Q'){
                return;
            }
            else{
                S.push(input);
            }

        }
    }
}