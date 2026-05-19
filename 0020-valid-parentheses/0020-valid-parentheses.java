class Node{
	char data;
	Node link;
	Node(char data){
		this.data=data;
	}
}
class Solution  {
    	Node head = null;
	
		void push(char value) {
			Node newnode = new Node(value);
			if(head==null) {
				head=newnode;
			}else {
				newnode.link=head;
				head=newnode;
                }		
        }
		void pop() {
			if(head!=null) {
				char value = head.data;
				head=head.link;			
				}
        }
		char peek() {
			if(head!=null) {
				return head.data;			
                }
			return '!';		
        }

    public boolean isValid(String s) {
        for(char c : s.toCharArray()) {
				if((c=='(')||(c=='{')||(c=='['))
				{
					push(c);
				}
				else if((c==')')) {
					if(head!=null) {
					if(peek()=='(') {
						pop();
					}else {
						return false;
					}
                }else {
						return false;
					}
				}
				else if((c=='}')) {
					if(head!=null) {
					if(peek()=='{') {
						pop();
					}else {
						return false;
					}
                }else {
						return false;
					}
				}
				else if((c==']')) {
					if(head!=null) {
					if(peek()=='[') {
						pop();
					}else {
						return false;
					}
                }else {
						return false;
					}
				}
		}
			return (head==null)?true:false;
    }
}