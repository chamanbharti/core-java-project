package hashcode_equal;

public class Price {
	private String item;
    private int price;
    
	public Price(String item, int price) {
		super();
		this.item = item;
		this.price = price;
	}

	@Override
	public int hashCode() {
		System.out.println("In hashcode");
		/*final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + price;*/
		int hashcode = 0;
		hashcode = price * 20;
		hashcode += item.hashCode();
		
		return hashcode;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In equals");
		
		if (obj instanceof Price)
		{
			Price p = (Price) obj;
			return (p.item.equals(this.item) && p.price == this.price);
		}else{
			return false;
		}
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
    

}
