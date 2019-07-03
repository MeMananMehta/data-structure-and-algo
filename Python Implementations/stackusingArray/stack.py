class stack:

    def __init__(self):
        '''Objective - To initialise a stack with an array'''
        '''Input - None'''
        '''Output - None'''
        self.top = -1
        self.stackArray = []

    def push(self,data):
        '''Objective - To push an element in a stack'''
        '''Input - Value to be inserted'''
        '''Output - None'''
        self.top = self.top + 1
        self.stackArray.append(data)

    def pop(self):
        '''Objective - To pop an element from a stack'''
        '''Input - Value to be deleted'''
        '''Output - None'''
        self.top = self.top - 1

    def printStack(self):
        '''Objective - To print complete stack'''
        '''Input - None'''
        '''Output - None'''

        for i in range(self.top,-1,-1):
            print(self.stackArray[i])

myStack = stack()
myStack.push(3)
myStack.push(7)
myStack.push(1)
myStack.push(8)


myStack.pop()
myStack.pop()

myStack.printStack()
