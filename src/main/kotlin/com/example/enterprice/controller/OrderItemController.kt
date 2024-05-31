package com.example.enterprice.controller

import com.example.enterprice.model.OrderItem
import com.example.enterprice.service.OrderItemService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/orderItem")
class OrderItemController {
    @Autowired
     lateinit var  orderItemService: OrderItemService
    @GetMapping
    fun list(): List<OrderItem>{
        return orderItemService.list()
    }

    @PostMapping
    fun save(@RequestBody orderItem: OrderItem): OrderItem{
        return orderItemService.save(orderItem)
    }

    @PutMapping
    fun update(@RequestBody orderItem: OrderItem):ResponseEntity <OrderItem>{
        return ResponseEntity(orderItemService.update(orderItem), HttpStatus.OK)
    }

    @PatchMapping
    fun updateName(@RequestBody orderItem: OrderItem):ResponseEntity<OrderItem>{
        return ResponseEntity(orderItemService.update(orderItem), HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id:Long):ResponseEntity<String>{
        orderItemService.delete(id)
        return ResponseEntity("Articulo Eliminado" ,HttpStatus.OK)
    }

}