package com.example.enterprice.repository

import com.example.enterprice.model.orderItem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface orderItemRepository:JpaRepository<orderItem, Long> {
    fun findById(id: Long?) : orderItem?
}