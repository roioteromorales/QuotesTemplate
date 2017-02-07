package com.roisoftstudio.frasesdetemplate.ui.quote;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.roisoftstudio.frasesdetemplate.R;
import com.roisoftstudio.frasesdetemplate.model.Quote;

import java.util.List;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesViewHolder> {

    private List<Quote> quotes;
    private Context context;

    public QuotesAdapter(List<Quote> quotes) {
        this.quotes = quotes;
    }

    @Override
    public QuotesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        CardView cardView = (CardView) LayoutInflater.from(context)
                .inflate(R.layout.quote_view, parent, false);
        return new QuotesViewHolder(cardView);    }

    @Override
    public void onBindViewHolder(QuotesViewHolder holder, int position) {
        Quote quote = quotes.get(position);
        holder.render(quote);
    }

    @Override
    public int getItemCount() {
        return quotes.size();
    }
}
