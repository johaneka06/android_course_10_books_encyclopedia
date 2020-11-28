package com.example.aswin.booksenyclopedia;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Book {

    @SerializedName("artworkUrl60")
    @Expose
    public String artworkUrl60;
    @SerializedName("artworkUrl100")
    @Expose
    public String artworkUrl100;
    @SerializedName("artistViewUrl")
    @Expose
    public String artistViewUrl;
    @SerializedName("trackCensoredName")
    @Expose
    public String trackCensoredName;
    @SerializedName("fileSizeBytes")
    @Expose
    public Integer fileSizeBytes;
    @SerializedName("trackViewUrl")
    @Expose
    public String trackViewUrl;
    @SerializedName("trackId")
    @Expose
    public Integer trackId;
    @SerializedName("trackName")
    @Expose
    public String trackName;
    @SerializedName("formattedPrice")
    @Expose
    public String formattedPrice;
    @SerializedName("genreIds")
    @Expose
    public List<String> genreIds = null;
    @SerializedName("releaseDate")
    @Expose
    public String releaseDate;
    @SerializedName("artistIds")
    @Expose
    public List<Integer> artistIds = null;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("artistId")
    @Expose
    public Integer artistId;
    @SerializedName("artistName")
    @Expose
    public String artistName;
    @SerializedName("genres")
    @Expose
    public List<String> genres = null;
    @SerializedName("price")
    @Expose
    public Double price;
    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("kind")
    @Expose
    public String kind;

}
