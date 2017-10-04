import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class that implements Book items.
 */

public class Book implements LibraryItem, Borrowable {
    final private String LOCATION_SHELF = "shelf";
    final private String LOCATION_CHECKED_OUT = "checked out";
    final private int MAX_CHECKOUT_DAY = 30;
    final int GRACE_PERIOD_DAYS = 3;
    final BigDecimal FEE_PER_DAY = new BigDecimal("0.05");
    final int DAYS_TILL_CHARGED = 30;
    private String title;
    private String category;
    private String location;
    private boolean checkedOut;
    private Date checkOutDate;
    private BigDecimal price;

    public Book(String title, String category, String location, BigDecimal Price){
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
        location = LOCATION_SHELF;
        checkedOut = false;
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
        return null;
    }

    @Override
    public int getDaysTillCharged() {
        return 0;
    }

    @Override
    public Date getCheckoutDate() {
        return null;
    }

    @Override
    public int getGracePeriodDays() {
        return 0;
    }

    @Override
    public int getMaxCheckoutDays() {
        return 0;
    }
}
