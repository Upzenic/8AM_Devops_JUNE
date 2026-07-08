#!/usr/local/bin/python

# Launhcing EC2 instance

import os

def launch_ec2():
    ami_id=input("Enter AMI ID:")
    instance_type=input("Enter Instance type(ex: t3.micro):")
    ec2_count=input("Enter the count of instances:")
    print(f"Launching EC2 with {ami_id} and {instance_type} with count {ec2_count} " )
    os.system("aws ec2 run-instances --image-id ami_id --instance-type instance_type --count ec2_count")



launch_ec2()
