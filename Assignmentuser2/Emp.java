package Assignmentuser2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {
String empname;
String worklocation;
LocalDate doj;
LocalDate dob;
LocalDate dor;
String dept;
int sal;
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getWorklocation() {
	return worklocation;
}
public void setWorklocation(String worklocation) {
	this.worklocation = worklocation;
}
public LocalDate getDoj() {
	return doj;
}
public void setDoj(LocalDate doj) {
	this.doj = doj;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public LocalDate getDor() {
	return dor;
}
public void setDor(LocalDate dor) {
	this.dor = dor;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getSal() {
	return sal;
	
}
public void setSal(int sal) {
	this.sal = sal;
}
public Emp(String empname, String worklocation, LocalDate doj, LocalDate dob, LocalDate dor, String dept, int sal) {
	super();
	this.empname = empname;
	this.worklocation = worklocation;
	this.doj = doj;
	this.dob = dob;
	this.dor = dor;
	this.dept = dept;
	this.sal = sal;
}
@Override
public String toString() {
	return "User2 [empname=" + empname + ", worklocation=" + worklocation + ", doj=" + doj + ", dob=" + dob + ", dor="
			+ dor + ", dept=" + dept + ", sal=" + sal + "]";
}
public static void main(String[] args) {
	List<Emp> list=new ArrayList<>();
	list.add(new Emp("ajit","pune",LocalDate.of(2022,02,27),LocalDate.of(1998, 04, 05),LocalDate.of(2026, 03,30),"java",20000));
	list.add(new Emp("meghraj","pune",LocalDate.of(2022,06,13),LocalDate.of(1998, 11, 02),LocalDate.of(2026, 10,30),"sap",15000));
	list.add(new Emp("amit","pune",LocalDate.of(2022,03,10),LocalDate.of(2000, 05, 05),LocalDate.of(2026, 12,31),"sap",22000));
	list.add(new Emp("harshad","pune",LocalDate.of(2022,05,27),LocalDate.of(1998, 11, 04),LocalDate.of(2026, 01,23),"java",30000));
	list.add(new Emp("Dhanashri","pune",LocalDate.of(2022,01,21),LocalDate.of(1998, 04, 04),LocalDate.of(2026, 05,25),"java",28000));
	list.add(new Emp("Sneha","pune",LocalDate.of(2022,05,27),LocalDate.of(1998, 05, 24),LocalDate.of(2026, 01,23),"java",28000));
	System.out.println(list);

Double totalavgByDep1=list.stream().filter(dept->"java"==dept.getDept()).collect(Collectors.averagingDouble(Emp::getSal));
Double totalavgByDep2=list.stream().filter(dept->"sap"==dept.getDept()).collect(Collectors.averagingDouble(Emp::getSal));
System.out.println("avg sal of java"+totalavgByDep1);
System.out.println("avg sal of sap"+totalavgByDep2);
int maxSal=list.stream().filter(Deptm->"java"==Deptm.getDept()).map(Emp::getSal).max(Integer::compare).get();
System.out.println("max sal by dept java"+maxSal);
int maxSal1=list.stream().filter(Deptm->"sap"==Deptm.getDept()).map(Emp::getSal).max(Integer::compare).get();
System.out.println("max sal by dept sap"+maxSal1);
String deptt1=list.stream().map(Emp::getDept).max(String::compareTo).get();
String deptt2=list.stream().map(Emp::getDept).min(String::compareTo).get();
System.out.println("Department with highest no of emp"+deptt1);
System.out.println("Department with highest no of emp"+deptt2);
}
}
