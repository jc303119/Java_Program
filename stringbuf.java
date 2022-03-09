class stringbuf{

public static void main(String[] args){

StringBuffer b=new StringBuffer("hello");
System.out.println(b.length());
System.out.println(b.capacity());

b.append("my"+"name"+"is"+"jikmat");
System.out.println(b.length());
System.out.println(b.capacity());


}
}

