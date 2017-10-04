import java.math.BigDecimal;

public interface Borrowable {
    public void checkOut();
    public void checkIn();
    public BigDecimal getPrice();
    public int getMaxCheckoutDays();
    public int getGracePeriodDays();
    public BigDecimal getFeePerDay();
    public int getDaysTillCharged();
}
