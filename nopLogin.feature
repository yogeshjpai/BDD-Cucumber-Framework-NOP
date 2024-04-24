Feature: NOPCommerceLogin
Scenario: Login functionality test
Given user launch firefox browser
When user opens Url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And user clear Email field
And user enter Email as "admin@yourstore.com"
And user clear Password field
And user enter Password as "admin"
And user click on LogIn button
And user scroll down in the home page
And user click on Sales button
And user click on Order button 
Then Page url should be "https://admin-demo.nopcommerce.com/Admin/Order/List"