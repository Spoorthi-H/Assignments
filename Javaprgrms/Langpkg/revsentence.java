class revsentence {
    public static void main(String[] args) {
       // sentence reverse
       String s1 = "Hello welcome to Java World";
        String s2[] = s1.split(" ");
        for (int i = s2.length - 1; i >= 0; i--) {
            System.out.print(s2[i] +" ");
        } 
        
        
       
    }
}