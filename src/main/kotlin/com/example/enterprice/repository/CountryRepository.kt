package com.example.enterprice.repository

import com.example.enterprice.model.Country
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CountryRepository: JpaRepository<Country, Long> {
    fun findById (id:Long?):Country?
}