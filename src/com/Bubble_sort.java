package com;

public class Bubble_sort {

	public static void main(String[] args) 
	{
		int[] number= {5,6,1,2,3,4,7,8,9};
		int temp=0;
		for(int i=0;i<number.length;i++)
		{
			for(int j=1;j<(number.length-i);j++)
			{
				if(number[j-1]>number[j])
				{
					temp=number[j-1];
					number[j-1]=number[j];
					number[j]=temp;
				}
			}
		}
		for(int i=0;i<number.length;i++)
		{
		System.out.print(number[i]);
		}
		
	}

}
