//Number=327 then 327*2=654 & 327*3=981
//Combine 327654981
//All digit freq in number is 1 then it is fascinating number
class FascinatingNumber1// without using string
{ 
	public static void main(String[] args) 
	{
		int num=327;
		int temp=num;
		boolean flag = true;
		
		for(int i = 2; i<=3; i++)
			{
			num = (num*1000)+(temp*i);
			}
			for(int i = 1; i<=9; i++)
		    {
				int cnt=0;
			for (int j = num; j > 0; j /= 10)
			{  
            if(i==(j%10))  
            cnt++;  
			}
			if(cnt!=1)
			{
				flag= false;
				break;
			}
		}
		if(flag){
				System.out.println(num+" is FascinatingNumber");
		}
		else{
			System.out.println(num+" is not FascinatingNumber");
	}
}
}
