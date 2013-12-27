package edu.univdhaka.iit.twitter.repository;

import edu.univdhaka.iit.twitter.domain.Tweet;
import edu.univdhaka.iit.twitter.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bazlur Rahman Rokon on 12/28/13.
 */
public class TwitterFactory {
    private static List<User> userList;
    private static List<Tweet> tweetList;
    private static int tweetId = 0;
    private static int userId = 0;

    static {
        userList = new ArrayList<User>();
        tweetList = new ArrayList<Tweet>();
    }

    public static int getGeneratedTweetId() {
        return tweetId = tweetId + 1;
    }

    public static int getGeneratedUserId() {
        return userId = userId + 1;
    }

    public static List<User> getUserList() {
        return userList;
    }

    public static List<Tweet> getTweetList() {
        return tweetList;
    }
}
