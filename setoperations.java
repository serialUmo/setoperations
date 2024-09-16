import java.util.ArrayList;

public class setoperations {

public ArrayList<String> computeIntersection(ArrayList<String> listOfNumbers, ArrayList<String> numberList){

ArrayList<String> intersectionList = new ArrayList<>();

int size = Math.min(listOfNumbers.size(), numberList.size());

for (int i = 0; i < size; i++){
    String currentElement = listOfNumbers.get(i);


    if (numberList.contains(currentElement)){
        intersectionList.add(currentElement);
    }

}
return intersectionList;
   
}

public ArrayList<String> computeUnion(ArrayList<String> listOfNumbers, ArrayList<String> numberList){

    ArrayList<String> unionList = new ArrayList<>();


    for (int i = 0; i < listOfNumbers.size(); i++) {
        String currentElement = listOfNumbers.get(i);
        if (!unionList.contains(currentElement)) {
            unionList.add(currentElement);
        }
    }

        for (int i = 0; i < numberList.size(); i++) {
            String currentElement = numberList.get(i);
            if (!unionList.contains(currentElement)) {
                unionList.add(currentElement);
            }

            
        }
        return unionList;

    }


       



        }
    