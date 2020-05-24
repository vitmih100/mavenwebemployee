package domain;

import enums.Gender;
import java.time.LocalDate;

public class Employee {
  private int id;
  private int idnp;
  private static int nextIdnp = 1;
  private String name;
  private String surName;
  private double salary;
  private LocalDate hireDay;
  private LocalDate birthDay;
  private Gender gender;

  public Employee(int id,String name,String surName,double salary,LocalDate hireDay,LocalDate birthDay,Gender gender){
    this.id=id;
    //setIdnp();
    this.idnp=id;
    this.name=name;
    this.surName=surName;
    this.salary=salary;
    this.hireDay=hireDay;
    this.birthDay=birthDay;
    this.gender=gender;
  }

  public Employee(int id,int idnp,String name,String surName,double salary,LocalDate hireDay,LocalDate birthDay,Gender gender){
    this.id=id;
    this.idnp=idnp;
    this.name=name;
    this.surName=surName;
    this.salary=salary;
    this.hireDay=hireDay;
    this.birthDay=birthDay;
    this.gender=gender;
  }  
  
  public int getId(){
    return this.id;
  }
  public void setId(int id){
    this.id=id;
  }
  
  public int getIdnp(){
    return this.idnp;
  }

  public void setIdnp(){
    this.idnp=this.nextIdnp++;
  }

  public void setIdnp(int idnp){
    this.idnp=idnp;
  }
  
  public static int getNextIdnp(){
    return nextIdnp;
  }

  public String getName(){
    return this.name;
  }

  public String getSurName(){
    return this.surName;
  }

  public double getSalary(){
    return this.salary;
  }

  public LocalDate getHireDay(){
    return this.hireDay;
  }

  public LocalDate getBirthDay(){
    return this.birthDay;
  }

  public void raiseSalary(double byPercent){
    double raise = salary * byPercent / 100;
    salary += raise;
  }


  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }
  @Override
  public boolean equals(Object obj){
    
    if(obj instanceof Employee){
      Employee emp=(Employee)obj;
      return this.name == emp.getName() && this.surName == emp.getSurName() &&
           this.salary == emp.getSalary() && this.hireDay == emp.getHireDay() &&
           this.birthDay == emp.getBirthDay() && this.gender == emp.getGender();
    }
    return false;
  }
  
  public void setSalary(double salary) throws IllegalArgumentException{
    if(salary>0){
      this.salary=salary;
    }else{
      throw new IllegalArgumentException("Salariul nu poate fi negativ");
    }
  }

}
