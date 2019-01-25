package designingClasses;

import java.util.ArrayList;

public class HardDrive {
	
	private String name;
	private ArrayList<Double> fileSizes = new ArrayList<Double>();
	private double totalCapacity;
	private double freeSpace;
	
	public HardDrive() {
		name = "Disk 1";
		fileSizes.add(0.0);
		totalCapacity = 32000.0;
		freeSpace = 0;
	}

}
