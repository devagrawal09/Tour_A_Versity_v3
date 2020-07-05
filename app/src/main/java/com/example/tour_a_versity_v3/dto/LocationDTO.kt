package com.example.tour_a_versity_v3.dto

import com.google.android.gms.maps.model.LatLng

data class LocationDTO(var lat: Double, var lng: Double, var title: String, var snippet: String) {
    fun getLatLng() = LatLng(lat, lng)
}