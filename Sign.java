public class Sign {
    String display = "";
    int signwidth = 0;

    public Sign(String message, int width) {
        display = message;
        signwidth = width;
    }

    public int numberOfLines() {
        int lines = 0;
        int len = display.length();
        while (len > signwidth) {
            len -= signwidth;
            lines++;
        }
        lines++;
        return lines;
    }

    public String getLines() {
        String breakdown = "";
        int semicount = signwidth;

        for (int i = 0; i < display.length(); i++) {
            if (i == display.length() - 1) breakdown += display.substring(i);

            else if (i == semicount) {
                breakdown += ";";
                breakdown += display.substring(i, i + 1);
                semicount += signwidth;
            }

            else {
                breakdown += display.substring(i, i + 1);
            }
        
        }

        return breakdown;
    }
}