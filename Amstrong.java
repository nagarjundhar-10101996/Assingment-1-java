class Amstrong {
        public static void main(String[] args) {

            arm(153);
            arm(150);
        }
        static void arm(int n)
        {
            int m,c=0;
            int temp=n;
            
            for(int i=n;i>0;i--)
            {
                m=n%10;//153%10=3, 15%10=5, 1%10=1
                n=n/10;//153/10=15, 15/10=1, 1/10=0;
                c=c+(m*m*m);//0+27=27 ,27+(5*5*5)=27+125=152, 152+(1*1*1)=152+1=153
            }
            if(temp==c)
            {
                System.out.println(temp+" is an Armstrong Number");
            } else {
                System.out.println(temp+" is not an Armstrong");
            }
        }
    }

