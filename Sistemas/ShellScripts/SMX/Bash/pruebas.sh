#!/bin/bash

echo enter numero
read numero
c=$(echo "obase=2;$numero" | bc)
echo $c

exit 0


