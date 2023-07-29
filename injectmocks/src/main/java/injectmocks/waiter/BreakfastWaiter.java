package injectmocks.waiter;

import java.util.Arrays;
import java.util.List;

public class BreakfastWaiter {
    public List<String> getMeatMenu() {
        return Arrays.asList("breakfast-meat-1", "breakfast-meat-2");
    }
    public List<String> getVegetarianMenu() {
        return Arrays.asList("breakfast-vegetarian-1", "breakfast-vegetarian-2");
    }
}
