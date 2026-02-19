package com.example.arcanevaluecompanion.ui.state

data class ArcaneItemsUiState(
    val items: List<ArcaneItem> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)