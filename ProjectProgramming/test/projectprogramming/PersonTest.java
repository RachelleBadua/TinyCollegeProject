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
 * Test class for Person class
 * @author Rachelle Badua
 */
public class PersonTest {
    
    public PersonTest() {
    }

    /**
     * Test of checkingCategory method, of class Person.
     */
    @Test
    public void testCheckingCategory() {
        System.out.println("checkingCategory");
        Person instance = new PersonImpl();
        instance.checkingCategory();
        System.out.println("");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFname method, of class Person.
     */
    @Test
    public void testGetFname() {
        System.out.println("getFname");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getFname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFname method, of class Person.
     */
    @Test
    public void testSetFname() {
        System.out.println("setFname");
        String fname = "Micah";
        Person instance = new PersonImpl();
        instance.setFname(fname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLname method, of class Person.
     */
    @Test
    public void testGetLname() {
        System.out.println("getLname");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getLname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLname method, of class Person.
     */
    @Test
    public void testSetLname() {
        System.out.println("setLname");
        String lname = "Lani";
        Person instance = new PersonImpl();
        instance.setLname(lname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class Person.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class Person.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "5142345678";
        Person instance = new PersonImpl();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Person.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Person.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "f";
        Person instance = new PersonImpl();
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailAddress method, of class Person.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailAddress method, of class Person.
     */
    @Test
    public void testSetEmailAddress() {
        System.out.println("setEmailAddress");
        String emailAddress = "weAreGreat@yahoo.com";
        Person instance = new PersonImpl();
        instance.setEmailAddress(emailAddress);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthday method, of class Person.
     */
    @Test
    public void testGetBirthday() {
        System.out.println("getBirthday");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getBirthday();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setBirthday method, of class Person.
     */
    @Test
    public void testSetBirthday() {
        System.out.println("setBirthday");
        String birthday = "1999-04-27";
        Person instance = new PersonImpl();
        instance.setBirthday(birthday);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPerson method, of class Person.
     */
    @Test
    public void testGetIdPerson() {
        System.out.println("getIdPerson");
        Person instance = new PersonImpl();
        String expResult = "";
        String result = instance.getIdPerson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPerson method, of class Person.
     */
    @Test
    public void testSetIdPerson() {
        System.out.println("setIdPerson");
        String idPerson = "100021";
        Person instance = new PersonImpl();
        instance.setIdPerson(idPerson);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSalary method, of class Person.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Person instance = new PersonImpl();
        double expResult = 0.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSalary method, of class Person.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        double salary = 54000;
        Person instance = new PersonImpl();
        instance.setSalary(salary);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class PersonImpl extends Person {

        public PersonImpl() {
            super("", "", "", "", "", "", "");
//            super("100013", "Florence", "Ford", "5148789008", "f", "florrence@yahoo.ca", "1990-02-14");
        }

        public void checkingCategory() {
        }
    }
}
