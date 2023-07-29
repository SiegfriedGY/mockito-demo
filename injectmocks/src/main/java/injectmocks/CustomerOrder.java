package injectmocks;

import injectmocks.waiter.BreakfastWaiter;
import injectmocks.waiter.DinnerWaiter;

import java.util.List;

public class CustomerOrder {

    private BreakfastWaiter breakfastWaiter;
    private DinnerWaiter dinnerWaiter;

    public CustomerOrder(BreakfastWaiter breakfastWaiter, DinnerWaiter dinnerWaiter) {
        this.breakfastWaiter = breakfastWaiter;
        this.dinnerWaiter = dinnerWaiter;
    }

    public List<String> vegetarianBreakfast() {
        return breakfastWaiter.getVegetarianMenu();
    }

    public List<String> meatBreakfast() {
        return breakfastWaiter.getMeatMenu();
    }

    public List<String> vegetarianDinner() {
        return dinnerWaiter.getVegetarianMenu();
    }

    public List<String> meatDinner() {
        return dinnerWaiter.getMeatMenu();
    }
}
