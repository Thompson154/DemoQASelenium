package pages.pageELements;

import org.openqa.selenium.By;

import controls.Button;
import controls.TextBox;

public class WebTablesPage {
    public Button Add = new Button(By.xpath(""));
    public TextBox TypeToSearch = new TextBox(By.xpath(""));
    public Button Edit = new Button(By.xpath(""));
    public Button Delete = new Button(By.xpath(""));
    public TextBox NumberPage = new TextBox(By.xpath(""));
    public Button NumberRows = new Button(By.xpath(""));
    public Button NextPage = new Button(By.xpath(""));
    public Button PreviousPage = new Button(By.xpath(""));

    // Form de la parte de edicion
    public TextBox FirstName = new TextBox(By.xpath(""));
    public TextBox LastName = new TextBox(By.xpath(""));
    public TextBox Email = new TextBox(By.xpath(""));
    public TextBox Age = new TextBox(By.xpath(""));
    public TextBox Salary = new TextBox(By.xpath(""));
    public TextBox Department = new TextBox(By.xpath(""));
    public Button Submit = new Button(By.xpath(""));

}
