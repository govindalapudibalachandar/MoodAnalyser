package com.bridgelabz;

public class MoodAnalyser {

	public String analyserMood (String message) {
    
	//try and catch block
        try {
            if (message.contains("Sad"))  //if condition for happy or sad
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e){
            return "HAPPY";
        }
		
    }
}
