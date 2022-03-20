package classesandinterfeaces

import zadanie.Employee
import zadanie.EmployeeManagerImpl


fun main() {

    val emplyee = Employee(1,"kety" , 3000)
    val employeeManager = EmployeeManagerImpl()
    employeeManager.addEmployee(emplyee)

    var result : String = employeeManager.employeeToString()
    println(result)

}
