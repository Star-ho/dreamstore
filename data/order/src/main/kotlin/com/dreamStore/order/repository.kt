package com.dreamStore.order

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderJPARepository : JpaRepository<OrderData, Long>