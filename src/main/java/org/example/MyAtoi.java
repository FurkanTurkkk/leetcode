package org.example;

public class MyAtoi {
    public static void main(String[] args) {

        String x="+1";
        System.out.println(myAtoi(x));

    }
    /*
    Input: s = "42"

    Output: 42

    Explanation:

    The underlined characters are what is read in and the caret is the current reader position.
    Step 1: "42" (no characters read because there is no leading whitespace)
         ^
    Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
    Step 3: "42" ("42" is read in)
     */



    public static int myAtoi(String s) {

        s=s.trim();
        if(s.length()==0) return 0;
        if(s==null){
            return 0;
        }
        int sign=1;
        if(s.charAt(0)=='-'){
            sign=-1;
        }

        long result=0;
        int index=1;
        while (index<s.length() && Character.isDigit(s.charAt(index))){
            result=result*10+(s.charAt(index)-'0');
            if(sign*result<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign*result>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            index++;
        }
        result=sign*result;
        return (int) result;

    }
}
