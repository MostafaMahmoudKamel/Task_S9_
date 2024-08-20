class Manager:Employee(){

    //override role Employee
    override var role: String?="Manager"

    private var department:String?=null

    fun setDepartment(department:String){
        this.department=department
    }

    fun getDepartment()=this.department

    //override work in Employee
    override fun work(): String? {
        return "manager is Managing department name ${this.department}"
    }

    //override report in Employee
    override fun report(): String {
        return "manager reports to the company board"
    }
}