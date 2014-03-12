package saitek.darkadaptations;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import net.minecraft.client.Minecraft;

public class Update {
	
	private JButton updateButton;

	public Update() {
	/*this.setLayout(new BorderLayout());
	this.setTitle("Dark Adaptations" + " Update!");
	this.setSize(500, 100);

	// DONT set this to "EXIT_ON_CLOSE" that will just cause minecraft to
	// close
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	updateButton = new JButton("Update!");

	// this adds an action to the button
	updateButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	// this is what will happen after you click the button
	downloadUpdate();
	}
	});

	add(updateButton, BorderLayout.CENTER);
	show();
	}

	private void downloadUpdate() {
	//Your updater will be placed into the mods folder
	File file = new File(Minecraft.getMinecraft().mcDataDir.getAbsolutePath() + File.separator + "mods" + File.separator + "Dark Adaptations" + "Updater.jar");
	System.out.println(file);
	String[] run = { "java", "-jar", file.getAbsolutePath().toString() };
	if (file.exists()) {
	try {
	Runtime.getRuntime().exec(run);
	System.exit(0);
	} catch (Exception e) {
	e.printStackTrace();
	}
	} else {
	openInBrowser();
	JOptionPane.showMessageDialog(null, file.getName() + " didn't exist ... opening in browser!");
	}
	}

	private void openInBrowser() {
	try{
	//to keep it simple you can put your forums url in here
	String url = "insert forums url";

	if(Desktop.isDesktopSupported())
	{
	Desktop.getDesktop().browse(new URI(url));
	}
	}catch(Exception e)
	{
	e.printStackTrace();
	}
	}

*/	}

	
	
	

}
