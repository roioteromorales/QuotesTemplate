package com.roisoftstudio.frasesdetemplate.ui.quote;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.roisoftstudio.frasesdetemplate.R;
import com.roisoftstudio.frasesdetemplate.model.Quote;
import com.roisoftstudio.frasesdetemplate.ui.BaseActivity;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class QuotesListActivity extends BaseActivity {

    private RecyclerView quotes;
    private QuotesAdapter quotesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes_list);
        initializeRecyclerView();
    }
    private void initializeRecyclerView() {
        quotes = (RecyclerView) findViewById(R.id.quotes);
        quotes.setHasFixedSize(true);
        quotes.setLayoutManager(new LinearLayoutManager(this));
        quotesAdapter = new QuotesAdapter(asList(new Quote("Quote 1"), new Quote("Quote 2")));

        quotes.setAdapter(quotesAdapter);
    }

}
