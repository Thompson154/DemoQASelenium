package pages;

import org.openqa.selenium.By;

import controls.Button;

public class pagePrincipal {

    public Button Elements = new Button(By.xpath("//h5[text()='Elements']"));
    public Button Forms = new Button(By.xpath("//h5[text()='Forms']"));
    public Button AlertFrameWindow  = new Button(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
    public Button Widgets = new Button(By.xpath("//h5[text()='Widgets']"));
    public Button Interaction = new Button(By.xpath("//h5[text()='Interactions']"));
    public Button BookStore = new Button(By.xpath("//h5[text()='Book Store Application']"));

}