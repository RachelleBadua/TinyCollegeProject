/*
 * The MIT License
 *
 * Copyright 2022 Rachelle.
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
public class Teacher extends Person {
    private String speciality;
    private int degreeRate;

    public Teacher(String idPerson, String fname, String lname, String phoneNumber, String gender, String emailAddress, String birthday) {
        super(idPerson, fname, lname, phoneNumber, gender, emailAddress, birthday);
    }
    
    public Teacher(String idPerson, String fname, String lname, String phoneNumber, 
            String gender, String emailAddress, String birthday, String speciality, int degreeRate) throws InvalidDegree {
        super(idPerson, fname, lname, phoneNumber, gender, emailAddress, birthday);
        this.speciality = speciality;
        
        if ((degreeRate == 112) || (degreeRate == 82) || (degreeRate == 42)) 
            this.degreeRate = degreeRate;
        else
            throw new InvalidDegree(degreeRate);
    }

    @Override
    public String toString() {
        String str = String.format("ID: %s, First Name: %s, Last Name: %s, Phone Number: %s, Gender: %s,"
                + " Email Address: %s, Birthday: %s, Salary: %.2f, Speciality: %s, Degree: %d", 
                getIdPerson(), getFname(), getLname(), getPhoneNumber(), getGender(), getEmailAddress(), getBirthday(),   
                getSalary(), speciality, degreeRate);
    
        return str;
    }
    
//    @Override
    public boolean equals(Teacher teacher) {
        if (!this.getIdPerson().equals(teacher.getIdPerson()))
            return false;
        if (!this.getFname().equals(teacher.getFname()))
            return false;
        if (!this.getLname().equals(teacher.getLname()))
            return false;
        if (!this.getPhoneNumber().equals(teacher.getPhoneNumber()))
            return false;
        if (!this.getGender().equals(teacher.getGender()))
            return false;
        if (!this.getEmailAddress().equals(teacher.getEmailAddress()))
            return false;
        if (!this.getBirthday().equals(teacher.getBirthday()))
            return false;
        if (this.getSalary() != teacher.getSalary())
            return false;
        if (!this.getSpeciality().equals(teacher.getSpeciality()))
            return false;
        if (this.getDegreeRate() != teacher.getDegreeRate())
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
//        final Teacher other = (Teacher) obj;
//        if (this.degreeRate != other.degreeRate) {
//            return false;
//        }
//        if (!Objects.equals(this.speciality, other.speciality)) {
//            return false;
//        }
        return true;
    }
    
    @Override
    public void checkingCategory() {
        System.out.printf("The person with %s id is a Teacher\n", getIdPerson());
    }
        
    
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getDegreeRate() {
        return degreeRate;
    }

    public void setDegreeRate(int degreeRate) throws InvalidDegree {
        if ((degreeRate == 112) || (degreeRate == 82) || (degreeRate == 42)) 
            this.degreeRate = degreeRate;
        else
            throw new InvalidDegree(degreeRate);         
       
    }
}
