package com.hexaware.FTP117.model;

import com.hexaware.FTP117.persistence.DbConnection;
import com.hexaware.FTP117.persistence.EmployeeDAO;
import java.text.SimpleDateFormat;

import java.util.Objects;
import java.util.Date;
import java.util.List;


/**
 * Employee class to store employee personal details.
 * @author hexware
 */
public class Employee {
  /**
   * empId to store employee Id.
   */
  private int empId;
  /**
   * empFullName to store employee FullName.
   */
  private String empFullName;
  /**
   * empEmail to store employee Email.
   */
  private String empEmail;
  /**
   * empMobile to store employee Mobile.
   */
  private String empMobile;
  /**
   * empDateOfJoining to store employee Date of joining.
   */
  private Date empDateOfJoining;
  /**
   * empDeparmentName to store employee Department.
   */
  private String empDeparment;
  /**
   * empMgrId to store employee manager id.
   */
  private int empMgrId;
  /**
   * empMl to store employee AvailableLeaves.
   */
  private int empMl;
  /**
  * empMl to store employee AvailableLeaves.
  */
  private int empEl;
  /**
   * empMl to store employee AvailableLeaves.
   */
  private int empPl;
  /**
   * empHrId to store employee AvailableLeaves.
   */
  private int empHrId;


  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Employee emp = (Employee) obj;
    if (Objects.equals(empId, emp.empId)
        && Objects.equals(empFullName, emp.empFullName)
        && Objects.equals(empMobile, emp.empMobile)
        && Objects.equals(empEmail, emp.empEmail)
        && Objects.equals(empDeparment, emp.empDeparment)
        && Objects.equals(empDateOfJoining, emp.empDateOfJoining)
        && Objects.equals(empMgrId, emp.empMgrId)
        && Objects.equals(empPl, emp.empPl)
        && Objects.equals(empMl, emp.empMl)
        && Objects.equals(empEl, emp.empEl)
        && Objects.equals(empHrId, emp.empHrId)) {
      return true;
    }
    return false;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(empId, empFullName, empMobile, empEmail, empDeparment, empDateOfJoining, empMgrId,
                        empPl, empMl, empEl, empHrId);
  }
  @Override
  public final String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String doj = sdf.format(empDateOfJoining);
    return " EmpId:" + empId + " EmpName:" + empFullName + " EmpPhoneNo:"
             + empMobile + " EmpEmail:" + empEmail + " EmpDept:"
             + empDeparment + " EmpJoinDate:" + doj + " EmpMgrId:"
             + empMgrId + " EmpML:" + empMl + "empHrId " + empHrId;
  }
  /**
   * Default Constructor of Employee.
   */
  public Employee() {
  }
  /**
   * @param argEmpId to initialize employee id.
   * @param argEmpFullName to initialize employee FullName.
   * @param argEmpMobile to initialize employee mobile.
   * @param argEmpEmail to initialize employee email.
   * @param argEmpDepartment to initialize employee Department.
   * @param argEmpDateOfJoining to initialize employee Date of Joining.
   * @param argEmpMgrId to initialize employee manager Id.
   * @param argEmpPl to initialize employee AvailableLeave.
   * @param argEmpMl to initialize employee AvailableLeave.
   * @param argEmpEl to initialize employee AvailableLeave.
   * @param argHrId to initialize employee AvailableLeave
   */
  public Employee(final int argEmpId, final String argEmpFullName, final String argEmpEmail,
                 final String argEmpMobile,
                 final String argEmpDepartment, final Date argEmpDateOfJoining,
                 final int argEmpMgrId, final int argEmpPl, final int argEmpMl, final int argEmpEl, final int argHrId) {
    this.empId = argEmpId;
    this.empFullName = argEmpFullName;
    this.empMobile = argEmpMobile;
    this.empEmail = argEmpEmail;
    this.empDeparment = argEmpDepartment;
    this.empDateOfJoining = argEmpDateOfJoining;
    this.empMgrId = argEmpMgrId;
    this.empMl = argEmpMl;
    this.empPl = argEmpPl;
    this.empEl = argEmpEl;
    this.empHrId = argHrId;
  }
  /**
   * Gets the EmployeeId.
   * @return this Employee's ID.
   */
  public final int getEmpId() {
    return empId;
  }

  /**
   *
   * @param argEmpId to set employee id.
   */
  public final void setEmpId(final int argEmpId) {
    this.empId = argEmpId;
  }
  /**
   * Gets the EmployeeName.
   * @return this Employee's Name.
   */
  public final String getEmpFullName() {
    return empFullName;
  }
  /**
   * @param argEmpFullName to set employee name.
   */
  public final void setEmpFullName(final String argEmpFullName) {
    this.empFullName = argEmpFullName;
  }
  /** Gets the EmployeeEmail.
   * @return this Employee's Email.
   */
  public final String getEmpEmail() {
    return empEmail;
  }
  /**
   * @param argEmpEmail to set employee email.
   */
  public final void setEmpEmail(final String argEmpEmail) {
    this.empEmail = argEmpEmail;
  }
  /**
   * Gets the EmployeeMobile.
   * @return this Employee's Mobile.
   */
  public final String getEmpMobile() {
    return empMobile;
  }
  /**
   * @param argEmpMobile to set employee mobile.
   */
  public final void setEmpMobile(final String argEmpMobile) {
    this.empMobile = argEmpMobile;
  }
  /**
   * Gets the EmployeeDateOfJoining.
   * @return this Employee's DateofJoining.
   */
  public final Date getEmpDateOfJoining() {
    return empDateOfJoining;
  }
  /**
   * @param argEmpDateOfJoining to set employee DateOfJoining.
   */
  public final void setEmpDateOfJoining(final Date argEmpDateOfJoining) {
    this.empDateOfJoining = argEmpDateOfJoining;
  }
  /**
   * Gets the EmployeeDeparment.
   * @return this Employee's Department Name.
   */
  public final String getEmpDepartment() {
    return empDeparment;
  }
  /**
   * @param argEmpDepartment to set employee Department.
   */
  public final void setEmpDepartment(final String argEmpDepartment) {
    this.empDeparment = argEmpDepartment;
  }
  /**
   * @Gets the Empolyee Manager.
   * @return this Employee's manager Id.
   */
  public final int getEmpMgrId() {
    return empMgrId;
  }
  /**
   * @param argEmpMgrId to set employee managerId.
   */
  public final void setEmpMgrId(final int argEmpMgrId) {
    this.empMgrId = argEmpMgrId;
  }
  /**
   * @Gets the Employee Avaliable leave.
   * @return this Employee's mL
   */
  public final int getEmpMl() {
    return empMl;
  }
  /**
   * @param argEmpMl to set employee Ml
   */
  public final void setEmpMl(final int argEmpMl) {
    this.empMl = argEmpMl;
  }
    /**
   * @Gets the Employee Avaliable leave.
   * @return this Employee's mL
   */
  public final int getEmpPl() {
    return empPl;
  }
  /**
   * @param argEmpPl to set employee Ml
   */
  public final void setEmpPl(final int argEmpPl) {
    this.empPl = argEmpPl;
  }
      /**
   * @Gets the Employee Avaliable leave.
   * @return this Employee's mL
   */
  public final int getEmpEl() {
    return empEl;
  }
  /**
   * @param argEmpEl to set employee Ml
   */
  public final void setEmpEl(final int argEmpEl) {
    this.empEl = argEmpEl;
  }
  /**
   * @Gets the Employee hr id.
   * @return this Employee's mL
   */
  public final int getEmpHrId() {
    return empHrId;
  }
  /**
   * @param argHrId to set employee Ml
   */
  public final void setEmpHrId(final int argHrId) {
    this.empHrId = argHrId;
  }

  /**
   * The dao for employee.
   * @return returning connection.
   */
  public static EmployeeDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }

  /**
   * list all employee details.
   * @return all employees' details
   */
  public static Employee[] listAll() {

    List<Employee> es = dao().list();
    return es.toArray(new Employee[es.size()]);
  }

  /**
   * list employee details by id.
   * @param empID id to get employee details.
   * @return Employee
   */
  public static Employee listById(final int empID) {
    return dao().find(empID);
  }

}
