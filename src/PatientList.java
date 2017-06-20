import java.util.Date;
import java.util.LinkedList;


public class PatientList extends LinkedList<Patient> {

   /
    public boolean add(PatientList p) {
        if (this.size() == 0) {
            super.add(p);
        }
        // for loop created to check the id's//
        for (int i = 0; i < this.size(); i++) {
            /*if condition is passed ; it returns false 
             when the exisiting id equals the input id
             */
            if (p.getPatient_id().equalsIgnoreCase(this.get(i).getPatient_id())) {
                System.out.println(" Error Its a duplicate id ");
                return false;
            } else {
                // if condition is true ; it will be keep new id's//
                super.add(p);
                return true;
            }
        }
        return true;
    }

    @Override
    /* method is written to meausre the size of all the input 
     integers as well as existing
     */

    public int size() {
        return super.size(); //To change body of generated methods, choose Tools | Templates.
    }

    /* method is written to find or remove
     the id from the list ; and pointer is been used 
     to find the existence of the id in the 
     memomry and to extract the information if
     needed in future use
    
     */
    public void remove(String id) {

        int pointer = 0;
        for (int i = 0; i < this.size(); i++) {
            if (id.equalsIgnoreCase(this.get(i).getPatient_id())) {
                System.out.println(" we found this id in our list");
                pointer = i;
                break;
            }

            this.remove(pointer);
        }
    }
    /* method is been passed to add new id
    
     */

    Patient getNext(String id) {

        int k = Integer.parseInt(id);
        /* the id is been added in the 
         form k , k+1 , k+2, k+n
         */
        String patientid = "" + (k + 1);
        if (find(patientid)) {

            for (int i = 0; i < this.size(); i++) {
                /* for loop is been passed ;
                 increment the value of i and return the
                 value
                 */
                if (patientid.equalsIgnoreCase(this.get(i).getPatient_id())) {

                    return this.get(i);
                }
            }
        }
        /*
         if the value of i becomes greater
         than the size of the int ; it returns
         null
         */
        return null;

    }
    /* method to find the id from the file
    
     */

    boolean find(String id) {
        for (int i = 0; i < this.size(); i++) {
            /* for loop is passed ; and if
             the entered id is same as the exisitng
             id ; it will be return all the information 
             about the id
             */
            if (id.equalsIgnoreCase(this.get(i).getPatient_id())) {
                System.out.println(" we found this id in our list");
                System.out.println(" Name: " + this.get(i).getName());
                System.out.println(" Address: " + this.get(i).getAddress());
                System.out.println(" Height: " + this.get(i).getHeight());
                System.out.println(" Weight: " + this.get(i).getWeight());
                System.out.println(" Date of birth: " + this.get(i).getDob());
                System.out.println("Date of initial visit: " + this.get(i).getDoi());
                System.out.println("Date of last visit: " + this.get(i).getDol());

                return true;
            }
            /* if the entered id and any of the exisitng id is 
             not same it will return false
             */
        }
        return false;
    }
    /* method is been 
     to reset the id
     */

    public void reset() {
        for (int i = 0; i < this.size(); i++) {

            this.add(i, null);
        }
    }
    /* method to display list

     */

    public void displayList() {

        for (int i = 0; i < this.size(); i++) {
            System.out.print(this.get(i).getName() + " ");
            System.out.print(this.get(i).getPatient_id() + " ");
            System.out.print(this.get(i).getAddress() + " ");
            System.out.print(this.get(i).getHeight() + " ");
            System.out.print(this.get(i).getWeight() + " ");
            System.out.print(this.get(i).getDob() + " ");
            System.out.print(this.get(i).getDoi() + " ");
            System.out.println(this.get(i).getDol() + " ");

        }

    }

    /* method to find 
     the average age ; used simple mathematics
     */
    public void averageAge() {
        /* set the initial age to 0
    
         */
        int age = 0;
        /* for loop is passed and added all the ages
    
         */
        for (int i = 0; i < this.size(); i++) {
            age = age + this.get(i).getAge();
        }
        /* average age is been divided by the size of the age
     
         */
        int avgAge = age / this.size();
    }
    /* method passed for the notification settings
     to check is anyone is due for 3 years
     */

    public void patientCheckup() {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).get_time_sincle_lastvisit() > 3) {
                System.out.println("This patient is due for checkup since 3" + this.get(i).getName());
            }
        }
    }
    /* method passed to find the youngest patient

     */

    public void youngestPatient() {
        /* set int young =150 as no one 
         can be 150 years old and values
         are compared with if and else condition
         */
        int young = 150;
        int k = 0;
        //  Collections.sort(this);
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getAge() < young) {
                young = this.get(i).getAge();
                k = i;
            }
        }
        System.out.println(" *** youngest is " + this.get(k).getName());
    }

	public void setName(String element) {
		
		
	}

	public void setPatient_id(String element) {
		// TODO Auto-generated method stub
		
	}

	public void setAddress(String element) {
		// TODO Auto-generated method stub
		
	}

	public void setHeight(double d) {
		// TODO Auto-generated method stub
		
	}

	public void setDob(Date parse) {
		// TODO Auto-generated method stub
		
	}
}
 