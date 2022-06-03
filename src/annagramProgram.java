import java.util.ArrayList;
public class annagramProgram {static void isAnagram(String str1, String str2) {
    String s1 = str1.replaceAll("\\s", "");
    String s2 = str2.replaceAll("\\s", "");
    boolean find = true;
    if (s1.length() != s2.length()) {
        find = false;
    } else {
        char[] ArrS1 = s1.toLowerCase().toCharArray();
        char[] ArrayS2 = s2.toLowerCase().toCharArray();
        Arr.sort(ArrS1);
        Arr.sort(ArrS2);
        find = Arr.equals(ArrS1, ArrS2);
    }
    if (find) {
        System.out.println(s1 + " and " + s2 + " are anagrams");
    } else {
        System.out.println(s1 + " and " + s2 + " are not anagrams");
    }
}

    public static void main(String[] args) {
    annagramProgram ang=new annagramProgram()
       ang.isAnagram("aabb", "bbaa");
       ang.isAnagram("abcd");
       ang.annagramProgram(str1,str2);
    }


}




