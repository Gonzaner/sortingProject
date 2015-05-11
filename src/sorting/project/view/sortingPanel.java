package sorting.project.view;

import java.awt.Color;

import javax.swing.*;

import sorting.project.controller.sortingController;

public class sortingPanel extends JPanel
{
	private sortingController baseController;
	private JButton scrambleButton;
	private JButton sortButton;
	private JButton searchButton;
	private JTextField userField;
	private JTextArea displayArea;
	private JScrollPane displayPane;
	private SpringLayout baseLayout;

	public sortingPanel(sortingController baseController)
	{
		this.baseController = baseController;

		scrambleButton = new JButton("Scramble arrays");
		sortButton = new JButton("Sort");
		searchButton = new JButton("Search");
		userField = new JTextField(25);
		displayArea = new JTextArea(10,25);
		displayPane = new JScrollPane(displayArea);
		baseLayout = new SpringLayout();
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
		baseLayout = new SpringLayout();
		
	}

	private void setupTable()
	{

	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(displayPane);
		this.add(displayArea);
		this.add(userField);
		
		this.setBackground(Color.DARK_GRAY);
	}
	
	
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}

}