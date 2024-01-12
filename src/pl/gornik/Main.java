package pl.gornik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape("Kwadrat", 'M', ColorType.BLUE));
        shapes.add(new Shape("Koło", 'M', ColorType.GREEN));
        shapes.add(new Shape("Trójkat", 'M', ColorType.YELLOW));
        shapes.add(new Shape("Romb", 'M', ColorType.RED));

        for (Shape shape : shapes) System.out.println(shape);

        System.out.println("Wprowadź nazwe,rozmiar ('S','M','L'),oraz kolor");
        String name = scanner.nextLine();
        char size = scanner.nextLine().toUpperCase().charAt(0);
        String colorName = scanner.nextLine();

        ColorType color = getColor(colorName);
        if (color != null) {
            shapes.add(new Shape(name,size, color));
            System.out.println("Utworzono obiekt");
        }
        else System.out.println("Wprowadziles wartosć z poza pola ENUM");


        for (Shape shape : shapes) System.out.println(shape);
    }

    public static ColorType getColor(String colorName) {
        switch (colorName) {
            case "czerwony" -> {
                return ColorType.RED;
            }
            case "niebieski" -> {
                return  ColorType.BLUE;
            }
            case "żółty" -> {
                return  ColorType.YELLOW;
            }
            case "zielony" -> {
                return ColorType.GREEN;
            }
            case "czarny" -> {
                return ColorType.BLACK;
            }
            case "biały" -> {
                return ColorType.WHITE;
            }
            default -> {
                return null;
            }
        }
    }
}
