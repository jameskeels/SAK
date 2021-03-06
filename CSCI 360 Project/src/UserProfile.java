import java.util.*;
public class UserProfile {
	private String profileID;
	private ArrayList<String> linkedDevices;
	private String username;
	private float strideLength;
	private float weight;
	private int stepGoal;
	private ArrayList<Day> history;
	
	
	public UserProfile(String[] profileVals){
		profileID = profileVals[0];
		username = profileVals[1];
		strideLength = Float.parseFloat(profileVals[2]);
		weight = Float.parseFloat(profileVals[3]);
		stepGoal = Integer.parseInt(profileVals[4]);
		linkedDevices = new ArrayList<String>();
		history = new ArrayList<Day>();
		
		
	}
	
	public void addToLinkedDevices(String deviceId){
		linkedDevices.add(deviceId);
	}
	
	//Some Getter Functions
	public String getProfileID(){
		return profileID;
		
	}
	
	public String getUsername(){
		return username;
		
	}
	public float getStrideLength(){
		return strideLength;
		
	}

	public ArrayList<Day> getHistory(){
		return history;
	}
	
	public int getStepgoal(){
		return stepGoal;
	}
	/**
	 * 
	 * @param deviceID
	 * @return
	 * Tests to see if the deviceID specified exists in linkedDevices
	 */
	public boolean verifyLinkedDevice(String deviceID){
		for(int i = 0; i< linkedDevices.size(); i++){
			if(linkedDevices.get(i) == deviceID){
				return true;
			}
		}
		return false;
	
	}
	/**
	 * 
	 * @param newHist
	 * @return
	 * Tests to see if two ArrayList<Day> objects are equal and have all of the same objects in the 
	 * same order.
	 */
	public boolean equalHistory(ArrayList<Day> newHist){
	   if(newHist == null && this.history == null){
		   return true; 
	   }else if(newHist == null && this.history != null){
		   return false;
	   }else if(newHist != null && this.history == null){
		   return false;
	   }else if(newHist.size() != this.history.size()){
		   return false;
	   }
	   for(Day d: newHist){
		   if(!this.history.contains(d)){
			   return false;
		   }
	   }
	   return true;
	   
	   
	}
	
	public void addToHistory(Day d){
		history.add(d);
	}
}
	

