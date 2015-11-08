#include <stdio.h>
#include <stdlib.h>
#define TRUE 1
#define FALSE 0
typedef int BOOLEAN;

struct Node{
	int value;
	struct Node *next;
	};
	
void insert(int x, struct Node **pL)
{
  if(*pL==NULL)
  {
  	struct Node *temp;
  	temp=(struct Node*)malloc(sizeof(struct Node));//memory allocated
  	*pL=temp;//set the node to refer to this memory location
  	temp->value=x;//set the value variable 
  	temp->next=NULL;
  	
  }
  else{
  	
  	insert(x,&((*pL)->next));
  
  }

}

void printList(struct Node *L)
{
	if(L!=NULL)
	{
	printf("%d\n",(L->value));
	return printList((L->next));
	}
}

BOOLEAN lookup(int x, struct Node *L){

	if(L!=NULL)
	{
		if(L->value==x)
		{
			return TRUE;
		}
		return lookup(x, L->next);
	}
	
	return FALSE;
}
void delete(int x, struct Node **pL)
{
	if((*pL)!=NULL)
	{
		if((*pL)->value==x)
		{
			(*pL)=(*pL)->next;
		}
		return delete(x, &(*pL)->next);
	}
	
	
}
int main(){

 		struct Node *L=NULL;
 		
	for(int i=1;i<20;i+=2)
		insert(i,&L);
	printList(L);
	//printf("the list has 3 in it is: %d\n",lookup(3,L));
	//printf("the list has 2000 in it is:%d\n",lookup(2000,L));
	
	for(int i=0;i<20;i++)
	{
		printf("%d %s FOUND\n",i,((lookup(i,L)==TRUE) ? "": "NOT"));
	}
	
	for(int i=0;i<20;i+=3)
	{
		delete(i,&L);
	}
	printList(L);

}