package ru.otus.otuskotlin.dating.common.backend

import ru.otus.otuskotlin.dating.common.Message

import kotlin.test.Test
import kotlin.test.assertEquals

class ReplyMessageTest {
    @Test
    fun itRepliesToMessage() {
        val incoming = Message(id = 1, content = "Hello!")
        val expected = Message(id = 2, content = "Reply to Hello!")

        assertEquals(replyMessage(incoming), expected)
    }
}