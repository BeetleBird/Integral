package kata;

import java.util.Scanner;

public class Kata {
	public static void main(String[] args) {
		MakePost post = new MakePost();
		Users user = new Users();
		int selection;
		Boolean runApp = true;
		while (runApp) {
			
			
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to Integral Social!");
			System.out.println("-------------------------\n");
			System.out.println("1 - Make a Post");
			System.out.println("2 - View your profile");
			System.out.println("3 - View Timeline");
			System.out.println("4 - Select Friends Profile");
			selection = input.nextInt();
			if (selection == 1) {
				while (true) {
					System.out.println("Whatcha thinkin' about?");
					Scanner scan = new Scanner(System.in);
					String capturePost = scan.nextLine();
					post.createPost(capturePost);
					break;
				}
			}
//			if (selection == 2) {
//				while (true) {
//					System.out.println(user.getSelectedUser() + "'s" + " Profile");
//					ViewProfiles view = new ViewProfiles(post.getPostList());
//					view.displayProfile();
//				}
			}
		}
	}



