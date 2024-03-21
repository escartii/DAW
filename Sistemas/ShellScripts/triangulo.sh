#!/bin/bash

if [ $# -ne 1 ]; then
    echo "Uso: $0 <N>"
    exit 1
fi

N=$1

for ((i=1; i<=N; i++))
do
    for ((j=1; j<=i; j++))
    do
        echo -n "$i "
    done
    echo ""
done
