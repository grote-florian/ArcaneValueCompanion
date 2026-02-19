package com.example.arcanevaluecompanion

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

@HiltViewModel
class ArcaneItemsViewModel @Inject constructor(
    private val repository: ArcaneItemsRepository // Assuming dependency injection for repository
) : ViewModel() {

    private val _uiState = MutableLiveData<ArcaneItemsUiState>()
    val uiState: LiveData<ArcaneItemsUiState> get() = _uiState

    init {
        fetchArcaneItems()
    }

    private fun fetchArcaneItems() {
        _uiState.value = ArcaneItemsUiState.Loading // Set loading state
        viewModelScope.launch {
            try {
                val items = repository.getArcaneItems() // Fetch items from repository
                _uiState.value = ArcaneItemsUiState.Success(items) // Set success state with items
            } catch (e: Exception) {
                _uiState.value = ArcaneItemsUiState.Error(e.message ?: "Unknown error") // Set error state
            }
        }
    }
}

sealed class ArcaneItemsUiState {
    object Loading : ArcaneItemsUiState()
    data class Success(val items: List<ArcaneItem>) : ArcaneItemsUiState() // Assuming ArcaneItem is defined
    data class Error(val message: String) : ArcaneItemsUiState()
}