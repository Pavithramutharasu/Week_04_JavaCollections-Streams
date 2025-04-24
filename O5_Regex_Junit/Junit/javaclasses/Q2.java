package javaclasses;


public class Q2 {
	public Boolean isPalin(String a) {
		String rev = new StringBuilder(a).reverse().toString();
		return rev.equals(a);
	}
    public String reverse(String s) {
    	String r = new StringBuilder(s).reverse().toString();
    	return r;
    }
    public String Upper(String s) {
    	return s.toUpperCase();
    }
}
