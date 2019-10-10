package concession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.winium.WiniumDriver;

import drivers.Controllers;

public class Objects_elements_concession {

	
	WebDriver wd;

	public Objects_elements_concession(WiniumDriver wd) 
	{
		
		PageFactory.initElements(wd, this);
	}

	@FindBy(how = How.ID, using = "txtUserName")
	private WebElement txtbox;

	public void Login_username(String Username)
	{
		txtbox.sendKeys(Username);
	}

	@FindBy(how = How.ID, using = "CmdLogin")
	private WebElement btn;

	public void Login_btn_button() 
	{
		btn.click();
	}

	@FindBy(how = How.ID, using = "CmdButton0")
	private WebElement zero;

	public void zero_button() {
		zero.click();
	}

	@FindBy(how = How.ID, using = "CmdButton1")
	private WebElement one;

	public void one_button() {
		one.click();
	}

	@FindBy(how = How.ID, using = "CmdButton2")
	private WebElement two;

	public void two_button() {
		two.click();
	}

	@FindBy(how = How.ID, using = "CmdButton3")
	private WebElement three;

	public void three_button() {
		three.click();
	}

	@FindBy(how = How.ID, using = "CmdButton4")
	private WebElement four;

	public void four_button() {
		four.click();
	}

	@FindBy(how = How.ID, using = "CmdButton5")
	private WebElement five;

	public void five_button() {
		five.click();
	}

	@FindBy(how = How.ID, using = "CmdButton6")
	private WebElement six;

	public void six_button() {
		six.click();
	}

	@FindBy(how = How.ID, using = "CmdButton7")
	private WebElement seven;

	public void seven_button() {
		seven.click();
	}

	@FindBy(how = How.ID, using = "CmdButton8")
	private WebElement eight;

	public void eight_button() {
		eight.click();
	}

	@FindBy(how = How.ID, using = "CmdButton9")
	private WebElement nine;

	public void nine_button() {
		nine.click();
	}

	@FindBy(how = How.NAME, using = "Multiple")
	private WebElement Checkbox_multiple;

	public void multiple_button() {
		Checkbox_multiple.click();
	}

	@FindBy(how = How.NAME, using = "KOT")
	private WebElement Checkbox_kot;

	public void kot_button() {
		Checkbox_kot.click();
	}

	@FindBy(how = How.NAME, using = "Is LED Display Enabled")
	private WebElement Checkbox_Is_LED_Display_Enabled;

	public void checkbox_is_led_display_enabled_button() {
		Checkbox_Is_LED_Display_Enabled.click();
	}

	@FindBy(how = How.NAME, using = "       snackes       ")
	private WebElement btn_snacks;

	public void snacks_button() {
		btn_snacks.click();
	}

	@FindBy(how = How.NAME, using = "       cold drink       ")
	private WebElement btn_cold_drinks;

	public void cold_drink_button() {
		btn_cold_drinks.click();
	}

	@FindBy(how = How.NAME, using = "       pestry       ")
	private WebElement btn_pestry;

	public void pestry_button() {
		btn_pestry.click();
	}

	@FindBy(how = How.NAME, using = "       icecream       ")
	private WebElement btn_ice_cream;

	public void ice_cream_button() {
		btn_ice_cream.click();
	}

	@FindBy(how = How.NAME, using = "       sandwich       ")
	private WebElement btn_sandwich;

	public void sandwich_button() {
		btn_sandwich.click();
	}

	@FindBy(how = How.NAME, using = "Show Total")
	private WebElement btn_show_total;

	public void show_total_button() {
		btn_show_total.click();
	}

	@FindBy(how = How.NAME, using = "Refresh")
	private WebElement btn_refresh;

	public void refresh_button() {
		btn_refresh.click();
	}

	@FindBy(how = How.NAME, using = "Last Transaction")
	private WebElement btn_last_transaction;

	public void last_transaction_button() {
		btn_last_transaction.click();
	}

	@FindBy(how = How.NAME, using = "Refund")
	private WebElement btn_refund;

	public void refund_button() {
		btn_refund.click();
	}

	@FindBy(how = How.NAME, using = "Exit")
	private WebElement btn_exit;

	public void exit_button() {
		btn_exit.click();
	}

	@FindBy(how = How.NAME, using = "Abort")
	private WebElement btn_abort;

	public void abort_button() {
		btn_abort.click();
	}

	@FindBy(how = How.NAME, using = "Remove")
	private WebElement btn_remove;

	public void remove_button() {
		btn_remove.click();
	}

	@FindBy(how = How.NAME, using = "Print")
	private WebElement btn_print;

	public void print_button() {
		btn_print.click();
	}

	@FindBy(how = How.NAME, using = "Payment")
	private WebElement btn_payment;

	public void payment_button() {
		btn_payment.click();
	}

}
