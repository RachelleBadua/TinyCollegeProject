/*
 * The MIT License
 *
 * Copyright 2022 Rachelle Badua.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package projectprogramming;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import static projectprogramming.Department.addPartTimeTeacher;

/**
 * @author Rachelle Badua
 * 
 */
public class ProjectProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        try {
            PartTime teacher1 = new PartTime("100001", "Rachelle", "Badua", "5146497001", "f", 
                "RachelleBadua@outlook.com", "2002-01-10", "Computertechnicien", 112, 25.0);
            PartTime teacher2 = new PartTime("100002", "Justine", "Mae", "5142345232", "f", 
                "JustineMae@outlook.com", "1997-05-02", "Computertechnicien", 42, 30.0);
            PartTime teacher3 = new PartTime("100003", "Ryan", "Jay", "5149568005", "m", 
                "RyanJay@outlook.com", "2002-06-26", "BuildingAnalyst", 42, 30.0);
            PartTime teacher4 = new PartTime("100004", "Nathan", "Brendan", "5145689768", "m", 
                "NathanBrendan@outlook.com", "2000-02-05", "MaterialAnalyst", 42, 30.0);
            PartTime teacher9 = new PartTime("100009", "Simon", "Joll", "5145687380", "m", 
                "SimonJoll@outlook.com", "1999-02-07", "Pharmacytechnicien", 42, 30.0);
            PartTime teacher10 = new PartTime("100010", "Rose", "Park", "5145682358", "f", 
                "RoseAnne@outlook.com", "1998-02-25", "Pharmacytechnicien", 42, 30.0);
        
            FullTime teacher5 = new FullTime("100005", "Kate", "Nolasco", "5144938506", "m", 
                "KateNolasco@yahoo.ca", "2002-05-18", "Pharmacian", 82, "InsuranceHealth");
            FullTime teacher6 = new FullTime("100006", "Micah", "Sophia", "5149386045", "f", 
                "MisoLaurente@yahoo.ca", "2003-04-06", "Pharmacian", 82, "InsuranceHealth");
            FullTime teacher7 = new FullTime("100007", "Kirsten", "Ombao", "5148395768", "f", 
                "KisrstenOB@yahoo.ca", "2004-03-29", "Architect", 42, "InsuranceHouse");
            FullTime teacher8 = new FullTime("100008", "Jervis", "Carl", "5144938506", "m", 
                "JervisCarlA@yahoo.ca", "2003-04-18", "Architect", 42, "InsuranceHouse");
            FullTime teacher11 = new FullTime("100011", "Jennie", "Carl", "5144938506", "f", 
                "JennieRuby@yahoo.ca", "2001-09-08", "Software", 42, "InsuranceHouse");
            FullTime teacher12 = new FullTime("100012", "Chae", "Son", "5144938506", "m", 
                "HelloWeAreTwice@yahoo.ca", "2000-06-28", "Database", 112, "InsuranceHouse");
        
            Staff staff1 = new Staff("200001", "Jake", "Bob", "5141234569", "m", 
                "HelloMyNameISJake@yahoo.ca", "2002-11-15", "researcher", 23);
            Staff staff2 = new Staff("200002", "Jay", "Rodriguez", "5141378940", "m", 
                "JAYrody@outlook.com", "2002-04-20", "admin", 30);
            Staff staff3 = new Staff("200003", "Mina", "Sharon", "5143859205", "f", 
                "SharonTheBoss@outlook.com", "1997-03-23", "secretary", 29);
            Staff staff4 = new Staff("200004", "Lisa", "McClaire", "5148129879", "f", 
                "LisaWithBangs@yahoo.ca", "1997-03-24", "assistant", 20);
            Staff staff5 = new Staff("200005", "Nayeon", "Love", "5148129234", "f", 
                "NateonWithBangs@yahoo.ca", "1999-09-24", "assistant", 32);
            Staff staff6 = new Staff("200006", "John", "Carter", "5146789879", "m", 
                "JohnnyC@yahoo.ca", "1990-14", "assistant", 30);
        
            Department department1 = new Department("100", "ComputerScience", teacher1);
            Department department2 = new Department("200", "Pharmacy", teacher6);
            Department department3 = new Department("300", "Architect", teacher8);
            
            //adding teachers and staff to department1 
            department1.addPartTimeTeacher(teacher1, "100");
            department1.addPartTimeTeacher(teacher2, "100");
            department1.addFullTimeTeacher(teacher11, "100");
            department1.addFullTimeTeacher(teacher12, "100");
            department1.addStaff(staff1, "100");
            department1.addStaff(staff2, "100");
           
           //adding teachers and staff to department2
            department2.addPartTimeTeacher(teacher9, "200");
            department2.addPartTimeTeacher(teacher10, "200");
            department2.addFullTimeTeacher(teacher5, "200");
            department2.addFullTimeTeacher(teacher6, "200");
            department2.addStaff(staff3, "200");
            department2.addStaff(staff4, "200");
           
            //adding teachers and staff to department3
            department3.addPartTimeTeacher(teacher3, "300");
            department3.addPartTimeTeacher(teacher4, "300");
            department3.addFullTimeTeacher(teacher7, "300");
            department3.addFullTimeTeacher(teacher8, "300");
            department3.addStaff(staff5, "300");
            department3.addStaff(staff6, "300");
            
            
        } catch (InvalidDean e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidDepartmentID e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidTeacherStaffID e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidDegree e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidWorkHours e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        // catching Invalid staff or teacher already in file list for department
        try {
            
            PartTime teacher1 = new PartTime("100001", "Rachelle", "Badua", "5146497001", "f", 
                "RachelleBadua@outlook.com", "2002-01-10", "Computertechnicien", 112, 25.0);
            Department department1 = new Department("100", "ComputerScience", teacher1);
            
            department1.addPartTimeTeacher(teacher1, "100");
        } catch (InvalidDean e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidDepartmentID e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidTeacherStaffID e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidDegree e) {
            System.out.println("Error: " + e.getMessage());
        }
      
       // catching Invalid non existant department
        try {
            FullTime teacher6 = new FullTime("100006", "Micah", "Sophia", "5149386045", "f", 
                "MisoLaurente@yahoo.ca", "2003-04-06", "Pharmacian", 82, "InsuranceHealth");
            FullTime teacher5 = new FullTime("100005", "Kate", "Nolasco", "5144938506", "m", 
                "KateNolasco@yahoo.ca", "2002-05-18", "Pharmacian", 82, "InsuranceHealth");
            Department department2 = new Department("200", "Pharmacy", teacher6);
            
            department2.addFullTimeTeacher(teacher6, "550");
        } catch (InvalidDean e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidDepartmentID e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidTeacherStaffID e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidDegree e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
       // catching Invalid dean in department
        try {
            Person staff1 = new Staff("200001", "Jake", "Bob", "5141234569", "m", 
                "HelloMyNameISJake@yahoo.ca", "2002-11-15", "researcher", 23);
            PartTime teacher1 = new PartTime("100001", "Rachelle", "Badua", "5146497001", "f", 
                "RachelleBadua@outlook.com", "2002-01-10", "Computertechnicien", 112, 25.0);
            Department department1 = new Department("100", "ComputerScience", teacher1);
            
            department1.setDean(staff1);
        } catch (InvalidDean e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidDegree e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidWorkHours e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
