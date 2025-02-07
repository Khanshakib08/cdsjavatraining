#include <stdio.h>
int main()
{
	int a=7, b=5;
	b=a+b;
	a=b-a;
	b=b-a;
	printf("swapped value of a and b is %d & %d" ,a,b);
	return 0;
}
