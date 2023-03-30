

import java.util.Calendar;
import java.util.Scanner;

/**
 *  Hospital Management System (Console-Based)
 */


public class HMS 
{
    public static void main(String[] args) 
    {
        String months[] = {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        int count1 = 4, count2 = 4, coun3 = 4, count4 = 4, count5 = 4, count6 = 4;
        System.out.println("\n-----------------------------------------------------------------------------------");
        System.out.println("                        ****Welcome to Apollo Hospital****");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.print("Date: "+calendar.get(Calendar.DATE)+" "+months[calendar.get(Calendar.MONTH)]+ " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: "+calendar.get(Calendar.HOUR)+ ":" +calendar.get(Calendar.MINUTE)+":"+calendar.get(Calendar.SECOND));
        

        doctor d [] = new doctor[25];
        patient p [] = new patient[100];
        lab l [] = new lab [10];
        facility f [] = new facility [10];
        medical m [] = new medical [1000];
        staff s [] = new staff [25];

        for(int i = 0; i < d.length; i++)
            d[i] = new doctor();
        for (int i = 0; i < p.length; i++)
            p[i] = new patient();
        for (int i = 0; i < l.length; i++)
            l[i] = new lab();
        for (int i = 0; i < f.length; i++)
            f[i] = new facility();
        for (int i = 0; i < m.length; i++)
            m[i] = new medical();
        for (int i = 0; i < s.length; i++)
            s[i] = new staff();

        d[0].did = "21";
        d[0].dname = "Dr.Ghanendra";
        d[0].dspecialization = "ENT";
        d[0].dworkTime = "5-11AM";
        d[0].dqualification = "MBBS,MD";
        d[0].droomNo = 17;
        d[1].did = "32";
        d[1].dname = "Dr.Vikram";
        d[1].dqualification = "Physician";
        d[1].dworkTime= "10-3AM";
        d[1].dqualification = "MBBS,MD";
        d[1].droomNo = 45;
        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].dqualification = "Surgeon";
        d[2].dworkTime= "8-2AM";
        d[2].dqualification = "BDM";
        d[2].droomNo = 8;
        d[3].did = "33";
        d[3].dname = "Dr.Pramod";
        d[3].dqualification = "Artho";
        d[3].dworkTime= "10-4PM";
        d[3].dqualification = "MBBS,MS";
        d[3].droomNo = 40;

        p[0].pid = "12";
        p[0].pname = "Pankaj";
        p[0].disease = "Cancer";
        p[0].sex = "Male";
        p[0].admit_status = "y";
        p[0].age = 30;
        p[1].pid = "13";
        p[1].pname = "Sumit";
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 23;
        p[2].pid = "14";
        p[2].pname = "Alok";
        p[2].disease = "Maleriya";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 45;
        p[3].pid = "15";
        p[3].pname = "Ravi";
        p[3].disease = "Diabetes";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 25;

        m[0].med_name = "Corex";
        m[0].med_comp = "Cino pvt";
        m[0].exp_date = "9-5-16";
        m[0].med_cost = 55;
        m[0].count = 8;
        m[1].med_name = "Nytra";
        m[1].med_comp = "Ace pvt";
        m[1].exp_date = "4-4-15";
        m[1].med_cost = 500;
        m[1].count = 5;
        m[2].med_name = "Brufa";
        m[2].med_comp = "Reckitt";
        m[2].exp_date = "12-7-17";
        m[2].med_cost = 50;
        m[2].count = 56;
        m[3].med_name = "Pride";
        m[3].med_comp = "DDF pvt";
        m[3].exp_date = "12-4-12";
        m[3].med_cost = 1100;
        m[3].count = 100;

        l[0].facility = "X-ray     ";
        l[0].lab_cost = 800;
        l[1].facility = "CT Scan   ";
        l[1].lab_cost = 1200;
        l[2].facility = "OR Scan   ";
        l[2].lab_cost = 500;
        l[3].facility = "Blood Bank";
        l[3].lab_cost = 50;

        f[0].facility_Name= "Ambulance";
        f[1].facility_Name = "Admit Facility ";
        f[2].facility_Name = "Canteen";
        f[3].facility_Name = "Emergency";

        s[0].sid = "22";
        s[0].sname = "Prakash";
        s[0].sdesignation = "Worker";
        s[0].sex = "Male";
        s[0].salary = 5000;
        s[1].sid = "23";
        s[1].sname = "Komal";
        s[1].sdesignation = "Nurse";
        s[1].sex = "Female";
        s[1].salary = 2000;
        s[2].sid = "24";
        s[2].sname = "Raju";
        s[2].sdesignation = "Worker";
        s[2].sex = "Male";
        s[2].salary = 5000;
        s[3].sid = "25";
        s[3].sname = "Rani";
        s[3].sdesignation = "Nurse";
        s[3].sex = "Female";
        s[3].salary = 20000;
        s[3].sid = "26";
        s[3].sname = "Suresh";
        s[3].sdesignation = "Security";
        s[3].sex = "Male";
        s[3].salary = 8000;


        Scanner sc = new Scanner(System.in);
        int choice, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        
        
        while (status==1) 
        {
            System.out.println("\n                                 MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1: 
                    {
                        System.out.println("\n--------------------------------------------------------------------------------");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s1 = 1;
                        while(s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = sc.nextInt();
                            switch (c1) 
                            {
                                case 1: 
                                    {
                                        d[count1].new_doctors();
                                        count1++;
                                    }
                                    break;
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        
                                        for(int j = 0; j<count1; j++)
                                        {
                                            d[j].doctor_info();
                                        }
                                        break;
                                    }
                                default: System.out.println("Invalid Choice! ");
                                // break;
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = sc.nextInt();
                        }
                        break;
                    }
                    
                case 2: 
                    {
                        System.out.println("\n--------------------------------------------------------------------------------");
                        System.out.println("                      **PATIENT SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        s2 = 1;
                        while (s2 == 1) 
                        {
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = sc.nextInt();
                            switch (c1) {
                                case 1:
                                    {
                                        p[count2].new_patient(); count2++;
                                        break;
                                    }

                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        
                                        for(int j=0; j<count2; j++)
                                        {
                                            p[j].patient_info();
                                        }
                                        break;
                                    }

                                default: System.out.println("Invalid Choice!");
                                // break;
                            }
                            System.out.println("\n Retrun back Press 1 or for Main Menu press 0");
                            s2 = sc.nextInt();
                        }
                        
                        break;
                    }
                case 3: 
                    {
                        System.out.println("\n--------------------------------------------------------------------------------");
                        System.out.println("                      **MEDICINE SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        
                        while (s3 == 1) 
                            {
                                System.out.println("1.Add New Entry\n2. Existing Medicines List");
                                c1 = sc.nextInt();

                                switch (c1) {
                                    case 1:
                                    {
                                        m[coun3].new_medi();coun3++;
                                        break;
                                    }
                                    case 2:
                                    {
                                        for(int j = 0; j<coun3; j++)
                                        {
                                            m[j].find_medi();
                                        }
                                        break;
                                    }
                                    default: System.out.println("Invalid Choice!");
                                    // break;
                                }
                                System.out.println("\n Retrun back Press 1 or for Main Menu press 0");
                                s3 = sc.nextInt();
                            }
                        break;
                    }
                case 4: 
                    {
                        System.out.println("\n--------------------------------------------------------------------------------");
                        System.out.println("                      **LABORATORY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");

                        while (s4 == 1) 
                        {
                            System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                            c1 = sc.nextInt();
                            switch (c1) {
                                case 1:
                                    {
                                        l[count4].new_facility();count4++;
                                        break;
                                    }

                                case 2:
                                    {
                                        for(int j = 0; j < count4; j++)
                                        {
                                            l[j].list_facilities();
                                        }
                                        break;
                                    }

                                default: System.out.println("Invalid Choice!");
                                    break;
                            }
                            System.out.println("\n Retrun back Press 1 or for Main Menu press 0");
                            s4 = sc.nextInt();
                        }
                        break;
                    }
                
                case 5: 
                    {
                        System.out.println("\n--------------------------------------------------------------------------------");
                        System.out.println("                      **FACILITY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s5 == 1) 
                        {
                            System.out.println("1.Add New Facility\n2.Existing Facility List");
                            c1 = sc.nextInt();
                            switch (c1) {
                                case 1:
                                    {
                                        f[count5].add_facility();count5++;
                                        break;
                                    }

                                case 2:
                                    {
                                        for(int j = 0; j < count5; j++)
                                        {
                                            f[j].show_facility();
                                        }
                                        break;
                                    }

                                default: System.out.println("Invalid Choice!");
                                    break;
                            }
                            System.out.println("\n Retrun back Press 1 or for Main Menu press 0");
                            s5 = sc.nextInt();
                        }
                        break;
                    }
                case 6: 
                    {
                        System.out.println("\n--------------------------------------------------------------------------------");
                        System.out.println("                      **STAFF SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s6 == 1) 
                        {
                            String a = "Nurse", b = "Worker", c = "Security";
                            System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                            c1 = sc.nextInt();
                            switch(c1)
                            {
                                
                                case 1:
                                {
                                    s[count6].new_staff();count6++;
                                    break;
                                }
                                case 2:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Gender \t Salary");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for(int j = 0; j < count6; j++)
                                    {
                                        if(a.equals(s[j].sdesignation))
                                        s[j].staff_info();
                                    }
                                    break;
                                }
                                case 3:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Gender \t Salary");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for(int k = 0; k < count6; k++)
                                    {
                                        if(b.equals(s[k].sdesignation))
                                        s[k].staff_info();
                                    }
                                    break;
                                }
                                case 4:
                                {
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("id \t Name \t Gender \t Salary");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for(int ll = 0; ll < count6; ll++)
                                    {
                                        if(c.equals(s[ll].sdesignation))
                                        s[ll].staff_info();
                                    }
                                    break;
                                }
                                default: System.out.println("Invalid Choice!");
                                break;
                            }
                            System.out.println("\n Retrun back Press 1 or for Main Menu press 0");
                            s6 = sc.nextInt();
                        }
                        break;
                    }
                default: 
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }

            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = sc.nextInt();
            sc.close();
        
        }

        
    }
}
