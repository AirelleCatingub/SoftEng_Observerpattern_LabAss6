package com.newsagency.demo;

import com.newsagency.observer.*;

/**
 * Demo class to test the News Subscription Service
 */
public class NewsSubscriptionDemo {
    public static void main(String[] args) {
        // Create the news agency
        NewsAgency newsAgency = new NewsAgency();

        System.out.println("=== Real-Time News Subscription Service Demo ===\n");

        // Create subscribers
        Subs alice = new Subs("Alice", newsAgency);
        Subs bob = new Subs("Bob", newsAgency);
        Subs charlie = new Subs("Charlie", newsAgency);

        // Publish first breaking news
        newsAgency.publishNews("Breaking: Major tech company announces revolutionary AI breakthrough!");

        System.out.println("\n--- Charlie unsubscribes ---");
        charlie.unsubscribe();

        // Publish second breaking news
        newsAgency.publishNews("Breaking: Global climate summit reaches historic agreement!");

        // Add new subscriber
        System.out.println("\n--- Diana joins the service ---");
        Subs diana = new Subs("Diana", newsAgency);

        // Publish third breaking news
        newsAgency.publishNews("Breaking: Scientists discover potential cure for rare disease!");

        System.out.println("\n--- Bob unsubscribes ---");
        bob.unsubscribe();

        // Final news update
        newsAgency.publishNews("Breaking: International space mission launches successfully!");

        System.out.println("\n=== Demo Complete ===");
        System.out.println("Current subscribers: " + newsAgency.getSubscriberCount());
    }
}