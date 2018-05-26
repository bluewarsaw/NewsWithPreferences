package pl.sebastianczarnecki.newswithpreferences;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_details, parent, false);
        }

        News currentNews = getItem(position);
        TextView newsTitleTextView = (TextView) listItemView.findViewById(R.id.title_tv);
        String title = currentNews.getTitleNews();
        newsTitleTextView.setText(title);

        TextView newsCategoryTV = (TextView) listItemView.findViewById(R.id.category_tv);
        String category = currentNews.getSectionNews();
        newsCategoryTV.setText(category);

        TextView newsDateTV = (TextView) listItemView.findViewById(R.id.date_tv);
        String date = currentNews.getDateNews();
        newsDateTV.setText(date);

        TextView newsAuthorTV = (TextView) listItemView.findViewById(R.id.author_tv);
        String author = currentNews.getAuthorNews();
        checkAuthorTV(newsAuthorTV, author);

        return listItemView;
    }

    private void checkAuthorTV(TextView authorTV, String author) {
        if (author == null) {
            authorTV.setVisibility(View.GONE);
        } else {
            authorTV.setVisibility(View.VISIBLE);
            authorTV.setText(author);
        }
    }

}
