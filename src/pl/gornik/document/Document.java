package pl.gornik.document;

public class Document {
    private String name;
    private int numberOfPages;
    private String size;
    private DocumentType documentType;

    public Document(String name, int numberOfPages, String size, DocumentType documentType) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.size = size;
        this.documentType = documentType;
    }

    @Override
    public String toString() {
        return "Document ->  " +
                "name:" + name + '\'' +
                ", numberOfPages: " + numberOfPages +
                ", size: " + size + '\'' +
                ", documentType: " + documentType.getPlName() + '\'' +
                ", documentTypeID:" + documentType.getId();

    }
}
