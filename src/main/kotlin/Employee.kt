open class Employee(var name: String, var id: Int, open var role: String?) {
//

    //this will return clash error because get(),set() is named [setName2() , getName2]
    fun setName_(name2:String){
        this.name=name
    }
    fun getName_():String{
        return this.name
    }


    //init block
    init {
        this.role = "Employee"
    }

    constructor(name: String, id: Int) : this(name, id, role = null)

    //secondary constructor
    constructor():this(name="defaultName",id=0,"defaultRule")

    open fun work():String? = this?.role         //if role = null return null

    open fun report():String="Employee is reporting"



}



