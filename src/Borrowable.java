import java.math.BigDecimal;

public interface Borrowable {
    public void checkOut();
    public void checkIn();
    public BigDecimal getPrice();
}
