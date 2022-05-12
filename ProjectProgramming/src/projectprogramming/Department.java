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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Rachelle Badua
 */
public class Department {

    private String idDepartment;
    private String nameOfDepartment;
    private ArrayList<Teacher> listOfTeachers;
    private ArrayList<Staff> listOfStaff;
    private Person dean;
    public File teachersFile;
    public File staffsFile;

    public Department(String idDepartment, String nameOfDepartment, Person dean) throws InvalidDean {
        this.idDepartment = idDepartment;
        this.nameOfDepartment = nameOfDepartment;
        if (dean instanceof Teacher)
            this.dean = dean;
        else 
            throw new InvalidDean();
    }

    /**
     * To add the Part Time teacher in the file and checking if the department
     * exists
     *
     * @param partTime the Part Time teacher you want to add
     * @param idDepartment The ID department of the department
     */
    public void addPartTimeTeacher(PartTime partTime, String idDepartment) throws InvalidDepartmentID, InvalidTeacherStaffID {
        listOfTeachers = new ArrayList<>();

        if (idDepartment.equals(this.idDepartment)) {
            System.out.println("The department exists: " + idDepartment);
            readPartTime(partTime);
            System.out.println("The teacher has succesfully been added into list.");
        } else {
//            System.out.println("Department does not exist: " + idDepartment);
            throw new InvalidDepartmentID(idDepartment);
        }

    }

    /**
     * To add the Full Time teacher in the file and checking if the department
     * exists
     *
     * @param fullTime the Full Time teacher you want to add
     * @param idDepartment The ID department of the department
     */
    public void addFullTimeTeacher(FullTime fullTime, String idDepartment) throws InvalidDepartmentID, InvalidTeacherStaffID {
        listOfTeachers = new ArrayList<>();

        if (idDepartment.equals(this.idDepartment)) {
            System.out.println("The department exists: " + idDepartment);
            readFullTime(fullTime);
            System.out.println("The teacher has succesfully been added into list.");
        } else {
//            System.out.println("Department does not exist: " + idDepartment);
            throw new InvalidDepartmentID(idDepartment);
        }
    }

    /**
     * To add the Staff in the file and checking if the department exists
     *
     * @param staff
     * @param idDepartment
     */
    public void addStaff(Staff staff, String idDepartment) throws InvalidDepartmentID, InvalidTeacherStaffID {
        listOfTeachers = new ArrayList<>();

        if (idDepartment.equals(this.idDepartment)) {
            System.out.println("The department exists: " + idDepartment);
            readStaff(staff);
            System.out.println("The staff has succesfully been added into list.");
        } else {
//            System.out.println("Department does not exist: " + idDepartment);
            throw new InvalidDepartmentID(idDepartment);
        }
    }

