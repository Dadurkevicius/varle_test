# Varle.lt Automated Tests

[Link to Varle website](https://www.varle.lt/)

Before every test the following steps will be taken:
1. Opening Varle home page
2. Clicking on account icon
3. Entering User ID
4. Entering User password
5. Clicking on login button

## Test scenario 1: Searching for items
### Test case 1 - Checking if word that we search for is in the titles of products:

#### Steps:
1. Click on search field
2. Enter product name
3. Click on search icon
4. Compare if titles of products contains product name that we entered in search field

### Test case 2 - Checking if products are sorted by descending price order:
#### Steps:
1. Click on search field
2. Enter product name
3. Click on search icon
4. Click on drop down menu and select "Brangiausi viršuje"
5. Wait for products to change order and check first and following products prices
-----------------------------------------------
## Test scenario 2: Managing wishlist items
### Test case 1 - Checking if selected items can be added to wishlist

#### Steps:
1. Click on search field
2. Enter product name
3. Click on search icon
4. Click on first product's heart icon
5. Click on wishlist button
6. Check if number of items in wishlist has increased by one

### Test case 2 - Checking if all items can be removed from wishlist

#### Steps:
1. Click on search field
2. Enter product name
3. Click on search icon
4. Click on first product's heart icon
5. Click on wishlist button
6. Click on all available un-wishlist buttons
7. Check if wishlist have no products
-----------------------------------------------
## Test scenario 3: Managing shopping basket items
### Test case 1 - Checking if selected items can be added to basket

#### Steps:
1. Click on search field
2. Enter product name
3. Click on search icon
4. Click on first product
5. Click on "Į krepšelį" button
6. Click on "Pirkti" button
7. Check if number of items in basket has increased by one
