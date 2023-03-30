

import java.util.Scanner;

/**
 *  Doctors
 */


public class doctor 
{
    String did;
    String dname;
    String dspecialization;
    String dworkTime;
    String dqualification;
    int droomNo;

    void new_doctors()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id:- ");
        did = sc.nextLine();
        System.out.println("Name:- ");
        dname = sc.nextLine();
        System.out.println("Specialization:- ");
        dspecialization = sc.nextLine();
        System.out.println("Worktime:- ");
        dworkTime = sc.nextLine();
        System.out.println("Qualification:- ");
        dqualification = sc.nextLine();
        System.out.println("RoomNo:- ");
        droomNo = sc.nextInt();
        // sc.close();
    }


    void doctor_info ()
    {
        System.out.println(did + "\t | " + dname + "\t | " + dspecialization + "\t\t | " +  dworkTime + "\t | " + dqualification  + "\t | " + droomNo );
    }
    

    
}
