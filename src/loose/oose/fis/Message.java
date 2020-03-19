class Message {
	
	private String text;
	private Person exp,dest;
	
	public Message(Person exp, Person dest, String text) {
		this.exp = exp;
		this.text = text;
		this.dest = dest;
	} 
	
	public Person getDest() {
		return dest;
	}
	
	public String toString() {
		return exp + " said to " + dest + ":" + text;
	}
}