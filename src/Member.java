import java.math.BigDecimal;
import java.util.List;

public class Member {
    private String firstName;
    private String lastName;
    private BigDecimal lateFees;
    public List<LibraryItem> checkedOutItems;

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        lateFees = new BigDecimal(0);
    }

    public String getName() {
        return (firstName + " " + lastName);
    }

    public void addToLateFees(BigDecimal lateFee) {
        lateFees.add(lateFee);
    }

    public BigDecimal getLateFees() {
        return lateFees;
    }

    public List<LibraryItem> getCheckedOutItems() {
        return checkedOutItems;
    }

    public void addToListOfItems(LibraryItem passedItem) {
        checkedOutItems.add(passedItem);
    }

}
