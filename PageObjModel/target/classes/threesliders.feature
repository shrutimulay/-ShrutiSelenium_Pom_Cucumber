Feature: Three Sliders Feature
Scenario: Home page must contains only three sliders
Given user opens the browser
And click on Shop Menu
Then click on Home menu button
Then firstslide is displayed
Then secondslide is displayed
Then thirdslide is displayed

Scenario: home page with three arrivals
Given user is on main page
When user click show menu
And user click home button
Then user is available with three arrivals

Scenario: images in arrival should navigate
Given user is on main page
When user click show menu
And user click home button
Then user is available with three arrivals
And arrival image should be clickable and navigable

Scenario: arrivals image description
Given user is on main page
When user click show menu
And user click home button
Then user is available with three arrivals
And arrival image should be clickable and navigable
Then click on description tab
And there should be description regarding book

Scenario: arrivals image reviews
Given user is on main page
When user click show menu
And user click home button
Then user is available with three arrivals
And arrival image should be clickable and navigable
Then click on review tab
And there should be review regarding book







