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
    /**
     * Gets the name of a Member.
     * @return combined first and last name of the Member.
     */
    public String getName() {
        return (firstName + " " + lastName);
    }

    /**
     * Adds late fees to the Member's late fee total.
     * @param lateFee based on days late and late fee rate for item type.
     */
    public void addToLateFees(BigDecimal lateFee) {
        lateFees.add(lateFee);
    }
    /**
     * Gets late fees for a Member.
     * @return late fees for a Member.
     */
    public BigDecimal getLateFees() {
        return lateFees;
    }
    /**
     * Gets items currently checked out by the Member.
     * @return a Borrowable list of items checked out by the Member.
     */
    public List<Borrowable> getCheckedOutItems() {
        return checkedOutItems;
    }
    /**
     * Adds new items to Member's checked out library items.
     * @param itemToAdd Items to add to the Member's chekced out library items.
     */
    public void addToCheckedOutItems(Borrowable itemToAdd) {
        checkedOutItems.add(itemToAdd);
    }
}
