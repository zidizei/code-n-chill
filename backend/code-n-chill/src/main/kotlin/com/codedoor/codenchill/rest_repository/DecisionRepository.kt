package com.codedoor.codenchill.rest_repository

import com.codedoor.codenchill.model.Decision
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DecisionRepository : CrudRepository<Decision, Long> {
    /***/
    @Query("SELECT decision FROM Decision decision")
    fun getAllDecisions(): List<Decision>
}