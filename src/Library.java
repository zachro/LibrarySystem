import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * The Library class represents a library catalog system and contains a list of all the items in the library, all the
 * library's members, and methods for checking items in and out.
 */
public class Library {
    private List<LibraryItem> libraryItems;
    private List<Member> members;

    /**
     * Constructs an empty Library object.
     */
    public Library() {}

    /**
     * Adds an item to the library.
     * @param item Any object that implements the LibraryItem interface
     */
    public void addItem(LibraryItem item) {
        libraryItems.add(item);
    }

    /**
     * Adds a member to the library.
     * @param member A Member object representing the new member
     */
    public void addMember(Member member) {
        members.add(member);
    }

    /**
     * Returns the item that matches the title provided.
     * @param title The title of the item to get
     * @return A LibraryItem object if a match is found; null otherwise
     */
    public LibraryItem getItemByTitle(String title) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    /**
     * Returns a list of items matching the given category.
     * @param category The category to search for
     * @return A list of matching LibraryItems
     */
    public List<LibraryItem> getItemsByCategory(String category) {
        List<LibraryItem> list = new ArrayList<>();
        for (LibraryItem item : libraryItems) {
            if (item.getCategory().equals(category)) {
                list.add(item);
            }
        }
        return list;
    }

    /**
     * Checks an item out from the library.
     * @param item
     */
    public void checkOutItem(Borrowable item, Member member) {
        member.addToCheckedOutItems(item);
        item.checkOut();
    }

    /**
     * Checks an item back in to the library.
     * @param item A Borrowable item to check out
     * @param member A Member to check the item out to
     */
    public void checkInItem(Borrowable item, Member member) {
        int daysCheckedOut = getDaysCheckedOut(item);
        int gracePeriod = item.getGracePeriodDays();

        // Calculate late fees or item charge, if applicable
        if (daysCheckedOut > item.getDaysTillCharged()) {
            BigDecimal fee = item.getPrice();
            member.addToLateFees(fee);
        }
        else if (daysCheckedOut > gracePeriod + item.getMaxCheckoutDays()) {
            BigDecimal feePerDay = item.getFeePerDay();
            BigDecimal fee = feePerDay.multiply(new BigDecimal(daysCheckedOut));
            member.addToLateFees(fee);
        }

        item.checkIn();
    }

    /**
     * Gets the number of days a particular item has been checked out.
     * @param item A Borrowable item to get checked-out days for
     * @return The number of days the item was checked out for
     */
    private int getDaysCheckedOut(Borrowable item) {
        Date now = new Date();
        Date checkOutDate = item.getCheckoutDate();
        long diffMilliseconds = now.getTime() - checkOutDate.getTime();
        return (int) TimeUnit.DAYS.convert(diffMilliseconds, TimeUnit.MILLISECONDS);
    }
}
