package week3.day2;

public class DEsktop implements HardWare, Software { 
	
	public void softwareResources() {
		System.out.println("Software Resources Method is succesfully called!");
	}

	public void hardwareResources() {
		System.out.println("Hardware Resources Method is succesfully called!");
	}

	public void desktopModel() {
		System.out.println("Desktop Model Method is successfully called!");
	}

	public static void main(String[] args) {
		DEsktop desktop = new DEsktop();
		desktop.softwareResources();
		desktop.hardwareResources();
		desktop.desktopModel();
	}
}