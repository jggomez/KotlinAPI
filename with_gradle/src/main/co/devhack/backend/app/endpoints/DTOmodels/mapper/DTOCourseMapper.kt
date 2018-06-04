package co.devhack.backend.app.endpoints.DTOmodels.mapper

import co.devhack.backend.app.domain.models.Course
import co.devhack.backend.app.endpoints.DTOmodels.DTOCourse
import co.devhack.backend.app.util.Mapper
import org.springframework.stereotype.Component

@Component
class DTOCourseMapper : Mapper<Course, DTOCourse>() {

    override fun map(value: Course): DTOCourse {
        val course = DTOCourse()
        course.date = value.date
        course.description = value.description
        course.name = value.name

        return course
    }

    override fun reverseMap(value: DTOCourse): Course {
        val course = Course("")
        course.date = value.date
        course.description = value.description
        course.name = value.name

        return course
    }
}