//Chen Zhang Lab08
#include <stdio.h>

//session 2
int mystrcmp(char *s, char *t)
{
	for ( ; *s == *t; s++, t++)
	
		 if (*s == '\0')
               return 0;
       return *s - *t;
}
//session 3
void mystrcat(char *dest, char *source)
{
	while(*dest)//find end of dest
	{dest++;}
	while((*dest++)=(*source++))//copy source to dest
	{
		;
	}
}
//session 4
void mystrcpy(char*s, char*t)
{
	while((*s=*t)!='\0')
	{
		s++;
		t++;
	}
}

//session 1
int main(int argc, char*argv[])
{

	for(int i=0;i<argc;i++)
	{	
	//Check my name in the argument
		if(mystrcmp("Chen",argv[i])==0)
		{	
			//copy"Hello" to the array 
			char hi[30];
			mystrcpy(hi,"Hello, ");
			//put my name after hello
			mystrcat(hi,argv[i]);
			printf("%s\n",hi);
		}
		else{
			printf("%s\n",argv[i]);
		}
	}
	

//session 6
	int a[10];
	
	for(int i=0; i<10;i++)
	{
		a[i]=i*i;
		printf("%d\n", *(a+i));
	}
		
}

