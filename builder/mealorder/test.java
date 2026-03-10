package builder.mealorder;

public class test {
    public static void main (String[] args) {

        MealOrder order = new MealOrder.Builder("veg burger")
                                        .drink("juice")
                                        .build();

        System.out.println(order);
    }
}