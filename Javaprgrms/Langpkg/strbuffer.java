class strbuffer{
    public static void main(String[] args)
    {
StringBuffer ename= new StringBuffer("Rahul");
ename.append(" Gandhi");
System.out.println(ename);
System.out.println("String Constant");
String s1="Sonia";
String s2=s1.concat("Gandhi");
System.out.println("s2:"+s2);
System.out.println("s1" + s1);
    }
}
