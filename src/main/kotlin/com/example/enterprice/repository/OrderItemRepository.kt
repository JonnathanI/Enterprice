package com.example.enterprice.repository

import com.example.enterprice.model.OrderItem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderItemRepository:JpaRepository<OrderItem, Long> {
    fun findById(id: Long?) : OrderItem?
}