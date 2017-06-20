
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;


public class FileReader {
  Path file = Paths.get("C:\\dsproject\\patientfile.txt");
    PatientList plist = new PatientList();

    FileReader() {
throw new UnsupportedOperationException("Not supported yet."); //To change  //       body of generated methods, choose Tools | Templates.
    }

    

public static void main(String args[]) throws IOException,ParseException {

        FileReader f = new FileReader();

    public void menudriven() throws IOException,ParseException {
        while (true) {
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

            System.out.println("1.DisplayList");
            System.out.println("2.Add a new patient");
            System.out.println("3.Show information for a patient");
            System.out.println("4.Delete a patient");
            System.out.println("5.Show Average patient age");
            System.out.println("6.Show information for the youngest patient ");
            System.out.println("7.Show notification list");
            System.out.println("8.Quit");
            System.out.println("Enter Your choice");
            int ch = Integer.parseInt(br.readLine());
        switch (ch) {
                case 1:
                    plist.displayList();
                    break;

                case 2:
                System.out.println(" enter name");
                   
 BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                    Patient p = new Patient();
                    p.setPatient_id(br1.readLine());
                    System.out.println("enter patient id ");
                    
BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                    p.setPatient_id(br2.readLine()); 
                    System.out.println("Enter patient address");
                    
                    BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
                    p.setAddress(br3.readLine()); 
                    System.out.println(p.getAddress()+"<<<Enter patient height in inchies");
                    BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
                    p.setHeight(br4.read()); 
                    System.out.println("Enter patient weight");
                    BufferedReader br5 = new BufferedReader(new InputStreamReader(System.in));
                    p.setWeight(br5.read()); 
                    System.out.println("Enter Date of birth");
                    BufferedReader br6 = new BufferedReader(new InputStreamReader(System.in));
                   DateFormat df = new SimpleDateFormat("mm-dd-yyyy"); //01-15-1975
                    String dob = br6.read()+"";     
                    System.out.println(" *** dob "+dob);

                    p.setDob(df.parse(dob));
                    
                    System.out.println(" $$$$ &&&& "+df.parse(dob));
                    System.out.println("Enter Doi ");
                    BufferedReader br7 = new BufferedReader(new InputStreamReader(System.in));
                    p.setDoi(br7.readLine()); 
                    System.out.println("Dol");
                    BufferedReader br8 = new BufferedReader(new InputStreamReader(System.in));
                    p.setDoi(br8.readLine()); 
                    plist.add(p);
                    break;
              case 3: System.out.println(" Enter the id to search: ");
                    BufferedReader br9 = new BufferedReader(new InputStreamReader(System.in));
                    plist.find(br9.readLine());
                    break;
            case 4: System.out.println(" Enter the id to delete: ");
                    BufferedReader br10 = new BufferedReader(new InputStreamReader(System.in));
                    plist.remove(br10.readLine());
                    break;
             case 5:                    
                    plist.averageAge();
                    break;

                case 6:
                   
                    plist.youngestPatient();
                    break;
           case 7:
                  
                    plist.patientCheckup();
                    break;
              case 8:
                    BufferedReader br20 = new BufferedReader(new InputStreamReader(System.in));
                  
                    System.exit(0);
                    break;

            }
         }
    }

public void processFile() throws ParseException{

        if (Files.exists(file) && Files.isReadable(file)) {

            try {
                // File reader
                BufferedReader reader = Files.newBufferedReader(file, Charset.defaultCharset());

                PatientList p = null;
                String line;
                // read each line
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                   
                    StringTokenizer tokenizer = new StringTokenizer(line, " ");
                    int j = 0;
                    while (tokenizer.hasMoreElements()) {
                        // parse each integer in file
                        String element = tokenizer.nextToken();

                        if (j == 0) {
                            p = new PatientList();
                            p.setName(element);
                            System.out.println("*** set name "+p.getName());

                        }
                        if (j == 1) {
                            p.setPatient_id(element);
                            
                            System.out.println("*** set patient id "+p.getPatient_id());
                        }
              
                        if (j == 2) {
                            p.setAddress(element);                            
                            System.out.println("*** set patient id "+p.getAddress());
                                    
                        }
                            
                       if (j == 3) {
                            p.setHeight(Integer.parseInt(element));                            
                            System.out.println("*** set patient height "+p.getHeight());
                                    
                        }
                     if (j == 4) {
                            p.setHeight(Double.parseDouble(element));                            
                            System.out.println("*** set patient weight "+p.getWeight());
                                    
                        }
                    
                     if(j==5) {
                         System.out.println(" *** dob "+element);
                        DateFormat df = new SimpleDateFormat("mm-dd-yyyy"); //01-15-1975
               
                      System.out.println(" *** dob parsed is "+df.parse(element));
                    
                       p.setDob(df.parse(element));
                    
                         p.setDob(null);
                         
                     }
                        j++;

                    }

                    plist.add(p);
                }
                reader.close();
            } catch (IOException e) {
            }
        }
    }
}
