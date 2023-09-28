import java.util.Scanner;
public class a {
    public static void main(String[] args) {
	String s="abc xyz";
	Scanner sc=new Scanner(s);
	while(sc.hasNext()){     // value here True Otherwise False
		System.out.println(sc.next());
	}
}
}