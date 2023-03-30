

import java.util.Scanner;

public class facility 
{
    String facility_Name;

    public void add_facility()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("fecility:-");
        facility_Name = sc.nextLine();
        
        // sc.close();
    }

    public void show_facility()
    {
        System.out.println(facility_Name);
    }

}
