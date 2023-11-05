// remove whitespaces from the string

public class q7 {
    String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();
        
        char[] charArray = input.toCharArray();
        
        for (char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }
        
        return output.toString();
    }
}
