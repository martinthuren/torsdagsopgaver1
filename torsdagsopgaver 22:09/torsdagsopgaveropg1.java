/*Task 1. Palindrome
1.a Skriv en metode printIfPalindrome() som tager en tekststreng som argument 
og printer den HVIS den kan skrives bagfra uden at ændre sig.

Hint
Lad dig inspirere i dokumentationen for String klassen

1.b Sørg for at metoden ikke er case-sensitiv.

1.c Kald metoden fra main med argumentet "Den laks skal ned", for at teste den.*/

class Palindrome
public static main void (String[] args)
String myStr1 = "Den laks skal ned";
String myStr2 = "DEN LAKS SKAL NED";


printIfPalindrome("Den laks skal ned");
System.out.println(myStr1.equalsIgnoreCase(myStr2));
System.out.println(Palindrome)