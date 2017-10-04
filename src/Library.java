import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Library {
    private List<LibraryItem> libraryItems;
    private List<Member> members;

    public Library() {}

    public void addItem(LibraryItem item) {
        libraryItems.add(item);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public LibraryItem getItemByTitle(String title) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public void checkOutItem(Borrowable item) {
        item.checkOut();
    }

    public void checkInItem(Borrowable item, Member member) {
        int daysCheckedOut = getDaysCheckedOut(item);
        int gracePeriod = item.getGracePeriodDays();

        // Calculate late fees or item charge, if applicable
        if (daysCheckedOut > item.getDaysTillCharged()) {
            BigDecimal fee = item.getPrice();
            member.addToLateFees(fee);
        }
        else if (daysCheckedOut > gracePeriod) {
            BigDecimal feePerDay = item.getFeePerDay();
            BigDecimal fee = feePerDay.multiply(new BigDecimal(daysCheckedOut));
            member.addToLateFees(fee);
        }

        item.checkIn();
    }

    private int getDaysCheckedOut(Borrowable item) {
        Date now = new Date();
        Date checkOutDate = item.getCheckoutDate();
        long diffMilliseconds = now.getTime() - checkOutDate.getTime();
        return (int) TimeUnit.DAYS.convert(diffMilliseconds, TimeUnit.MILLISECONDS);
    }
}
