package com.kotlinspring.course_catalog_service.dto
// Data Transfer Object

data class CourseDTO(
    val id : Int?,
    val name : String,
    val category : String
)