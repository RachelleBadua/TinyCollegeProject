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
 * Test class for FullTime class
 * @author Rachelle Badua
 */
public class FullTimeTest {
    
    public FullTimeTest() {
    }

    /**
     * Test of checkingCategory method, of class FullTime.
     */
    @Test
    public void testCheckingCategory() throws Exception {
        System.out.println("checkingCategory");
        FullTime instance = new FullTime("100032", "Eroll", "Jones", "5141236789", "m", 
                "EroLLJ@yahoo.ca", "2000-01-13", "Research", 82);
        instance.checkingCategory();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FullTime.
     */
    @Test
    public void testToString() throws Exception {
        System.out.println("toString");
        FullTime instance = new FullTime("100032", "Eroll", "Jones", "5141236789", "m", 
                "EroLLJ@yahoo.ca", "2000-01-13", "Research", 82, "HealthInsurance");
        String expResult = String.format("ID: %s, First Name: %s, Last Name: %s, Phone Number: %s, Gender: %s,"
                + " Email Address: %s, Birthday: %s, Salary: %.2f, Speciality: %s, Degree: %d, Benefit: %s", 
                instance.getIdPerson(), instance.getFname(), instance.getLname(), 
                instance.getPhoneNumber(), instance.getGender(), instance.getEmailAddress(), 
                instance.getBirthday(), instance.getSalary(), instance.getSpeciality(), 
                instance.getDegreeRate(), instance.getBenefit());
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of computePayRoll method, of class FullTime.
     */
    @Test
    public void testComputePayRoll() throws Exception {
        System.out.println("computePayRoll");
        FullTime instance = new FullTime("100032", "Eroll", "Jones", "5141236789", "m", 
                "EroLLJ@yahoo.ca", "2000-01-13", "Research", 82, "HealthInsurance");
        double expResult = 4460.80;
        double result = instance.computePayRoll();
        assertEquals(expResult, result, 0.0);
        System.out.println(" " + instance.getSalary());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getBenefit method, of class FullTime.
     */
    @Test
    public void testGetBenefit() throws Exception {
        System.out.println("getBenefit");
        FullTime instance = new FullTime("100032", "Eroll", "Jones", "5141236789", "m", 
                "EroLLJ@yahoo.ca", "2000-01-13", "Research", 82, "HealthInsurance");
        String expResult = "HealthInsurance";
        String result = instance.getBenefit();
        assertEquals(expResult, result);
        System.out.println("  " + instance.getBenefit());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setBenefit method, of class FullTime.
     */
    @Test
    public void testSetBenefit() throws Exception {
        System.out.println("setBenefit");
        String benefit = "HouseInsurance";
        FullTime instance = new FullTime("100032", "Eroll", "Jones", "5141236789", "m", 
                "EroLLJ@yahoo.ca", "2000-01-13", "Research", 82, "HealthInsurance");
        instance.setBenefit(benefit);
        System.out.println("  " + instance.getBenefit());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
