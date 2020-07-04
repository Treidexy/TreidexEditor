package me.Treidex.Editor.Window;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;

public class FileEvents {
	public static void NewFile() {
		
	}
	
	public static void OpenFile() {
		JButton b = new JButton();
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new File("."));
		fc.setDialogTitle("Open...");
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		if (fc.showOpenDialog(b)==JFileChooser.APPROVE_OPTION) {
			
			try {
				File f = new File("");
				FileInputStream fis = new FileInputStream(f);
				byte[] d = new byte[(int) f.length()];
				fis.read(d);
				fis.close();
				String r = new String(d, "UTF-8");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
