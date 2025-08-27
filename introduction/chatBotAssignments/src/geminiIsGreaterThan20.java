public class geminiIsGreaterThan20 {
    public static void main(String[] args) {
        double x = 5.5d;
        int y = 2;
        double multiplyXY = (x*y);
        System.out.printf("multiplyXY: " +multiplyXY);
        //Post-increment operator
        multiplyXY++;
        System.out.println("The value of multiplyXY after increment is: " +multiplyXY);
        //Multiply the third variable by 2
        multiplyXY = multiplyXY*2;
        System.out.println("The new value of multiplyXY is: "+multiplyXY);
        boolean isGreaterThan20 = multiplyXY > 20 ? true : false;
        if (isGreaterThan20){
            System.out.print("The value is high");
        }else {
            System.out.print("The value is low");
        }
    }
}
/*
Challenge 3: Combining Data Types and Expressions
Step 1: Create a double variable with a value of 5.5.
Step 2: Create a second variable of type integer with a value of 2.
Step 3: Create a third variable of type double and assign it the result of multiplying the first two variables.
Step 4: Add a post-increment operator to the third variable.
Step 5: Multiply the third variable by 2.
Step 6: Create a boolean variable that checks if the result from step five is greater than 20.
Step 7: Output the boolean variable.
Step 8: Write an if-then-else statement that displays a message "The result is high" if the boolean in step six is true, and "The result is low" otherwise.
 */