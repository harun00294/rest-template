package com.restapi.Spring.Boot.Rest.Template.dto

import java.math.BigDecimal

data class AvgPriceDto(
        val mins: Int,
        val prica: BigDecimal,
        val symbol: String
)
