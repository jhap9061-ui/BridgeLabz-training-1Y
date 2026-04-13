class StringBufferExample {
	public static void main(String[] args){
		
		StringBuffer sb = new StringBuffer("hello");
		
		
		sb.append("World");
		System.out.println("append: "+ sb);
		
		sb.insert( offset5, str:",");
		System.out.println("insert: " + sb);
		
		
		sb.replace( start6,end:11, stc"Java");
		System.out.println("replace: " + sb);
	}
	