package com.rahmayuniar.myprayschedule.model.response

import com.google.gson.annotations.SerializedName
import com.rahmayuniar.myprayschedule.model.nearby.ModelResults



class ModelResultNearby {
    @SerializedName("results")
    lateinit var modelResults: List<ModelResults>
}