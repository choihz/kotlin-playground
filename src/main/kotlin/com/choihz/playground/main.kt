package com.choihz.playground

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
	val handler = CoroutineExceptionHandler { context, throwable ->
		println("Error captured in $context")
		println("Message: ${throwable.message}")
	}

	GlobalScope.launch(handler) {
		TODO("Not implemented yet!")
	}

	// wait for the error to happen
	delay(500)
}
