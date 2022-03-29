package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Student {
    private Integer id;
    private String name;
    private String college;
    private String roll;
    private String qualification;
    private String course;
    private String year;
    private String certificate;
    private String hallticketno;
  
    public Student() {
    }
 
    public Student(Integer id,String name,String college,String roll,String qualification,String course, String year,String certificate,String hallticketno) {
        this.id = id;
        this.name = name;
        this.college=college;
        this.roll=roll;
        this.qualification=qualification;
        this.course=course;
        this.year=year;
        this.certificate=certificate;
        this.hallticketno=hallticketno;
        
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getHallticketno() {
		return hallticketno;
	}

	public void setHallticketno(String hallticketno) {
		this.hallticketno = hallticketno;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ",roll="+roll+",qualification="+qualification+",course="+course+",year="+year+",certificate="+certificate+",hallticketno="+hallticketno+"]";
	}

	
}