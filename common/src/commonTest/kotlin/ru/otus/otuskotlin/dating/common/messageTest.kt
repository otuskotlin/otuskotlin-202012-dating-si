package ru.otus.otuskotlin.dating.common

import kotlin.test.Test
import kotlin.test.assertEquals

class MessageTest {
    @Test
    fun itCreatesMessage() {
        val id = "one-id"
        val content = "message to you"
        val message = Message(id = id, message = content)

        assertEquals(message.id, id)
        assertEquals(message.message, content)
    }
}