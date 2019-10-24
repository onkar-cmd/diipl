 
Feature: Cinean and Cinean Approver.
#pass
@Sign_up_merchant
Scenario: Signup with merchant.
Given Click on Sign-up button.
Then Enter name,email,mobile number,password,select language,select User as merchant.
Then Click on Sign up button.
Then you will go to home page.

#pass
@Sign_up_merchant_using_google_account
Scenario: Signup with merchant using google api.
Given Click on Sign-up button.
Then Click on google button .
Then Select account want to sign up.
Then you will go to home page. 
 
 #pass
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
Then Click on NO.
Then Click on next.
Then Select state as Maharashtra and city as Thane.
Then Select as Single screen .
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

#Pass
@Approved_Media
Scenario: Testing for campaign.
Given Login with predefined account.
Then Click on new campaign.
Then Complete all campaign steps.
Then Go to Cinean Approv app .
Then Click on that media and check all terms and condition.
Then Click on Approve button.
Then Go to Cinean app check if that media is approved or not.

#Fail
#Notification is about cancellation of campaign
@notification
Scenario: Testing for Notification icon.
Given not Working or not implemented.

#Pass
@Media_preview
Scenario: Testing for threater preview.
Given Login with predefined account.
Then Click on media.
Then Click on Media preview.

#Pass
@Download
Scenario: Testing for threater preview.
Given Login with predefined account.
Then Click on media.
Then Click on Download.

#Pass
@Refer_code
Scenario: Testing for Refer Code.
Given Login With predefined account.
Then Go to profile and click on Refer a code and Click on Copy button.
Then Log out.
Then Create a new user and paste refer code in sign up page.
Then Login with Refered code account and see that reward point is credited with 5000.

#pass
@Change_password
Scenario: Testing for Change Password.
Given Login With predefined account.
Then Go to profile and click on Change Password.
Then Enter Current password ,new Password and retype new password.
Then Click on Update.
Then Log out and see that password is changed or not.

#Inside Campaign Booking on timing is wrong as "18, Oct 2019 12:00 AM" but it was done in 2.40PM

@Track_your_campaign 
#Funcnality is incomplete.
#Froget password link doesnt sent to respective email id

@Check_cancellation_of_media
Scenario: Testing Completed Creation and Campaign and media after media cancellation from approver.
Given Login with predefined account from Cinean app.
Then  Create Campaign and select predefined media.
Then After Creation of Process of Campaign Go to Cinean Approver app
Then Reject that respective media.
Then Validate respective Campaign and media is been deleted .

@media_cancellation @mute_image
Scenario: Testing media Rejection
Given Login with predefined account from cinean app.
Then Click on media and create mute image.
Then After creation of media ,go to cinean approver app
Then Go to respective media and click on accept.
Then Click on reject and validate whether that media is been deleted or not.

#If media is reject with Campaign refund 
@Check_media_language @signup
Scenario: Testing Media different langauage synchronized with approver
Given Signup account and select Marathi as default language media.
Then Create Media for marathi language.
Then Go to English approver account and check media should not generate marathi media.

@Check_media_language @updating_language
Scenario: Testing Update of media language pop up
Given Login with English Cinean account.
Then Create media and update language as marathi
Then Go to Marathi approver and check  media should be generate marathi media.

@Check_media_multiple_accounts
Scenario: Testing approver app from 3 accounts
Given Login with English Cinean account and there should be 3 mobile phones to validate media.
Then Create media .
Then check account1 and click on accept and logout and login with account2 and wait for 15 min whether notification is coming or not for account2.
Then check account2 and click on accept and logout and login with account3 and wait for 15 min whether notification is coming or not for account3.
