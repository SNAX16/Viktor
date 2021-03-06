package com.molodovViktor.instagram.data

import android.arch.lifecycle.LiveData
import com.molodovViktor.instagram.models.SearchPost
import com.google.android.gms.tasks.Task

interface SearchRepository {
    fun searchPosts(text: String): LiveData<List<SearchPost>>
    fun createPost(post: SearchPost): Task<Unit>
}