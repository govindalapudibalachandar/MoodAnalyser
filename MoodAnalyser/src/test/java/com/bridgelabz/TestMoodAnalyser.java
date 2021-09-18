package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyser {

MoodAnalyser moodanalyser = new MoodAnalyser();
	
	//test case for sad
	@Test
	 public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        String mood = moodanalyser.analyserMood("These Is A Sad Message");
        Assert.assertEquals("SAD",mood);
	}
	
	//test case for happy
		@Test
		 public void givenMessgae_WhenNotSad_ShouldReturn_Happy() {
	        String mood = moodanalyser.analyserMood("These Is A Hppy Mesage");
	        Assert.assertEquals("HAPPY",mood);
}
}
