public class geminiLogicalOperatorAndMultipleConditions {
    public static void main(String[] args) {
        //Step 1 and 2
        double x = 10.0d;
        double y = 5.0d;
        //Step 3
        x +=y;
//        System.out.println(x);
        //Step 4
        int z = 15;
        //Step 5
        //My line
//        boolean isXEqualToZ = x == z ? true : false;
        //Gemini recomends
        boolean isXEqualToZ = x == z;
        //Step 6
        boolean isXLess20AndZGreater10 = ((x < 20) && (z > 10));
        //Step 7
//        System.out.println(isXLess20AndZGreater10);
        //Gemini recommends
        boolean finalResult = isXEqualToZ && isXLess20AndZGreater10;
        System.out.println(finalResult);
        //Step 8
        if (finalResult){
            System.out.println("Both conditions are met");
        }else {
            System.out.println("At least one condition is not met");
        }
    }
    /*
Challenge 4: Logical Operators and Multiple Conditions
Step 1: Create a double variable with a value of 10.0.
Step 2: Create a second variable of type double with a value of 5.0.
Step 3: Use the addition assignment operator (+=) to add the second number to the first.
Step 4: Create a third variable of type integer with a value of 15.
Step 5: Create a boolean variable that checks if the first variable is equal to the third variable.
Step 6: Create a second boolean variable that checks if the first variable is less than 20 AND the third variable is greater than 10.
Step 7: Output the result of applying the logical AND operator (&&) to the two boolean variables from steps five and six.
Step 8: Write an if-then-else statement that displays "Both conditions are met" if the result in step seven is true,
and "At least one condition is not met" otherwise.
     */
}
