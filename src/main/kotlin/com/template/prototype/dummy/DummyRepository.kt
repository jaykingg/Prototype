package com.template.prototype.dummy

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DummyRepository : CrudRepository<Dummy, Long> {
}