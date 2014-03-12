package saitek.darkadaptations;

public class CheckVersion {

	public CheckVersion() {
		System.out.println("Dark Adaptations" + " is checking for updates!");

		try {
			if (Integer.parseInt(UpdateInfo.getLatestVersion()) > UpdateInfo.currentVersion) {
				System.out.println("Dark Adaptations" + " Found Update!");
				new Update();
			} else {
				System.out.println("Dark Adaptations" + " Didnt find any update!");
			}
		} catch (Exception e) {
			System.out.println("Dark Adaptations" + " Failed to check for updates!");
			e.printStackTrace();
		}
	}

}
