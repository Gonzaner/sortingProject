package sorting.project.view;

import javax.swing.JFrame;

import sorting.project.controller.sortingController;

public class sortingFrame extends JFrame
{
	
private sortingPanel appPanel;
	
	public sortingFrame(sortingController baseController)
	{
		appPanel = new sortingPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setContentPane(appPanel);
		this.setVisible(true);
	}
	
}
