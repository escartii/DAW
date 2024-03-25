#!/bin/bash

#alvaro escarti

vboxmanage list vms | while read lines; do

    echo " * Woking with : "$lines
    x=$(echo $lines | cut -d "{" -f2 | tr "}" " ")

    vmState=$(vboxmanage showvminfo $x | grep ^State | tr -s " ")
    echo " : "$vmState

    #vboxmanage showvminfo $x
    nicsenabled=$(vboxmanage showvminfo $x | grep ^NIC | grep -v disabled)
    echo $nicsenabled
    echo "==="
done
ports=$(vboxmanage list natnets | tail -n4 | head -n1)
echo "Reenvio de puertos: " $ports

exit 0
