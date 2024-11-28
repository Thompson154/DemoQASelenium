package pages.pageELements;

import org.openqa.selenium.By;

import controls.Button;

public class CheckBox {
    
    public Button displayOptions = new Button(By.className("rct-collapse rct-collapse-btn"));
    public Button checkHome = new Button(By.xpath("//span[text()='Home']"));
}
