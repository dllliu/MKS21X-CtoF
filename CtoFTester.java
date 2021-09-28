// The functions should have doubles as parameters, so the type is double
//The functions should return the equivalent temperature, also as a double.

class FtoCTester {

    public static void main(String[] args)
{
        double fahrenheit = 100.0;
        double celsius = 0.0;

        celsius = (fahrenheit - 32.0) * (5.0/9.0);

        System.out.println("value of temperature in celsius:" + celsius);
    }
  }


class CtoFTester {
  public static void main(String[] args)
{
        double fahrenheit = 0.0;
        double celsius = 100.0;

        fahrenheit = (celsius * (9.0/5.0)) + 32.0;

        System.out.println("value of temperature in fahrenheit:" + fahrenheit);
      }
}
