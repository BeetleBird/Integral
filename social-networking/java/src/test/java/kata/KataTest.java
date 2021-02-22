package kata;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KataTest {
		@Test
	    //Testing if we can make a post.
	 void canCreatePost() {
	        MakePost post = new MakePost();
	        String testPost = "Fine weather we're having";
	        //I'm calling the method createPost to then store this string in.
	        post.createPost(testPost);
	        String expected = testPost;
	        // Actual is getting the PostList at index 0.
	        String actual = post.getPostList().get(0);
	       
	        assertEquals(expected, actual);
	            
	    }
}