//
//  Lab10.c
//  
//
//  Created by Chen on 10/13/15.
//
//
#include <stdio.h>
#include <stdlib.h>
#define MAX 10

int myrand();

int a[MAX];

//void bubble_sort(int m, int a[]);
void bubble_sort(int m, int a[],int (*comp)(int x, int y));

int gtcmp(int x, int y);
int ltcmp(int x, int y);
int main(int argc, char*argv[]){

	int i,t,x,y;
	/* fill array*/
	
	for(i=0;i<MAX;i++)
	{
		a[i]=myrand();
		printf("%d\n",a[i]);
	}
	printf("after sorting in ascending:\n");
    bubble_sort(MAX,a,gtcmp);
    for(i=0;i<MAX;i++)
    {
        printf("%d\n",a[i]);
    }
    printf("after sorting in descending:\n");
    bubble_sort(MAX,a,ltcmp);
    for(i=0;i<MAX;i++)
    {
        printf("%d\n",a[i]);
    }
}
int rand_seed=10;
int myrand()
{
	rand_seed=rand_seed*1103515245+12345;
	return(rand_seed/65536)%32768;
}
void bubble_sort(int m, int a[],int (*comp)(int x, int y))
{
    int x,y,t;
    for(x=0;x<m-1;x++)
    {
        for(y=0;y<m-x-1;y++)
        {
            if((*comp)(a[y],a[y+1]))
            {
                t=a[y];
                a[y]=a[y+1];
                a[y+1]=t;
            }
        }
    }
}
/*
void bubble_sort(int m, int a[])
{
	int x,y,t;
	for(x=0;x<m-1;x++)
	{
		for(y=0;y<m-x-1;y++)
		{
			if(gtcmp(a[y],a[y+1]))
			{
				t=a[y];
				a[y]=a[y+1];
				a[y+1]=t;
			}
		}
	}
}
*/
int gtcmp(int x, int y){

if(x>y)
return 1;
else
return 0;

}
int ltcmp(int x, int y){

if(x<y)
return 1;
else
return 0;

}