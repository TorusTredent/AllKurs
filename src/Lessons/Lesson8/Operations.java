package Lessons.Lesson8;

public class Operations {

    public static void printString(String words) {
        System.out.println(words);
    }

    public static void findLastChar(String words) {
        if (words != null && !words.isEmpty()) {
            System.out.println(words.charAt(words.length() - 1));
        }
    }

    public static void checkingStartElements(String words) {
        if (words != null && !words.isEmpty()) {
            System.out.println(words.endsWith("!!!"));
        }
    }

    public static void checkingEndElements(String words) {
        if (words != null && !words.isEmpty()) {
            System.out.println(words.startsWith("I like"));
        }
    }

    public static void checkingForSomeElements(String words) {
        if (words != null && !words.isEmpty()) {
            System.out.println(words.contains("Java"));
        }
    }

    public static void findPositionOfElement(String words) {
        if (words != null && !words.isEmpty()) {
            System.out.println(words.indexOf("Java"));
        }
    }

    public static void changeSomeSymbols(String words){
        if (words != null && !words.isEmpty()){
            System.out.println(words.replace("a","o"));
        }
    }

    public static void transformStringToUpper(String words){
        if (words != null && !words.isEmpty()){
            System.out.println(words.toUpperCase());
        }
    }

    public static void transformStringToLower(String words){
        if (words != null && !words.isEmpty()){
            System.out.println(words.toLowerCase());
        }
    }

    public static void cutSomeString(String words){
        if(words != null && !words.isEmpty()){
            System.out.println(words.substring(0,7) + words.substring(11));
        }
    }
}
