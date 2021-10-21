# APIGateway

http://localhost:8765/CUSTOMERMODULE/customer/custByIdd/13

http://localhost:8765/CUSTOMERMODULE/customer/custByIddFeign/12

#Eureka server service names are lowercase in below URL's

http://localhost:8765/customermodule/customer/custByIdd/13

http://localhost:8765/customermodule/customer/custByIddFeign/12

=================================
Apigateway route:

http://localhost:8765/customer/custByIdd/13
http://localhost:8765/customer/custByIddFeign/12
http://localhost:8765/bank/getAllBanks
http://localhost:8765/custBank/getAllCustBankDetails

Apigateway rewrite path route URL:

dummy URL: http://localhost:8765/customerkollu/13
Actual URL: http://localhost:8765/customer/custByIdd/13
