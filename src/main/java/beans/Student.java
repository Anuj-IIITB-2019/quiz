package beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Student {
	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	    private String rollNo;
	    private boolean login;
	private String name;
	private String dob;
	private String course;
	private String year;
	private String password;
//	    private Integer login;// 0 false 1 true

	@ManyToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	private Collection<Test> tests = null;

	@OneToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	private Collection<TestA> answers = null;

	public Collection<Test> getTests() {
		return tests;
	}

	public void setTests(Collection<Test> tests) {
		this.tests = tests;
	}

	public Collection<TestA> getAnswers() {
		return answers;
	}

	public void setAnswers(Collection<TestA> answers) {
		this.answers = answers;
	}

	public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	public boolean getLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourse(){ return course ;}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	}


