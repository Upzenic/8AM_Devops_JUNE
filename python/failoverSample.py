#!/usr/bin/python3


def addNumbers(num1, num2):
 type1 = type(num1)
 type2 = type(num2)
    try:
        if type1 == type2:
            return num1+num2
        else:
            raise TypeError(f"Type Mismatch:{type1} does not match with {type2}")
    except TypeError as e:
        print(f"Error:{e}")
        return e

addNumbers(5,"10")
    

