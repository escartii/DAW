#!/bin/bash

#Alvaro Escarti :))

for f in $(ls -1 /usr/bin/); do
    if [ -L /usr/bin/$f ]; then
    echo "$f is a symbolic link"
    fi
done

exit 0



