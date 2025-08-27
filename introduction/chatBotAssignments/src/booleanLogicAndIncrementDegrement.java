public class booleanLogicAndIncrementDegrement {
    public static void main(String[] args) {
        int a = 10;
        boolean isComplete = false;
        ++a;
//        System.out.println(a);
        boolean isNotComplete = !isComplete;
        boolean isEqualTo11OrIsComplete = (a == 11) || (isComplete);
        System.out.println(isEqualTo11OrIsComplete);
        if (isNotComplete && isEqualTo11OrIsComplete){
            System.out.println("Challenge ready to start");
        }
        else{
            System.out.println("Challenge already complete");
        }
    }

    /*
Challenge 5: Boolean Logic and Increment/Decrement
Step 1: Create an integer variable with a value of 10.
Step 2: Create a boolean variable named isComplete and initialize it to false.
Step 3: Use the pre-increment operator (++) on the integer variable.
Step 4: Create a second boolean variable named isNotComplete and assign it the logical NOT of the isComplete variable.
Step 5: Create a third boolean variable that checks if the integer variable is equal to 11 OR if isComplete is true.
Step 6: Output the third boolean variable.
Step 7: Write an if-then-else statement that checks if isNotComplete is true AND the third boolean variable is also true.
If the condition is met, display "Challenge is ready to start," otherwise, display "Challenge already complete."
     */
}
