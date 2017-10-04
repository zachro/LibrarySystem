import java.math.BigDecimal;
import java.util.Date;

public interface Borrowable {
    void checkOut();
    void checkIn();
    Date getCheckoutDate();
    BigDecimal getPrice();
    int getMaxCheckoutDays();
    int getGracePeriodDays();
    BigDecimal getFeePerDay();
    int getDaysTillCharged();
}
