
public class PrimeNumber {
	void prime(int a){
		int i,r,q,s;    
		for(i=2;i<=a;i++)
		{
			if(i==2)
				{
				System.out.print("2"+" ");
				}
			if(i==3)
				{
				System.out.print("3"+" ");
				}
			if(i==5)
				{
				System.out.print("5"+" ");
				}
			else if(i>2){
				r= i %2;
				q=i%3;
				s=i%5;
				if (r != 0 && q!=0 && s!=0){
				System.out.print(i+" ");
		}
		}
		}
		}
		public static void main(String[] args){
		    PrimeNumber p=new PrimeNumber();
			p.prime(150);
		}
}
