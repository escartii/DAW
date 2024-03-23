#!/bin/bash

#Alvaro Escarti :))

rc=0
testpath=$1

echo $testpath | grep -q  ^./ || rc=1

if [ $# -eq 1 ]; then

    echo " * WELL DONE, YOU PUT A ARGUMENT *  "
else
    exit 1
fi

if [ $rc -eq 0 ]; then
    echo "$testpath is an absolute rute"
else
    echo "$testpath is not an absolute rute"
fi


if [ -e $testpath ]; then
    echo "   [ OLE TU ] " $testpath "exist"
else
    echo "  [ WARNING ] " $testpath "NO EXIST"
fi
