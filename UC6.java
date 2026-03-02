public class UC6 {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "****  ",
            "*    *",
            "*    *",
            "****  ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "     * ",
            "*    * ",
            " ***** "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {
        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // All patterns are 7 rows tall; print them side-by-side
        for (int i = 0; i < o.length; i++) {
            // O O P S (two O's for "OO")
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}