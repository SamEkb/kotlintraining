package ru.kilanov.vacancy.test

import io.kotest.core.annotation.Ignored
import ru.kilanov.vacancy.docker.WiremockDockerCompose
import ru.kilanov.vacancy.fixture.BaseFunSpec
import ru.kilanov.vacancy.fixture.client.RestClient
import ru.kilanov.vacancy.fixture.docker.DockerCompose

@Ignored
open class AccRestTestBase(dockerCompose: DockerCompose) : BaseFunSpec(dockerCompose, {
    val client = RestClient(dockerCompose)

    testApiV1(client)
})

class AccRestWiremockTest : AccRestTestBase(WiremockDockerCompose)
// TODO class AccRestSpringTest : AccRestTestBase(SpringDockerCompose)
// TODO class AccRestKtorTest : AccRestTestBase(KtorDockerCompose)
