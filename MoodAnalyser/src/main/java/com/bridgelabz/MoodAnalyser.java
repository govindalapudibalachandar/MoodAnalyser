package com.bridgelabz;

public class MoodAnalyser {

	public String analyserMood (String message) {
        if(message.contains("Sad"))  //if condition for happy and sad
            return "SAD";
        else 
        return "Happy";
        
		
    }
}
