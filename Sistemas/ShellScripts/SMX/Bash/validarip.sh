#!/bin/bash

ip=$(hostname -I)

ip2=$ip
gateway=$(ip -j route show 0.0.0.0/0 dev enp0s3 | jq -r '.[0].gateway')
echo $gateway

if [[ $ip2 =~ ^[192]+\.[168]+\.[1]+|.[0-9]+$ ]]; then
    echo "Es valida"
    ping -c5 192.168.1.254
else
    echo "Ping Failed"
fi

if [[ $ip2 =~ ^[192]+\.[168]+\.[2]+|.[0-9]+$ ]]; then
    echo "Es valida"
    ping -c5 192.168.2.254
else
    echo "Ping Failed"
fi

if [[ $ip2 =~ ^[192]+\.[168]+\.[4]+|.[0-9]+$ ]]; then
    echo "Es valida"
    ping -c5 192.168.4.254
else
    echo "Ping Failed"
fi

if [[ $ip2 =~ ^[10]+\.[0]+\.[2]+|.[0-9]+$ ]]; then
    echo "Es valida"
    ping -c5 10.0.2.1
else
    echo "Ping Failed"
fi

if [[ $ip2 =~ ^[172]+\.[29]+\.[0]+|.[0]+$ ]]; then
    echo "Es valida"
    ping -c5 172.29.0.1
else
    echo "Ping Failed"
fi

exit 0


