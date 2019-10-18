 
Feature: Cinean and Cinean Approver.
@Sign_up_merchant
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

#Fail
@media @template
Scenario: Testing of template .
Given Login with predefined account.
Then Click on New Campaign.
When By default campany budget 5000 and campaign name as campaign_221.
Then Select Package campaign as Weekly.
Then Select playtime as Before Movie .
Then Click on next button.
Then Click on Choose template.
Then Click on Edit button.
#Shows Cinean has stopped.

#Fail
@Approved_Media
Scenario: Testing for campaign.
Given Login with predefined account.
Then Click on new campaign.
Then Complete all campaign steps.
Then Go to Cinean Approv app 
Then Click on that media and check all terms and condition.
Then Click on Approve button
Then Go to Cinean app check if that media is approved or not.

#Fail
@notification
Scenario: Testing for Notification icon
Given not Working or not implemented.

#Fail
@Threater_preview
Scenario: Testing for threater preview.
Given Login with predefined account.
Then Click on media.
Then Click on Threater preview.









 
