class StringBufferExample {
	public static void main(String[] args){
		
		StringBuffer sb = new StringBuffer("hello");
		
		
		sb.append("World");
		System.out.println("append: "+ sb);
		
		sb.insert( 5, ",");
		System.out.println("insert: " + sb);
		
		
		sb.replace( 6,11, "Java");
		System.out.println("replace: " + sb);
	}
}
	