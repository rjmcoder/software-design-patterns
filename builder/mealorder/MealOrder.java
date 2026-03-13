package builder.mealorder;

public class MealOrder {
    private final String mainItem;
    private final String drink;

    // private constructor, all fields are final and no setters => immutable object
    private MealOrder (Builder builder) {
        this.mainItem = builder.mainItem;
        this.drink = builder.drink;
    }

    // getters
    public String getMainItem () {
        return this.mainItem;
    }

    public String getDrink () {
        return this.drink;
    }

    @Override
    public String toString () {
        return "Main item: " + this.mainItem +
                "\n-- Drink: " + this.drink;
    }

    // inner static builder class
    public static class Builder {
        
        private String mainItem;
        private String drink;

        public Builder (String item) {
            if (item == null || item.isBlank()) {
                System.out.println("mainItem cannot be null or blank");
            }
            this.mainItem = item;
        }

        public Builder drink (String drink) {
            this.drink = drink;
            return this;
        }

        public MealOrder build () {
            return new MealOrder(this);
        } 

    }
}