package unit11ArrayList;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;
import java.util.Collections;

public class Class
{
	private String name;
	//private Student[] studentList;
	ArrayList<Student> studentList;
	
	public Class()
	{
		name="";
		//studentList = new Student[0];
		studentList = new ArrayList<Student>();
	}
	
	public Class(String name, int stuCount)
	{
		this.name = name;
		//studentList = new Student[stuCount];
		studentList = new ArrayList<Student>(stuCount);
	}
	
	public void addStudent(int stuNum, Student s)
	{
		//studentList[stuNum] = s;
		studentList.add(s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public ArrayList<Student> sort(){
		Collections.sort(studentList);
		return studentList;
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;
		for(int i = 0; i < studentList.size(); i++){
			classAverage += getStudentAverage(i);
		}
		classAverage = classAverage / studentList.size();
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return (studentList.get(stuNum)).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		int index = 0;
		for(int i = 0; i < studentList.size(); i++){
			if (stuName.equals((studentList.get(i)).getName())){
				index = i;
			}
		}
		return getStudentAverage(index);
	}
	
	public String getStudentName(int stuNum)
	{
		return (studentList.get(stuNum)).getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";

//		for(int i = 0; i < studentList.length; i++){
//			if (getStudentAverage(i) > high){
//				high = getStudentAverage(i);
//				hName = studentList[i].getName();
//			}
//		}
		Collections.sort(studentList);
		hName = (studentList.get(studentList.size() - 1)).getName();
		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		
//		for(int i = 0; i < studentList.length; i++){
//			if (getStudentAverage(i) < low){
//				low = getStudentAverage(i);
//				hName = studentList[i].getName();
//			}
//		}
		
		Collections.sort(studentList);
		hName = (studentList.get(0)).getName();
		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i = 0; i < studentList.size(); i++){
			if (getStudentAverage(i) < 70){
				output += (studentList.get(i)).getName() + " ";
			}
		}
		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";
		for (int i = 0; i < studentList.size(); i++){
			output += String.format((studentList.get(i)).toString() + "\t" + "%.2f", (studentList.get(i)).getAverage()) + "\n";
		}
		return output;
	}  	
}