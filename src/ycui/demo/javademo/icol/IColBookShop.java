package ycui.demo.javademo.icol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Book{
	public String getName();
	public double getPrice();
	public String getInfo();
}

class ComputerBook implements Book{
	private String name;
	private double price;
	private String info;
	
	public ComputerBook(String name, double price, String info) {
		this.setName(name);
		this.setPrice(price);
		this.setInfo(info);
	}

	public void setName(String name){
		this.name = name;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setInfo(String info){
		this.info = info;
	}
	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public String getInfo() {
		return this.info;
	}
	
	public String toString(){
		return "Computer book: " + this.getName() + " price: " + this.getPrice() + " Context: " + this.getInfo();
	}
	
}

class Magazine implements Book{
	private String name;
	private double price;
	private String info;
	
	public Magazine(String name, double price, String info) {
		this.setName(name);
		this.setPrice(price);
		this.setInfo(info);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public void setInfo(String info){
		this.info = info;
	}
	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public String getInfo() {
		return this.info;
	}
	
	public String toString(){
		return "Magazine: " + this.getName() + " price: " + this.getPrice() + " Context: " + this.getInfo();
	}
	
}

class BookShop{
	private String shopName;
	private List<Book> allBooks;
	
	public BookShop(){
		this.allBooks = new ArrayList<Book>();
	}
	public BookShop(String name){
		this();
		this.setShopName(name);
	}
	
	public void setShopName(String name){
		this.shopName = name;
	}
	
	public String getShopName(){
		return this.shopName;
	}
	
	//列出所有书
	public List<Book> getAllBooks(){
		return this.allBooks;
	}
	
	//添加一本书
	public void appendBook(Book b){
		this.allBooks.add(b);
	}
	
	//删除一本书
	public void deleteBook(Book b){
		this.allBooks.remove(b);
	}
	
	//根据书名查询
	public Book findBookByName(String bookName){
		Book b = null;
		Iterator<Book> iter = this.allBooks.iterator();
		while(iter.hasNext()){
			Book temp = iter.next();
			if((bookName).equals(temp.getName())){
				b = temp;
				break;
			}
		}
		return b;
	}
	
	//根据索引查询
	public List<Book> findBooksByIndex(String index){
		List<Book> list = new ArrayList<Book>();
		Iterator<Book> iter = this.allBooks.iterator();
		while(iter.hasNext()){
			Book b = (Book) iter.next();
			if(b.getName().indexOf(index) != -1){
				list.add(b);
			}
		}
		return list;
	}
	
}
public class IColBookShop {

	public static void main(String[] args) {

		Book b1 = new ComputerBook("JAVA",10.0d,"Java tech");
		Book b2 = new ComputerBook("C++",20.0d,"C++ tech");
		Book b3 = new ComputerBook("Ubuntu",15.5d,"Linux tech");
		Book m1 = new Magazine("Auto",5.5d,"Automobile");
		Book m2 = new Magazine("Mode",3.65d,"Dress");
		
		BookShop bs = new BookShop("Our Lib");
		
		bs.appendBook(b1);
		bs.appendBook(b2);
		bs.appendBook(b3);
		bs.appendBook(m1);
		bs.appendBook(m2);
		
		System.out.println("------------------All books in book shop-------------------");
		showList(bs.getAllBooks());
		System.out.println("----------------------Find a book C++----------------------");
		System.out.println(bs.findBookByName("C++"));	
		System.out.println("-----------------Find all books index of A-----------------");
		showList(bs.findBooksByIndex("A"));
		System.out.println("---------------------Delete magazine Mode------------------");
		bs.deleteBook(m2);
		showList(bs.getAllBooks());
		
	}
	
	public static void showList(List<Book> l){
		Iterator<Book> iter = l.iterator();
		while(iter.hasNext()){
			System.out.println((Book)iter.next());
		}
	}

}
