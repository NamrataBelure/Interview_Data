package interview.java.ass.set;

public class price {
private String item;
private int price;

@Override
public String toString() {
	return "price [item=" + item + ", price=" + price + "]";
}

public price(String item, int price) {
	super();
	this.item = item;
	this.price = price;
}

public String getItem() {
	return item;
}

public void setItem(String item) {
	this.item = item;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int hashcode(){
	System.out.println("In Hashcode:");
	int hashcode=0;
	hashcode=price*40;
	hashcode+=item.hashCode();
	return hashcode;
}

public boolean equals(Object obj){
    System.out.println("In equals");
    if (obj instanceof price) {
        price pp = (price) obj;
        return (pp.item.equals(this.item) && pp.price == this.price);
    } else {
        return false;
    }
}
}
