class cart{
	HashMap<Product,BigDecimal>products;
	HashMap<Product,BigDecimal>taxes;
	private BigDecimal sub_total;
	private BigDecimal tax_total;
	public cart() {
		products = new HashMap<>();
		taxes = new HashMap<>();
		sub_total = new BigDecimal(0.0);
		tax_total = new BigDecimal(0.0);
	}
	public void add(Product p,calculator c,BigDecimal quantity) {
		BigDecimal tax = c.calc_tax(p);
		BigDecimal price = p.getPrice();
		sub_total = sub_total.add(price.multiply(quantity));
		tax_total = tax_total.add(tax);
		products.put(p,quantity);
		taxes.put(p,tax);
	}
	public void print() {
		Set<Product>set = products.keySet();
		for(Product each_product:set) {
			System.out.print(each_product.getName()+"\t");
			System.out.println(products.get(each_product)+"\t\tOriginal Price\t\t"+each_product.getPrice());
		}
		System.out.println("\n");
		System.out.printf("\nSubTotal\t\t %.2f",sub_total);
		System.out.printf("\nSalesTax\t\t %.2f",tax_total);
		System.out.printf("\nTotal Amount\t\t %.2f",total());

	} 
	public BigDecimal total() {
		return tax_total.add(sub_total);
	}
	
	
}
