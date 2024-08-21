package com.example.domain.usecase

import com.example.domain.repository.ApiRepository

class GetListChannelsUseCase(
    private val apiRepository: ApiRepository
) {

    suspend fun execute(cookie: String) = apiRepository.getListChannels(cookie)

}