package ru.otus.otuskotlin.dating.common.backend

import ru.otus.otuskotlin.dating.common.Message

fun replyMessage(incoming: Message): Message {
    return Message(id = incoming.id + 1, content = "Reply to ${incoming.content}")
}