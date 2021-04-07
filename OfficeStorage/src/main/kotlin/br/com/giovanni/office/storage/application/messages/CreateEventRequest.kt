package br.com.giovanni.office.storage.application.messages

import br.com.giovanni.office.storage.domain.models.ScheduledEvent
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

data class CreateEventRequest(
    val endDate: String,
    val invitees: List<String>,
    val notes: String,
    val startDate: String,
    val title: String
) {
    fun build(userId: UUID): ScheduledEvent = ScheduledEvent(
        userId = userId,
        title = title,
        startDate = LocalDateTime.parse(startDate, DateTimeFormatter.ISO_DATE_TIME),
        endDate = LocalDateTime.parse(endDate, DateTimeFormatter.ISO_DATE_TIME),
        notes = notes,
        invitees = invitees.reduce { acc, s -> "$acc, $s" },
    )
}
