
public class DemoApp {

	
		static int maxi(int arr[])
		{
			int max =0;
			int count=0;
			for(int i=0;i<=arr.length-1;i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
			}
			return max;
		}
		public static void main(String []args)
		{
			int arr[]={12,45,87,51,96,35,445};
			System.out.println(maxi(arr));
		}
	

}
