package com.tiagobani.parameterstorekotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ParameterStoreKotlinApplication

fun main(args: Array<String>) {
	runApplication<ParameterStoreKotlinApplication>(*args)
}
