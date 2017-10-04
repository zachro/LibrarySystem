public class Reference implements LibraryItem {
    private String title;
    private String category;
    private String location = "counter";


    public Reference(String title, String category) {
        this.title = title;
        this.category = category;
    }

    @Override public String getTitle() {
        return title;
    }

    @Override public void setTitle(String title) {
        this.title = title;
    }

    @Override public String getCategory() {
        return category;
    }

    @Override public void setCategory(String category) {
        this.category = category;
    }

    @Override public String getLocation() {
        return location;
    }

    @Override public void setLocation(String location) {
        location = location;
    }
}
