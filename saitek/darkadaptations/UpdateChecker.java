package saitek.darkadaptations;

import java.io.BufferedInputStream;
import java.net.URL;
import java.net.URLConnection;

public class UpdateChecker {
	public UpdateChecker() {
		System.out.println(ModInfo.NAME + " is checking for updates!");

		try {
			if (Integer.parseInt(getLatestVersion()) > ModInfo.CURRENTBUILD) {
				System.out.println(ModInfo.NAME + " A new version is available!");
				ModInfo.UPDATEA = true;
			} else {
				System.out.println(ModInfo.NAME + " No updates are available.");
			}
		} catch (Exception e) {
			System.out.println(ModInfo.NAME + " Something went wrong, failed to check for updates!");
			e.printStackTrace();
		}
	}

	public static String getLatestVersion() throws Exception {
		String data = getData(ModInfo.UPDATEURL);
		return data;
	}
	
	private static String getData(String address) throws Exception {
	  URL url;
	  URLConnection uc;
	  StringBuffer buffer = new StringBuffer("");
	  
	  url = new URL(address);
	  uc = url.openConnection();
	  uc.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
	  uc.connect();
	  uc.getInputStream();
	  
	  BufferedInputStream in = new BufferedInputStream(uc.getInputStream());
	  
	  int ch;
	  while ((ch = in.read()) != -1) {
		  buffer.append((char) ch);
	  }
	  return buffer.toString();
	}
}
