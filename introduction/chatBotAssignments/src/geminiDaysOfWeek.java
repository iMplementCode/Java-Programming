public class geminiDaysOfWeek {
    public static void main(String[] args) {
        int daysOfYear = 365;
        int daysOfWeek = 7;
        //Find remaining days using the modulus operator.
        int remainingDays = daysOfYear%daysOfWeek;
        //String to hold a message
        String daysLeftMessage = "days left in a week";
        boolean isZeroDays = remainingDays == 0 ? true : false;
        if (isZeroDays){
            System.out.println("It is the end of the week");
        }
        System.out.println(remainingDays + " " +daysLeftMessage);
    }
}
/*
Challenge 2: Using the Modulo Operator and Strings
Step 1: Create a variable of type integer with a value of 365.
Step 2: Create a second variable of type integer with a value of 7.
Step 3: Find the remainder when the first number is divided by the second number.
Step 4: Create a variable of type string with the value "days left in the week."
Step 5: Use the ternary operator to create a string variable that displays a message. If the remainder in step three is 0, the message should be "It's the end of a full week." If the remainder is not 0, the message should be the remainder followed by the string from step four (e.g., "1 days left in the week").
Step 6: Output the message from step five.
 */