package br.com.giovanni.office.storage.domain

import br.com.giovanni.office.storage.domain.models.ScheduledEvent
import br.com.giovanni.office.storage.domain.ports.CalendarRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class CalendarService (
    private val repository: CalendarRepository
) {
    fun createEvent(event: ScheduledEvent) {
        repository.save(event);
    }

    fun getEvents(userId: UUID): List<ScheduledEvent> {
        return repository.findByUserId(userId)
    }
}