package com.example.StudentResultPublisher.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long Id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("rollno")
    private String rollNo;

    @JsonProperty("department")
    private String department;

    @JsonProperty("sub1_name")
    private String sub1_name;

    @JsonProperty("sub1_marks")
    private String sub1_marks;

    @JsonProperty("sub1_totalMarks")
    private String sub1_totalMarks;

    @JsonProperty("sub2_name")
    private String sub2_name;

    @JsonProperty("sub2_marks")
    private String sub2_marks;

    @JsonProperty("sub2_totalMarks")
    private String sub2_totalMarks;

    @JsonProperty("sub3_name")
    private String sub3_name;

    @JsonProperty("sub3_marks")
    private String sub3_marks;

    @JsonProperty("sub3_totalMarks")
    private String sub3_totalMarks;

    @JsonProperty("sub4_name")
    private String sub4_name;

    @JsonProperty("sub4_marks")
    private String sub4_marks;

    @JsonProperty("sub4_totalMarks")
    private String sub4_totalMarks;

    @JsonProperty("sub5_name")
    private String sub5_name;

    @JsonProperty("sub5_marks")
    private String sub5_marks;

    @JsonProperty("sub5_totalMarks")
    private String sub5_totalMarks;

    @JsonProperty("sub6_name")
    private String sub6_name;

    @JsonProperty("sub6_marks")
    private String sub6_marks;

    @JsonProperty("sub6_totalMarks")
    private String sub6_totalMarks;

    public Students() {
    }

    public Students(long id, String name, String rollNo, String department, String sub1_name, String sub1_marks, String sub1_totalMarks, String sub2_name, String sub2_totalMarks, String sub2_marks, String sub3_name, String sub3_marks, String sub3_totalMarks, String sub4_name, String sub4_marks, String sub4_totalMarks, String sub5_name, String sub5_marks, String sub5_totalMarks, String sub6_name, String sub6_marks, String sub6_totalMarks) {
        Id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.sub1_name = sub1_name;
        this.sub1_marks = sub1_marks;
        this.sub1_totalMarks = sub1_totalMarks;
        this.sub2_name = sub2_name;
        this.sub2_totalMarks = sub2_totalMarks;
        this.sub2_marks = sub2_marks;
        this.sub3_name = sub3_name;
        this.sub3_marks = sub3_marks;
        this.sub3_totalMarks = sub3_totalMarks;
        this.sub4_name = sub4_name;
        this.sub4_marks = sub4_marks;
        this.sub4_totalMarks = sub4_totalMarks;
        this.sub5_name = sub5_name;
        this.sub5_marks = sub5_marks;
        this.sub5_totalMarks = sub5_totalMarks;
        this.sub6_name = sub6_name;
        this.sub6_marks = sub6_marks;
        this.sub6_totalMarks = sub6_totalMarks;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSub1_name() {
        return sub1_name;
    }

    public void setSub1_name(String sub1_name) {
        this.sub1_name = sub1_name;
    }

    public String getSub1_marks() {
        return sub1_marks;
    }

    public void setSub1_marks(String sub1_marks) {
        this.sub1_marks = sub1_marks;
    }

    public String getSub1_totalMarks() {
        return sub1_totalMarks;
    }

    public void setSub1_totalMarks(String sub1_totalMarks) {
        this.sub1_totalMarks = sub1_totalMarks;
    }

    public String getSub2_name() {
        return sub2_name;
    }

    public void setSub2_name(String sub2_name) {
        this.sub2_name = sub2_name;
    }

    public String getSub2_totalMarks() {
        return sub2_totalMarks;
    }

    public void setSub2_totalMarks(String sub2_totalMarks) {
        this.sub2_totalMarks = sub2_totalMarks;
    }

    public String getSub2_marks() {
        return sub2_marks;
    }

    public void setSub2_marks(String sub2_marks) {
        this.sub2_marks = sub2_marks;
    }

    public String getSub3_name() {
        return sub3_name;
    }

    public void setSub3_name(String sub3_name) {
        this.sub3_name = sub3_name;
    }

    public String getSub3_marks() {
        return sub3_marks;
    }

    public void setSub3_marks(String sub3_marks) {
        this.sub3_marks = sub3_marks;
    }

    public String getSub3_totalMarks() {
        return sub3_totalMarks;
    }

    public void setSub3_totalMarks(String sub3_totalMarks) {
        this.sub3_totalMarks = sub3_totalMarks;
    }

    public String getSub4_name() {
        return sub4_name;
    }

    public void setSub4_name(String sub4_name) {
        this.sub4_name = sub4_name;
    }

    public String getSub4_totalMarks() {
        return sub4_totalMarks;
    }

    public void setSub4_totalMarks(String sub4_totalMarks) {
        this.sub4_totalMarks = sub4_totalMarks;
    }

    public String getSub4_marks() {
        return sub4_marks;
    }

    public void setSub4_marks(String sub4_marks) {
        this.sub4_marks = sub4_marks;
    }

    public String getSub5_name() {
        return sub5_name;
    }

    public void setSub5_name(String sub5_name) {
        this.sub5_name = sub5_name;
    }

    public String getSub5_marks() {
        return sub5_marks;
    }

    public void setSub5_marks(String sub5_marks) {
        this.sub5_marks = sub5_marks;
    }

    public String getSub5_totalMarks() {
        return sub5_totalMarks;
    }

    public void setSub5_totalMarks(String sub5_totalMarks) {
        this.sub5_totalMarks = sub5_totalMarks;
    }

    public String getSub6_name() {
        return sub6_name;
    }

    public void setSub6_name(String sub6_name) {
        this.sub6_name = sub6_name;
    }

    public String getSub6_marks() {
        return sub6_marks;
    }

    public void setSub6_marks(String sub6_marks) {
        this.sub6_marks = sub6_marks;
    }

    public String getSub6_totalMarks() {
        return sub6_totalMarks;
    }

    public void setSub6_totalMarks(String sub6_totalMarks) {
        this.sub6_totalMarks = sub6_totalMarks;
    }
}
/*
@PostMapping("/studentEntry")
    public String readStudentDetails(@RequestBody Map<String,String> data){
        String getName = data.get("name");
        String getRollNo = data.get("rollno");
        String getDOB = data.get("dob");
        String getGender = data.get("gender");
        String getAdmno = data.get("admno");
        String getDept = data.get("department");
        String getBloodGroup = data.get("blood group");
        String getAddress = data.get("address");
        String getPincode= data.get("pincode");

        System.out.println("Name : "+getName);
        System.out.println("Roll number : "+getRollNo);
        System.out.println("Date of Birth : "+getDOB);
        System.out.println("Gender : "+getGender);
        System.out.println("Admission number : "+getAdmno);
        System.out.println("Deaprtment : "+getDept);
        System.out.println("Blood group : "+getBloodGroup);
        System.out.println("Address : "+getAddress);
        System.out.println("Pincode : "+getPincode);

        return "Student added successfully";

    }
    @PostMapping("/findResult")
    public String findResult(@RequestBody Map<String,String> data){
        String getRollNo = data.get("rollno");

        String getSub1_name = data.get("sub1_name");
        String getSub1_marks = data.get("sub1_marks");
        String getSub1_totalMarks = data.get("sub1_totalMarks");

        String getSub2_name = data.get("sub2_name");
        String getSub2_marks = data.get("sub2_marks");
        String getSub2_totalMarks = data.get("sub2_totalMarks");

        String getSub3_name = data.get("sub3_name");
        String getSub3_marks = data.get("sub3_marks");
        String getSub3_totalMarks = data.get("sub3_totalMarks");

        String getSub4_name = data.get("sub4_name");
        String getSub4_marks = data.get("sub4_marks");
        String getSub4_totalMarks = data.get("sub4_totalMarks");

        String getSub5_name = data.get("sub5_name");
        String getSub5_marks = data.get("sub5_marks");
        String getSub5_totalMarks = data.get("sub5_totalMarks");

        String getSub6_name = data.get("sub6_name");
        String getSub6_marks = data.get("sub6_marks");
        String getSub6_totalMarks = data.get("sub6_totalMarks");

        String sub1_grade = getGrade(getSub1_marks,getSub1_totalMarks);
        String sub2_grade = getGrade(getSub2_marks,getSub2_totalMarks);
        String sub3_grade = getGrade(getSub3_marks,getSub3_totalMarks);
        String sub4_grade = getGrade(getSub4_marks,getSub4_totalMarks);
        String sub5_grade = getGrade(getSub5_marks,getSub5_totalMarks);
        String sub6_grade = getGrade(getSub6_marks,getSub6_totalMarks);

        boolean ifFailed = sub1_grade.equals("F") || sub2_grade.equals("F") ||sub3_grade.equals("F") ||sub4_grade.equals("F") || sub5_grade.equals("F") || sub6_grade.equals("F") ;

        if(ifFailed)
            return "Failed";
        else
            return "Passed";

    }

    public static String getGrade(String marks,String total){
        int actualMarks = Integer.parseInt(marks);
        int totalMarks = Integer.parseInt(total);

        double percentage = (actualMarks * 1.0/totalMarks) * 100;

        if(percentage>=90)
            return "S";
        else if(percentage>=85)
            return "A+";
        else if(percentage>=80)
            return "A";
        else if(percentage>=75)
            return "B+";
        else if(percentage>=70)
            return "B";
        else if(percentage>=65)
            return "C+";
        else if(percentage>=60)
            return "C";
        else if(percentage>=55)
            return "D+";
        else if(percentage>=50)
            return "D";
        else
            return "F";
    }
 */