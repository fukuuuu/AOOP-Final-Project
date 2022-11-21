package Home;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PAsswordVerifier {
  static int MINIMUM_PASSWORD_LENGTH = 6 ; 

  public static boolean IsMinimumLenght(String str) {  
    return (str.length() >= MINIMUM_PASSWORD_LENGTH );
  } 

  public static boolean hasUpperCase(String str) 
  { 
    return !str.equals(str.toLowerCase()) ;
  } 

  public static boolean hasLowerCase (String str) 
  { 
    return !str.equals(str.toUpperCase()) ; 
  }  

  public static boolean hasDigit(String str) { 
    return str.matches(".*\\d+.*");
  } 

//  public static boolean hasLegalChars(String str) { 
//    Pattern pattern = Pattern.compile("[a-zA-Z0-9_]*");
//    Matcher matcher = pattern.matcher(str);
//    return matcher.matches();
//
//  } 

  public static boolean isValid(String str ) { 
    return IsMinimumLenght(str)  
        && hasUpperCase(str) 
        && hasLowerCase(str) 
        && hasDigit(str) ;
//        && hasLegalChars(str) ;
  }
}
