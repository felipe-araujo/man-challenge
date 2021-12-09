# man-challenge


curl -X POST  localhost:8080/restaurant/orders -H "Content-Type: application/json" -d '{"name":"Felipe", "ingredients": ["atum"]}'

curl -X POST  localhost:8080/restaurant/orders -H "Content-Type: application/json" -d '{"name":"Felipe", "ingredients": ["pork"]}'

curl localhost:8080/restaurant/orders/1
