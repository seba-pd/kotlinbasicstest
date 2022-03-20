package zadanie

interface EmployeeManager {

    fun addEmployee(employee: Employee)
    fun employeeToString() : String
    fun salarySum(list: MutableList<Employee>): Int
}
