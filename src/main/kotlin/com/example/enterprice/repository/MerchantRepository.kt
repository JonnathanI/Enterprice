package com.example.enterprice.repository

import com.example.enterprice.model.Merchant
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MerchantRepository: JpaRepository<Merchant, Long> {
    fun  findById(merchantId: Long?): Merchant?
}