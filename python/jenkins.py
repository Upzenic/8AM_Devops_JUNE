#!/usr/bin/python3

import subprocess

def identifyMemoryUsage():
 print("Function Started")
 memory = subprocess.run(['df', '-h'], capture_output=True, text=True)
 result = memory.stdout
 print("The memory is:", result)


identifyMemoryUsage()
