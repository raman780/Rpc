//Length() and capacity() methods of String Buffer class
public class Shvm {
    public static void main(String[] args) {
        //Two Ways of creating a string
        //1st
        String strl = "Antiquity";

        //2nd
        String g = new String("Antiquity");

        //String class methods:
        //1. int length() - returns the number of characters in the string.
        //2. Char charAt(int i) - returns the character at ith index
        //3. String substring(int i ) - return the substring from ith index character to end
        //4. String substring(int i, int j) - Returns the substring from i to j-1 index.
        //5. String concat(String str) - concatenates specified string to the end of this string
        //6. int indexOf(String s) - Returns the index within the string of the first occurrence of the specified string.
        //7. int indexOf(String s, int i) - Returns the index within the string of the first occurrence of the specified
        //string, starting at the specified index.
        //8. int lastIndexOf(String s) - returns the index within the string of the last occurrence of the specified string.
        //9. boolean equals(Object otherObj)- compares the string to the specified object.
        //10. boolean equalsIgnoreCase(String anotherString) - compares string to another string, ignoring case considerations.
        //11. int compareTo(String anotherString): compare two string lexicographically
        //12. int compareToIgnoreCase(String anotherString)- compare two string lexicographically, ignoring case considerations.
        //13. String toLowerCase()-  Converts all the characters in the String to upper case.
        //14. String toUpperCase()- Converts all the Characters in the String to upper case.
        //15. String trim()- Returns the copy of the string, by removing whitespaces at both ends. it does not affect whitespaces in the middle.
        //16. String replace(char oldChar, char newChar) - Returns new string by replacing all occurrences of oldChar with newChar.


        //Creating and storing string by creating object of StringBuffer
        StringBuffer s = new StringBuffer("Elektrobit");

        //Getting the length of the String

        int p = s.length();

        //getting the length of the string
        int q = s.capacity();

        //appending
        s.append("India");

        System.out.println(s);

        s.append(1);
        System.out.println(s);
        s.append(2);
        System.out.println(s);
        s.append(3);
        System.out.println(s);


        //printing the length and capacity of the above generated input string on console
        System.out.println("Length of String elektrobit = " + p);

        System.out.println("capacity of string elektrobit = " + q); //capacity of string means length of string + more

        //Insert()
        s.insert(5, "Bengaluru");//  str will start from 5th index
        System.out.println(s);
        s.insert(0,5);
        System.out.println(s);
        s.insert(3,true);
        System.out.println(s);

        //reverse()
        //creating string via creating object of string Buffer class
        StringBuffer b = new StringBuffer("Evosys");
        //Invoking reverse() method
        b.reverse();

        //Returns reverse of String
        System.out.println(b);

        //StringBuilder
        // creating a stringBuilder object using StringBuider() constructor
        StringBuilder str = new StringBuilder();
        str.append("EB");

        //print string
        System.out.println("String = " + str.toString());

        //create a StringBuilder object using StringBuilder(charSequence) constructor
        StringBuilder str1 = new StringBuilder("RAMAN");

        //print string
        System.out.println("String 1 = " + str1.toString());

        str1.append("Ranjan");
        System.out.println(str1);
        str1.appendCodePoint(6);
        System.out.println(str1);
        str1.capacity();
        System.out.println(str1);
        str1.charAt(3);
        System.out.println(str1);
        str1.codePointBefore(5);
        System.out.println(str1);





         }
}
