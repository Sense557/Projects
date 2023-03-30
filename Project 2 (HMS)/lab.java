

import java.util.Scanner;

public class lab 
{
    String facility;
    int lab_cost;
    
    void new_facility()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Facility:- ");
        facility = sc.nextLine();
        System.out.println("Cost:- ");
        lab_cost = sc.nextInt();

        // sc.close();
    }
    void list_facilities()
    {
        System.out.println(facility+ "\t\t" +lab_cost);
    }
}
