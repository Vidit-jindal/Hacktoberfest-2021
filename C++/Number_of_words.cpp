#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    char str[50];
    int count,i;
    count =0;
    cout<<"Enter a String: ";
    gets(str);
    for(i=0;str[i]!='\0';i++)
    {
        if(str[i]==' ')
        count++;
    }
    cout<<"Number of words in the String are: "<<count+1;
    return (0);
}