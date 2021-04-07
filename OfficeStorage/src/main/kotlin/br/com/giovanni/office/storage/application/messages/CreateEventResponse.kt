package br.com.giovanni.office.storage.application.messages

data class CreateEventResponse(
    val status: String,
    val notes: List<String>,
)
