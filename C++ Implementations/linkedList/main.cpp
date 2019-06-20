#include <iostream>

using namespace std;

struct node{
    int value;
    node *next;
};

node *head = NULL;

node *createNode(int value){
    node *newNode = new node;
    newNode->value = value;
    newNode->next = NULL;

return newNode;
}


void insertToFront(int value){

    node *newNode = createNode(value);

    if(head == NULL){
        head = newNode;
    }else{
        newNode->next = head;
        head = newNode;
    }

}

node *deleteFromBeg(){
    node *removed = head;
    head=head->next;
    return removed;

}

void printList(){
    node *current = head;

    while(current != NULL){
        cout << current->value << "-";
        current = current->next;
    }
}

int main(){


    int value;

    for(int i=0;i<5;i++){
        cout << "Enter value: ";
        cin >> value;
        insertToFront(value);
    }

    printList();

    cout << endl;
    cout << "list after two elements deleted from beginning" << endl;
    cout << deleteFromBeg()->value << endl;
    cout << deleteFromBeg()->value << endl;

    printList();

    return 0;
}
