import java.util.Scanner;

public class Test001 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int x = scanner.nextInt();
            System.out.println(x);
        }
        for(int i = 0; i < args.length; i++){

            System.out.println(args[i]);
        }


    }
}
