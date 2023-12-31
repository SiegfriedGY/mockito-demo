public class BookingManager {
    private BookingPersister bookingPersister;

    public BookingManager(BookingPersister bookingPersister) {
        this.bookingPersister = bookingPersister;
    }

    public void addReservation(String name, Integer number, Integer time) {
        Table table = new Table(name, number, time);
        Booking booking = new Booking(table);
        bookingPersister.persistToDb(booking); //this method call with specific argument needs to be test
    }
}
