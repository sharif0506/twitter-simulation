package edu.univdhaka.iit.twitter;

import edu.univdhaka.iit.twitter.domain.User;
import edu.univdhaka.iit.twitter.service.TweetService;
import edu.univdhaka.iit.twitter.service.TweetServiceImpl;
import edu.univdhaka.iit.twitter.service.UserService;
import edu.univdhaka.iit.twitter.service.UserServiceImpl;

/**
 * All the tweets are generated from
 * http://yes.thatcan.be/my/next/tweet/
 */

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        TweetService tweetService = new TweetServiceImpl();

        User user = new User();
        user.setFirstName("Bazlur");
        user.setLastName("Rahman");
        user.setEmailAddress("anm_brr@yahoo.com");
        user.setPassword("Bd647#td");
        userService.createNewUser(user);

        String[] tweets = {"I posted a discussion, end of the stupid content tracker git\" can mean anything, ",
                "PaaS Review : Looking for a programmer are; impatience, laziness.",
                "Ok I'm currently taking notes. Check out the finest software development. It forces you learn and.",
                "আজ শরতের প্রথম দিন, এখনি আকাশে নীলের মাঝে শাদা মেঘের ছুটোছুটি শুরু না হতেই শেষ হয়ে গেলো বেড়াল... !!",
                "Java gives you, the motto, your lifetime. "};

        for (String tweet : tweets) {
            tweetService.postTweet(tweet, user);
        }

        User user1 = new User();
        user1.setFirstName("Twitter");
        user1.setLastName("Robot");
        user1.setEmailAddress("robot@yahoo.com");
        user1.setPassword("Bd647#td");
        userService.createNewUser(user1);

        String[] tweets2 = {
                "JBoss Application Server renaming.... requests for kids...: A brief introduction of a CV like sticky.",
                "Just Rayhanur Rahman & Django :P :| ... : Rayhanur Rahman is almost done!!",
                "An article on cloud . works fine.. ! Ubuntu 13.04 will be great fun, I should be well... interesting.",
                "Java pundits will buy JRebel. I can... আজ শরতের প্রথম দিন, এখনি আকাশে নীলের মাঝে শাদা মেঘের ছুটোছুটি শুরু!",
                "Every foreign language you really make use G+. ফটোগ্রাফি: guys got skills... Guys, get a concurrency.",
                "Android - random... A book recommendation, one and ... grrr : Another day just animal names .. $6.2?",
                "The three attributes of lambda expressions and Me of the stupid content tracker git\" can you program...",
                "How to have been... I can exchange my talents and even shapes the latest Java Executing Linux Mint, if.",
                "Check out Birds Puzzle on Google Play How Remove Duplicate Rows from Java EE EAR with Dracula Theme, just?",
                "The answer is, Nothing. I thought, it was only be in bugs. A trivial exception was so easy to learn!",
                "Funny Indeed !!! বাংলাদেশের পাবলিক ইউনিভার্সিটির ওয়েব সাইট গুলা কি জানতো? জানতো না।... Executing Linux.",
                "Things get some fresh entertainment, start reading linux kernel code, specially... know that have any.",
                "Loved it. if you please explain it a little about cutting off their development time, try Spring MVC 2nd."
        };

        for (String tweet : tweets2) {
            tweetService.postTweet(tweet, user1);
        }
    }
}
