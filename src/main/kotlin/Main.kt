fun main() {

    var employee = Employee()
    println(employee.role)
    println(employee.report())
    println()

    var manager1 = Manager()
    manager1.setName_("Desha")
    println(manager1.name)
    println("manager rule= ${manager1.role}")
    println("rule is = ${manager1.role}")
    manager1.setDepartment("superMarket")
    println(manager1.getDepartment() ?: null)
    println(manager1.work())
    println()

//    3. Demonstrate Polymorphism:
    var developer: Employee = Developer()            //liskov's substitution principle [manager is employee]
    println(developer.work())
    println(developer.report())
    println()

//casting subClass to superClass
    var manager: Manager = Manager()
    var castingEmployee = manager as? Employee
    println(castingEmployee?.work())
    println(castingEmployee?.report())

    //sealed Class
    var state = State.Success("Success data")
    var isSuccess = state is State.Success
    println("State is success = $isSuccess")


}