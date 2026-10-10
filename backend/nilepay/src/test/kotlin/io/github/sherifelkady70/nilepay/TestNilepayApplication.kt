package io.github.sherifelkady70.nilepay

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<NilepayApplication>().with(TestcontainersConfiguration::class).run(*args)
}
