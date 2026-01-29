package com.placement.model;

import jakarta.persistence.*;

// This tells JPA it's a database table
@Entity
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int issueYear;

    private String filePath; // where the certificate file is stored

    // Link to Student
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    // Link to College
    @ManyToOne
    @JoinColumn(name = "college_id", nullable = false)
    private College college;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getIssueYear() { return issueYear; }
    public void setIssueYear(int issueYear) { this.issueYear = issueYear; }

    public String getFilePath() { return filePath; }
    public void setFilePath(String filePath) { this.filePath = filePath; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public College getCollege() { return college; }
    public void setCollege(College college) { this.college = college; }
}