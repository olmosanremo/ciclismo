//package bizPackage;
//
//public enum FrameSize {
//    SMALL, MEDIUM, LARGE, EXTRA_LARGE
//}

package bizPackage;

public enum FrameSize {
    SMALL, MEDIUM, LARGE, EXTRA_LARGE;

    // Factory-Methode, die verschiedene Schreibweisen akzeptiert
    public static FrameSize fromString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        // Normalisiere die Eingabe
//        String normalizedInput = input.trim().toUpperCase().replaceAll(" ", "_");
        String normalizedInput = input.trim().toUpperCase().replaceAll("[- ]", "_");

        return switch (normalizedInput) {
            case "SMALL" -> SMALL;
            case "MEDIUM" -> MEDIUM;
            case "LARGE" -> LARGE;
            case "EXTRA_LARGE" -> EXTRA_LARGE;
            default -> throw new IllegalArgumentException("Unknown frame size: " + input);
        };
    }
}


//**************************hier ein beispiel wie man verschieden eingaben normalisiert --- nicht im enum sondern in bizlogic oder so (hier halt in der main aber das ist scheisse)

//package mainPackage;
//
//        import bizPackage.FrameSize;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            FrameSize size1 = FrameSize.fromString("small");
//            FrameSize size2 = FrameSize.fromString("Medium");
//            FrameSize size3 = FrameSize.fromString("LARGE");
//            FrameSize size4 = FrameSize.fromString("extra large");
//
//            System.out.println(size1); // Output: SMALL
//            System.out.println(size2); // Output: MEDIUM
//            System.out.println(size3); // Output: LARGE
//            System.out.println(size4); // Output: EXTRA_LARGE
//
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }
//    }
//}
