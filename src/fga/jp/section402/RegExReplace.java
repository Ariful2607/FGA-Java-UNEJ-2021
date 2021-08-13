package regexreplace;

public class RegExReplace {
	 public static void main(String[] args) {
		String str = "help   me   I have   no idea what's  going on!  !   !";
		str = str.replaceAll(" {2,}", " ");
		System.out.println(str);

	 }//end method main
}//end class RegExReplace
