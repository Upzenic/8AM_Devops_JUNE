#!/usr/bin/python3

name = input("Enter Your Name:")

def validateName():
    listName = list(name)
    print(listName)
    for i in range(len(listName)):
        letter = listName[i].isalpha()
        if(letter != True):
          print("The name is not valid as it contains non alphabetic letters")
          return        
    print("The name is valid")
validateName()
