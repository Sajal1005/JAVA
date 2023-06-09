import com.sun.security.jgss.GSSUtil;

import java.util.*;

class ETE{
    public static boolean pal(String s){
        StringBuffer str = new StringBuffer(s);
        if(str.reverse().equals(s)){
            return true;
        }
        return false;
    }
    public static boolean cube(int n){
        if(n==1){
            return true;
        }
        for(int i=1;i<n;i++){
            if(i*i*i==n){
                return true;
            }
        }
        return false;
    }
    public static boolean uniq(String s){
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                return false;
            }else{
                set.add(s.charAt(i));
            }
        }
        return true;
    }
    public static boolean prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean arm(int n){
        int count=0,num=n;
        while(n!=0){
            count++;
            n/=10;
        }
        n=num;
        int ans=0;
        while(n!=0){
            ans+=(Math.pow(n%10,count));
            n/=10;
        }
        return num==ans;
    }
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int ans=0;
//        int n = in.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            ans*=10;
//            arr[i]=in.nextInt();
//            ans+=arr[i];
//        }
//        ans+=1;
//        ArrayList<Integer> list = new ArrayList<>();
//        while(ans!=0){
//            list.add(ans%10);
//            ans/=10;
//        }
//        Collections.reverse(list);
//        System.out.println(list);
        // 5 1 2 3 8 10 11 12 14
//Add only continuity sum like 1 2 3....then break at 8 .....then again sum 10 11 12

//6
//1 2 3 5 7 8
//21 ans
//        int n = in.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        int ans=0;
//        int flag=0;
//        for(int i=0;i<n-1;i++){
//            if(arr[i]+1==arr[i+1]){
//                if(flag==0){
//                    ans+=arr[i]+arr[i+1];
//                    flag=1;
//                }else{
//                    ans+=arr[i+1];
//                }
//            }else{
//                flag=0;
//            }
//        }
//        System.out.println(ans);

//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        int n = in.nextInt();
//        for(int i=0;i<n;i++){
//            arr.add(in.nextInt());
//        }
//        n=in.nextInt();
//        for(int i=0;i<n;i++){
//            arr.add(in.nextInt());
//        }
//        Collections.sort(arr);
//        for(int i=0;i<arr.size();i++){
//            System.out.print(arr.get(i));
//            if(i!=arr.size()-1){
//                System.out.print(" ");
//            }
//        }

//        int n = in.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        int min=arr[0];
//        System.out.print(arr[0]+" ");
//        for(int i=1;i<n;i++){
//            if(arr[i]<min){
//                System.out.print(arr[i]+" ");
//                min=arr[i];
//            }
//        }

//        int n = in.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        while(n!=0){
//            arr.add(n%10);
//            n/=10;
//        }
//        Collections.sort(arr);
//        int ans1=0,ans2=0;
//        for(int i=0;i<arr.size();i++){
//            ans1*=10;
//            ans1+=arr.get(i);
//        }
//        for(int i=arr.size()-1;i>=0;i--){
//            ans2*=10;
//            ans2+=arr.get(i);
//        }
//        System.out.println(ans1+ans2);

//        int n = in.nextInt();
//        int arr[]= new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        int count=0;
//        int n1=in.nextInt();
//        int n2=in.nextInt();
//        for(int i=0;i<n;i++){
//            if(n1%arr[i]==0 && n2%arr[i]==0){
//                count++;
//            }
//        }
//        System.out.println(count);

//        int n = in.nextInt();
//        int k = in.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        Arrays.sort(arr);
//        if(k>arr.length){
//            System.out.println("Invalid Input");
//            System.exit(0);
//        }
//        System.out.println(arr[n-k]);

//        int n = in.nextInt();
//        int k = in.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = in.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]+arr[j]==k){
//                    System.out.println(i+" "+j);
//                    System.exit(0);
//                }
//            }
//        }

//        int ans=-1;
//        int n = in.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            int count=0;
//            for(int j=0;j<n;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if(count==arr[i]){
//                ans=Math.max(ans,count);
//            }
//        }
//        System.out.println(ans);

//        int n = in.nextInt();
//        int arr[] = new int[n];
//        int count=0;
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//            if(cube(arr[i])){
//                System.out.print(arr[i]+" ");
//            }
//        }

