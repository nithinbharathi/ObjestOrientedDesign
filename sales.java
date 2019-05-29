class sales{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	cart c = new cart();
	calculator calc = new calculator();
	tax basic = new tax("basic",new BigDecimal(0.1));
	tax import_tax = new tax("import",new BigDecimal(0.2));
	calc.add("basic", basic);
	calc.add("import", import_tax);
	calc.addExcemptions("food");
	calc.addExcemptions("book");
	calc.addExcemptions("medical");
	Product p1 = new Product("pizza",new BigDecimal(100),"food");
	Product p2 = new Product("Harry Potter",new BigDecimal(200),"book");
	Product p3 = new Product("imac",new BigDecimal(500),"electronics");
	c.add(p1, calc, new BigDecimal(1));
	c.add(p2, calc, new BigDecimal(1));
	c.add(p3, calc, new BigDecimal(1));
	c.print();

	
	
	}
}
