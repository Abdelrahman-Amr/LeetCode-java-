package gov.iti.jets.array;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ValidParentheses {

    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        if(s.length()==1 || s.charAt(0) ==')' || s.charAt(0) ==']' || s.charAt(0) =='}'){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='(' || s.charAt(i) =='[' || s.charAt(i) =='{')
            {
                stack.offer(s.charAt(i));
            }else if(!stack.isEmpty() && s.charAt(i) ==']' && stack.getLast()=='[' ){
                stack.removeLast();
            }else if( !stack.isEmpty() && s.charAt(i) ==')' && stack.getLast()=='('){
                stack.removeLast();
            }else if( !stack.isEmpty() && s.charAt(i) =='}' && stack.getLast()=='{' ){
                stack.removeLast();
            }else{
                return false;
            }
        }
        return stack.isEmpty();

    }
}
