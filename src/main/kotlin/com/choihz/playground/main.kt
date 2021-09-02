package com.choihz.playground

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

var count = 0

fun main() = runBlocking {
	val workerA = asyncIncrement(2000)
	val workerB = asyncIncrement(100)

	workerA.await()
	workerB.await()

	println("count $count")
}

fun asyncIncrement(by: Int) = GlobalScope.async {
	for (i in 0 until by) {
		count++
	}
}
