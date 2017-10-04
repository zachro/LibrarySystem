import java.math.BigDecimal;
import java.util.Date;

/**
 * The Borrowable interface represent
 */
public interface Borrowable {
    /**
     * Sets the item's checked-in/checked-out state to checked out.
     */
    void checkOut();

    /**
     * Sets the item's checked-in/checked-out state to checked in.
     */
    void checkIn();

    /**
     * Returns the date the item was checked out.
     * @return A Date object representing the item's checkout date
     */
    Date getCheckoutDate();

    /**
     * Returns the purchase price of the item.
     * @return the item's price as a BigDecimal
     */
    BigDecimal getPrice();

    /**
     * @return the maximum number of days an item can be checked out
     */
    int getMaxCheckoutDays();

    /**
     * @return the number of days an item can be late before the member is charged a late fee.
     */
    int getGracePeriodDays();

    /**
     * Returns the late fee per day for the item.
     * @return The item's late fee, as a BigDecimal
     */
    BigDecimal getFeePerDay();

    /**
     * @return The number of days an item can be late before the member is charged the full price.
     */
    int getDaysTillCharged();
}
