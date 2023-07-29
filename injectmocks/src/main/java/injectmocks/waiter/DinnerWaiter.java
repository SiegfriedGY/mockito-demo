package injectmocks.waiter;

import java.util.Arrays;
import java.util.List;

public class DinnerWaiter {
    public List<String> getMeatMenu() {
        return Arrays.asList("dinner-meat-1", "dinner-meat-2");
    }
    public List<String> getVegetarianMenu() {
        return Arrays.asList("dinner-vegetarian-1", "dinner-vegetarian-2");
    }
}
