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
 * Test class for Staff class
 * @author Rachelle Badua
 */
public class StaffTest {
    
    public StaffTest() {
    }

    /**
     * Test of toString method, of class Staff.
     */
    @Test
    public void testToString() throws Exception {
        System.out.println("toString");
        Staff instance = new Staff("100014", "Florence", "Ford", "5142333455", "f", 
                "Florrencxe@yahoo.ca", "1990-06-23", "Technician", 20);
        String expResult = String.format("ID: %s, First Name: %s, Last Name: %s, Phone Number: %s, gender: %s,"
                + " Email Address: %s, Birthday: %s, Salary: %.2f, Duty: %s, workload: %.2f", 
                instance.getIdPerson(), instance.getFname(), instance.getLname(), 
                instance.getPhoneNumber(), instance.getGender(),
                instance.getEmailAddress(), instance.getBirthday(),
                instance.getSalary(), instance.getDuty(), instance.getWorkload());
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Staff.
     */
    @Test
    public void testEquals() throws Exception {
        System.out.println("equals");
        Object obj = new Staff("124342", "Loki", "Gord", "5142332145", "m", 
                "hiLOki@yahoo.ca", "1998-01-19", "HealthCare", 20);
        Staff instance = new Staff("100014", "Florence", "Ford", "5142333455", "f", 
                "Florrencxe@yahoo.ca", "1990-06-23", "Technician", 20);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkingCategory method, of class Staff.
     */
    @Test
    public void testCheckingCategory() throws Exception {
        System.out.println("checkingCategory");
        Staff instance = new Staff("100014", "Florence", "Ford", "5142333455", "f", 
                "Florrencxe@yahoo.ca", "1990-06-23", "Technician", 20);
        instance.checkingCategory();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of computePayRoll method, of class Staff.
     */
    @Test
    public void testComputePayRoll() throws Exception{
        System.out.println("computePayRoll");
        Staff instance = new Staff("100014", "Florence", "Ford", "5142333455", "f", 
                "Florrencxe@yahoo.ca", "1990-06-23", "Technician", 20);
        double expResult = 960;
        double result = instance.computePayRoll();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuty method, of class Staff.
     */
    @Test
    public void testGetDuty() throws Exception{
        System.out.println("getDuty");
        Staff instance = new Staff("", "", "", "", "f", "", "", "Technician", 30);
        String expResult = "Technician";
        String result = instance.getDuty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuty method, of class Staff.
     */
    @Test
    public void testSetDuty() throws Exception{
        System.out.println("setDuty");
        String duty = "Reseacher";
        Staff instance = new Staff("", "", "", "", "f", "", "", "Technician", 30);
        instance.setDuty(duty);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getWorkload method, of class Staff.
     */
    @Test
    public void testGetWorkload() throws Exception{
        System.out.println("getWorkload");
        Staff instance = new Staff("", "", "", "", "f", "", "", "", 30);
        double expResult = 30;
        double result = instance.getWorkload();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setWorkload method, of class Staff.
     */
    @Test (expected = InvalidWorkHours.class)
    public void testSetWorkload()throws Exception{
        System.out.println("setWorkload");
        double workload = -1;
        Staff instance = new Staff("", "", "", "", "f", "", "");
        instance.setWorkload(workload);

        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
