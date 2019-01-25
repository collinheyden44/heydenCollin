package designingClasses;

import java.util.ArrayList;

public class HardDrive {
	
	private String name;
	private ArrayList<Integer> fileSizes = new ArrayList<Integer>();
	private double totalCapacity;
	private double freeSpace;
	
	public HardDrive(String newName, int newTotalCapacity, ArrayList<Integer> newFileSizes) throws RuntimeException {
		
		if (newName.length() <= 0) {
			throw new RuntimeException("Invalid name entered");
		}
		
		if (totalCapacity <= 0) {
			throw new RuntimeException("Incorrect Size");
		}
		
		int sum = 0;
		for (int i = 0; i < newFileSizes.size(); i++) {
			sum += newFileSizes.get(i);
		}
		
		if (sum > totalCapacity) {
			throw new RuntimeException("Invalid Free space");
		}
		
		name = newName;
		totalCapacity = newTotalCapacity;
		fileSizes = newFileSizes;
		freeSpace = totalCapacity - sum;

	}
	
	public boolean isHardDriveFull() {
		
		if (freeSpace == 0) {
			return true;

		} 
		else {
			return false;
		}
	
	}
	
	public boolean isHardDriveEmpty() {
		if (freeSpace == totalCapacity) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void addFile(int newFileSize) throws RuntimeException {
		
		if (!(newFileSize > 0 && newFileSize <= freeSpace)) {
			throw new RuntimeException("Incorrect Size");
		}
		
		freeSpace -= newFileSize;
		fileSizes.add(newFileSize);
		
	}
	
	public void deleteFile(int deleteIndex) throws RuntimeException {
		
		if (!(deleteIndex >= 0 && deleteIndex < fileSizes.size())) {
			throw new RuntimeException("Index is out of bounds");
		}
		
		int fileSize = fileSizes.get(deleteIndex);
		freeSpace += fileSize;
		fileSizes.remove(deleteIndex);
		
	}

}
