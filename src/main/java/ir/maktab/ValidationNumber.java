package ir.maktab;

public class ValidationNumber {
    public static boolean digitValidation(String name) {
        try {
            Double.parseDouble(name.trim());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
