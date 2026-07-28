#!/usr/bin/python4

import platform
import socket
import psutil

print("=" * 40)
print("        SERVER DETAILS")
print("=" * 40)

print(f"Hostname      : {socket.gethostname()}")

print(f"IP Address    : {socket.gethostbyname(socket.gethostname())}")

print(f"OS            : {platform.system()} {platform.release()}")

print(f"Version       : {platform.version()}")

print(f"Architecture  : {platform.machine()}")

print(f"Processor     : {platform.processor()}")

print(f"CPU Cores     : {psutil.cpu_count(logical=False)}")
print(f"Logical CPUs  : {psutil.cpu_count(logical=True)}")

memory = psutil.virtual_memory()
print(f"Total Memory  : {round(memory.total / (1024**3), 2)} GB")
print(f"Available RAM : {round(memory.available / (1024**3), 2)} GB")
print(f"Memory Usage  : {memory.percent}%")

disk = psutil.disk_usage('/')
print(f"Disk Total    : {round(disk.total / (1024**3), 2)} GB")
print(f"Disk Used     : {round(disk.used / (1024**3), 2)} GB")
print(f"Disk Free     : {round(disk.free / (1024**3), 2)} GB")

print("=" * 40)
print("=" * 40)
