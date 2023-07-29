import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Table {
    private String name;
    private Integer number;
    private Integer time;
}
