package br.com.giovanni.office.storage.application

import br.com.giovanni.office.storage.application.messages.CreateEventRequest
import br.com.giovanni.office.storage.application.messages.CreateEventResponse
import br.com.giovanni.office.storage.domain.CalendarService
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/calendar")
class CalendarController (
    private val service: CalendarService
) {

    @PostMapping("/{userId}/events")
    fun createEvent(
    request: HttpServletRequest,
    @PathVariable("userId") userId: UUID,
    @RequestBody createEventRequest: CreateEventRequest
    ): CreateEventResponse = run {
        service.createEvent(createEventRequest.build(userId))
        return CreateEventResponse("ok!", listOf("cannot check calendar from user #1"))
    }

    @GetMapping("/{userId}/events")
    fun getEvents(
        request: HttpServletRequest,
        @PathVariable("userId") userId: UUID
    ): CreateEventResponse = run {
        service.getEvents(userId)
        return CreateEventResponse("ok!", listOf("cannot check calendar from user #1"))
    }

}