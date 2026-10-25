import java.util.Arrays;

public class Main {
public static void main(String[] args) {
       
    int[] scores = {95, 88, 78, 87, 80, 86, 85, 90};


    int target = 90;
    int foundIndex = -1;

    for (int i = 0; i < scores.length; i++) {
    if (scores[i] == target) {
    foundIndex = i;
    break; 
    }
    }

    if (foundIndex != -1) {
    System.out.println("Target score " + target + " was found at index " + foundIndex + ".");
    } else {
    System.out.println("Target score " + target + " was not found in the array.");
    }
     
    int[] sortedScores = Arrays.copyOf(scores, scores.length);
    Arrays.sort(sortedScores);

 
    System.out.println("Original scores: " + Arrays.toString(scores));
    System.out.println("Sorted scores:   " + Arrays.toString(sortedScores));
    }
}