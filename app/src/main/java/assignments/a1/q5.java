package assignments.a1;

import java.util.Arrays;
import java.util.Collection;

public class q5 {
    public static String isValidMove(String from, String to) {
/* 1*/    if ((from == null || from.trim().isEmpty()) || (to == null || to.trim().isEmpty())) { // A
/* 2*/       return "Invalid: <from> and <to> both needs to be non-empty strings";
/* 3*/    }
/* 4*/
/* 5*/   if (from.equals("stock") && isValidPileNumber(to)) { // B
/* 6*/        return "Valid: stock to pile";
/* 7*/    } else if (from.equals("stock") && SUITS.contains(to)) { // C
/* 8*/        return "Valid: stock to suit";
/* 9*/    } else if (isValidPileNumber(from)) { // D
/*10*/        if (!(isValidPileNumber(to) || SUITS.contains(to))) { // E
/*11*/           return "Invalid: <to> value is invalid";
/*12*/       }
/*13*/       return "Valid: pile to (pile or suit)";
/*14*/   } 
/*15*/   return "Invalid <from> or <to> value";
}

// Helper variables and methods 
public static final Collection<String> SUITS = Arrays.asList("s", "d", "h", "c");

public static boolean isValidPileNumber(String input) {
    try {
        int i = Integer.parseInt(input.trim());
        return i >= 1 && i <= 7;
    } catch (NumberFormatException ex) {
        return false;
    }
}
}
