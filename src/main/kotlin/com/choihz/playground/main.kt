package com.choihz.playground

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
	val dispatcher = newFixedThreadPoolContext(4, "myPool")

	GlobalScope.launch(dispatcher) {
		println("Starting in ${Thread.currentThread().name}") // Starting in myPool-1
		delay(500)
		println("Resuming in ${Thread.currentThread().name}") // Resuming in myPool-2
		delay(500)
		println("Resuming in ${Thread.currentThread().name}") // Resuming in myPool-1
		delay(500)
		println("Resuming in ${Thread.currentThread().name}") // Resuming in myPool-2
	}.join()
}
