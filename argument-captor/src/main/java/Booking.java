import lombok.Getter;

@Getter
public class Booking {
    private Table table;

    public Booking(Table table) {
        this.table = table;
    }
}
