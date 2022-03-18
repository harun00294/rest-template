package com.restapi.Spring.Boot.Rest.Template.model.dataaccess

import java.math.BigDecimal

data class AvgPrice(
        val mins: Int,
        val prica: BigDecimal,
        var symbol: String
)
