package builder.mealorder;

public class MealOrder {
    private String mainItem;
    private String drink;

    // All setters are private so MealOrder class is an immutable object

    // setters
    private void setMainItem(String item) {
        this.mainItem = item;
    }

    private void setDrink (String drink) {
        this.drink = drink;
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
        private MealOrder mo;

        public Builder (String item) {
            this.mainItem = item;
        }

        public Builder drink (String drink) {
            this.drink = drink;
            return this;
        }

        public MealOrder build () {
            this.mo = new MealOrder();
            this.mo.setMainItem(mainItem);
            this.mo.setDrink(drink);
            return this.mo;
        } 

    }
}