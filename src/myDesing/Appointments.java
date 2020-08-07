package myDesing;

import java.util.Date;

public class Appointments {
   public Date AppDate;
   public String Name;
   public String Surname;
   public int PatNo;
   public String Condition;
   


public Appointments(Date appDate, String name, String surname, int patNo, String condition) {
	super();
	AppDate = appDate;
	Name = name;
	Surname = surname;
	PatNo = patNo;
	Condition = condition;
}



public Appointments() {
	super();
	// TODO Auto-generated constructor stub
}



/**
 * @return the appDate
 */
public Date getAppDate() {
	return AppDate;
}



/**
 * @param appDate the appDate to set
 */
public void setAppDate(Date appDate) {
	AppDate = appDate;
}



/**
 * @return the name
 */
public String getName() {
	return Name;
}



/**
 * @param name the name to set
 */
public void setName(String name) {
	Name = name;
}



/**
 * @return the surname
 */
public String getSurname() {
	return Surname;
}



/**
 * @param surname the surname to set
 */
public void setSurname(String surname) {
	Surname = surname;
}



/**
 * @return the patNo
 */
public int getPatNo() {
	return PatNo;
}



/**
 * @param patNo the patNo to set
 */
public void setPatNo(int patNo) {
	PatNo = patNo;
}



/**
 * @return the condition
 */
public String getCondition() {
	return Condition;
}



/**
 * @param condition the condition to set
 */
public void setCondition(String condition) {
	Condition = condition;
}



@Override
public String toString() {
	return "Appointments [AppDate=" + AppDate + ", Name=" + Name + ", Surname=" + Surname + ", PatNo=" + PatNo
			+ ", Condition=" + Condition + "]";
}

	

}
