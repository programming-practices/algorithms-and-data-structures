package recursion;

import java.util.ArrayList;
import java.util.List;

import static recursion.Recursion_LabaratoryWork.*;
import static utils.ArrayOperations.castCharArrayToCharacterArray;

/**
 * Sources: https://www.youtube.com/watch?v=WGxYIH7Ikqw&list=PLoij6udfBncifDy8AjaU5wcG_UDPjDSSb&index=3
 *          Nachalo: 39:40
 * */
public class Recursion_LabaratoryWork {
    public static int evalue(String expr) {
        if (expr.startsWith("(") && expr.endsWith(")")) {
            return evalue(expr.substring(1, expr.length() - 1));
        } else if (expr.startsWith("(") && !expr.endsWith(")")) {
            throw new RuntimeException("If expr start with '(' than MUST end with ')' but expr = '" + expr + "'");
        } else {
            int pos = 0;
            while (pos < expr.length() - 1) {
                if (Character.isDigit(expr.charAt(pos))) {
                    pos++;
                } else {
                    int leftOperand = Integer.valueOf(expr.substring(0, pos));
                    char operator = expr.charAt(pos);
                    int rightOperand = evalue(expr.substring(pos + 1));
                    switch (operator) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }
            return Integer.valueOf(expr);
        }
    }

    public static int evalue_2(String expr) {
        List<String> expresion = removeParenthesesFromExpression(expr);
        boolean checkParentheses = checkParentheses(expr);
        for (int i = expresion.size() - 1; i >= 0; i--) {
            calculaValue(expresion.get(i));
        }


        return 0;
    }

    public static List<String> removeParenthesesFromExpression(String expr) {
        List<String> result = new ArrayList<>();
        Character[] chars = castCharArrayToCharacterArray(expr.toCharArray());
        StringBuffer tmp = new StringBuffer();
        for (Character value : chars) {
            // Delete empty values
            if (value.equals('(') || value.equals(')')) {
                if (!(tmp.length() == 0)) {
                    result.add(tmp.toString());
                    tmp.delete(0, tmp.length());
                }
            } else {
                tmp.append(value);
            }
        }
        return result;
    }

    public static boolean checkParentheses(String expr) {
        Character[] chars = castCharArrayToCharacterArray(expr.toCharArray());
        int countParenthesesOpen = 0;
        int countParenthesesClose = 0;
        for (Character value : chars) {
            if (value.equals('(')) countParenthesesOpen++;
            if (value.equals(')')) countParenthesesClose++;
        }
        return countParenthesesOpen == countParenthesesClose;
    }

    public static int calculaValue(String expr) {
        Character[] chars = castCharArrayToCharacterArray(expr.toCharArray());
        int value1;
        int value2;
        for (Character value : chars) {
            if (Character.isDigit(value)){

            }
        }
        if (Character.isDigit(chars[0]) && Character.isDigit(chars[2])) {
            switch (chars[1]) {
                case '+':
                    return Integer.valueOf(chars[0].toString()) + Integer.valueOf(chars[2].toString());
                case '-':
                    return Integer.valueOf(chars[0].toString()) - Integer.valueOf(chars[2].toString());
                case '*':
                    return Integer.valueOf(chars[0].toString()) * Integer.valueOf(chars[2].toString());
                case '/':
                    return Integer.valueOf(chars[0].toString()) / Integer.valueOf(chars[2].toString());
            }
        }
        return 0;
    }
}

class Main {
    public static void main(String[] args) {
//        System.out.println(">> 123 = " + evalue("123"));
//        System.out.println(">> 2*3 = " + evalue("2*3"));
//        System.out.println(">> 2*(1+3) = " + evalue("2*(1+3)"));
//        System.out.println(">> 1+(5-2*(13/6)) = " + evalue("1+(5-2*(13/6))"));

//        System.out.println(">> 123 = " + evalue("123"));
//        System.out.println(">> 2*3 = " + evalue("2*3"));
//        System.out.println(">> 2*(1+3) = " + evalue("(1+3)*2"));
//        System.out.println(">> ((13/6)*2-5)+1 = " + evalue("((13/6)*2-5)+1"));

        List<String> list = removeParenthesesFromExpression("1+(5-2*(13/6))");
        for (String value : list) {
            System.out.println("--" + value + "--");
        }
        System.out.println(list.size());
        System.out.println(checkParentheses("1+(5-2*(13/6))"));
        System.out.println(calculaValue("2*4"));
        System.out.println(calculaValue("13/6"));

    }
}