package com.choihz.playground

import com.choihz.playground.profile.ProfileServiceClient
import com.choihz.playground.profile.ProfileServiceRepository
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
	val client: ProfileServiceRepository = ProfileServiceClient()
	val profile = client.asyncFetchById(12).await()

	println(profile)
}
