package Practice2;

public class Book {
    String title;
    String author;
    String tableOfContents = "";
    int nextPage = 1;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void addChapter(String titleOfChapter, int numberOfPages) {
        tableOfContents += "\n" + titleOfChapter + "..." + nextPage;
        System.out.println(tableOfContents);
        nextPage += numberOfPages;
    }

    public int getPages() {
        return nextPage - 1;
    }

    public String getTableOfContents() {
        return tableOfContents;
    }

    public String toString() {
        return title + "\n" + author;
    }
}
