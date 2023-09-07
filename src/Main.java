import pizza.Factory;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<String> options = List.of(
            "1- For view Mini Combo",
            "2- For view Combo",
            "3- For view Wombo Combo",
            "4- Close (default)"
    );
    public static void main(String[] args) {
        int option = 0;
        var scanner = new Scanner(System.in);
        var combos = List.of(Factory.miniCombo(), Factory.combo(), Factory.womboCombo());

        while(option >= 0) {
            System.out.println("Combos:");
            options.forEach(System.out::println);
            System.out.print("Press some option: ");
            option = scanner.nextInt();

            if(option >= combos.size()){
                break;
            }
            System.out.printf("\n%s\n\n", combos.get(option - 1));
        }

        scanner.close();
    }
}