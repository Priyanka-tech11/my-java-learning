interface Searchable {
    void search(String keyword);
}

class Document implements Searchable {
    private String text;

    Document(String text) {
        this.text = text;
    }

    public void search(String keyword) {
        if (text.contains(keyword)) {
            System.out.println("Keyword \"" + keyword + "\" found in Document.");
        } else {
            System.out.println("Keyword \"" + keyword + "\" not found in Document.");
        }
    }
}

class WebPage implements Searchable {
    private String content;

    WebPage(String content) {
        this.content = content;
    }

    public void search(String keyword) {
        if (content.contains(keyword)) {
            System.out.println("Keyword \"" + keyword + "\" found on WebPage.");
        } else {
            System.out.println("Keyword \"" + keyword + "\" not found on WebPage.");
        }
    }
}

public class SearchDemo {
    public static void main(String[] args) {
        Document doc = new Document("Java is a popular programming language.");
        WebPage page = new WebPage("Learn Java, Python, and more online.");

        doc.search("Java");
        doc.search("Python");

        page.search("Python");
        page.search("C++");
    }
}
