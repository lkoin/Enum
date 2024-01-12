package pl.gornik.document;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Document> documentList = new ArrayList<>();
        documentList.add(new Document("Certyfikat wydania", 2, "A4", DocumentType.CERTYFICATE));
        documentList.add(new Document("Faktura zakupy sprzetu", 1, "A4", DocumentType.INVOICE));
        documentList.add(new Document("Akt notarialny zakupu mieszkania", 10, "A4", DocumentType.NOTARIALACT));
        documentList.add(new Document("Contrakt przetargu miejskiego", 48, "A4", DocumentType.CONTRACT));

        for (Document documents : documentList) {
            System.out.println(documents);
        }

        System.out.println("Wprowadz dane do dokumentu ,nazwa,liczba stron,rozmiar(A3,A$),Typ dokumentu");
        String name = scanner.nextLine();
        int numberOfPages = scanner.nextInt();
        scanner.nextLine();
        String size = scanner.nextLine();
        String docType = scanner.nextLine();

        DocumentType type1 = getType(docType);
        if (type1 != null) {
            documentList.add(new Document(name, numberOfPages, size, type1));
        } else System.out.println("Wprowadziles warosc z poza ENUM");
        for (Document documents : documentList) {
            System.out.println(documents);
        }
    }

    public static DocumentType getType(String type) {
        switch (type) {
            case ("faktura") -> {
                return DocumentType.INVOICE;
            }
            case ("kontrakt") -> {
                return DocumentType.CONTRACT;
            }
            case ("akt notarialny") -> {
                return DocumentType.NOTARIALACT;
            }
            case ("certyfikat") -> {
                return DocumentType.CERTYFICATE;
            }
            default -> {
                return null;
            }
        }
    }
}