package ru.kilanov.vacancy.test.action.v1

import io.kotest.assertions.withClue
import io.kotest.matchers.should
import ru.kilanov.vacancy.fixture.client.Client

suspend fun Client.createAd(): Unit =
    withClue("createAdV1") {
        val response = sendAndReceive(
            "ad/create", """
                {
                    "name": "Bolt"
                }
            """.trimIndent()
        )

        response should haveNoErrors
    }
