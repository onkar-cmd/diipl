@Sign_up_merchant 
Feature: Sign Up.

Scenario: Signup with merchant.
Given Click on Sign-up button.
Then Enter name,email,mobile number,password,select language,select User as merchant.
Then Click on Sign up button .
Then you will go to home page.

@Sign_up_merchant_using_google_account

Scenario: Signup with merchant using google api.
Given Click on Sign-up button.
Then Click on google button .
Then Select account want to sign up.
Then you will go to home page. 
 
 
 
 @Create_campaign_merchant
 
 Scenario: Create new Campaign from merchant
Given Login with predefined account.
Then Click on New Campaign.
When By default campany budget 5000 and campaign name as campaign_221 .
Then Select Package campaign as Weekly
Then Select playtime as Before Movie .
Then Click on next button.
Then Click on Upload media name as media_244 ,media duration of 10 sec,select media type as mute slide.
Then Upload an image ,select any image from gallery.
Then pop up come shows update default language. 
Then click on NO.
Then Click on next.
Then Select state as Maharashtra and city as Thane.
Then Slect as Single screen .
Then select threater according to budget and cost then click on next button.
When you will see campaign summary then click on next.
Then you will see review booking then click on proceed to payment.
Then you will go to home page. 





  