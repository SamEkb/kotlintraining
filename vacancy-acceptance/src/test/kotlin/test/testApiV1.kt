package ru.kilanov.vacancy.test

import io.kotest.core.spec.style.FunSpec
import ru.kilanov.vacancy.fixture.client.Client
import ru.kilanov.vacancy.test.action.v1.createAd

fun FunSpec.testApiV1(client: Client) {
    context("v1") {
        test("Create Ad ok") {
            client.createAd()
        }
    }
}