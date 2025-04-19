public class at4 {
    public static void main(String[] args) {
        int cont=1000; 
        float s = 0;
        for (int i = 1; i<=50 ;i++ ){
            if ( i%2 ==1 || i ==1 ){
                s+= cont/i;
            }else {
                s-= cont/i;
            }
            cont-=3;
        }
        System.out.println(s);
    }
}
