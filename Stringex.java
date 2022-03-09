class Stringex{
public static void main(String[] args)
{
String s1="hello java";
String s2="hello java";
//s2=s1; 
if(s1==s2){  
System.out.println("same ref");
}

else{
System.out.println("not same ref");
}

String s3=new String("hello java".intern());
//s1 = s3;
if(s1==s3){
System.out.println("same ref");
}

else{
System.out.println("not same ref"); 
}

}
}