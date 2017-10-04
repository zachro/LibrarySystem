import java.math.BigDecimal;
import java.util.List;

/**
 * Defines library member with late fees and all currently checked out items.
 */
public class Member {
    private String firstName;
    private String lastName;
    private BigDecimal lateFees;
    private List<Borrowable> checkedOutItems;

    /**
     * Creates new Member object.
     * @param firstName Provided Member first name.
     * @param lastName rovided Member last name.
     */
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

    public List<Borrowable> getCheckedOutItems() {
        return checkedOutItems;
    }

    public void addToCheckedOutItems(Borrowable itemToAdd) {
        checkedOutItems.add(itemToAdd);
    }

}
