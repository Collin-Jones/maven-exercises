import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String userInput = scanner.nextLine();
        System.out.println("You Entered: " + userInput);
        if (!StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is not a number");
            System.out.println(StringUtils.swapCase(userInput));
            System.out.println(StringUtils.reverse(userInput));
        }else {
            System.out.println("Invalid input");
        }
    }
}
