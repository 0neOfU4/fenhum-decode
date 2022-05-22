#!/usr/bin/python2
import re

str1 = 'FLAGISHAPPYDAY'
key = 'HGVEBDUDKSDHSG'

flag = ''
for i in range(0,len(key)):
    print bin(ord(str1[i]) ^ ord(key[i]))