#include <iostream>

using namespace std;

int size = 5;

void push(int stackArray[], int element, int &top){
    if(top == size-1){
        cout << "Stack is full" << endl;
    }else{
        top = top + 1;
        stackArray[top] = element;
    }

}

int pop(int stackArray[],int &top){
    if(top == -1){
        cout << "Stack is empty";
        return -1;
    }else{
        int poppedElement = stackArray[top];
        top = top - 1;
        return poppedElement;
    }
}

void displayStack(int stackArray[],int top){
    for(int i=0;i<=top;i++){
            cout << stackArray[i] << " - ";
    }
}

int main()
{
    int stackArray[size];
    int top = -1;
    int element;

    for(int i=0;i<5;i++){
        cout << "Enter element : ";
        cin >> element;
        push(stackArray,element,top);
    }

    displayStack(stackArray,top);
    cout << endl;

    pop(stackArray,top);
    pop(stackArray,top);

    displayStack(stackArray,top);
    return 0;
}
