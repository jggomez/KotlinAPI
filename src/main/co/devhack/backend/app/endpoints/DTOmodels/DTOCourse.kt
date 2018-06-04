package co.devhack.backend.app.endpoints.DTOmodels


class DTOCourse() {

    lateinit var name: String
    lateinit var description: String
    lateinit var date: String

    constructor(name: String,
                description: String,
                date: String) : this() {
        this.name = name
        this.description = description
        this.date = date
    }
}