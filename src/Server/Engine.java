package Server;

import java.util.ArrayList;

public class Engine implements Runnable{

	public static ArrayList<Subreddit> subreddits;
	public static Subreddit frontPage;
	
	Subreddit world;
	
	static boolean [] objectIDs = new boolean[100000];
	public final static int TICK_RATE = 60;
	
	
	
	public Engine()
	{
		subreddits = new ArrayList<Subreddit>();
		frontPage = new Subreddit("frontpage");
		subreddits.add(frontPage);
	}
	
	@Override
	public void run() {
		
		
	}
	
	
	public static int useNextID()
	{
		for (int id = 0; id < objectIDs.length; id++) {
			if (!objectIDs[id]) {
				objectIDs[id] = true;
				return id;
			}
		}
		return -1;
		
	}
	
	public static void removeID(int id)
	{
		objectIDs[id]=false;
	}
	
	

}
