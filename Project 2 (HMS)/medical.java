

import java.util.Scanner;

public class medical 
{
    String med_name, med_comp, exp_date;
    int med_cost, count;
    void new_medi()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("name:-");
        med_name = sc.nextLine();
        System.out.print("comp:-");
        med_comp = sc.nextLine();
        System.out.print("exp_date:-");
        exp_date = sc.nextLine();
        System.out.print("cost:-");
        med_cost = sc.nextInt();
        System.out.print("no of unit:-");
        count = sc.nextInt();
        // sc.close();
    }
    void find_medi()
    {
        System.out.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
    }

}
