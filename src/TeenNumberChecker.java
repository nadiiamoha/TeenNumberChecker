public class TeenNumberChecker {
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if (firstAge >= 13 && firstAge <= 19) {
            return true;
        }

        if (secondAge >= 13 && secondAge <= 19) {
            return true;
        }

        if (thirdAge >= 13 && thirdAge <= 19) {
            return true;
        }

        return false;
    }

    public static boolean isTeen(int fourthAge) {
        if (fourthAge >= 13 && fourthAge <= 19) {
            return true;
        }
        return false;
    }
}
