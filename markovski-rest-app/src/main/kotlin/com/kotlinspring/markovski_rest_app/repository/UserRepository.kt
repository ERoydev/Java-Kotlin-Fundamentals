package com.kotlinspring.markovski_rest_app.repository

import com.kotlinspring.markovski_rest_app.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/*
I Use Repository layer to interact with the database.
This UserRepository interface will interact with the User Entity
 */

@Repository // JPA handles all basic Crud opperations
interface UserRepository: JpaRepository<User, Long> {}