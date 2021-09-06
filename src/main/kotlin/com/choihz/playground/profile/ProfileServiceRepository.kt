package com.choihz.playground.profile

interface ProfileServiceRepository {
	suspend fun fetchByName(name: String): Profile
	suspend fun fetchById(id: Long): Profile
}
