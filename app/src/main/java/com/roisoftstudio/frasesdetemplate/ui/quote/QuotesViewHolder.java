package com.roisoftstudio.frasesdetemplate.ui.quote;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.roisoftstudio.frasesdetemplate.R;
import com.roisoftstudio.frasesdetemplate.model.Quote;

public class QuotesViewHolder extends RecyclerView.ViewHolder {
    private TextView text;

    public QuotesViewHolder(View itemView) {
        super(itemView);
        text = (TextView) itemView.findViewById(R.id.quote_text);
    }

    public void render(Quote quote) {
        text.setText(quote.getText());
    }
}
