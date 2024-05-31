package com.example.enterprice.repository


import com.example.enterprice.model.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository: JpaRepository<Order, Long> {
    fun findById(id: Long?): Order?
}