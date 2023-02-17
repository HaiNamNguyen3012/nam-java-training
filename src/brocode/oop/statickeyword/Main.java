package brocode.oop.statickeyword;

public class Main {
	/*
     * static = modifier. A single copy of a variable/method is create and shared.
     * The class "owns" the static member
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend friend1 = new Friend("Nguyen Thuc Anh");
        Friend friend2 = new Friend("Patrick vieira");
        Friend friend3 = new Friend("Thierry Henry");
        
        Friend.displayFriend();
	}

}
