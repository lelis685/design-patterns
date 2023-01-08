package org.example.creational.factoryMethod;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType websiteType){
        return switch (websiteType){
            case BLOG -> new Blog();
            case SHOP -> new Shop();
        };
    }

}
