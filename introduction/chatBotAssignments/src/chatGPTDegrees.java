public class chatGPTDegrees {
    public static void main(String[] args) {
        double celsiusTemperature = 37.0d;
        double fahrenheit = ((celsiusTemperature*(9.0/5)) + 32);
        boolean isFahrenheitGreaterThan100 = fahrenheit > 100 ? true : false;
        System.out.println("Celsius: " + celsiusTemperature+ " Fahrenheit: " +fahrenheit);
        if (isFahrenheitGreaterThan100){
            System.out.println("Hot");
        }
        else {
            System.out.println("Not too hot");
        }
        /*
Challenge 1 – Temperature Converter
Step 1: create a double variable with a Celsius temperature value, e.g., 37.0.
Step 2: convert it to Fahrenheit using the formula (Celsius * 9/5) + 32.
Step 3: store the result in a second double variable.
Step 4: check if the Fahrenheit value is greater than 100.
Step 5: create a boolean variable to hold the result of that check.
Step 6: print both Celsius and Fahrenheit values.
Step 7: use an if statement to print "Hot!" if the boolean is true, otherwise print "Not too hot.".
         */
    }
}
