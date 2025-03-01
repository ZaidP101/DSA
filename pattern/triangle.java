import java.util.Scanner;
public class triangle{
    public static void type2(int n){
        for(int i =0; i<n ; i++){
            for(int j =0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void triangle2(int n){
        for(int i=1; i <n; i++){
            for (int j=1; j<i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void triangle3(int n){
        for(int i =0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
        }   
    }
    public static void triangle4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<n-i+1; j++){
                System.out.print( " * ");
            }
            System.out.println();
        }
    }
    public static void piramid(int n ){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i*2+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void piramidR(int n){
            for(int i=0; i<n; i++){
                for(int j=0;j<i-1; j++){
                    System.out.print(" ");
                }
                for(int j=0; j<2*n-(2*i+1); j++){
                    System.out.print("*");
                }
                for(int j=0; j<i-1; j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
            
    }
    public static void triangle5(int n){
        for(int i=1; i<=2*n-1; i++){
            int start = i;
            if(i>n)start = 2*n-i;
            for(int j =1; j<=start;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void biTriangle(int n){
        int start =1;
        for(int i=1; i<=n+1; i++){
            if(i%2==0) start = 1;
            else start =0;
            for(int j=1; j<i; j++){
                System.out.print(start);
            }
            System.out.println();
        }
    }
    public static void triangle6(int n){
        int num =1;
        for(int i=1; i <=n; i++){
            for(int j=1; j<i; j++){
                System.out.print(num);
                num += 1;
            }
            System.out.println();
        }
    }
    public static void alpha(int n ){
        for(int i=1; i<=n; i++){
            for(char ch ='A'; ch<'A'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void alphaR(int n){
        for(int i=1; i<=n; i++){
            for(char ch='A'; ch<='A'+n-i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void alpha2(int n){
        for(int i=0; i<n; i++){
            char alpha = (char)('A' + i);
            for(char ch =0; ch<=i; ch++){
                System.out.print(alpha);
            }
            System.out.println();
        }
    }
    public static void alphaPiramid(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            for(int j=0; j<2*i +1; j++){
                System.out.print(ch);
                ch++;
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void alphaPiramid2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j=0; j<2*i +1; j++){
                System.out.print(ch);
                if(j<=breakpoint)ch++;
                else ch--;
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void hollowSq(int n){
        int space= 0;
        for(int i=0;i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
    }
    public static void hollowSq2(int n){
        // int space= 8;
        for(int i=0;i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            for(int j=0; j<(2*n)-(2*i); j++){
                System.out.print(" ");
            }for(int j=0; j<i; j++){
                System.out.print("*");
            }
            // space -= 2;
            System.out.println();
        }
    }
    public static void hollowSq3(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0 || j==n-1 || i==n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // type2(n);
        // triangle2(n);
        // triangle3(n);
        // triangle4(n);
        // piramid(n);
        // piramidR(n);
        // triangle5(n);
        // biTriangle(n);
        // triangle6(n);
        // alpha(n);
        // alphaR(n);
        // alpha2(n);
        // alphaPiramid(n);
        // alphaPiramid2(n);
        // hollowSq(n);
        // hollowSq2(n);
        // hollowSq3(n);

    }
}