package co.devhack.backend.app.data.entities.mapper

import co.devhack.backend.app.data.entities.CourseEntity
import co.devhack.backend.app.domain.models.Course
import co.devhack.backend.app.util.Mapper
import org.springframework.stereotype.Component

@Component
class CourseEntityMapper : Mapper<CourseEntity, Course>() {

    override fun map(value: CourseEntity): Course {
        val course = Course("")
        course.id = value.id
        course.date = value.date
        course.description = value.description
        course.name = value.name

        return course
    }

    override fun reverseMap(value: Course): CourseEntity {
        val course = CourseEntity("")
        course.id = value.id
        course.date = value.date
        course.description = value.description
        course.name = value.name

        return course
    }
}