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
public class FullTime extends Teacher implements PayRoll {
    private String benefit;

    public FullTime(String idPerson, String fname, String lname, String phoneNumber, String gender, 
            String emailAddress, String birthday, String speciality, int degreeRate) throws InvalidDegree {
        super(idPerson, fname, lname, phoneNumber, gender, emailAddress, birthday, speciality, degreeRate);
    }
    
    public FullTime(String idPerson, String fname, String lname, String phoneNumber, 
            String gender, String emailAddress, String birthday, String speciality,
            int degreeRate, String benefit) throws InvalidDegree {
        super(idPerson, fname, lname, phoneNumber, gender, emailAddress, birthday, 
                speciality, degreeRate);
        this.benefit = benefit;
        setSalary(computePayRoll());
    }
    
    @Override
    public void checkingCategory() {
        System.out.printf("The person with %s id is a Full-Time Teacher\n", getIdPerson());
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += String.format(", Benefit: %s", benefit);
        
        return str;
    }
    
    @Override
    public double computePayRoll() {
        double salaryComputed = (32 * getDegreeRate() * 2) * 0.85;
        return salaryComputed;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }
}
