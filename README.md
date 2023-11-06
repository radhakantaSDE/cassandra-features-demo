# cassandra-features-demo

### How to start this application ?
1. Run the ```docker-compose.yml``` to start cassandra in docker
2. Create a keyspace ```products``` in cassandra and a table ```product``` by executing queries given in ```schema_struct.sql```
3. Start this spring-boot application
4. Use bellow curl to create new record in cassandra

```
curl --location 'http://localhost:8080/product' \
--header 'Content-Type: application/json' \
--data '{
    "itemName": "iPhone 15",
    "availableQuantity": 10,
    "productCategory": "Mobile",
    "pricePerUnit": 51000
}'
```