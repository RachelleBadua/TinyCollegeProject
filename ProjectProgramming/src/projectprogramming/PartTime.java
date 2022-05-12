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

/**
 *
 * @author Rachelle Badua
 */
public class PartTime extends Teacher implements PayRoll {
    private double hoursWorked;

    public PartTime(String idPerson, String fname, String lname, String phoneNumber,
            String gender, String emailAddress, String birthday, String speciality,
            int degreeRate) throws InvalidDegree {
        super(idPerson, fname, lname, phoneNumber, gender, emailAddress, birthday, speciality, degreeRate);
    }
    
    public PartTime(String idPerson, String fname, String lname, String phoneNumber,
            String gender, String emailAddress, String birthday, String speciality,
            int degreeRate, double hoursWorked) throws InvalidDegree {
        super(idPerson, fname, lname, phoneNumber, gender, emailAddress, birthday, speciality, degreeRate);
        this.hoursWorked = hoursWorked;
        setSalary(computePayRoll());
    }

    @Override
    public void checkingCategory() {
        System.out.printf("The person with %s id is a Part-Time Teacher\n", getIdPerson());
    }
    
    @Override
    public String toString() {
        String str = super.toString();
        str += String.format(", Hours Worked: %f", hoursWorked);
        
        return str;
    }
    
    /**
     * checks if the workhours is greater than 25 and return true or false
     * @return 
     */
    public boolean checkWorkHOurs() {
        return (hoursWorked < 25) ? true : false;
    }
    
    @Override
    public double computePayRoll() {
        double salaryComputed = (hoursWorked * getDegreeRate() * 2) * 0.76;
        return salaryComputed;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
