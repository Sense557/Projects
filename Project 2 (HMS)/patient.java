

import java.util.Scanner;

public class patient
{
    String pid;
    String pname;
    String disease;
    String sex;
    String admit_status;
    int age;

    public void new_patient()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id:- ");
        pid = sc.nextLine();
        System.out.println("Name:- ");
        pname = sc.nextLine();
        System.out.println("Disease:- ");
        disease = sc.nextLine();
        System.out.println("sex:- ");
        sex = sc.nextLine();
        System.out.println("Admit-status:- ");
        admit_status = sc.nextLine();
        System.out.println("Age:- ");
        age = sc.nextInt();
        // sc.close();
    }

    public void patient_info() 
    {
        System.out.println(pid + "\t" + pname + "\t" + disease + "\t" + sex + "\t" + admit_status + "\t" + age );
    }

}
