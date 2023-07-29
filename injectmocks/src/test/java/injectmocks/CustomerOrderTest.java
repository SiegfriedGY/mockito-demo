package injectmocks;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import injectmocks.waiter.BreakfastWaiter;
import injectmocks.waiter.DinnerWaiter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CustomerOrderTest {

    @Spy
    private BreakfastWaiter breakfastWaiter;

    @Spy
    private DinnerWaiter dinnerWaiter;

    // 上面那两个对象没有直接用到，只是作为customerOrder的属性注入！！
    @InjectMocks
    private CustomerOrder customerOrder;

    @Test
    public void testServeVegetarianBreakfast() {
        List<String> expectedBreakfast = Arrays.asList("breakfast-vegetarian-1", "breakfast-vegetarian-2");
        assertThat(expectedBreakfast, is(customerOrder.vegetarianBreakfast()));
    }

    @Test
    public void testServeMeatDinner() {
        List<String> expectedBreakfast = Arrays.asList("dinner-meat-1", "dinner-meat-2");
        assertThat(expectedBreakfast, is(customerOrder.meatDinner()));
    }

}