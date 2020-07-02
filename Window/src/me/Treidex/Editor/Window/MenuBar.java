package me.Treidex.Editor.Window;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {
	private static final long serialVersionUID = 1L;
	
	public static MenuBar $this;
	
	public JMenu file;
		public JMenuItem file_new;
		public JMenuItem file_open;
	
	public JMenu edit;
		
	
	public JMenu run;
		
	
	private MenuBar() {}
	
	public static void Initialize() {
		$this = new MenuBar();
		
		$this.file = new JMenu("File");
			$this.file_new = new JMenuItem("New");
			$this.file_open = new JMenuItem("Open...");
		
			$this.file.add($this.file_new);
			$this.file.add($this.file_open);
		
		$this.add($this.file);
		
		$this.edit = new JMenu("Edit");
		
		$this.add($this.edit);
	
		$this.run = new JMenu("Run");
		
		$this.add($this.run);
	}
}
