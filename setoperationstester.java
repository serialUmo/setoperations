import java.util.ArrayList;

public class setoperationstester {

    public static void main(String[] args) {

    setoperations tester = new setoperations();


    ArrayList<String> numberList = new ArrayList<>();

    numberList.add("pizza");
    numberList.add("chicken tenders");
    numberList.add("takis");
    numberList.add("gummy bears");
    numberList.add("soup");
    numberList.add("croutons");

    ArrayList<String> listOfNumbers = new ArrayList<>();

    listOfNumbers.add("lettuce");
    listOfNumbers.add("takis");
    listOfNumbers.add("soup");
    listOfNumbers.add("oreos");
    listOfNumbers.add("protein bar");
    listOfNumbers.add("carrots");

    System.out.println("The first list is " + listOfNumbers);
    System.out.println("The second list is " + numberList);
    System.out.println("The intersection is "  + tester.computeIntersection(listOfNumbers, numberList));
    System.out.println("The union is " + tester.computeUnion(listOfNumbers, numberList));
    
}
}
