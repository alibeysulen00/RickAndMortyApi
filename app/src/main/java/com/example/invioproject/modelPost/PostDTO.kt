package com.example.invioproject.modelPost

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PostDTO(
    @SerializedName("info")
    var info: Info,
    @SerializedName("results")
    var results: List<Result>
):Serializable