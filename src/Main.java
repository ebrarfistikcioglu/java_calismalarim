//public class Main
// {
//    public static void main(String[] args)
//    {
//        System.out.println("hello world");
//    }
//}

//public class Main
//{
//    public static void main(String[] args)
//    {
//        System.out.println(3.5 * 4 / 2 - 2.5);
//    }
//}

//import java.util.Scanner; // Scanner is in the java.util package
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number for radius: ");
//         double radius = input.nextDouble();
//        double area = radius * radius * 3.14159;
//        System.out.println("The area for the circle of radius " +
//        radius + " is " + area);
//        }}

// nesneye yonelikte istedigin kadar veri tipi olusturabilirsin

//import java.util.Scanner; // import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter two numbers: ");
//
//        double number1 = input.nextDouble();
//        double number2 = input.nextDouble();
//
//        double average = (number1 + number2) / 3;
//        System.out.print("The average of " + number1 + " " + number2 + " is: " + average);
//    }
//}

//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter radius: ");
//        double radius = input.nextDouble();
//        System.out.print("Enter length: ");
//        double length = input.nextDouble();
//
//        double area = radius * radius * 3.14;
//        double volume = area * length;
//        System.out.print("volume is: " + volume );
//    }
//}


//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        final double CARPIM = 0.454;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number in pounds: ");
//        double pounds = input.nextDouble();
//        double kilogram = pounds * CARPIM;
//        System.out.print(pounds + " pound is " +kilogram+" kilogram");
//    }
//}

//        System.out.print(pounds + " pounds is " + kilogram);
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        System.out.println("welcome to java");
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        System.out.println("welcome to java \n".repeat(5));
//    }
//}

//public class Main{
//    public static void main(String[] args){
//        System.out.println("   j     a\n   j    a a");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.print((9.5 * 4.5 - 2.5 * 3) / 45.5 - 3.5);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("a\ta^2\ta^3");
//        System.out.println("1\t1\t1");
//        System.out.println("2\t4\t8");
//    }
//}

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a radius:");
//        double radius = input.nextDouble();
//
//        double perimeter = 2 * radius * 3.14;
//        double area = radius * radius * 3.14;
//
//        System.out.print("perimeter is " + perimeter + " and area is " + area);
//    }
//}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a width:");
//        double width = input.nextDouble();
//        System.out.print("Enter a height:");
//        double height = input.nextDouble();
//
//        double area = width * height;
//        double perimeter = 2 * (width + height);
//        System.out.print("area is " + area + " and perimeter of rectangle is " + perimeter);
//    }
//}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        final double CARPIM = 1.6;
//        double miles = 14 / CARPIM;
//        double timeHour = ((45 * 60 + 30) / 3600.0);
//        double hesap = miles / timeHour;
//        System.out.print("the average speed in miles per hour is " + hesap);
//    }
//}
import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//       int secondsInYear = 365 * 24 * 60 * 60;
//       int birthPerYear = secondsInYear / 7;
//       int deathPerYear = secondsInYear / 13;
//       int immigrantsPerYear = secondsInYear / 45;
//       int currentPopulation = 312032486;
//       int netChangePerYear = birthPerYear - deathPerYear + immigrantsPerYear;
//        currentPopulation += netChangePerYear;
//        System.out.println("year 1 population: " + currentPopulation);
//        currentPopulation += netChangePerYear;
//        System.out.println("year 2 population: " + currentPopulation);
//        currentPopulation += netChangePerYear;
//        System.out.println("year 3 population: " + currentPopulation);
//
//    }
//    }

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a radius:");
//        double radius = input.nextDouble();
//        double s = 2 * radius * Math.sin(Math.PI / 5);
//        if (radius >0) {
//            double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
//            System.out.println("the area is " + area);
//        }
//        else {
//            System.out.println("radius must be positive");
//            }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        final double CARPIM = 1.6;
//        double runnerRun = 24 * CARPIM;
//        double seconds = (60 * 60) + (40 * 60) + 35;
//        double timeInHours = seconds / 3600.0;
//        double speed = runnerRun / timeInHours;
//        System.out.println("the average speed in kilometers per hour is " + speed);
//}
//}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter an integer for seconds: ");
        int seconds = input.nextInt();
        int minutes = seconds / 60 ;
        int remainingSeconds = seconds % 60;
        System.out.print(seconds + " seconds is "+ minutes + " minutes and " + remainingSeconds + "seconds");
    }

    }