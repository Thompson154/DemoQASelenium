package pages.pageELements;

import org.openqa.selenium.By;

import controls.Button;
import controls.TextBox;

public class TextBoxPage {
    
    public TextBox FullName = new TextBox(By.xpath("//input[@id='userName']"));
    public TextBox Email = new TextBox(By.xpath("//input[@id='userEmail']"));
    public TextBox CurrentAddress = new TextBox(By.xpath("//input[@id='currentAddress']"));
    public TextBox PermanentAddress = new TextBox(By.xpath("//input[@id='permanentAddress']"));
    public Button Submit = new Button(By.xpath("//button[@id='submit']"));


    public void setTextBoxes(String name, String email, String currentAddress, String permanentAddress){
        FullName.setText(name);
        Email.setText(email);
        CurrentAddress.setText(currentAddress);
        PermanentAddress.setText(permanentAddress);
        Submit.click();
    }
}
