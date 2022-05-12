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

import java.util.Objects;

/**
 *
 * @author Rachelle Badua
 */
public class Staff extends Person implements PayRoll {
    private String duty;
    private double workload;

    public Staff(String string, String string1, String string2, String string3, String string4, String string5, String string6) {
        super(string, string1, string2, string3, string4, string5, string6);
    }

    public Staff(String idPerson, String fname, String lname, String phoneNumber,
            String gender, String emailAddress, String birthday, String duty, double workload) throws Exception {
        super(idPerson, fname, lname, phoneNumber, gender, emailAddress, birthday);
        this.duty = duty;
        
        if (workload < 0 || workload > 40)
            throw new InvalidWorkHours(workload);
        else
            this.workload = workload;
        
        setSalary(computePayRoll());
    }
    
    @Override
    public String toString() {
        String str = String.format("ID: %s, First Name: %s, Last Name: %s, Phone Number: %s, gender: %s,"
                + " Email Address: %s, Birthday: %s, Salary: %.2f, Duty: %s, workload: %.2f", 
                getIdPerson(), getFname(), getLname(), getPhoneNumber(), getGender(), getEmailAddress(), getBirthday(),  
                getSalary(), duty, workload);
    
        return str;
    }
    
//    @Override
    public boolean equals(Staff staff) {
        if (!this.getIdPerson().equals(staff.getIdPerson()))
            return false;
        if (!this.getFname().equals(staff.getFname()))
            return false;
        if (!this.getLname().equals(staff.getLname()))
            return false;
        if (!this.getPhoneNumber().equals(staff.getPhoneNumber()))
            return false;
        if (!this.getGender().equals(staff.getGender()))
            return false;
        if (!this.getEmailAddress().equals(staff.getEmailAddress()))
            return false;
        if (!this.getBirthday().equals(staff.getBirthday()))
            return false;
        if (this.getSalary() != staff.getSalary())
            return false;
        if (!this.getDuty().equals(staff.getDuty()))
            return false;
        if (this.getWorkload()!= staff.getWorkload())
            return false;
        
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Staff other = (Staff) obj;
//        if (Double.doubleToLongBits(this.workload) != Double.doubleToLongBits(other.workload)) {
//            return false;
//        }
//        if (!Objects.equals(this.duty, other.duty)) {
//            return false;
//        }
        return true;
    }
    
    
    @Override
    public void checkingCategory() {
        System.out.printf("This person with %s id is a Staff\n", getIdPerson());
    }
    
    // make exception for InvalidWorload !!!!!
    @Override
    public double computePayRoll() {
        double salaryComputed = (workload * 32 * 2) * 0.75;
        return salaryComputed;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public double getWorkload() {
        return workload;
    }

    public void setWorkload(double workload) throws InvalidWorkHours {
        if (workload < 0 || workload > 40)
            throw new InvalidWorkHours(workload);
        else
            this.workload = workload;
    }
}