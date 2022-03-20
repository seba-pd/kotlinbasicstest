package zadanie

interface EmployeeManager {

    fun addEmployee(employee: Employee)
    fun employeeToString() : List<String>
    fun salarySum(list: MutableList<Employee>): Int
}
