# country-demo
#### Instructions to run the application in your local system

Tools used to run the codde in your local computer:
1. Spring Tool Suite
2. Postman
3. Any web browser

#### Code Repository
Get the code from https://github.com/naveennvk93/country-demo-main.git

Steps:
1. Export the code to you local system from the given reporsitory
2. Import the project to Spring Tool Suite
3. Run the project
4. Now once the application started running check the console and get the localhost details where the project is running
5. Now using postman tool, start a new HTTP request to test the API requests

##### GET Requests:
Countries List: use this localhost url to get the list of countries - http://localhost:8080/countries

States List: use this localhost url to get the list of countries and their states - http://localhost:8080/countries/states

Countries and Capitals: use this url to get the list of countries and their capital cities - http://localhost:8080/countries/capital

Currecny details: use this localhost url to get the list of countries and their currency details - http://localhost:8080/countries/currency

##### POST Requests:
Cities List: To get the list of cities for a given country post this http request with input a country value in json format.

Post URL: http://localhost:8080/countries/cities

Body: 

{
        
   "country":"nigeria"
      
}

Country & Capital: To get the capital city details for a given country post this http request with input a country value in json format.

Post URL: http://localhost:8080/countries/capital

Body: 

{
        
   "country":"nigeria"
      
}
