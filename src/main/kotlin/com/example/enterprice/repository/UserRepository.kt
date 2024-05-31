package com.example.enterprice.repository

import com.example.enterprice.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long> {
    fun findById(id: Long?): User?
}