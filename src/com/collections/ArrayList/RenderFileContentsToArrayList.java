package com.collections.ArrayList;

import java.io.*;
import java.util.*;

public class RenderFileContentsToArrayList {
	static ArrayList<String> songsList = new ArrayList<String>();
	public static void main(String[] args) {
		
		RenderFileContentsToArrayList content = new RenderFileContentsToArrayList();
		content.getSongs();
		System.out.println("Before sorting :"+songsList);
		Collections.sort(songsList); // sort() in-built method provided by collections class
		System.out.println("After sorting :"+ songsList);	
	}
	void getSongs() {
		//read the contents of the file
		try {
				File f = new File("songsList.txt");
				BufferedReader reader = new BufferedReader(new FileReader(f));
				String line = null;
				while((line=reader.readLine())!=null) { //reading until the line is empty 
					addSongsToList(line);
				}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	void addSongsToList(String parseTheContent) {
		//add the contents to the List
		String[] songTitles = parseTheContent.split("/");
		songsList.add(songTitles[0]);
	}

}


/*
 * Output of the program :
 * 
 * Before sorting :[Shake it off, The Heart Wants What it Wants, 7 rings, Perfect]
 * After sorting :[7 rings, Perfect, Shake it off, The Heart Wants What it Wants]
 * 
 */