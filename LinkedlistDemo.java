
    class Node {
        int coefficient;
        int exponent;
        Node next;
        public Node(int coefficient, int exponent) {
            this.coefficient = coefficient;
            this.exponent = exponent;
            this.next = null;
        }
    }
    class Polynomial {
        Node head;
    
        public Polynomial() {
            this.head = null;
        }
    
        public void insertNode(int coefficient, int exponent) {
            Node newNode = new Node(coefficient, exponent);
    
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.coefficient + "x^" + current.exponent);
                if (current.next != null) {
                    System.out.print(" + ");
                }
                current = current.next;
            }
            System.out.println();
        }
    }
    
    public class tut2 {
        public static void main(String[] args) {
            Polynomial poly = new Polynomial();
            String str="5x^0+2x^2+5x^3-7x^6";
            String output="";
        String s[]=str.split("[x^+-]+");
        for(int i=0;i<s.length;i=i+2){
            poly.insertNode(Integer.parseInt(s[i]) ,Integer.parseInt(s[i+1]));
        };
    
            poly.display();
        }
    }
