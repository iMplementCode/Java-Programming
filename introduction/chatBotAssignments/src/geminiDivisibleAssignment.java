public class geminiDivisibleAssignment {
    public static void main(String[] args) {
        int a = 150;
        int b = 10;
        int c = (a/b);
        int remainder = (a%b);
        boolean isZero = remainder == 0 ? true : false;
        System.out.println(isZero);
        if (isZero){
            System.out.printf("The first number is perfectly divisible by the second number");
        }

    }
}
/*
Challenge 1: Working with Integers and Division
Step 1: Create an integer variable with a value of 150.
Step 2: Create a second variable of type integer with a value of 10.
Step 3: Divide the first number by the second number.
Step 4: Use a remainder operator to figure out what the remainder of the operation in step three is.
Step 5: Create a boolean variable that assigns the value true if the remainder in step four is 0, or false if it's not.
Step 6: Output the boolean variable just to see what the result is.
Step 7: Write an if-then statement that displays a message, "The first number is perfectly divisible by the second number," if the boolean in step five is true.
 */