#!/bin/bash

#Alvaro Escarti :))

ip=$(hostname -I)
echo "IP DE LA MAQUINA: " $ip ""

gateway=$(ip -j route show 0.0.0.0/0 dev enp0s3 | jq -r '.[0].gateway')
echo "GATEWAY DE LA IP: " $gateway ""

echo "VAMOS A COMPROBAR UN PING"
ping -c5 $gateway

exit 0
