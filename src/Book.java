public class Book {

    /*
    properties
     */
    private String title;
    private int pages;
    private int releaseYear;

/*
constructors
 */

    public Book() {
    }

    public Book(String title, int pages, int releaseYear) {
        this.title = title;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }
    /*
       getters and setters
        */

    public String getTitle() {
        return this.title;
    }
    public int getPages() {
        return this.pages;
    }
    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }



















}



