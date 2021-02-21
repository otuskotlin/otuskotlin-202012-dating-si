package ru.otus.otuskotlin.dating.common

import kotlin.test.Test
import kotlin.test.assertEquals

class MessageTest {
    @Test
    fun itCreatesMessage() {
        val id = 1
        val content = "message to you"
        val message = Message(id = id, content = content)

        assertEquals(message.id, id)
        assertEquals(message.content, content)
    }
}