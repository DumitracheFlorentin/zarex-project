package Order;

import Services.generateID;

public class Order implements generateID {
    private String id;
    private String restaurantID;
    private String clientUsername;
    private Cart cart;

    public Order( String restaurantID, String clientUsername, Cart cart) {
        this.id = generateID.genID();
        this.restaurantID = restaurantID;
        this.clientUsername = clientUsername;
        this.cart = cart;
    }

    public Order(){}

    public String getId() {
        return id;
    }

    public String getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getClientUsername() {
        return clientUsername;
    }

    public void setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID-Restaurant ='" + restaurantID + '\'' +
                ", Client-Username = '" + clientUsername + '\'' +
                ", Cart = '" + cart.getProducts() + '\'' +
                '}';
    }
}
