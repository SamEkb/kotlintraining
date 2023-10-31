package ru.kilanov.vacancy.docker

import ru.kilanov.vacancy.fixture.docker.AbstractDockerCompose

object WiremockDockerCompose : AbstractDockerCompose(
    "app-wiremock_1", 8080, "wiremock/docker-compose-wiremock.yml"
)