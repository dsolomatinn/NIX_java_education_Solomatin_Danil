package nix.education.java.coffemachine;

import java.util.Scanner;

public class CoffeeMachineMain  {
    public static final Scanner scanner = new Scanner(System.in);
    public static final CoffeeMachine employee = new CoffeeMachine(400,540,120,9, 550.00);


    //Stage 1
    public static void main(String[] args) {
        System.out.println("""
                Starting to make coffee
                Grinding coffee beans
                Boiling water
                Mixin boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Ingridients is ready!
                """);
//        //Stage 2
//
//     System.out.println("Write how many cup of coffee you will need:");
//        int cupsOfCoffee = scanner.nextInt();
//        int water = 200;
//        final int milk = 50;
//        final int coffeeBeams = 15;
//        System.out.println("For" + " " + cupsOfCoffee + " " + "coffee you will need:");
//        System.out.println(water * cupsOfCoffee + " " + "ml of water");
//        System.out.println(milk * cupsOfCoffee + " " + "ml of milk");
//        System.out.println(coffeeBeams * cupsOfCoffee + " " + "g of coffeeBeams");
//
//        //Stage 3
//        System.out.println("Write how many ml of water you will have:");
//        int amountOfWater = scanner.nextInt();
//        System.out.println("Write many how ml of milk you will have:");
//        int amountOfMilk = scanner.nextInt();
//        System.out.println("Write how many grams of CoffeeBeams you will have:");
//        int amountOfCoffeeBeams = scanner.nextInt();
//        int coffeeForWater = amountOfWater / water;
//        int coffeeForMilk = amountOfMilk / milk;
//        int coffeeForCoffeeBeams = amountOfCoffeeBeams / coffeeBeams;
//        int[] tab = {coffeeForWater, coffeeForMilk, coffeeForCoffeeBeams};
//        int min = Arrays.stream(tab).min().getAsInt();
//        System.out.println("Write how many cup of coffee you will need:");
//        int cupOfCoffee = scanner.nextInt();
//        int N = min - cupOfCoffee;
//        if (min == cupOfCoffee) {
//            System.out.println("Yes, i can make that amount of coffee");
//        } else if (min > cupOfCoffee) {
//            System.out.println("Yes, i can make that amount of coffee(and even" + " " + N + " " + "more than that)");
//        } else {
//            System.out.println("No,i make only" + " " + min + " " + "cups of coffee\n");
//        }
//*/
        //Stage4 //Stage5 //Stage6
        while (true) {
            System.out.println("Write action: buy, fill, take, remaining, exit:");
            String action = scanner.next();
            if (action.equals("buy")) {
               employee.buyCoffee();
            }
            if (action.equals("fill")) {
                employee.incIngredients();
            }
            else if (action.equals("take")) {
                System.out.println("I gave you " + " " + employee.getMoney());
                employee.takeMoney();
            }
            else  if (action.equals("remaining")){
                System.out.println(employee.showIngridients());
            }
            else  if (action.equals("exit")){
                break;
            }
        }
    }
}



