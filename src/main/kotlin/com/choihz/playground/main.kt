package com.choihz.playground

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
	val dispatcher = newSingleThreadContext("myThread")

	GlobalScope.launch(dispatcher) {
		println("Starting in ${Thread.currentThread().name}") // Starting in myThread
		delay(500)
		println("Resuming in ${Thread.currentThread().name}") // Resuming in myThread
	}.join()
}
