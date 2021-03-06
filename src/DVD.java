import java.math.BigDecimal;
import java.util.Date;

/**
 * Class that implements DVD items.
 */

public class DVD implements LibraryItem, Borrowable {
    private final String LOCATION_COUNTER = "counter";
    private final String LOCATION_CHECKED_OUT = "checked out";
    private final int MAX_CHECKOUT_DAY = 5;
    private final int GRACE_PERIOD_DAYS = 1;
    private final BigDecimal FEE_PER_DAY = new BigDecimal("0.50");
    private  final int DAYS_TILL_CHARGED = 7;
    private String title;
    private String category;
    private String location;
    private boolean checkedOut;
    private Date checkOutDate;
    private BigDecimal price;

    /**
     * Constructor that creates DVD objects
     * @param title contains DVD title
     * @param category contains DVD category
     * @param location contains location of DVD
     * @param price contains price of DVD
     */
    public DVD(String title, String category, String location, BigDecimal price){
        this.title = title;
        this.category = category;
        this.location = location;
        this.price = price;
    }
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void checkIn() {
        location = LOCATION_COUNTER;
        checkedOut = false;
        checkOutDate = null;
    }

    @Override
    public void checkOut() {
        location = LOCATION_CHECKED_OUT;
        checkedOut = true;
        checkOutDate = new Date();
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public BigDecimal getFeePerDay() {
        return FEE_PER_DAY;
    }

    @Override
    public int getDaysTillCharged() {
        return DAYS_TILL_CHARGED;
    }

    @Override
    public Date getCheckoutDate() {
        return checkOutDate;
    }

    @Override
    public int getGracePeriodDays() {
        return GRACE_PERIOD_DAYS;
    }

    @Override
    public int getMaxCheckoutDays() {
        return MAX_CHECKOUT_DAY;
    }
}
