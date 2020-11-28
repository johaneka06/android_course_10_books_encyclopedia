package com.example.aswin.booksenyclopedia;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BooksResponse {

    @SerializedName("resultCount")
    @Expose
    public Integer resultCount;
    @SerializedName("results")
    @Expose
    public List<Book> results = null;

}
