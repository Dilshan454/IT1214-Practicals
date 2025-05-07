class Paper{
    int length,width;
    String text;
}

class Document{
    String name;
    //Paper p;
    Paper p= new Paper();

    public static void main(String[] args){
        Document d=new Document();
        System.out.println("createda document object d");
        d.name="My first Document";
        System.out.println("Name of the Document d is "+d.name);
        

      // d.p = new Paper();

        //d.p.text="This is the text in the paper of document My first document";
        d.p.width=15;
        d.p.length=20;
		System.out.println("Size (l*w) of the paper of the document d is "+d.p.length+" * "+d.p.width);
		
		Document d2=new Document();
		System.out.println("Crated a Document object d2");
		d2.name="My second Document";
		System.out.println("Name of the Document d2 is "+d2.name);

    }
}