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
 * Test class for Teacher class
 * @author Rachelle Badua
 */
public class TeacherTest {
    
    public TeacherTest() {
    }

    /**
     * Test of toString method, of class Teacher.
     */
    @Test
    public void testToString() throws InvalidDegree {
        System.out.println("toString");
        Teacher instance = new Teacher("100025", "Kobe", "Howard", "5144321512", "m", 
                "MambaBaby@yahoo.com", "2000-03-21", "Research", 42);
        String expResult = String.format("ID: %s, First Name: %s, Last Name: %s, Phone Number: %s, Gender: %s,"
                + " Email Address: %s, Birthday: %s, Salary: %.2f, Speciality: %s, Degree: %d", 
                instance.getIdPerson(), instance.getFname(), instance.getLname(), 
                instance.getPhoneNumber(), instance.getGender(), instance.getEmailAddress(), 
                instance.getBirthday(), instance.getSalary(), instance.getSpeciality(), 
                instance.getDegreeRate());
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Teacher.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Teacher("100034", "", "", "", "", "", "");
        Teacher instance = new Teacher("100025", "Kobe", "Howard", "5144321512", "m", 
                "MambaBaby@yahoo.com", "2000-03-21");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        System.out.println("The teacher does not equal the other teacher");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkingCategory method, of class Teacher.
     */
    @Test
    public void testCheckingCategory() {
        System.out.println("checkingCategory");
        Teacher instance = new Teacher("100025", "Kobe", "Howard", "5144321512", "m", 
                "MambaBaby@yahoo.com", "2000-03-21");
        instance.checkingCategory();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeciality method, of class Teacher.
     */
    @Test
    public void testGetSpeciality() throws Exception {
        System.out.println("getSpeciality");
        Teacher instance = new Teacher("100025", "Kobe", "Howard", "5144321512", "m", 
                "MambaBaby@yahoo.com", "2000-03-21", "Research", 42);
        String expResult = "Research";
        String result = instance.getSpeciality();
        assertEquals(expResult, result);
        System.out.println("  " + instance.getSpeciality());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeciality method, of class Teacher.
     */
    @Test
    public void testSetSpeciality() {
        System.out.println("setSpeciality");
        String speciality = "Computers";
        Teacher instance = new Teacher("100025", "Kobe", "Howard", "5144321512", "m", 
                "MambaBaby@yahoo.com", "2000-03-21");
        instance.setSpeciality(speciality);
        System.out.println("  " + instance.toString());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getDegreeRate method, of class Teacher.
     */
    @Test
    public void testGetDegreeRate() throws Exception {
        System.out.println("getDegreeRate");
        Teacher instance = new Teacher("100025", "Kobe", "Howard", "5144321512", "m", "MambaBaby@yahoo.com", "2000-03-21", "research", 112);
        int expResult = 112;
        int result = instance.getDegreeRate();
        assertEquals(expResult, result);
        System.out.println("  " + instance.getDegreeRate());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setDegreeRate method, of class Teacher.
     * @throws java.lang.Exception
     */
    @Test (expected = InvalidDegree.class)
    public void testSetDegreeRate() throws Exception{
        System.out.println("setDegreeRate");
        int degreeRate = -1;
        Teacher instance = new Teacher("", "", "", "", "", "", "");
        instance.setDegreeRate(degreeRate);
        System.out.println("This Exception for degreeRate does not allow other"
                + " numbers other than 42, 82, and 112");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
