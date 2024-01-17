package com.template.prototype.something

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import org.springframework.data.annotation.CreatedDate
import java.time.Instant

@Entity
data class Something(
    @field: Id
    @field: GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @field:NotBlank
    val name: String,

    @field: Min(0)
    val stock: Int,

    @field: CreatedDate
    val createAt: Instant?
)