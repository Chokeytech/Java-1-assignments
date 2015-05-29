// Takes in the title, artist, and playing time of 5 different songs
// You can choose to sort the songs based on title, artist, or playing time
// Program then outputs a list of the songs based on what you chose to sort by

import java.util.*;

class Recording {
	String title;
	String artist;
	int playingTime;
		
	// getters and setters for the variables
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(int i) {
		this.playingTime = i;
	}

	// constructor: takes in the title, artist, and playing time
	public Recording(String title, String artist, int playingTime) {
		this.title = title;
		this.artist = artist;
		this.playingTime = playingTime;
	}
}

public class RecordingSort {	

	public static void main(String[] args) {
		// initializes array for Recording objects
		Recording[] list = new Recording[5];

		Scanner input = new Scanner(System.in);

		int i = 0;
		// prompts user for song title, artist, and playing time.
		// takes information and stores it within object
		for (i = 0; i < list.length; i++) {
			int j = i + 1;

			// asks for song title
			System.out.print("Enter song " + j + "'s title: ");
			String title = input.nextLine();

			// asks for song artist
			System.out.print("Enter song " + j + "'s artist: ");
			String artist = input.nextLine();

			// asks for playing time
			System.out.print("Enter song " + j + "'s playing time in seconds: ");
			// int playingTime = input.nextInt();
			// when ^^ is used, for some reason, the loop does not ask for song 2's title.
			// so I have to use String and parseInt
			String playingTimeString = input.nextLine();
			// converts stored String to integer
			int playingTime = Integer.parseInt(playingTimeString);

			// constructs Recording object from title, artist, and playing time
			list[i] = new Recording(title, artist, playingTime);

			// adds line between prompting for information for each song
			System.out.println();
		}
		
		// initializes sortMethod variable for choosing how to sort songs
		int sortMethod;
		// asks user how songs should be sorted. User enters number that corresponds to their choice.
		do {
			System.out.println("How should these songs be sorted? 1) title 2) artist 3) playing time");
			sortMethod = input.nextInt();

			// confirms user did not enter invalid number before sorting
			if (sortMethod > 0 && sortMethod < 4) {
				int a, b;
				int highestVal = list.length - 1;
				// bubble sort
				for (a = 0; a < highestVal; a++) {
					for (b = 0; b < highestVal; b++) {
						int c = b + 1;
						
						// sorts by titles
						if (sortMethod == 1) {
							// compares title of one song with the song immediately after it
							if (list[b].getTitle().compareTo(list[c].getTitle()) > 0) {
								// reorders the songs if necessary
								Recording temp = list[b];
								list[b] = list[c];
								list[c] = temp;
							}
						} 
						// sorts by artist
						else if (sortMethod == 2) {
							// compares name of one artist with the name of the artist immediately after it
							if (list[b].getArtist().compareTo(list[c].getArtist()) > 0) {
								// reorders the songs if necessary
								Recording temp = list[b];
								list[b] = list[c];
								list[c] = temp;
							}
						} 
						// sort by playing time
						else if (sortMethod == 3) {
							// compares one song's playing time with playing time of the song immediately after it
							if (list[b].getPlayingTime() > list[c].getPlayingTime()) {
								// reorders the songs if necessary
								Recording temp = list[b];
								list[b] = list[c];
								list[c] = temp;
							}
						}
					}
				}
			}
			else {
				System.out.println("Invalid choice. Please choose 1, 2, or 3.");
			}
		} while (sortMethod < 1 || sortMethod > 3); // continues loop if user chooses invalid number
		
		// adds line space
		System.out.println();
		// displays songs in whatever order was chosen
		for (i = 0; i < list.length; i++) {
			System.out.println("Song: Title: " + list[i].getTitle() + ". Artist: " + list[i].getArtist() + ". Playing time: "
					+ list[i].getPlayingTime() + " seconds.");
		}
		

		// closes scanner
		input.close();

	}
}
