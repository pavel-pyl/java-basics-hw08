import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        // Also works:
        // 1 - String ipPattern = "(2[0-5][0-5]\\.2[0-5][0-5]\\.2[0-5][0-5]\\.2[0-5][0-5]|[0-1]?\\d?\\d\\.[0-1]?\\d?\\d\\.[0-1]?\\d?\\d\\.[0-1]?\\d?\\d)";
        // Next variant is shorter but hard to read
        // 2 - String ipPattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3})";
        // Next variant is valid when we use limitation in the end (if item <=255)...
        // 3 - String ipPattern = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"
        // I think next variant is more readable, and easy for maintain
        String s = "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])"; // any number from 0 to 255
        String ipPattern = String.format("(\\b%s\\.%s\\.%s\\.%s\\b)", s, s, s, s);
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return "";
        }




        // TODO fill in code here for extracting IP address using Regular Expression

    }
}