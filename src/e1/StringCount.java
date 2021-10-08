package e1;


import java.util.Locale;

//Authors : AMOS HUTA & SILBIANA DEMA
public class StringCount  {
    static int countWords(String text)
    {
        //if it is an empty text we return 0
        if (text == null)
        return 0;
        //we go through the text to detect the spaces, after that we count the word when we detect one or more space
        int calculate=0;
        char[] ch = new char[text.length()];
        for (int i=0;i<text.length();i++)
        {
        ch[i]= text.charAt(i);
        if(
        ((i>0)&&(ch[i]!=' ')
        &&(ch[i-1]==' '))
        || ((ch[0]!=' ')
        &&(i==0)) )
        calculate++;
        }

        return calculate;
    }

    public static int countChar(String text, char c)
    {
        //if it is an empty text we return 0
        if (text==null)
        return 0;
        //we iterate through every character in the given text and compare those characters with our given one, which is char c and then calculate
        int calculate = 0;
        for (
        int i=0;
        i<text.length();
        i++ )
        {
        if (text.charAt(i) == c)
        calculate++; }
        return calculate;
    }



    public static int countCharIgnoringCase(String text, char c) {
        //if it is an empty text we return 0
        if (text == null)
        return 0;
        //we put the all text to the Capital letters and also put our char c into Capital letter too, in order to count ignoring the case
        return countChar(text.toUpperCase(Locale.forLanguageTag((text.toUpperCase()))), Character.toUpperCase(c));


    }
      //we check for special characters
    private static boolean isSpecialChar(char c) {
        return (c == '?' || c == '@'
               || c == '#' || c == '$'
               || c == '.' || c == ',');
    }

    public static boolean isPasswordSafe(String password) {
        //if it is an empty text we false
        if (password == null) return false;
        else if (password.length() < 8) return false;

        int i;
        // we create an array to check for our conditions
        boolean[] checkArr = {false, false, false, false};
        // we check for the password length and also if it contains any special characters as declared above
        for (i = 0; i < password.length(); i++){
        if (!checkArr[0]) {
        if (isSpecialChar(password.charAt(i))) {
        checkArr[0] = true;
        continue;
        }
        }
        //we check for Capital letters and low letters because password in order to be safe should contain both of them
        if (!checkArr[1]) {
        if (Character.isUpperCase(password.charAt(i))) {
        checkArr[1] = true;
        continue;
        }
        }
        if (!checkArr[2]) {
        if (Character.isLowerCase(password.charAt(i))) {
        checkArr[2] = true;
        continue;
        }
        }
        //check for digits and return true if it has digits and false if it does not because password in order to be safe should contain digits
        if (!checkArr[3]) {
        if (Character.isDigit(password.charAt(i)))
        checkArr[3] = true;
        }
        }
        //we check if every condition is filled and return
        return (checkArr[0] && checkArr[1] && checkArr[2] && checkArr[3]);
        }



    public static void main(String[] args) {


    }
    }




