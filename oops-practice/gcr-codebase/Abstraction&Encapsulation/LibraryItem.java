abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    // Getters and Setters
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method
    abstract int getLoanDuration();

    // Concrete method
    public void displayItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Book extends LibraryItem {
    @Override
    int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    @Override
    int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    @Override
    int getLoanDuration() {
        return 3;
    }
}

