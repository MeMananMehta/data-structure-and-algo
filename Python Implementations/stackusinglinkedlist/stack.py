class node:
    def __init__(self,data):
        '''Objective - To initialise a stack with an linked list'''
        '''Input - None'''
        '''Output - None'''
        self.data = data
        self.next = None

class stack:

    def __init__(self):
        '''Objective - To initialise a stack with an linked list'''
        '''Input - None'''
        '''Output - None'''
        self.top = None

    def push(self,data):
        '''Objective - To push an element in a stack'''
        '''Input - Value to be inserted'''
        '''Output - None'''
        newNode = node(data)

        if(self.top == None):
            self.top = newNode
        else:
            newNode.next = self.top
            self.top = newNode

    def pop(self):
        '''Objective - To pop an element from a stack'''
        '''Input - Value to be deleted'''
        '''Output - None'''
        self.top = self.top.next


    def traverseStack(self):
        '''Objective - To print complete stack'''
        '''Input - None'''
        '''Output - None'''
        currentNode = self.top
        while(currentNode!= None):
            print(currentNode.data)
            currentNode = currentNode.next


myStack = stack()
myStack.push(2)
myStack.push(3)
myStack.push(7)
myStack.push(1)
myStack.push(8)

myStack.pop()
myStack.pop()

myStack.traverseStack()
