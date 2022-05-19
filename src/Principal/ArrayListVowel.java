package Principal;    
	import java.util.*;

    public class ArrayListVowel {
    public static void main (String [] args) {

    ArrayList<String> vowels = new ArrayList<String>();
    int teste [] = new int [5];

    vowels.add("chocolate");
    vowels.add("pudding");
    vowels.add("elephants");

    System.out.println(vowels);    
       
    System.out.println("Number of vowel characters: " + Arrays.toString(averageVowels(vowels)));

}


public static int [] averageVowels(ArrayList<String> vowels) {

    int [] vowelInt = new int [5];
    //String that receives the amount of words from the ArrayList.
    String receiveStringsFromTheArrayList []  = new String [3];
    //Pass all the strings from the arraylist to the string array.
    for (int i = 0; i<vowels.size(); i++) {
    	receiveStringsFromTheArrayList[i] = vowels.get(i); 
    	} 
    //Iterate the strings
    for (int i = 0; i<vowels.size(); i++) {
    	//Iterate the letters of the strings
    	for (int j = 0; j<receiveStringsFromTheArrayList[i].length(); j++) {
    		// get the actual letter.
	   	 char letter = receiveStringsFromTheArrayList[i].charAt(j);
		        if(letter=='a') {
		            vowelInt[0]++;
		        } else if (letter == 'e') {
		            vowelInt[1]++;
		        } else if (letter == 'i') {
		            vowelInt[2]++;
		        } else if (letter == 'o') {
		            vowelInt[3]++;
		        } else if (letter == 'u') {
		            vowelInt[4]++;
		        }
	    	}
    
    
    }

    return vowelInt;
}

}
    