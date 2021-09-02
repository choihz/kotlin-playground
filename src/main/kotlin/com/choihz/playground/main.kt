package com.choihz.playground

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

lateinit var jobA: Job
lateinit var jobB: Job

fun main() = runBlocking {
	jobA = GlobalScope.launch {
		delay(1000)
		// wait for JobB to finish
		jobB.join()
	}

	jobB = GlobalScope.launch {
		// wait for JobA to finish
		jobA.join()
	}

	// wait for JobA to finish
	jobA.join()
	println("Finished!")
}
