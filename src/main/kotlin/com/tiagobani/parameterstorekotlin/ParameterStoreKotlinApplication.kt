package com.tiagobani.parameterstorekotlin

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ParameterStoreKotlinApplication {

	private val log = LoggerFactory.getLogger(ParameterStoreKotlinApplication::class.java)
	@Bean
	fun init() = CommandLineRunner {
	}
}

fun main(args: Array<String>) {
	runApplication<ParameterStoreKotlinApplication>(*args)
}
