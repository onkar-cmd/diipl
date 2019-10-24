package impactXchange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Xchange_properties {
	WebDriver wd;
	Select s;
	Actions a;

	public Xchange_properties(WebDriver wd) 
	{
		PageFactory.initElements(wd, this);
		this.wd = wd;
		a = new Actions(wd);
	}

	@FindBy(how = How.ID, using = "LoginCtrl_UserName") // Login Username
	private WebElement user_name;
    public void usrname(String name) {

		user_name.sendKeys(name);

	}

	@FindBy(how = How.ID, using = "LoginCtrl_Password") // Login Password
	private WebElement password;

	public void password(String name) {

		password.sendKeys(name);

	}

	@FindBy(how = How.ID, using = "LoginCtrl_LoginButton") // Login Button
	private WebElement login_btn;

	public void login_btn() {

		login_btn.click();

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-menu\"]/div/ul/li[3]") // User Admin Button
	private WebElement user_admin_btn;

	public void user_admin_btn() throws InterruptedException {
		Thread.sleep(2000);

		user_admin_btn.click();

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-menu\"]/div/ul/li[3]/ul/li[1]/a") // Manage Account Button
	private WebElement manage_account_btn;

	public void manage_account_btn() {

		manage_account_btn.click();

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"sidebar-menu\"]/div/ul/li[3]/ul/li[1]/ul/li[1]/a") // Add edit Account
																									// Button
	private WebElement add_edit_account_btn;

	public void add_edit_account_btn() {
		add_edit_account_btn.click();
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_GridView1_hylnkCompanyName_0") // First company name list
	private WebElement company_name_1;

	public void company_name_1() {

		company_name_1.click();
     }
    @FindBy(how = How.ID, using = "MainContentPlaceHolder_btnNext") // company next button
	private WebElement next_btn;

	public void next_btn() {

		next_btn.click();

	}
	// Class page

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtClassName") // class name textbox
	private WebElement class_name;

	public void class_name(String name) {
		class_name.clear();
		class_name.sendKeys(name);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_btnAddClass") // add Class button
	private WebElement add_Class_btn;

	public void add_Class_btn() {

		add_Class_btn.click();

	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_ddlClassCategory") // select Class Category
	private WebElement select_class_category;

	public void select_class_category(String scs) {

		s = new Select(select_class_category);
		s.selectByVisibleText(scs);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_btnClassNext") // add class next button
	private WebElement class_next_btn;

	public void class_next_btn() {

		class_next_btn.click();

	}

	// Screen page

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtScreenName") // Text Box for screen name
	private WebElement screen_name_txt;

	public void screen_name_txt(String name) {

		screen_name_txt.clear();
		screen_name_txt.sendKeys(name);

	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_chbUFO") // Add screen UFO checkbox
	private WebElement ufo_checkbox;

	public void ufo_checkbox() {

		ufo_checkbox.click();

	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_chbAC") // Add screen AC checkbox
	private WebElement ac_checkbox;

	public void ac_checkbox() {

		ac_checkbox.click();

	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txt_ScreenWebCode") // Screen Web Code
	private WebElement web_code;

	public void web_code(String wc) {
		web_code.clear();
		web_code.sendKeys(wc);
	}

	// Screen page

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_ddlScreen") // Add screen name checkbox
	private WebElement screen_name_checkbox;

	public void screen_name_checkbox(String snc) {
		s = new Select(screen_name_checkbox);
		s.selectByVisibleText(snc);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtTicketRate") // Ticket Fare
	private WebElement ticket_fare;

	public void ticket_fare(String tf) {
		ticket_fare.clear();
		ticket_fare.sendKeys(tf);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtSeats") // Seats
	private WebElement seats_txtbx;

	public void seats_txtbx(String st) {
		seats_txtbx.clear();
		seats_txtbx.sendKeys(st);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_btnAddScreen") // Add screen button
	private WebElement add_screen_btn;

	public void add_screen_btn() {

		add_screen_btn.click();

	}

	@FindBy(how = How.CSS, using = "a[href*='Edit $0']") // sofa edit button
	private WebElement sofa_edit_btn;

	public void sofa_edit_btn() {

		sofa_edit_btn.click();

	}

	@FindBy(how = How.CSS, using = "a[href*='Edit $0']") // Screen1 edit button
	private WebElement screen1_edit_btn;

	public void screen1_edit_btn() {

		screen1_edit_btn.click();

	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_chkIsAllowed") // Web-booking checkbox
	private WebElement is_web_allowed;

	public void is_web_allowed() {

		is_web_allowed.click();

	}
	
	@FindBy(how = How.XPATH, using = "//a[@menuid='4']") // Contracts button
	private WebElement contracts_btn;

	public void contracts_btn() {
		contracts_btn.click();

	}
	
	@FindBy(how = How.XPATH, using = "//a[@menuid='128']") // Reconcile local Contracts
	private WebElement reconcile_local_contracts_btn;

	public void reconcile_local_contracts_btn() {
		reconcile_local_contracts_btn.click();

	}
	
	@FindBy(how = How.XPATH, using = "//a[@menuid='260']") // Individual Reconcile 
	private WebElement individul_reconcile_btn;

	public void individul_reconcile_btn() {
		
		individul_reconcile_btn.click();
		

	}
	
	@FindBy(how = How.XPATH, using = "//a[@title='Link Cineworld']") // Link Ufo Movie link button 
	private WebElement link_ufo_movie;

	public void link_ufo_movie()
	{
		
		link_ufo_movie.click();
		

	}

	// movie
	// creation--------------------------------------------------------------------------------

	@FindBy(how = How.XPATH, using = "//a[@menuid='2']") // Movie button
	private WebElement movie_btn;

	public void movie_btn() {
		movie_btn.click();

	}
	
	@FindBy(how = How.XPATH, using = "//a[@menuid='261']") // Group Reconcile button
	private WebElement group_reconcile;

	public void group_reconcile() {
		group_reconcile.click();

	}
	
	@FindBy(how = How.XPATH, using = "//a[@menuid='23']") // Manage Contracts 
	private WebElement manage_contracts;

	public void manage_contracts() {
		manage_contracts.click();

	}

	@FindBy(how = How.XPATH, using = "//a[@menuid='15']") // Manage Movie button
	private WebElement manage_movie_btn;

	public void manage_movie_btn() 
	{
		manage_movie_btn.click();

	}
	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtMovieName") // Add movie name
	private WebElement movie_name_txt;

	public void movie_name_txt(String ms) 
	{
		movie_name_txt.clear();
		movie_name_txt.sendKeys(ms);
	}

	@FindBy(how = How.XPATH, using = "//a[@title='Open the calendar popup.']") // Screen1 edit button
	private WebElement movie_release_date;

	public void movie_release_date(String date_picker) {
		movie_release_date.click();
		wd.findElement(By.xpath("//td[@title='" + date_picker + "']")).click();
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_ddlMovieCertificate") // Add screen button
	private WebElement movie_certificate;

	public void movie_certificate(String cer) {
		s = new Select(movie_certificate);
		s.selectByVisibleText(cer);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_ddlMovieGenre") // Add movie genere
	private WebElement movie_genere;

	public void movie_genere(String gen) {
		s = new Select(movie_genere);
		s.selectByVisibleText(gen);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_ddlMovieLanguage") // Add movie language
	private WebElement movie_language;

	public void movie_language(String lan) {
		s = new Select(movie_language);
		s.selectByVisibleText(lan);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_ddlMovieType") // Add movie type
	private WebElement movie_type;

	public void movie_type(String type) {
		s = new Select(movie_type);
		s.selectByVisibleText(type);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_ddlProducer") // Add movie producer
	private WebElement movie_prod;

	public void movie_prod(String prod) {
		s = new Select(movie_prod);
		s.selectByVisibleText(prod);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtMovieLength") // Add movie length
	private WebElement movie_len;

	public void movie_len(String len)
	{
		movie_len.clear();
		movie_len.sendKeys(len);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtDirectorName") // Add movie director
	private WebElement director;

	public void director(String dir) {
		director.sendKeys(dir);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtMusicDirector") // Add screen button
	private WebElement music_director;

	public void music_director(String m) {
		music_director.sendKeys(m);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtMovieStars") // Movie Stars
	private WebElement movie_stars;

	public void movie_stars(String ms) {
		movie_stars.clear();
		movie_stars.sendKeys(ms);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_chbMovieStatus") // Movie status checkbox
	private WebElement movie_status;

	public void movie_status() {
		movie_status.click();
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_btnApprove") // Company Approve button
	private WebElement btn_approve;

	public void btn_approve() {
		btn_approve.click();
	}
	// Add new threater layout

	@FindBy(how = How.XPATH, using = "//a[@menuid='1']") // Master button
	private WebElement master;

	public void master() {
		master.click();

	}
	// Add new Threater layout

	@FindBy(how = How.XPATH, using = "//a[@menuid='176']") // Manage Threater Layout button
	private WebElement manage_threater_layout;

	public void manage_threater_layout() {
		manage_threater_layout.click();

	}

	@FindBy(how = How.ID, using = "img2") // add new threater layout
	private WebElement addnew_threater_layout;

	public void addnew_threater_layout() {
		addnew_threater_layout.click();

	}
	
	@FindBy(how = How.XPATH, using = "//button[@onclick='linkUfoMovie()']") // Link ufo movie button
	private WebElement link_ufo_btn;

	public void link_ufo_btn() {
		link_ufo_btn.click();

	}
	
	

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_ddlExhibitor") // select exhibitor
	private WebElement select_exhibitor;

	public void select_exhibitor(String exh) {
		s = new Select(select_exhibitor);
		s.selectByVisibleText(exh);
	}

	@FindBy(how = How.ID, using = "ddlScreen") // select screen
	private WebElement select_screen;

	public void select_screen(String scr) {
		s = new Select(select_screen);
		s.selectByVisibleText(scr);
	}

	@FindBy(how = How.ID, using = "ddlClass") // select class
	private WebElement select_class;

	public void select_class(String clas) {
		s = new Select(select_class);
		s.selectByVisibleText(clas);
	}

	@FindBy(how = How.ID, using = "txtNumberOfRows") // Enter number number of rows
	private WebElement enter_number_rows;

	public void enter_number_rows(String rw) {
		enter_number_rows.clear();
		enter_number_rows.sendKeys(rw);
	}

	@FindBy(how = How.ID, using = "txtNumberOfColumns") // Max No Of Seats In a Row
	private WebElement seats_in_row;

	public void seats_in_row(String rw) {
		seats_in_row.clear();
		seats_in_row.sendKeys(rw);
	}

	@FindBy(how = How.ID, using = "imgSubmit") // Submit Button
	private WebElement submit_btn;

	public void submit_btn() {
		submit_btn.click();
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_btnScreenNext") // Screen next Button
	private WebElement screen_next_btn;

	public void screen_next_btn() {
		screen_next_btn.click();
	}

	// Add
	// company-----------------------------------------------------------------------------------------

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_ddlAccountTypeID") // select Account territory
	private WebElement select_account_type;

	public void select_account_type(String st) {
		s = new Select(select_account_type);
		s.selectByVisibleText(st);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_btnAddNew") // add new button
	private WebElement add_new_btn;

	public void add_new_btn() {
		add_new_btn.click();
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_chbAccountStatus") // Account status checkbox
	private WebElement acc_status_chk;

	public void acc_status_chk() {
		acc_status_chk.click();
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_btnAdd") // add button
	private WebElement add_btn;

	public void add_btn() {
		add_btn.click();
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtCompanyName") // company name text box
	private WebElement company_name;

	public void exhibitor_name(String name) {
		company_name.clear();
		company_name.sendKeys(name);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_btnSave") // company save button
	private WebElement company_save_btn;

	public void company_save_btn() {

		company_save_btn.click();

	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtContactPerson") // Account Contact Person
	private WebElement contact_person;

	public void contact_person(String cp) {

		contact_person.clear();
		contact_person.sendKeys(cp);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtEmail") // Account Email
	private WebElement email;

	public void email(String e) {
		email.clear();
		email.sendKeys(e);
	}

	@FindBy(how = How.XPATH, using = "//input[@name='ctl00$MainContentPlaceHolder$txtAddress1']") // Account Address1
	private WebElement address1;

	@FindBy(how = How.XPATH, using = "//input[@name='ctl00$MainContentPlaceHolder$txtAddress2']") // Account Address2
	private WebElement address2;

	public void address1(String a1) {
		address1.clear();
		address1.sendKeys(a1);
	}

	public void address2(String a2) {

		address2.clear();
		address2.sendKeys(a2);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_ddlCityID") // select Account city
	private WebElement select_city;

	public void select_city(String c) {
		s = new Select(select_city);
		s.selectByVisibleText(c);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtPincode") // Account Pincode
	private WebElement pin_code;

	public void pin_code(String p) {
		pin_code.clear();
		pin_code.sendKeys(p);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtTicketBifurcation") // Account Ticket Bifurcation Amount
	private WebElement ticket_bifurcation_amount;

	public void ticket_bifurcation_amount(String tba) {
		ticket_bifurcation_amount.clear();
		ticket_bifurcation_amount.sendKeys(tba);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtTel") // Account Telephone
	private WebElement tel;

	public void tel(String t) {
		tel.clear();
		tel.sendKeys(t);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_ddlTerritory") // select Account territory
	private WebElement select_territory;

	public void select_territory(String st) 
	{
		s = new Select(select_territory);
		s.selectByVisibleText(st);
	}
	

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_RadGrid1_ctl00_ctl05_ddlMovie") // select approve movie in reconcile page
	private WebElement select_approve_movie;

	public void select_approve_movie(String st) {
		s = new Select(select_approve_movie);
		s.selectByValue(st);
	}
	
	@FindBy(how = How.ID, using = "MainContentPlaceHolder_RadGrid1_ctl00_ctl05_ddlDistributor") // select approve movie in reconcile page
	private WebElement select_distributer;

	public void select_distributer(String st) {
		s = new Select(select_distributer);
		s.selectByValue(st);
	}
	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtTheaterName") // Account Threater name
	private WebElement threater_name;

	public void threater_name(String tn) {
		threater_name.clear();
		threater_name.sendKeys(tn);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_chbRound") // Account Is rounding checkbox
	private WebElement is_rounding_in_reports;

	public void is_rounding_in_reports() {
		is_rounding_in_reports.click();

	}
	
	@FindBy(how = How.ID, using = "MainContentPlaceHolder_RadGrid1_ctl00_ctl05_UpdateButton") // Save button reconcile
	private WebElement save_btn_reconcile ;
	public void save_btn_reconcile() 
	{
		save_btn_reconcile.click();
    }
	@FindBy(how = How.XPATH, using = "//*[@id=\"imgPactTab_1\"]") // Save button reconcile
	private WebElement upcoming_pacts ;
	public void upcoming_pacts() {
		a.click(upcoming_pacts).build().perform();
    }
	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtMaxGuaranteeAmount") // Account Max. Guarantee Amount
	private WebElement max_guareentee_amount;

	public void max_guareentee_amount(String mga) {
		max_guareentee_amount.clear();
		max_guareentee_amount.sendKeys(mga);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_txtMaxThaeterHireAmount") // Account Max. Threater Hire Amount
	private WebElement max_theater_hire_amount;

	public void max_theater_hire_amount(String mga) {
		max_theater_hire_amount.clear();
		max_theater_hire_amount.sendKeys(mga);
	}

	@FindBy(how = How.ID, using = "MainContentPlaceHolder_btnSubmit") // Account class and screen submit button
	private WebElement class_scree_submit_btn;

	public void class_scree_submit_btn() {
		class_scree_submit_btn.click();

	}
	
	@FindBy(how = How.XPATH, using = "//*[@href=\"javascript:__doPostBack('ctl00$MainContentPlaceHolder$RadGrid1$ctl00$ctl02$ctl01$ctl00','')\"]") // Contract Id label click
	private WebElement contract_id;

	public void contract_id()
	{
		a.click(contract_id).build().perform();
		

	}
	 public void login() {
		wd.get("http://cloudtestimpactexchange.impactexchange.com/ImpactLive/Index.aspx?AspxAutoDetectCookieSupport=1#");
		usrname("admin");
		password("admin");
		login_btn();
	}
	public void enter_seats(String[] strArray, int no_of_rows, int seat_count) 
	{

		int seats_count = seat_count + 2;
		for (int i = 0; i < no_of_rows; i++) {
			int counter = 1;

			wd.findElement(By.xpath("//table[@id='tbl_" + i + "']//input[@id='txtSeat_" + i + "_" + counter + "']"))
					.sendKeys(strArray[i]);
			for (int j = 2; j < seats_count; j++) {

				wd.findElement(By.xpath("//table[@id='tbl_" + i + "']//input[@id='txtSeat_" + i + "_" + j + "']"))
						.sendKeys(String.valueOf(j - 1));

			}

			wd.findElement(By.xpath("//table[@id='tbl_" + i + "']//input[@id='txtSeat_" + i + "_" + seats_count + "']"))
					.sendKeys(strArray[i]);

			++counter;
		}

	}

	public void add_exhibitor(String cn, String cp, String e, String p, String a1, String a2, String c, String st,
			String t, String tn, String tba, String mga, String mtha) throws InterruptedException {
		try {
			user_admin_btn();
			manage_account_btn();
			add_edit_account_btn();
			add_new_btn();
			select_account_type("Exhibitor");
			Thread.sleep(1000);
			select_city(c);
			select_territory(st);
			exhibitor_name(cn);
			contact_person(cp);
			email(e);
			Thread.sleep(5000);
			address1(a1);
			address2(a2);
            pin_code(p);
			tel(t);
			threater_name(tn);
			ticket_bifurcation_amount(tba);
			max_guareentee_amount(mga);
			max_theater_hire_amount(mtha);
			next_btn();
		} catch (Exception et) {
			et.printStackTrace();
		}
	}

	public void add_class(String c, String scs) {
		class_name(c);
		select_class_category(scs);
		add_Class_btn();
        class_next_btn();  }
public void add_screen(String sc, String wc) {
		screen_name_txt(sc);
		ufo_checkbox();
		ac_checkbox();
		web_code(wc);
		add_screen_btn();
		screen_next_btn();
	}
public void add_class_screen_details(String tr, String s) {
		ticket_fare(tr);
		seats_txtbx(s);
		is_web_allowed();
		add_btn();
		class_scree_submit_btn();
}
public void add_movie(String mo, String date_picker, String cer, String gen, String lan, String type,String prod,String len, String dir, String m, String ms) throws InterruptedException
	{   
		Thread.sleep(5000);
		manage_movie_btn();
		add_new_btn();
		movie_name_txt(mo);
		movie_release_date(date_picker);
		movie_certificate(cer);
		movie_genere(gen);
		movie_language(lan);
		movie_type(type);
		movie_prod(prod);
		movie_len(len);
		director(dir);
		music_director(m);
		movie_stars(ms);
		company_save_btn();
		Thread.sleep(5000);
		}}