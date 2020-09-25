import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.*;

public class Checker {
    
    
    public boolean isDayOfWeek(String string){
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }
        return false;
    }
    
    public boolean allVowels(String string){
        String regex = "[aeiou]+";
        
        if (string.matches(regex)){
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay(String string){
        String regex = "([0-1][0-9]|[2][0-3]):[0-5]{1}[0-9]{1}:[0-5]{1}[0-9]{1}";
        
        return (string.matches(regex));
    }
}