//        int n = in.nextInt();
//        int a=0,b=1,temp,ans=0;
//        for(int i=0;i<n;i++){
//            ans+=a;
//            temp=b;
//            b+=a;
//            a=temp;
//        }
//        System.out.println(ans);
//        int ans=0;
//        int n1=in.nextInt();
//        int n2=in.nextInt();
//        int n3=in.nextInt();
//        ans+=Math.max(n1%10,Math.max(n2%10,n3%10));
//        ans*=10;n1/=10;n2/=10;n3/=10;
//        ans+=Math.min(n1%10,Math.min(n2%10,n3%10));
//        ans*=10;n1/=10;n2/=10;n3/=10;
//        ans+=Math.max(n1%10,Math.max(n2%10,n3%10));
//        ans*=10;n1/=10;n2/=10;n3/=10;
//        ans+=Math.min(n1%10,Math.min(n2%10,n3%10));
//        StringBuilder s = new StringBuilder(ans+"");
//
//        System.out.println(s.reverse());

//        int n = in.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        for(int i=0;i<10;i++){
//            int count=0;
//            for(int j=0;j<n;j++){
//                if(arr[j]==i){
//                    count++;
//                }
//            }
//            System.out.print(count+" ");
//        }
//        int n=in.nextInt();
//        for(int i=0;i<2*n-1;i++){
//            for(int j=0;j<2*n-1;j++){
//                System.out.print(n-Math.min(Math.min(i,j),Math.min(2*n-i-2,2*n-j-2)));
//            }
//            System.out.println();
//        }
//        int n = in.nextInt();
//        int k = in.nextInt();
//        int and=0,or=0,xor=0;
//        for(int i=1;i<=n;i++){
//            for(int j=i+1;j<=n;j++){
//                if((i&j)>and && (i&j)<k){
//                    and=Math.max(and,i&j);
//                }
//                if((i|j)>or && (i|j)<k){
//                    or=Math.max(or,i|j);
//                }
//                if((i^j)>xor && (i^j)<k){
//                    xor=Math.max(xor,i^j);
//                }
//            }
//        }
//        System.out.println(and+" "+or+" "+xor);
//        int n = in.nextInt();
//        for(int i=1;i<=n;i++){
//            if(prime(i)){
//                System.out.print(i+" ");
//            }
//        }

//        int n = in.nextInt();
//        int count=0,ans=0;
//        while(n!=0){
//            ans+=(Math.pow(2,count++)*n%10);
//            n/=10;
//        }
//        System.out.println(ans);

//        int n = in.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        while(n!=0){
//            arr.add(n%2);
//            n/=2;
//        }
//        int ans=0;
//        for(int i=arr.size()-1;i>=0;i--){
//            ans*=10;
//            ans+=arr.get(i);
//        }
//        System.out.println(ans);

//        double c = in.nextDouble();
//        double ans = (double)(9.0/5.0*c)+32;
//        System.out.printf("%.2f",ans);

