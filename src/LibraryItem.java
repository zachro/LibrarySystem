public interface LibraryItem {
    /**
     * @return The item's title.
     */
    public String getTitle();

    /**
     * Sets the item's title.
     * @param title A String to set as the new title
     */
    public void setTitle(String title);

    /**
     * @return The item's category as a string.
     */
    public String getCategory();

    /**
     * Updates the item's category
     * @param category A string to set as the new category
     */
    public void setCategory(String category);

    /**
     * @return The item's location.
     */
    public String getLocation();

    /**
     * Updates the item's location
     * @param location A string to set as the new location
     */
    public void setLocation(String location);
}
