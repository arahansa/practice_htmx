package com.example.practice_htmx.domain

import jakarta.validation.constraints.Max
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import org.hibernate.validator.constraints.Length

data class TestClass(

    @field:NotBlank
    @field:Length(max = 4)
    var name: String? = null,

    @field:NotNull
    @field:Max(20)
    var age: Int? = null
)