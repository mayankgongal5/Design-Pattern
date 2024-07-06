public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());


        Meal nonMeal = mealBuilder.prepareNonvegMeal();
        System.out.println("NonVeg Meal");
        nonMeal.showItems();
        System.out.println("Total Cost: " + nonMeal.getCost());

    }
}