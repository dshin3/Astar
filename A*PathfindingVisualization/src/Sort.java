import java.util.ArrayList;


public class Sort
{
	private boolean lowToHigh;
	private boolean highToLow;
	
	
	public Sort()
	{
		lowToHigh = true;
		highToLow = false;
	}
	
	
	public void bubbleSort(int[] data)
	{
		int Switch = -1;
		int temp;
		
		while(Switch != 0)
		{
			Switch =0;
			if(lowToHigh)
			{
				for(int i=0;i<data.length-1;i++)
				{
					if(data[i]>data[i+1])
					{
						temp = data[i];
						data[i] = data[i+1];
						data[i+1] = temp;
						Switch =1;
					}
				}
			}//End of if
			else if(highToLow)
			{
				for(int i =0; i<data.length-1;i++)
				{
					if(data[i]>data[i+1])
					{
						temp = data[i];
						data[i] = data[i+1];
						data[i+1] = temp;
						Switch =1;
					}
				}
			}
		}
		
		
	}//end of bubblesort
	
	
	public void bubbleSort(ArrayList<Cell> list)
	{
		int Switch = -1;
		Cell temp;
		
		while(Switch != 0)
		{
			Switch =0;
			
			if(lowToHigh)
			{
				for(int i =0;i<list.size()-1;i++)
				{
					if(list.get(i).getF() > list.get(i+1).getF())
					{
						temp =  list.get(i);
						list.remove(i);
						list.add(i+1,temp);
						Switch =1;
					}
				}
			}
			else if(highToLow)
			{
				for(int i = 0;i<list.size();i++)
				{
					if(list.get(i).getF() <list.get(i+1).getF())
					{
						temp = list.get(i);
						list.remove(i);
						list.add(i+1,temp);
						Switch =1;
					}
				}
			}
			
		}
	}
	
	
	//Low is 0, high is numbers.length -1
	public void quickSort(int[] numbers, int low, int high)
	{
		int i = low;
		int j = high;
		//low bound plus middle as index equals to the pivot.
		//Pivot is the number not the index.
		int pivot = numbers[low+(high - low)/2];
		
		while(i<=j)
		{
			if(lowToHigh)
			{
				while(numbers[i]< pivot)
				{
					i++;
				}
				while (numbers[j] > pivot)
				{
					j--;
				}
			}
			else if(highToLow)
			{
				while(numbers[i] > pivot)
				{
					i++;
				}
				while(numbers[j] < pivot)
				{
					j--;
				}
			}
			if(i<= j)
			{
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				i++;
				j--;
			}
		}
		
		if(low < j)
		{
			quickSort(numbers, low, j);
		}
		if(i<high)
		{
			quickSort(numbers,i,high);
		}
	}// end of quicksort
	
	
	
	
	public void setLowToHigh()
	{
		lowToHigh = true;
		highToLow = false;
	}
	
	public void setHighToLow()
	{
		lowToHigh = false;
		highToLow = true;
	}
}
