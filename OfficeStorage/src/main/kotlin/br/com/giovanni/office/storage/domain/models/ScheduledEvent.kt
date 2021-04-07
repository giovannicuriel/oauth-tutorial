package br.com.giovanni.office.storage.domain.models

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "scheduled_events")
data class ScheduledEvent(
    val endDate: LocalDateTime,
    val invitees: String,
    val notes: String,
    val startDate: LocalDateTime,
    val title: String,
    @Id
    val userId: UUID
)