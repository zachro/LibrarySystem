import java.util.List;

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

    public void checkInItem(Borrowable item) {
        item.checkIn();
    }
}
