package me.Treidex.Editor.Window;

import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public String name;
	public int width, height;
	
	public final boolean resizable;
	
	public Window(String name, int width, int height, final boolean resizable) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.resizable = resizable;
		
		setName(name);
		setSize(width, height);
		setResizable(resizable);
		
		if (resizable)
			addComponentListener(new ComponentAdapter() 
			{
				@Override
				public void componentResized(ComponentEvent e) {
				    Component c = (Component) e.getSource();
				    super.componentResized(e);
				    resizeWindow(c.getWidth(), c.getHeight());
				}
			});
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
	}
	
	public void Create() {
		setLocationRelativeTo(null);
		setVisible(true);
		setJMenuBar(MenuBar.$this);
	}
	
	public void resizeWindow(int width, int height) {
		this.width = width;
		this.height = height;
	}
}