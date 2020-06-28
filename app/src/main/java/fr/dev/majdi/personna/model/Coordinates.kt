package fr.dev.majdi.personna.model

import java.io.Serializable

/**
 * Created by Majdi RABEH on 28/06/2020.
 * Email : m.rabeh.majdi@gmail.com
 */

data class Coordinates(
    val latitude: String,
    val longitude: String
) : Serializable