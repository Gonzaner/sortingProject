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

		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
		baseLayout = new SpringLayout();
		
	}

	private void setupTable()
	{
		displayPane = new JScrollPane(displayPane);
		displayArea = new JTextArea();
		userField = new JTextField();
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