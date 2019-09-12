import java.util.Scanner;
public class Kapitel_2_opgaver {
    public static void main (String[] args) {


        //assignment 2.1
        double miles;
        Scanner s = new Scanner(System.in);
        System.out.println("enter amount of miles: ");
        miles = s.nextDouble();
        double kilometers = miles * 1.6;
        System.out.println(kilometers + " kilometers ");

        //assignment 2.2
        double length;
        Scanner t = new Scanner(System.in);
        System.out.println("enter length of triangle: ");
        length = t.nextDouble();
        double area = 1.73/4 * (length*length);
        System.out.println(area + " area ");
        area = t.nextDouble();
        double volume = area * length;
        System.out.println(volume + " volume of Triangular Prism ");

        //assignment 2.12
        Scanner u = new Scanner(System.in);
        System.out.println("Enter the amount of speed: ");
        double speed = u.nextDouble();
        System.out.println("Enter the amount of acceleration: ");
        double acceleration = u.nextDouble();
        double runway_length = (Math.pow(speed , 2)/(2 * acceleration));
        System.out.println("the minimum runway length needed for this plane is " +runway_length);

        //assignment 2.17
        Scanner p = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit between-58F and 14F: ");
        double temperature = p.nextDouble();
        System.out.print("Enter The Wind Speed (=> 2) in miles per hour: ");
        double wind_speed = p.nextDouble();
        double wind_chill_temperature = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(wind_speed, 0.16) +
                0.4275 * temperature * Math.pow(wind_speed, 0.16);
        System.out.printf("The Wind Chill Index is %5f", wind_chill_temperature);

        //assignment 2.23
        Scanner q = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double driving_distance = q.nextDouble();
        System.out.println("Enter the miles per gallon: ");
        Double gallon_per_miles = q.nextDouble();
        System.out.println("Enter the price per gallon: ");
        Double price_per_gallon = q.nextDouble();
        System.out.println("Enter the cost of driving: ");
        Double cost_of_driving = (driving_distance / gallon_per_miles) * price_per_gallon;
        System.out.printf("the cost of driving is £%.2f", cost_of_driving);


    }
}

