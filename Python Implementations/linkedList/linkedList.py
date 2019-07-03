from nodeClass import node

class linkedList:

    def __init__(self):
        '''Objective - To initialise a linked list'''
        self.head = None

    def insertToBeg(self,data):
        '''Objective - To insert in the beginning of a linked list'''
        '''Input - Value to be inserted'''
        '''Output - None'''
        newNode = node(data)

        if(self.head == None):
            self.head = newNode

        else:
            newNode.next = self.head
            self.head = newNode

    def traverseList(self):
        '''Objective - To traverse a linked list'''
        '''Input - None'''
        '''Output - None'''
        currentNode = self.head
        while(currentNode != None):
            print(currentNode.data , end = "->")
            currentNode = currentNode.next

        print("null")


    def deleteFromBeg(self):
        '''Objective - To delete from the beginning of a linked list'''
        '''Input - None'''
        '''Output - None'''
        self.head = self.head.next



