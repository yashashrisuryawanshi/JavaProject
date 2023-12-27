package day2;

import java.util.Collection;

public class CRUD_Main {
	
	private static void showOneRestaurant() {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		Restaurant rst = 	idao.getOne(3 );
		if(rst != null)
			System.out.println(rst);
		else
			System.out.println("Restaurant with this ID does not exist");
	}
	private static void showAllRestaurants() {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		Collection<Restaurant> allAvailableRestaurants  = idao.getAll();
		//allAvailableRestaurants.stream().forEach((rst) -> System.out.println(rst));
		for(Restaurant rst : allAvailableRestaurants)
			System.out.println(rst);
	}

	public static void main(String[] args) {
		//showAllRestaurants();
		showOneRestaurant();
		

	}

}
