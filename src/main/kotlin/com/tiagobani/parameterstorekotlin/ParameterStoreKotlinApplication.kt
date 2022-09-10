package com.tiagobani.parameterstorekotlin

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ParameterStoreKotlinApplication(
	@Value("\${param:default}")
	private val param: String
) {

	private val log = LoggerFactory.getLogger(ParameterStoreKotlinApplication::class.java)
	@Bean
	fun init() = CommandLineRunner {
		log.info("param => $param")
	}
}

fun main(args: Array<String>) {
	runApplication<ParameterStoreKotlinApplication>(*args)
}