    /**
     * To read the Part Time Teacher in the file an checking if that Part Time
     * Teacher exists already in the file.
     *
     * @param partTime Part Time teacher
     */
    private void readPartTime(PartTime partTime) throws InvalidTeacherStaffID{
        String path = "TeachersListIn" + getNameOfDepartment() + ".txt";
        teachersFile = new File(path);

        try {
            teachersFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Failed or interupted I/O operations");
        }

        try (Scanner input = new Scanner(teachersFile)) {

            if (teachersFile.length() == 0) {
                writePartTime(partTime);
            } else {
                while (input.hasNext()) {
                    String row = input.nextLine();
                    String[] data = row.split(" ");

                    String idPerson = data[0];

                    if (idPerson.equals(partTime.getIdPerson())) {
//                        System.out.printf("Teacher %s has been already added into department %s", partTime.getIdPerson(), getIdDepartment());
//                        break;
                        throw new InvalidTeacherStaffID(String.format("Staff or Teacher %s has been already added into department %s", partTime.getIdPerson(), getIdDepartment()));
                    } else {
                        if (input.hasNext() == false) {
                            writePartTime(partTime);
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("This file does not exist");
        }
    }

    /**
     * To read the Part Time Teacher in the file an checking if that Part Time
     * Teacher exists already in the file.
     *
     * @param fullTime Part Time teacher
     */
    private void readFullTime(FullTime fullTime) throws InvalidTeacherStaffID {
        String path = "TeachersListIn" + getNameOfDepartment() + ".txt";
        teachersFile = new File(path);
        try {
            teachersFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Failed or interupted I/O operations");
        }

        try (Scanner input = new Scanner(teachersFile)) {

            if (teachersFile.length() == 0) {
                writeFullTime(fullTime);
            } else {
                while (input.hasNext()) {
                    String row = input.nextLine();
                    String[] data = row.split(" ");

                    String idPerson = data[0];

                    if (idPerson.equals(fullTime.getIdPerson())) {
//                        System.out.printf("Teacher %s has been already added into department %s", fullTime.getIdPerson(), getIdDepartment());
//                        break;
                        throw new InvalidTeacherStaffID(String.format("Staff or Teacher %s has been already added into department %s", fullTime.getIdPerson(), getIdDepartment()));
                    } else {
                        if (input.hasNext() == false) {
                            writeFullTime(fullTime);
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("This file does not exist");
        }
    }

    /**
     * It reads the file and checks if the staff is already in file
     * @param staff staff 
     * @throws InvalidTeacherStaffID 
     */
    private void readStaff(Staff staff) throws InvalidTeacherStaffID {
        String path = "StaffsListIn" + getNameOfDepartment() + ".txt";
        staffsFile = new File(path);
        try {
            staffsFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Failed or interupted I/O operations");
        }

        try (Scanner input = new Scanner(staffsFile)) {

            if (staffsFile.length() == 0) {
                writeStaff(staff);
            } else {
                while (input.hasNext()) {
                    String row = input.nextLine();
                    String[] data = row.split(" ");

                    String idPerson = data[0];

                    if (idPerson.equals(staff.getIdPerson())) {
//                        System.out.printf("Staff %s has been already added into department %s", staff.getIdPerson(), getIdDepartment());
//                        break;
                        throw new InvalidTeacherStaffID(String.format("Staff or Teacher %s has been already added into department %s", staff.getIdPerson(), getIdDepartment()));
                    } else {
                        if (input.hasNext() == false) {
                            writeStaff(staff);
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("This file does not exist");
        }
    }
    
    /**
     * It writes in the file of teachers
     * @param partTime the partTime Teacher
     */
    private void writePartTime(PartTime partTime) {
        String path = "TeachersListIn" + getNameOfDepartment() + ".txt";
        teachersFile = new File(path);
        try (FileWriter fw = new FileWriter(teachersFile, true)) {
            double salaryOfCurrentTeacher = partTime.getSalary();
            String strSalary = salaryOfCurrentTeacher + " ";

            double hoursWorkedOfCurrentTeacher = partTime.getHoursWorked();
            String strHours = hoursWorkedOfCurrentTeacher + " ";

            fw.write(partTime.getIdPerson() + " ");
            fw.write(partTime.getFname() + " ");
            fw.write(partTime.getLname() + " ");
            fw.write(partTime.getPhoneNumber() + " ");
            fw.write(partTime.getGender() + " ");
            fw.write(partTime.getEmailAddress() + " ");
            fw.write(partTime.getBirthday() + " ");
            fw.write(strSalary + " ");
            fw.write(partTime.getSpeciality() + " ");
            fw.write(partTime.getDegreeRate() + " ");
            fw.write(" PartTimeTeacher");
            fw.write(strHours + " ");
            fw.write("\n");

        } catch (IOException e) {
            System.out.println(String.format("%s: %s", e.getClass(), e.getMessage()));
        }
        listOfTeachers = new ArrayList<>();
        listOfTeachers.add(partTime);
    }
    
    /**
     * it writes in file of teachers
     * @param fullTime the fulltime teacher to be added
     */
    private void writeFullTime(FullTime fullTime) {
        String path = "TeachersListIn" + getNameOfDepartment() + ".txt";
        teachersFile = new File(path);
        try (FileWriter fw = new FileWriter(teachersFile, true)) {
            double salaryOfCurrentTeacher = fullTime.getSalary();
            String strSalary = salaryOfCurrentTeacher + " ";

            fw.write(fullTime.getIdPerson() + " ");
            fw.write(fullTime.getFname() + " ");
            fw.write(fullTime.getLname() + " ");
            fw.write(fullTime.getPhoneNumber() + " ");
            fw.write(fullTime.getGender() + " ");
            fw.write(fullTime.getEmailAddress() + " ");
            fw.write(fullTime.getBirthday() + " ");
            fw.write(strSalary + " ");
            fw.write(fullTime.getSpeciality() + " ");
            fw.write(fullTime.getDegreeRate() + " ");
            fw.write(" FullTimeTeacher");
            fw.write(fullTime.getBenefit());
            fw.write("\n");

        } catch (IOException e) {
            System.out.println(String.format("%s: %s", e.getClass(), e.getMessage()));
        }
        listOfTeachers = new ArrayList<>();
        listOfTeachers.add(fullTime);
    }
    
    /**
     * it writes in staff file
     * @param staff the staff to be added
     */
    private void writeStaff(Staff staff) {
        String path = "StaffsListIn" + getNameOfDepartment() + ".txt";
        staffsFile = new File(path);
        try (FileWriter fw = new FileWriter(staffsFile, true)) {
            double salaryOfCurrentTeacher = staff.getSalary();
            String strSalary = salaryOfCurrentTeacher + " ";

            fw.write(staff.getIdPerson() + " ");
            fw.write(staff.getFname() + " ");
            fw.write(staff.getLname() + " ");
            fw.write(staff.getPhoneNumber() + " ");
            fw.write(staff.getGender() + " ");
            fw.write(staff.getEmailAddress() + " ");
            fw.write(staff.getBirthday() + " ");
            fw.write(strSalary + " ");
            fw.write(staff.getDuty() + " ");
            fw.write(staff.getWorkload() + " ");
            fw.write("\n");

        } catch (IOException e) {
            System.out.println(String.format("%s: %s", e.getClass(), e.getMessage()));
        }
        listOfStaff = new ArrayList<>();
        listOfStaff.add(staff);
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public String getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    public Person getDean() {
        return dean;
    }

    public void setDean(Person dean) throws InvalidDean {
        if (dean instanceof Teacher) {
            this.dean = dean;
            System.out.println("The Dean is a Teacher.");
        }
        else 
            throw new InvalidDean();
    }
}
