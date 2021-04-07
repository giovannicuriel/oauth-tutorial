package br.com.giovanni.office.storage.domain.ports

import br.com.giovanni.office.storage.domain.models.ScheduledEvent
import org.springframework.data.repository.Repository
import java.util.*

interface CalendarRepository : Repository<ScheduledEvent, UUID> {
    fun save(event: ScheduledEvent)
    fun findByUserId(userId: UUID): List<ScheduledEvent>
}