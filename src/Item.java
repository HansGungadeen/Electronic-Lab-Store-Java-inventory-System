
public class Item 
{
	
	private int quantity,contact;
	private String name,itemid,description,category,supplierName;
	private double price;
	
	
	public Item(int quantity,int contact,String name,String itemid,String description,String category,String supplierName,double price) 
	{
		super();
		this.quantity = quantity;
		this.contact = contact;
		this.name = name;
		this.itemid = itemid;
		this.description = description;
		this.category = category;
		this.supplierName = supplierName;
		this.price = price;
	}
	
	
	public int getQuantity() {
		return quantity;
	}


	public int getContact() {
		return contact;
	}


	public String getName() {
		return name;
	}

	public String getItemid() {
		return itemid;
	}

	public String getDescription() {
		return description;
	}


	public String getCategory() {
		return category;
	}

	public String getSupplierName() {
		return supplierName;
	}


	public double getPrice() {
		return price;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public void setContact(int contact) {
		this.contact = contact;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setItemid(String itemid) {
		this.itemid = itemid;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return (this.itemid + " " + this.name + " " + this.description+" "+this.category+" "+this.supplierName+" "+this.contact+" "+this.price+" "+this.quantity+" ");
	}
	
	

}

