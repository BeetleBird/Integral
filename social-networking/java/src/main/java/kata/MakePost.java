package kata;
import java.util.ArrayList;
import java.util.List;

public class MakePost {
	Users user = new Users();
	private String post;
	private List<String> postList = new ArrayList<String>();
	public MakePost() {
	}
	// constructor for viewing profile
	public MakePost(List<String> postList) {
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public List<String> getPostList() {
		return postList;
	}
	public void setPostList(List<String> postList) {
		this.postList = postList;
	}
	// Allows user to create post then and store post
	public void createPost(String postString) {
		this.post = user.setUserPosts(postString);
		postList.add(this.post);
		System.out.println("Post Created.");
		// This syso is just showing that we did indeed capture the users input..
		System.out.println(postList);
	}
}