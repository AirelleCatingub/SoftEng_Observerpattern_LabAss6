package com.newsagency.observer;

/**
 * Subject interface for the Observer pattern
 * Defines methods for managing observers (subscribers)
 */
public interface Observer {
    void attach(Subscriber subscriber);
    void detach(Subscriber subscriber);
    void notifySubscribers();
}