package Easy_Tasks;

import java.util.Stack;

public class Valid_Parentheses
{
    public boolean isValid(String s)
    {
        if(s==null || s.isEmpty()) return true;

        int stringLength = s.length();
        if(stringLength % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        stack.ensureCapacity(stringLength);

        for (int i = 0; i < stringLength; i++)
        {
            char c = s.charAt(i);
            // Check if opening bracket, if yes add
            if(isOpeningBracket(c)) stack.push(c);

            // Check if closing bracket, if yes then check top of stack and if they are equal and correspond to one another do pop,
            // if not return false
            else if(isClosingBracket(c))
            {
                if(stack.isEmpty()) return false;

                char peekChar = stack.peek();

                if(isCorrespondingBracket(peekChar, c)) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean isOpeningBracket(char c){
        return c == '(' || c == '{' || c == '[';
    }
    public boolean isClosingBracket(char c){
        return c == ')' || c == '}' || c == ']';
    }
    public boolean isCorrespondingBracket(char c1, char c2){
        return c1 == '(' && c2 == ')' || c1 == '{' && c2 == '}' || c1 == '[' && c2 == ']';
    }

    public static void main(String[] args){
        Valid_Parentheses obj = new Valid_Parentheses();

        System.out.println(obj.isValid("([[])"));
    }
}