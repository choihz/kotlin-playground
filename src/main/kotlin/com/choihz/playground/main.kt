package com.choihz.playground

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
	GlobalScope.launch(Dispatchers.Unconfined) {
		println("Starting in ${Thread.currentThread().name}") // Starting in main
		delay(500)
		println("Resuming in ${Thread.currentThread().name}") // Resuming in kotlinx.coroutines.DefaultExecutor
	}.join()
}
