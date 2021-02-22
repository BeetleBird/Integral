package kata;

import java.util.List;

public class Users {
	private String username;
	private String userPost;
	private int userFollowers;
	private int usersFollowing;

	public Users(String username, String userPost, int userFollowers, int usersFollowing) {
		//super();
		this.username = username;
		this.userPost = userPost;
		this.userFollowers = userFollowers;
		this.usersFollowing = usersFollowing;
	}

	public Users(String username, String userPost) {
		this.username = username;
		this.userPost = userPost;
	}
	
	public Users() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserPost() {
		return userPost;
	}

	public String setUserPosts(String userPost) {
		return this.userPost = userPost;
	}

	public int getUserFollowers() {
		return userFollowers;
	}

	public void setUserFollowers(int userFollowers) {
		this.userFollowers = userFollowers;
	}

	public int getUsersFollowing() {
		return usersFollowing;
	}

	public void setUsersFollowing(int usersFollowing) {
		this.usersFollowing = usersFollowing;
	}

}
