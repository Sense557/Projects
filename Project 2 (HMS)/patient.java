

import java.util.*;

public class patient
{
    String pid;
    String pname;
    String disease;
    String sex;
    String admit_status;
    int age;

    static Scanner sc = new Scanner(System.in);
      static Map<String, List<String>> appointments = new HashMap<String, List<String>>();

    public void bookAppointment() 
    {
        System.out.println("\nPlease enter the patient's name:");
        String pname = sc.nextLine();
        System.out.println("Please enter the appointment date (DD/MM/YYYY):");
        String appointmentDate = sc.nextLine();
        List<String> appointmentsList = appointments.get(appointmentDate);
        if (appointmentsList == null) 
        {
            appointmentsList = new ArrayList<String>();
            appointments.put(appointmentDate, appointmentsList);
        }
            appointmentsList.add(pname);
            System.out.println("Appointment booked successfully for " + pname + " on " + appointmentDate + ".");
    }

    public void viewAppointments() {
        System.out.println("\nPlease enter the appointment date (DD/MM/YYYY):");
        String appointmentDate = sc.nextLine();
        List<String> appointmentsList = appointments.get(appointmentDate);
        if (appointmentsList == null) {
            System.out.println("No appointments booked on " + appointmentDate + ".");
            return;
        }
        System.out.println("Appointments booked on " + appointmentDate + ":");
        for (String pname : appointmentsList) {
            System.out.println(pname);
        }
    }

    public void cancelAppointment() 
    {
        System.out.println("\nPlease enter the appointment date (DD/MM/YYYY):");
        String appointmentDate = sc.nextLine();
        List<String> appointmentsList = appointments.get(appointmentDate);
        if (appointmentsList == null) {
            System.out.println("No appointments booked on " + appointmentDate + ".");
            return;
        }
        System.out.println("Please enter the patient's name:");
        String pname = sc.nextLine();
        boolean removed = appointmentsList.remove(pname);
        if (removed) {
            System.out.println("Appointment cancelled successfully for " + pname + " on " + appointmentDate + ".");
        } else {
            System.out.println("Appointment not found for " + pname + " on " + appointmentDate + ".");
        }
    }

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
        System.out.println(pid + "\t" + pname + "\t" + disease + "    \t" + sex + "     \t" + admit_status + "\t" + age );
    }

}
