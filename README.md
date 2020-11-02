# Performance-Reservation

alert tcp any any -> 172.31.69.0/24 22 (msg:"Bruteforce"; sid:1000001; rev:1; detection_filter:count 200, seconds 2;)

alert tcp any any -> any any (msg:"Botnet"; sid:1000002; http_uri; content: "api";)
