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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for Department class
 * @author Rachelle Badua
 */
public class DepartmentTest {
    
    public DepartmentTest() {
    }

    /**
     * Test of addPartTimeTeacher method, of class Department.
     */
    @Test
    public void testAddPartTimeTeacher() throws Exception {
        System.out.println("addPartTimeTeacher");
        PartTime partTime = new PartTime("5000", "Yi", "Wang", "5147896789", "m", 
                "WangYI@yahoo.com", "1990-03-05", "Programming", 42, 30);
        String idDepartment = "1000";
        Department instance = new Department("1000", "IT", partTime);
        instance.addPartTimeTeacher(partTime, idDepartment);
        System.out.println("Check ProjectProgramming folder to see PartTime added in TeacherseListInIT");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of addFullTimeTeacher method, of class Department.
     */
    @Test
    public void testAddFullTimeTeacher() throws Exception {
        System.out.println("addFullTimeTeacher");
        FullTime fullTime = new FullTime("6000", "Yi", "Wang", "5147896789", "m", 
                "WangYI@yahoo.com", "1990-03-05", "Programming", 42, "HealthInsurance");
        String idDepartment = "1000";
        Department instance = new Department("1000", "IT", fullTime);
        instance.addFullTimeTeacher(fullTime, idDepartment);
        System.out.println("Check ProjectProgramming folder to see FullTime added in TeacherseListInIT");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of addStaff method, of class Department.
     */
    @Test
    public void testAddStaff() throws Exception {
        System.out.println("addStaff");
        FullTime fullTime = new FullTime("6000", "Yi", "Wang", "5147896789", "m", 
                "WangYI@yahoo.com", "1990-03-05", "Programming", 42);
        Staff staff = new Staff("100014", "Florence", "Ford", "5142333455", "f", 
                "Florrencxe@yahoo.ca", "1990-06-23", "Technician", 20);
        String idDepartment = "1000";
        Department instance = new Department("1000", "IT", fullTime);
        instance.addStaff(staff, idDepartment);
        System.out.println("Check ProjectProgramming folder to see Staff added in StaffseListInIT");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNameOfDepartment method, of class Department.
     */
    @Test
    public void testGetNameOfDepartment() throws Exception {
        System.out.println("getNameOfDepartment");
        FullTime fullTime = new FullTime("6000", "Yi", "Wang", "5147896789", "m", 
                "WangYI@yahoo.com", "1990-03-05", "Programming", 42);
        Department instance = new Department("1000", "IT", fullTime);
        String expResult = "IT";
        String result = instance.getNameOfDepartment();
        assertEquals(expResult, result);
        System.out.println(" " + instance.getNameOfDepartment());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setNameOfDepartment method, of class Department.
     */
    @Test
    public void testSetNameOfDepartment() throws Exception {
        System.out.println("setNameOfDepartment");
        FullTime fullTime = new FullTime("6000", "Yi", "Wang", "5147896789", "m", 
                "WangYI@yahoo.com", "1990-03-05", "Programming", 42);
        String nameOfDepartment = "Database";
        Department instance = new Department("1000", "IT", fullTime);
        instance.setNameOfDepartment(nameOfDepartment);
        System.out.println(" " + instance.getNameOfDepartment());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdDepartment method, of class Department.
     */
    @Test
    public void testGetIdDepartment() throws Exception {
        System.out.println("getIdDepartment");
        FullTime fullTime = new FullTime("6000", "Yi", "Wang", "5147896789", "m", 
                "WangYI@yahoo.com", "1990-03-05", "Programming", 42);
        Department instance = new Department("1000", "IT", fullTime);
        String expResult = "1000";
        String result = instance.getIdDepartment();
        assertEquals(expResult, result);
        System.out.println(" " + instance.getIdDepartment());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdDepartment method, of class Department.
     */
    @Test
    public void testSetIdDepartment() throws Exception{
        System.out.println("setIdDepartment");
         FullTime fullTime = new FullTime("6000", "Yi", "Wang", "5147896789", "m", 
                 "WangYI@yahoo.com", "1990-03-05", "Programming", 42);
        String idDepartment = "";
        Department instance = new Department("1000", "IT", fullTime);
        instance.setIdDepartment(idDepartment);
        System.out.println(" " + instance.getIdDepartment());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getDean method, of class Department.
     */
    @Test 
    public void testGetDean() throws Exception {
        System.out.println("getDean");
        Teacher teacher = new Teacher("6000", "Yi", "Wang", "5147896789", "m", 
                "WangYI@yahoo.com", "1990-03-05");
        Department instance = new Department("1000", "IT", teacher);
        Person expResult =  teacher;
        Person result = instance.getDean();
        assertEquals(expResult, result);
        System.out.println("  " + "This teacher is the dean -> " + teacher.toString());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setDean method, of class Department.
     */
    @Test (expected = InvalidDean.class)
    public void testSetDean() throws Exception {
        System.out.println("setDean");
        Person dean = new Staff("100014", "Florence", "Ford", "5142333455", "f", 
                "Florrencxe@yahoo.ca", "1990-06-23", "Technician", 20);
        Department instance = new Department("1000", "IT", dean);
        instance.setDean(dean);
        System.out.println("  " + "This teacher cannot be the dean -> " + dean.toString());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
