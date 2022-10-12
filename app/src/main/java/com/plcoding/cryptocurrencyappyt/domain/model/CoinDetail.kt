package com.plcoding.cryptocurrencyappyt.domain.model

import com.google.gson.annotations.SerializedName
import com.plcoding.cryptocurrencyappyt.data.remote.dto.TeamMember

data class CoinDetail(
    @SerializedName("coin_id")
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    @SerializedName("is_active")
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
