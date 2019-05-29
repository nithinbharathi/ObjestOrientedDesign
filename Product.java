class Product{
	private String name;
	private BigDecimal price;
	private boolean isImported;
	private String type;
	public Product(String name,BigDecimal price,String type) {
		this.name = name;
		this.price = price;
		this.isImported = isImported(name);
		this.type = type;
	}

	private boolean isImported(String imported){
        return (imported.indexOf("imported") >= 0) ? true : false;
    }
	public String getName() {
		return name;
	}
	
	public String getType() {
		return this.type;
	}
	public BigDecimal getPrice() {
		return price;
	}
	

	public boolean getisImported() {
		return isImported;
	}

}
