package zadanie

class EmployeeManagerImpl : EmployeeManager {
    private val employeeList = mutableListOf<Employee>()

    override fun addEmployee(employee: Employee) {
        employeeList.add(employee)
    }

    override fun employeeToString(): List<String> {
       return employeeList.map {it -> it.toString() }
    }

    override fun salarySum(list: MutableList<Employee>): Int {
        return list.map { it.salary }.reduce{acc, sum -> acc + sum}
    }
}
