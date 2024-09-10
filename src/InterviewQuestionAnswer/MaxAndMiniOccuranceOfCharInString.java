package InterviewQuestionAnswer;

public class MaxAndMiniOccuranceOfCharInString {

	public static void maxOccurrenceInString(String input) {
	    int maxOccurrenceCount = 0;
	    char maxOccurrenceChar = ' ';

	    try {
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            int count = 0;

	            // Count occurrences of currentChar in the input string
	            for (int j = 0; j < input.length(); j++) {
	                if (input.charAt(j) == currentChar) {
	                    count++;
	                }
	            }

	            // Update maxOccurrenceCount and maxOccurrenceChar if necessary
	            if (count > maxOccurrenceCount) {
	                maxOccurrenceCount = count;
	                maxOccurrenceChar = currentChar;
	            }
	        }

	        // Print the result outside the loops
	        System.out.println("Character with maximum occurrence: " + maxOccurrenceChar);
	        System.out.println("Occurrence count: " + maxOccurrenceCount);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void minOccurrenceInString(String input) {
	    int minOccurrenceCount = input.length();
	    char minOccurrenceChar = ' ';

	    try {
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            int count = 0;

	            // Count occurrences of currentChar in the input string
	            for (int j = 0; j < input.length(); j++) {
	                if (input.charAt(j) == currentChar) {
	                    count++;
	                }
	            }

	            // Update maxOccurrenceCount and maxOccurrenceChar if necessary
	            if (count < minOccurrenceCount) {
	            	minOccurrenceCount = count;
	            	minOccurrenceChar = currentChar;
	            }
	        }

	        // Print the result outside the loops
	        System.out.println("Character with maximum occurrence: " + minOccurrenceChar);
	        System.out.println("Occurrence count: " + minOccurrenceCount);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


	public static void main(String[] args) {
		String input = "java programming language";
		minOccurrenceInString(input);
	}
}
