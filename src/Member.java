import java.math.BigDecimal;
import java.util.List;

public class Member {
    private String firstName = "Santa";
    private String lastName = "Claus";
    private BigDecimal lateFees;
    public List<LibraryItem> listOfItems;

    public Member(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        lateFees = new BigDecimal(0);
    }
    public String getName(){
        return (firstName + " " + lastName);
    }
    public void addToLateFees(BigDecimal lateFee){
        lateFees.add(lateFee);
    }
    public BigDecimal getLateFees(){
        return lateFees;
    }
    public List<LibraryItem> getListOfItems(){
        return listOfItems;
    }
    public void addToListOfItems(List <LibraryItem> passedItem){
        listOfItems.add(passedItem);
    }
    //        public void removeFromLateFees(Items returnedBook){
    //
    //        }
}
