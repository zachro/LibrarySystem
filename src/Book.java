

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book implements LibraryItem, Borrowable {
    final private String LOCATION_SHELF = "shelf";
    final private String LOCATION_CHECKED_OUT = "checked out";
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

}
