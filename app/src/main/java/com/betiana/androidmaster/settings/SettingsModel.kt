package com.betiana.androidmaster.settings

data class SettingsModel (
    var volume: Int,
    var bluetooth: Boolean,
    val darkMode: Boolean,
    val vibration: Boolean
)
