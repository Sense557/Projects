package HMS;

import java.util.Scanner;

public class staff
{
    String sid;
    String sname;
    String sdesignation;
    String sex;
    int salary;

    
    public void new_staff()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id:- ");
        sid = sc.nextLine();
        System.out.println("Name:- ");
        sdesignation = sc.nextLine();
        System.out.println("sex:- ");
        sex = sc.nextLine();
        System.out.println("Salary:- ");
        salary = sc.nextInt();
        // sc.close();
    }
    

    public void staff_info() 
    {
        System.out.println(sid + "\t"  + sname + "\t" + sdesignation + "\t" + sex + "\t" + salary);
    }

}
