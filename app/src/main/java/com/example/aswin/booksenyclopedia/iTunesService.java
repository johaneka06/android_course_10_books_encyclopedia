package com.example.aswin.booksenyclopedia;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface iTunesService {
    @GET("search")
    Call<BooksResponse> getBooks(
            @Query(value="media") String media,
            @Query(value="term") String term
    );
}
