//data class can't be open
data class Developer(var programmingLanguage: String) : Employee() {

    override var role: String? = "Developer"

    constructor() : this("Default programming language data")

    fun setProgrammingLanguage_(programmingLanguage: String) {
        this.programmingLanguage = programmingLanguage
    }

    fun getProgrammingLanguage_() = this.programmingLanguage

    override fun work() = "Developer is Coding in programmingLanguage ${this.programmingLanguage}"

    override fun report() = "developer reports to their manager"


}

