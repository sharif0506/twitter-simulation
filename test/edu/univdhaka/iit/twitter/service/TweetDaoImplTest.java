package edu.univdhaka.iit.twitter.service;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;

import com.mysql.jdbc.UpdatableResultSet;

import edu.univdhaka.iit.twitter.domain.*;
import edu.univdhaka.iit.twitter.repository.TweetDao;
import edu.univdhaka.iit.twitter.repository.TweetDaoImpl;



public class TweetDaoImplTest {
	
	private static final String FIRST_NAME = "Bazlur";
	private static final String LAST_NAME = "Rahman";
	private static final String EMAIL_ADDRESS = "anm_brr@yahoo.com";
	private static final String PASSwORD = "HXJD^%DAS";

	private static final String TWEET = "I posted a discussion,end of the stupid content tracker git";

	private User user;
	private Tweet tweet;
	private TweetDao tweetDao;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("TweeterServiceImplTest setup");
		
		user = new User();
		
		user.setFirstName(FIRST_NAME);
		user.setLastName(LAST_NAME);
		user.setEmailAddress(EMAIL_ADDRESS);
		user.setPassword(PASSwORD);
		
		tweet = new Tweet();
		tweet.setTweetText(TWEET);
		tweet.setTimestamp(new Date(new java.util.Date().getTime()));
		tweet.setTweetBy(user);
		
		tweetDao = new TweetDaoImpl();
	
		
	}
	
	@Test
	public void createTest(){
		
		tweetDao.create(tweet);
	}
	
	
}
