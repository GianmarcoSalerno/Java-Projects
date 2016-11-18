package gw2;

public class Link {

	String info;

	public Link next;

	public Link(String info) {
		this.info = info;
	}

	public void display() {
		System.out.println("charecter info: " + info);
	}

	public String toString() {
		return info;
	}

	class LinkList {
		public Link firstLink;

		LinkList() {
			firstLink = null;
		}

		public boolean isEmpty() {
			return (firstLink == null);
		}

		public void insertFirstLink(String info) {
			Link newLink = new Link(info);

			newLink.next = firstLink;

			firstLink = newLink;
		}

		public Object removeFirst() {
			Link linkReference = firstLink;
			if (!isEmpty()) {
				firstLink = firstLink.next;
			} else {
				System.out.println("Empty LinkedList");
			}
			return linkReference;
		}

		public void display() {
			Link theLink = firstLink;

			while (theLink != null) {
				theLink.display();
				System.out.println("next linke: " + theLink.next);
				theLink = theLink.next;
				System.out.println();
			}
		}

		public Link find(String info) {
			Link theLink = firstLink;

			if (!isEmpty()) {
				while (theLink.info != info) {
					if (theLink.next == null) {
						return null;
					}// end if
					else {
						theLink = theLink.next;
					}
				}// end while
			}// end if
			else {
				System.out.println("Empty LinkedList");
			}
			return theLink;
		}
	}
}
