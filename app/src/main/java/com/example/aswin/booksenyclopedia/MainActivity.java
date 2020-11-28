package com.example.aswin.booksenyclopedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvBooks;
    BooksAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBooks = findViewById(R.id.rvBooks);
        rvBooks.setLayoutManager(new LinearLayoutManager(this));

        adapter = new BooksAdapter(this);
        rvBooks.setAdapter(adapter);

        Retrofit retrofit = ApiClient.getRetrofit();
        iTunesService service = retrofit.create(iTunesService.class);
        Call<BooksResponse> call = service.getBooks("ebook", "computer");

        call.enqueue(new Callback<BooksResponse>() {
            @Override
            public void onResponse(Call<BooksResponse> call, Response<BooksResponse> response) {
                List<Book> listBooks = response.body().results;
                adapter.setListBooks(listBooks);
            }

            @Override
            public void onFailure(Call<BooksResponse> call, Throwable t) {
                call.cancel();
            }
        });
    }
}
