package com.mkoralewski.bench

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BenchApplication

fun main(args: Array<String>) {
	runApplication<BenchApplication>(*args)
}
