
import java.util.Calendar;
import java.util.Date;

public class Patient {
    private String patient_id;  // patient id will be in strings ex: 100023//
    private String name;   // name as strings ex: peter//
    private String address; // same with address//
    private int height; // height will be int as it will be inches//
    private double weight; // weight will be double because it is from 0 to 100//
    private Date dob;       // all dates will be in date type//
    private String doi;
    private Date dol;
    public String getPatient_id() {
        return patient_id;
    }
 
    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }
   
    public String getName() {
        return name;
    }
    

    public void setName(String name) {
        this.name = name;
    }
   
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
   
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public double getWeight() {
        return weight;
    }
   
    public void setWeight(double weight) {
        this.weight = weight;
    }
   
    public Date getDob() {
        return dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    public Date getDoi() {
        return doi;
    }
    
    public void setDoi(String string) {
        this.doi = string;
    }
   
    public Date getDol() {
        return dol;
    }
    
    public void setDol(Date dol) {
        this.dol = dol;
    }
     
     public int getAge() {
    long diff = Calendar.getInstance().getTimeInMillis();
    this.dob.getTime();
       
        int diffDays = (int) (diff / (24 * 1000 * 60 * 60));
        
        return diffDays / 365;
    }
    
public int get_time_as_patient() {

        long diff = Calendar.getInstance().getTimeInMillis() - this.doi.getTime();
        
        int diffDays = (int) (diff / (24 * 1000 * 60 * 60));

        return diffDays / 365;
    }


    public int get_time_sincle_lastvisit() {
        
        long diff = Calendar.getInstance().getTimeInMillis() - this.dol.getTime();
        
        int diffDays = (int) (diff / (24 * 1000 * 60 * 60));
        
        return diffDays / 365;
    }
}
