import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BookingManagerTest {

    @Test
    public void addReservation() {
        BookingPersister persisterSpy = spy(BookingPersister.class);
        BookingManager bookingManager = new BookingManager(persisterSpy);

        ArgumentCaptor<Booking> capturedBooking = ArgumentCaptor.forClass(Booking.class);
        bookingManager.addReservation("Anthony", 2, 19);

        verify(persisterSpy).persistToDb(capturedBooking.capture());

        Booking capturedBookingValue = capturedBooking.getValue();

        assertEquals("Anthony", capturedBookingValue.getTable().getName());
        assertEquals(2, (int)capturedBookingValue.getTable().getNumber());
        assertEquals(19, (int)capturedBookingValue.getTable().getTime());
    }
}