package Lessons.Lesson8;

public class Main {
    public static void main(String[] args) {

        String words = "I love Java!!!";
        Operations.printString(words);
        Operations.findLastChar(words);
        Operations.checkingEndElements(words);
        Operations.checkingForSomeElements(words);
        Operations.findPositionOfElement(words);
        Operations.changeSomeSymbols(words);
        Operations.transformStringToUpper(words);
        Operations.transformStringToLower(words);
        Operations.cutSomeString(words);

        OperationsBuilder.arithmetical(3,56);

        TwoMiddleSymbols tms = new TwoMiddleSymbols(" ");
        tms.printMiddleSymbols();
    }
}