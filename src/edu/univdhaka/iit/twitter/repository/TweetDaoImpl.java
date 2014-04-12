package edu.univdhaka.iit.twitter.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import java.sql.PreparedStatement;

import edu.univdhaka.iit.twitter.domain.Tweet;
import edu.univdhaka.iit.twitter.utils.DataConnectionPool;

public class TweetDaoImpl implements TweetDao{

	private Connection connection;
	
	
	@Override
	public void create(Tweet tweet) {
		// TODO Auto-generated method stub

		String query = "INSERT INTO Tweet"
				+"(tweet_text,timestamp,tweet_by)"
						+ "VALUES(? ,? ,? )";
		
		
		try{
			
			
			//Connection connection = DataConnectionPool.getConnection();
			
			PreparedStatement preparedStatement = DataConnectionPool.getConnection().prepareStatement(query);
			
			preparedStatement.setString(1, tweet.getTweetText());
			preparedStatement.setDate(2, tweet.getTimestamp());
			preparedStatement.setString(3, tweet.getTweetBy().getEmailAddress());
			
			preparedStatement.execute();
			
		}catch (SQLException e){
			
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public Tweet findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tweet> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Tweet tweet) {
		// TODO Auto-generated method stub
		
	}

	

}
