package comportamental.observer;

//Clasa ConcreteSubject
public class NewsChannel extends Subject {
    private String latestNews;

    public void setLatestNews(String news) {
        this.latestNews = news;
        notifyObservers(news);
    }

    public String getLatestNews() {
        return latestNews;
    }
}
