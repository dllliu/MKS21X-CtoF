// The functions should have doubles as parameters, so the type is double
//The functions should return the equivalent temperature, also as a double.

public class temp
{
    public static double celsiusToFahrenheit(double celcius)
    {
    double fahrenheit = (celcius)*(9/5) + 32;
    return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit)
    {
    double celsius = (fahrenheit-32)*(5/9);
    return celsius;
    }
}
