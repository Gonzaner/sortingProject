package sorting.project.view;

import javax.swing.*;

import sorting.project.controller.sortingController;

public class sortingPanel extends JPanel
{
	private sortingController baseController;
	private JButton scrambleButton;
	private JButton sortButton;
	private JButton searchButton;
	private JTextField userFiled;
	private JTextArea displayArea;
	private JScrollPane displayPane;
	private SpringLayout baseLAyout;

	public sortingPanel(sortingController baseController)
	{
		this.baseController = baseController;

		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
		

	}

	private void setupTable()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
	
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}

}