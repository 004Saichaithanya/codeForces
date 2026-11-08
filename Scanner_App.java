import java.util.*;

class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();

        HashSet<String> keywords = new HashSet<>(
                Arrays.asList("int", "float", "double", "char", "void", "if", "else", "for", "while", "return"));

        HashSet<String> operators = new HashSet<>(Arrays.asList(
                "+", "-", "*", "/", "=", "<", ">", "!"));

        HashSet<Character> seperators = new HashSet<>(Arrays.asList(
                ';', ',', '(', ')', '{', '}'));

        String temp = "";
        String number = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                temp += ch;
            } else if (Character.isDigit(ch)) {
                number += ch;
            } else if (ch == '"') {

                String strLiteral = "";
                strLiteral += ch; // add opening quote

                i++; // move to next character

                while (i < str.length() && str.charAt(i) != '"') {
                    strLiteral += str.charAt(i);
                    i++;
                }

                if (i < str.length()) {
                    strLiteral += '"'; // add closing quote
                }

                System.out.println("<" + strLiteral + ", STRING >");
            } else {
                if (!temp.isEmpty()) {
                    if (keywords.contains(temp))
                        System.out.println("<" + temp + ", KEYWORD >");
                    else
                        System.out.println("<" + temp + ", IDENTIFIER >");
                    temp = "";
                }

                if (!number.isEmpty()) {
                    System.out.println("<" + number + ", NUMBER >");
                    number = "";
                }

                if (operators.contains(String.valueOf(ch))) {
                    System.out.println("<" + ch + ", OPERATOR >");
                } else if (seperators.contains(ch)) {
                    System.out.println("<" + ch + ", SEPERATOR >");
                }
            }
        }

        // Last pending tokens
        if (!temp.isEmpty()) {
            if (keywords.contains(temp))
                System.out.println("<" + temp + ", KEYWORD >");
            else
                System.out.println("<" + temp + ", IDENTIFIER >");
        }

        if (!number.isEmpty())
            System.out.println("<" + number + ", NUMBER >");
    }
}