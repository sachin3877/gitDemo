
public class StringApp {
	String subString (String str,int index)
	{
		char arr1[]=str.toCharArray();
		char arr2[]=new char[arr1.length-index];
		int j=arr2[0];
		for(int i=index;i<=arr1.length-1;i++)
		{
			arr2[j]=arr1[i];
			j++;
		}
		
	}
	String res=new String(res);
	return res;

}
