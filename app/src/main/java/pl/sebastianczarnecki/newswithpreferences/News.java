package pl.sebastianczarnecki.newswithpreferences;

public class News {
    private String titleNews;
    private String sectionNews;
    private String authorNews;
    private String dateNews;
    private String urlNews;

    public News(String titleNews, String sectionNews, String dateNews, String urlNews, String authorNews) {
        this.titleNews = titleNews;
        this.sectionNews = sectionNews;
        this.dateNews = dateNews;
        this.urlNews = urlNews;
        this.authorNews = authorNews;
    }

    public String getTitleNews() {
        return titleNews;
    }

    public String getSectionNews() {
        return sectionNews;
    }

    public String getDateNews() {
        return dateNews;
    }

    public String getUrlNews() {
        return urlNews;
    }

    public String getAuthorNews() {
        return authorNews;
    }
}
