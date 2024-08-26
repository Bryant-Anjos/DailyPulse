package com.bryant.dailypulse.articles

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class ArticlesService(private val httpClient: HttpClient) {
    private val country = "us"
    private val category = "business"
    private val apiKey = "7dfc14a87497432684159858234ab0e2"

    suspend fun fetchArticles(): List<ArticleRaw> {
        val response: ArticlesResponse = httpClient.get(
            "https://newsapi.org/v2/top-headlines?country=$country&category=$category&apiKey=$apiKey",
        ).body()
        return response.articles
    }
}