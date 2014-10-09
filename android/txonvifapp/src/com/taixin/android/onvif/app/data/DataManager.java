package com.taixin.android.onvif.app.data;

public class DataManager {
	
	private static DataManager instance;
	private  OnvifData onvifData;
	
	public static DataManager getInstance(){
		if(instance == null){
			instance = new DataManager();
		}
		return instance;
	}

	public OnvifData getOnvifData() {
		return onvifData;
	}

	public void setOnvifData(OnvifData onvifData) {
		this.onvifData = onvifData;
	}
	
}
