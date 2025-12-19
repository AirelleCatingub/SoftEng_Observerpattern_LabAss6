package com.newsagency.observer;

/**
 * Observer interface for receiving updates
 */
public interface Subscriber {
    void update(String news);
}