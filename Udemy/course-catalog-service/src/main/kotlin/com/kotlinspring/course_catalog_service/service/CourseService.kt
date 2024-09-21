package com.kotlinspring.course_catalog_service.service

import com.kotlinspring.course_catalog_service.dto.CourseDTO
import com.kotlinspring.course_catalog_service.entity.Course
import com.kotlinspring.course_catalog_service.repository.CourseRepository
import org.springframework.stereotype.Service

@Service
class CourseService(val courseRepository : CourseRepository ) {

    fun addCourse(courseDTO: CourseDTO) {

        val courseEntity = courseDTO.let {
            Course(null, it.name, it.category)
        }

        courseRepository.save(courseEntity)

        return courseEntity.let {
            courseDTO(it.id, it.name, it.category)
        }
    }
}