//        int n1=in.nextInt();
//        int n2 = in.nextInt();
//        int ans=1;
//        for(int i=1;i<=Math.max(n1,n2);i++){
//            if(n1%i==0 && n2%i==0){
//                ans=i;
//            }
//        }
//        System.out.println(ans);
//        int i=Math.max(n1,n2);
//        while(true){
//            if(i%n1==0 && i%n2==0){
//                System.out.println(i);
//                break;
//            }
//            i++;
//        }
//        int n = in.nextInt();
//        int num=n,sum=0;
//        while(n!=0){
//            sum+=n%10;
//            n/=10;
//        }
//        n=num;
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i=2;i<n;i++){
//            if(n%i==0 && prime(i)){
//                arr.add(i);
//            }
//        }
//        System.out.println(arr);
//        int i=0,ans=0;
//        while(n!=1){
//            if(n%arr.get(i)==0){
//                n/=arr.get(i);
//                ans+=arr.get(i);
//            }else{
//                i++;
//            }
//        }
//        System.out.println(ans==sum);

//        int n = in.nextInt();
//        int m = in.nextInt();
//        int arr[][] = new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                arr[i][j]=in.nextInt();
//            }
//        }
//        int n2 = in.nextInt();
//        int m2 = in.nextInt();
//        int arr2[][] = new int[n2][m2];
//        for(int i=0;i<n2;i++){
//            for(int j=0;j<m2;j++){
//                arr2[i][j]=in.nextInt();
//            }
//        }
//        int ans[][] = new int[n][m2];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m2;j++){
//                for(int k=0;k<n2;k++){
//                    ans[i][j]+=(arr[i][k]*arr2[k][j]);
//                }
//                System.out.println(ans[i][j]);
//            }
//        }
//        int a = 2, b = 2, c = 3; if (--a == b && --b == c ); else if (a == b & --b == c); System.out.print(a + " " + b + " " + c);


//        int n = in.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        while(n!=0){
//            arr.add(n%2);
//            n/=2;
//        }
//        int ans=0;
//        for(int i=arr.size()-1;i>=0;i--){
//            ans*=10;
//            ans+=arr.get(i);
//        }
//        System.out.println(ans);

//        int n=in.nextInt();
//        int m = in.nextInt();
//        for(int i=n+1;i<m;i++){
//            if(arm(i)){
//                System.out.print(i+" ");
//            }
//        }

//        int arr[] = new int[5];
//        System.out.println(arr.length());

//        int n = in.nextInt();
//        int ans=n*n,sum=0;
//        while(ans!=0){
//            sum+=ans%10;
//            ans/=10;
//        }
//        System.out.println(sum==n);
//        int ans=0;
//        while(n!=0){
//            if(n%2==1){
//                ans++;
//            }
//            n/=2;
//        }
//        System.out.println(ans);

//        int arr[] = new int[5];
//        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
//        for(int i=0;i<5;i++){
//            arr[i]=in.nextInt();
//            min=Math.min(arr[i],min);
//            max=Math.max(arr[i],max);
//        }
//        System.out.println(max);
//        System.out.println(min);
//        int ans=arr[0]-arr[1];
//        for(int i=2;i<5;i++){
//            ans-=arr[i];
//        }
//        System.out.println(ans);
//        if(ans>=0){
//            System.out.println("Subtraction result is greater than or equal to Zero");
//        }else{
//            System.out.println("Subtraction result is less than Zero");
//        }

//        int n = in.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        int min =arr[0];
//        System.out.print(min);
//        for(int i=1;i<n;i++){
//            if(arr[i]<min){
//                System.out.print(arr[i]);
//                min=arr[i];
//            }
//        }

//        int n = in.nextInt();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(".");
//            }
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(".");
//            }
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int n=in.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                for(int k=j+1;k<n;k++){
//                    if(arr[i]+arr[j]+arr[k]==0){
//                        System.out.println(1);
//                        System.exit(0);
//                    }
//                }
//            }
//        }
//        System.out.println(0);

//        char[] str = s.toCharArray();
//        for(int i=0;i<str.length;i++){
//            if(str[i]>='A' && str[i]<='Z'){
//                str[i]+=32;
//            }else if(str[i]>='a' && str[i]<='z'){
//                str[i]-=32;
//            }
//            System.out.print(str[i]);
//        }
//        char c='%';
//        int ans=0;
//        for(int i=0;i<s.length();i++){
//            int count=0;
//            for(int j=0;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    count++;
//                }
//            }
//            if(count>ans && s.charAt(i)!=' '){
//                c=s.charAt(i);
//                ans=count;
//            }
//        }
//        if(ans==0){
//            System.out.print(0);
//            System.exit(0);
//        }
//        System.out.print(ans+" "+c);

//        String s = in.nextLine();
//        String str[] = s.split(" ");
//        System.out.print(str.length+" ");
//        for(int i=0;i<str.length;i++){
//            System.out.print(str[i].charAt(0));
//            System.out.print((int)str[i].charAt(0));
//            System.out.print(" ");
//        }

//        int[] arr = new int[5];
//
//        for(int i=0;i<5;i++){
//            arr[i]=in.nextInt();
//        }
//        int ans=arr[0]-arr[1];
//        for(int i=2;i<5;i++){
//            ans-=arr[i];
//        }
//        System.out.println(ans);

//        int w = in.nextInt();
//        int h = in.nextInt();
//        int r = in.nextInt();
//        System.out.println(2*r>=(Math.sqrt(w*w+h*h)));

//        String s = in.next();
//        for(int i=0;i<s.length();i++){
//            if(i%2==0){
//                System.out.print(s.charAt(i));
//            }
//        }
//        for(int i=0;i<s.length();i++){
//            if(i%2!=0){
//                System.out.print(s.charAt(i));
//            }
//        }

//        String s1=in.next();
//        String s2 = in.next();
//        char str1[] = s1.toCharArray();
//        char str2[] = s2.toCharArray();
//        Arrays.sort(str1);
//        Arrays.sort(str2);
//        if(str1.length!=str2.length){
//            System.out.println(false);
//            System.exit(0);
//        }
//        int flag=1;
//        for(int i=0;i<str1.length;i++){
//            if(str1[i]!=str2[i]){
//                flag=0;
//                break;
//            }
//        }
//        if(flag==0){
//            System.out.println(false);
//        }else{
//            System.out.println(true);
//        }

//        int n = in.nextInt();
//        if(n%10<5){
//            n-=(n%10);
//        }else{
//            n+=(10-n%10);
//        }
//        System.out.println(n);

//        String s = in.next();
//        char c = s.charAt(0);
//        int count=0;
//        for(int i=0;i<s.length();i++){
//            if(c==s.charAt(i)){
//                count++;
//            }else{
//                System.out.print(c+""+count);
//                count=1;
//                c=s.charAt(i);
//            }
//        }
//        System.out.print(c+""+count);
//        int max=0;
//        String s = in.next();
//        for(int i=0;i<s.length();i++){
//            for(int j=i+1;j<s.length();j++){
//                if(uniq(s.substring(i,j+1))){
//                    max=Math.max(max,j-i);
//                }
//            }
//        }
//        System.out.println(max);

//        int n = in.nextInt();
//        HashSet<String> s = new HashSet<>();
//        for(int i=0;i<n;i++){
//            s.add(in.next());
//        }
//        System.out.println(s.size());

//        String s = in.next();
//        for(int i=0;i<s.length();i++){
//            int count=0;
//            for(int j=0;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    count++;
//                }
//            }
//            if(count==1){
//                System.out.print(s.charAt(i));
//                break;
//            }
//        }

//        int n = in.nextInt();
//        String ans = "";
//        int max=0;
//        for(int i=0;i<n;i++){
//            String s = in.next();
//            int x = in.nextInt();
//            if(x>max){
//                ans=s;
//                max=x;
//            }
//        }
//        System.out.println(max);

//        int n = in.nextInt();
//        ArrayList<String> arr = new ArrayList<>();
//        HashSet<String> set = new HashSet<>();
//        for(int i=0;i<n;i++){
//            String s = in.next();
//            if(set.contains(s)){
//                continue;
//            }else{
//                set.add(s);
//                arr.add(s);
//            }
//        }
//        System.out.println(arr);

//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        char c = s.charAt(0);
//        int count=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==c){
//                count++;
//            }else{
//                System.out.print(c);
//                System.out.print(count);
//                c=s.charAt(i);
//                count=1;
//            }
//        }
//        System.out.print(c);
//        System.out.print(count);

//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        char[] ch = s.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            if(ch[i]>='a' && ch[i]<='z'){
//                ch[i]-=32;
//            }else if(ch[i]>='A' && ch[i]<='Z'){
//                ch[i]+=32;
//            }
//        }
//        String ans = new String(ch);
//        System.out.println(ans);

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int j=in.nextInt();
//        int m = in.nextInt();
//        if(n>=j){
//            n-=j;
//            System.out.println("John: tickets booked: "+j);
//        }else{
//            System.out.println("John: not booked");
//        }
//        if(n>=m){
//            n-=m;
//            System.out.println("Mike: tickets booked: "+m);
//        }else{
//            System.out.println("John: not booked");
//        }
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for(int i=0;i<n;i++){
//            String s = in.next();
//            if(s.charAt(0)=='D'){
//                int x = s.length()+1;
//                for(int j=x;j>=1;j--){
//                    System.out.print(j);
//                }
//            }else{
//                int x = s.length()+1;
//                for(int j=1;j<=x;j++){
//                    System.out.print(j);
//                }
//            }
//            System.out.println();
//        Scanner in = new Scanner(System.in);
//        int n=in.nextInt();
//        int count=1;
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        for(int i=0;i<n-1;i++){
//            System.out.println(count);
//            if(arr[i+1]>arr[i]){
//                count++;
//            }else{
//                count=1;
//            }
//        }

//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        int count=0;
//        for(int i=0;i<s.length();i++){
//            for(int j=i;j<s.length();j++){
//                if(pal(s.substring(i,j+1))){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);

        Scanner in = new Scanner(System.in);
////        int p=in.nextInt();
////        for(int i=0;i<p;i++){
////            int n = in.nextInt();
////            int k= in.nextInt();
////            int ans=0;
////            while(ans^)
////        }
//
//        String s = "Sajal Nanda";
//        System.out.println(s.indexOf("Nan"));

//        String s = new String("5");
//        System.out.println(1 + 10 + s + 1 + 10);
//        String s = in.nextLine();
//        String str[] = s.split(" ");
//        for(int i=str.length-1;i>=0;i--){
//            System.out.print(str[i]+" ");
//        }

//        int n = in.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
//        while(n!=0){
//            arr.add(n%2);
//            n/=2;
//        }
//        System.out.println(arr);
//        int n1=in.nextInt();
//        int n2 = in.nextInt();
//            for(int i=n1+1;i<n2;i++){
//                if(arm(i)){
//                    System.out.print(i+" ");
//                }
//            }


//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(".");
//            }for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(".");
//            }
//            for(int j=0;j<n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        int ans=Integer.MIN_VALUE,sum=0;
//        for(int i=0;i<n;i++){
//            if(sum<0){
//                sum=0;
//            }
//            sum+=arr[i];
//            ans=Math.max(sum,ans);
//        }
//        System.out.println(sum);

//        String s = in.nextLine();
//        s=s.toLowerCase();
//        String str[] = s.split(" ");
//        for(int i=0;i<str.length;i++){
//            StringBuffer q = new StringBuffer(str[i]);
//            q.setCharAt(0,(char)(q.charAt(0)-32));
//            System.out.print(q+" ");
//        }

//        String s = in.next();
//        int ans=0;
//        char c='%';
//        for(int i=0;i<s.length();i++){
//            int count=0;
//            for(int j=0;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    count++;
//                }
//            }
//            if(count>ans){
//                ans=count;
//                c=s.charAt(i);
//            }
//        }
//        System.out.println(c);
//        String s = in.next();
//        int i=0,j=1;
//        while(i<s.length() && j<s.length()){
//            if(s.charAt(i)>s.charAt(j)){
//                System.out.print(s.charAt(i));
//            }else{
//                System.out.print(s.charAt(j));
//            }
//            i+=2;
//            j+=2;
//        }
//        if(s.length()%2!=0){
//            System.out.print(s.charAt(s.length()-1));
//        }

//        String s = in.next();
//        int sum=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
//                int k=i;
//                while(i<s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9')){
//                    i++;
//                }
//                sum+=(Integer.parseInt(s.substring(k,i)+""));
//            }
//        }
//        System.out.println(sum);

//        String s = in.nextLine();
//        String str[] = s.split(" ");
//        for(int i=0;i<str.length;i++){
//            StringBuffer buff = new StringBuffer(str[i]);
//            System.out.print(buff.reverse()+" ");
//        }

//        String s = in.next();
//        int max=0;
//        for(int i=0;i<s.length();i++){
//            for(int j=i;j<s.length();j++){
//                if(uniq(s.substring(i,j+1))){
//                    max=Math.max(max,j+1-i);
//                }
//            }
//        }
//        System.out.println(max);

//        int n = in.nextInt();
//        int k = in.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        int i=0,j=k-1;
//        while(i<n && j<n){
//            for(int q=j;q>=i;q--){
//                System.out.print(arr[q]+" ");
//            }
//            i+=k;j+=k;
//        }
//        for(int q=n-1;q>=i;q--){
//            System.out.print(arr[q]+" ");
//        }
//    }

//        String s = in.nextLine();
//        int count=0;
//        for(int i=0;i<s.length();i++){
//            char c = s.charAt(i);
//            if(c=='i' || c=='e' || c=='o' || c=='a' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
//                count++;
//            }
//        }
//        System.out.println(count);
//        }

//        String s1 = in.next();
//        String s2 = in.next();
//        char[] c1 = s1.toCharArray();
//        char[] c2 = s2.toCharArray();
//        Arrays.sort(c1);
//        Arrays.sort(c2);
//        String q1 = new String(c1);
//        String q2 = new String(c2);
//        System.out.println(q1.equals(q2));

//        int runs=in.nextInt();
//        int overs = in.nextInt();
//        if(overs==0){
//            System.out.print("java.lang.ArithmeticException");
//            System.exit(0);
//        }
//        float ans = runs/overs;
//
//        System.out.printf("%.2f",ans);

//        int n =in.nextInt();
//        if(n==1){
//            double l = in.nextDouble();
//            double w = in.nextDouble();
//            System.out.printf("Area: %.2f\n",(l*w));
//            System.out.printf("Perimeter: %.2f",(2*(l+w)));
//        }else if(n==2){
//            double r = in.nextDouble();
//            System.out.printf("Area: %.2f\n",(Math.PI*r*r));
//            System.out.printf("Circumference: %.2f",(Math.PI*2*r));
//        }

//        String s = in.next();
//        System.out.println(s.trim());

//        int n = in.nextInt();
//        String[] arr = new String[n];
//        in.nextLine();
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextLine();
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

//        int n = in.nextInt();
//        if(n%10<5){
//            n-=(n%10);
//        }else{
//            n+=(10-n%10);
//        }
//        System.out.println(n);

//        String s = in.next();
//        int n = in.nextInt();
//        int sum=0;
//        for(int i=0;i<n;i++){
//            char c= in.next().charAt(0);
//            int count=0;
//            for(int j=0;j<s.length();j++){
//                if(c==s.charAt(i)){
//                    count++;
//                }
//
//            }
//            sum+=(count*((int)c));
//        }
//        System.out.println(sum);

//        int n = in.nextInt();
//        int arr[] = new int[n];
//        String arr2[] = new String[n];
//        for(int i=0;i<n;i++){
//            int x = in.nextInt();
//            String s = in.next();
//            arr[i]=x;
//            arr2[i]=s;
//        }
//        int x = in.nextInt();

//        String s = in.next();
//        int id = in.nextInt();
//        if(id<=0){
//            System.out.println("Invalid ID");
//            System.exit(0);
//        }
//        int sal = in.nextInt();
//        if(sal<0){
//            System.out.println("Invalid Salary");
//            System.exit(0);
//        }
//        System.out.println("Data Processed");

//        int bal = in.nextInt();println("Withdrawal Unsuccessful");
//        }else{
//            System.out.printf("Withdrawal Successful. Available balance: %.1f",(float)bal-need);
//        }

//        String s = in.nextLine();
//        char[] ch = s.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            if(ch[i]>='A' && ch[i]<='Z'){
//                ch[i]+=32;
//            }else if(ch[i]>='a' && ch[i]<='z'){
//                ch[i]-=

//        String s = in.nextLine();
//        String str[] = s.split(" ");
//        System.out.print(str.length+" ");
//        for(int i=0;i<str.length;i++){
//            System.out.print(str[i].charAt(0));
//            System.out.print((int)str[i].charAt(0)+" ");
//        }

//        String s = in.nextLine();
//        char c='%';
//        int ans=0;
//        for(int i=0;i<s.length();i++){
//            int count=0;
//            for(int j=0;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    count++;
//                }
//            }
//            if(count>ans && s.charAt(i)!=' '){
//                ans=count;
//                c=s.charAt(i);
//            }
//        }
//        System.out.println(ans+" "+c);

//        int n=in.nextInt();
//        int k = in.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//        }
//        int i=0,j=k-1;
//        while(i<n && j<n){
//            for(int q=j;q>=i;q--){
//                System.out.print(arr[q]+" ");
//            }
//            i+=k;
//            j+=k;
//        }
//        for(int q=n-1;q>=i;q--){
//            System.out.print(arr[q]+" ");
//        }

//        int n = in.nextInt();
//        int arr[] = new int[n];
//        int sum=0,ans=0;
//        for(int i=0;i<n;i++){
//            arr[i]=in.nextInt();
//            if(sum<0){
//                sum=0;
//            }
//            sum+=arr[i];
//            ans = Math.max(ans,sum);
//        }
//        System.out.println(ans);

        Stack<Integer> stack = new Stack<>();
        String s = in.next();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                stack.push(Integer.parseInt(s.charAt(i)+""));
            }else{
                int op1=stack.pop();
                int op2=stack.pop();
                if(s.charAt(i)=='+'){
                    stack.push(op2+op1);
                }else if(s.charAt(i)=='-'){
                    stack.push(op2-op1);
                }else if(s.charAt(i)=='*'){
                    stack.push(op2*op1);
                }else{
                    stack.push(op2/op1);
                }
            }
        }
        System.out.println(stack.pop());

    }
}
