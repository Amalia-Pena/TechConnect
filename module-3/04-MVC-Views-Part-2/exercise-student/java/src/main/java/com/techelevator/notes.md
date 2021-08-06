/products  ----> gives products, productsList.jsp

/products/tiles  ----> gives products

/products/detail?id=1  ----> gives single product


Any combination of minRating, minPrice, maxPrice
/products?minRating=XXX&minPrice=XXX&maxPrice=XXX&category=XXX&sortOrder=XXX

Looks like category is required
/products?category=


Any combination of minRating, minPrice, maxPrice
/products?tiles=XXX&minPrice=XXX&maxPrice=XXX&category=XXX&sortOrder=XXX

Looks like category is required
/products/tiles?category=XXX&sortOrder=XXX


Product
	private double averageRating;
	private int categoryId;
	private String description;
	private int id;
	private String imageName;
	private String name;
	private double price;
	private int remainingStock;
	private boolean topSeller;
	private double weightInLbs;