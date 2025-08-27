public class usPopulation {
    public static void main(String[] args) {
        // Given constants for time
        double secondsInMinutes = 60.0;
        double minutesInHours = 60.0;
        double hoursInDays = 24.0;
        double daysInYear = 365.0;

        // Given initial population from the challenge
        long currentPopulation = 312032486L;

        // Calculate the total number of seconds in one year
        double secondsInYear = secondsInMinutes * minutesInHours * hoursInDays * daysInYear;

        // Calculate the number of births, deaths, and immigrants per year
        // We use doubles for these calculations to maintain precision
        double birthsPerYear = (1.0 / 7.0) * secondsInYear;
        double deathsPerYear = (1.0 / 13.0) * secondsInYear;
        double immigrantsPerYear = (1.0 / 45.0) * secondsInYear;

        // Calculate the population change for a single year
        long populationChangePerYear = (long) (birthsPerYear - deathsPerYear + immigrantsPerYear);

        // --- Calculate and print population for Year 1 ---
        currentPopulation += populationChangePerYear;
        System.out.println("The population at the end of year 1 is: " + currentPopulation);

        // --- Calculate and print population for Year 2 ---
        currentPopulation += populationChangePerYear;
        System.out.println("The population at the end of year 2 is: " + currentPopulation);

        // --- Calculate and print population for Year 3 ---
        currentPopulation += populationChangePerYear;
        System.out.println("The population at the end of year 3 is: " + currentPopulation);

        // --- Calculate and print population for Year 4 ---
        currentPopulation += populationChangePerYear;
        System.out.println("The population at the end of year 4 is: " + currentPopulation);

        // --- Calculate and print population for Year 5 ---
        currentPopulation += populationChangePerYear;
        System.out.println("The population at the end of year 5 is: " + currentPopulation);
        /*
        Challenge
(Population projection) The U.S. Census Bureau projects population based on
the following assumptions:
 ■ One birth every 7 seconds
 ■ One death every 13 seconds
 ■ One new immigrant every 45 seconds
Write a program to display the population for each of the next five years.
Assume that the current population is 312,032,486, and one year has 365 days.
Hint: In Java, if two integers perform division, the result is an integer. The fractional part is truncated.
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional part,
one of the values involved in the division must be a number with a decimal point.
For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
         */
    }
}
