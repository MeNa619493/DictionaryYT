package com.plcoding.dictionary.feature_dictionary.presentation

sealed class UIEvent {
    data class ShowSnackbar(val message: String): UIEvent()
}