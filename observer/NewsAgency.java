package com.newsagency.observer;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class NewsAgency implements Observer {
    private List<Subscriber> subscribers;
    private String latestNews;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void attach(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println("Subscriber added successfully.");
        } else {
            System.out.println("Subscriber already exists.");
        }
    }

    @Override
    public void detach(Subscriber subscriber) {
        if (subscribers.remove(subscriber)) {
            System.out.println("Subscriber removed successfully.");
        } else {
            System.out.println("Subscriber not found.");
        }
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }

    public void publishNews(String news) {
        System.out.println("\n[NEWS AGENCY] Publishing breaking news...");
        this.latestNews = news;
        notifySubscribers();
    }

    public String getLatestNews() {
        return latestNews;
    }

    public int getSubscriberCount() {
        return subscribers.size();
    }
}