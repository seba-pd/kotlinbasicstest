package zadanie

data class Employee(val id:Long, var address :  String,var salary: Int, var position: Position = Position.Developer ) {

}
