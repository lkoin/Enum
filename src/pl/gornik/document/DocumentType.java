package pl.gornik.document;

public enum DocumentType {
    INVOICE(0,"Faktura"),
    CONTRACT(1,"Kontrakt"),
    NOTARIALACT(2,"Akt Notarialny"),
    CERTYFICATE(3,"Certyfikat");

    public String getPlName() {
        return plName;
    }

    private int id;

    private String plName;

    DocumentType(int id, String plName) {
        this.id = id;
        this.plName = plName;
    }

    DocumentType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
