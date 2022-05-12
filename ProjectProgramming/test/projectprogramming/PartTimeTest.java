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
 * Test class for PartTime class
 * @author Rachelle Badua
 */
public class PartTimeTest {
    
    public PartTimeTest() {
    }

    /**
     * Test of checkingCategory method, of class PartTime.
     */
    @Test
    public void testCheckingCategory() throws Exception {
        System.out.println("checkingCategory");
        PartTime instance = new PartTime("100010", "Lani", "Robero", "5142340987", "f", 
                "LAniR@yahoo.ca", "2000-12-06", "Leadership", 112);
        instance.checkingCategory();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of checkWorkHOurs method, of class PartTime.
     */
    @Test
    public void testCheckWorkHOurs() throws Exception{
        System.out.println("checkWorkHOurs");
        PartTime instance = new PartTime("100010", "Lani", "Robero", "5142340987", "f", 
                "LAniR@yahoo.ca", "2000-12-06", "Leadership", 112, 30);
        boolean expResult = false;
        boolean result = instance.checkWorkHOurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of computePayRoll method, of class PartTime.
     */
    @Test
    public void testComputePayRoll() throws Exception {
        System.out.println("computePayRoll");
        PartTime instance = new PartTime("100010", "Lani", "Robero", "5142340987", "f", 
                "LAniR@yahoo.ca", "2000-12-06", "Leadership", 112, 23);
        double expResult = 3915.52;
        double result = instance.computePayRoll();
        assertEquals(expResult, result, 0.0);
        System.out.println("  " + instance.getSalary());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoursWorked method, of class PartTime.
     */
    @Test
    public void testGetHoursWorked() throws Exception {
        System.out.println("getHoursWorked");
        PartTime instance = new PartTime("100010", "Lani", "Robero", "5142340987", "f", 
                "LAniR@yahoo.ca", "2000-12-06", "Leadership", 112, 20);
        double expResult = 20;
        double result = instance.getHoursWorked();
        assertEquals(expResult, result, 0.0);
        System.out.println("  " + instance.getHoursWorked());
        
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoursWorked method, of class PartTime.
     */
    @Test
    public void testSetHoursWorked()  throws Exception {
        System.out.println("setHoursWorked");
        double hoursWorked = 25;
        PartTime instance = new PartTime("100010", "Lani", "Robero", "5142340987", "f", 
                "LAniR@yahoo.ca", "2000-12-06", "Leadership", 112, 20);
        instance.setHoursWorked(hoursWorked);
        System.out.println("  " + instance.getHoursWorked());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PartTime.
     */
    @Test
    public void testToString() throws Exception {
        System.out.println("toString");
        PartTime instance = new PartTime("100010", "Lani", "Robero", "5142340987", "f", 
                "LAniR@yahoo.ca", "2000-12-06", "Leadership", 112, 20);;
        String expResult = String.format("ID: %s, First Name: %s, Last Name: %s, Phone Number: %s, Gender: %s,"
                + " Email Address: %s, Birthday: %s, Salary: %.2f, Speciality: %s, Degree: %d, Hours Worked: %f", 
                instance.getIdPerson(), instance.getFname(), instance.getLname(), 
                instance.getPhoneNumber(), instance.getGender(), instance.getEmailAddress(), 
                instance.getBirthday(), instance.getSalary(), instance.getSpeciality(), 
                instance.getDegreeRate(), instance.getHoursWorked());
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
