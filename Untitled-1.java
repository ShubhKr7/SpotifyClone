//1) WAP to Selection sort an array
class ss
{
    void main(int arr[]){
        for(int k=0; k,arr.length();i+=1){
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                }}
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
    }}
    for (i = 0; i < n; i++) {
        System.out.println(arr[i]);
    }}}


//2)bubble sort
class bb{
    void main(){
          int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            if (swapped == false)
                break;
        }}
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }}}

//3) Armstrong
        class arm{
            void main(int n){
                int s=0;
                for(int i=n; i>0; i/=10){
                    s=(s*10)+(i%10);
                }
                if(s==n) System.out.println("Armstrong"); 
                else System.out.println("Not Armstrong");
            }
        }

        //4) WAP to check if an array is palindrome or not.
        class pp{
            void main(int n){ int s=0;
                for(int i=n; i>0; i/=10){
                    s=(s*10)+(i%10);
                }
                if(s==n) System.out.println("Palindrome");
                else System.out.println("Not Palindrome");
            }}

    //5) WAP to check if a number is prime or not.
    class prime{
        void main(int n){
            int c=0;
            for(int i=1; i<=n; i+=1){
                if(n%i==0) c+=1;
            }
            if(c==2) System.out.println("Prime");
            else System.out.println("Not Prime");
        }}

    //6) WAP to check if a number is neon number or not.
    class neon{
        void main(int n){
            int sq=n*n,s=0;
            for(int i=sq; i>0; i/=sq){
                s+=(i%10);
            }
            if(s==n) System.out.println("Neon");
            else System.out.println("Not Neon");
        }
    }

    //7) WAP to check if a number is automorphic or not.
    class auto{
        void main(int n){
            int sq=n*n,c=0;
            for(int i=n; i>0; i/=10){
                c+=1;
            }
            int l = sq%(int)Math.pow(10, c);
            if(l==n) System.out.print("Automorphic");
            else System.out.print("Not Automorphic");
        }}

    //8) WAP to check if a number is even or odd
    class even{
        void main(int n){
            if(n%2==0) System.out.print("Even");
            else System.out.print("Odd");
        }}

        //9) WAP to check if a number is special or not.
        class sp{
            void main(int n){ int fact=1,s=0;
                for(int i=n; i>0; i/=10){
                    int k=i%10;
                    for(int j=1; j<=k; j+=1){
                        fact*=j;
                    }
                    s+=fact;
                    fact=1;
                }
                if(s==n) System.out.print("Special");
                else System.out.print("Not Special");
            }}

    //10) WAP to print the largest of three numbers
    class num{
        void main(int n, int m, int o){
            if(n>m && n>o) System.out.print(n);
            if(m>n && m>o) System.out.print(m);
            if(o>n && o>m) System.out.print(o);
        }}

    //11) WAP to factorial using recursion
    class recur{
        int factorial(int n){
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }}

    //12) WAP to find HCF using recursion
    class hcf {
        int gcd(int num1, int num2)
    {
        if (num1 == 0)
          return num2;
        if (num2 == 0)
          return num1;
        if (num1 == num2)
            return num1;
        if (num1 > num2)
            return gcd(num1-num2, num2);
        return gcd(num1, num2-num1);
    }}

    //13) WAP to find an element in an array using linear search
    class lin{
        void main(int a[], int x){ int c=0;
            for(int i = 0 ; i <a .length; ++i ){
                if(a[i] == x){c=1; break;}
                }
            if(c==1) System.out.println("Element found!");
        else System.out.println("Element does not exist");}}

        //14) WAP to add elements of two arrays
        class a
        {
            void main(int a1[], int a2[])
            {
                if(a1.length>a2.length)
                {
                int s=new s[a2.length];
                for(int i=0; i<a2.length; i+=1)
                {
                    s[i]=a1[i]+a2[i];
                }
                for(int i=0; i<s.length; i+=1)
                {
                    System.out.println(s[i]);
                }
            }
            else
            {
                int s=new s[a1.length];
                for(int i=0; i<a1.length; i+=1)
                {
                    s[i]=a1[i]+a2[i];
                }
                for(int i=0; i<s.length; i+=1)
                {
                    System.out.println(s[i]);
                }
            }
        }}

        //18) WAP to print a double dimensional array
        class a{
            void main(int arr[][]){
                for(int row=0;row<arr.length;++row ){
                    for(int c=0; c<arr.length; c+=1){
                        System.out.print(arr[row][c]+" ");
                    }
                    System.out.println();
                }
            }
        }

        //19) WAP to print prime factors of a number.
        class v{
            void main(int n){
                int c=0;
                for(int i=1; i<=n; i+=1){
                    int r=n%i;
                    if(r==0) {
                        for(int j=1; j<=r; j+=1){
                            if(r%j==0) c+=1;
                        }
                        if(c==2) System.out.println(r);
                        c=0;
                    }
                }
            }
        }

 //20) WAP to find LCM using recursion.
class Test
{
	int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	int lcm(int a, int b)
	{
		return (a / gcd(a, b)) * b;
	}

	void main(String[] args)
	{
		int a = 15, b = 20;
		System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
	}
}

//21) WAP to print n terms of fibbonacci series
class GFG {
	void Fibonacci(int N)
	{
		int num1 = 0, num2 = 1;
		int counter = 0;
		while (counter < N) {
			System.out.print(num1 + " ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
	}
	 void main()
	{
		int N = 10;
		Fibonacci(N);
	}
}

//22) WAP to print fibbonacci series using recursion
class GFG {
	static int fib(int n)
	{
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
	public static void main(String args[])
	{
		int N = 10;
		for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
		}
	}
}
