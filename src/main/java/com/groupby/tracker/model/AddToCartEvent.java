
package com.groupby.tracker.model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * addToCart event component
 * <p>
 * The event data for an addToCart event.
 * 
 */
public class AddToCartEvent implements Parcelable
{

    /**
     * cart component
     * <p>
     * Contains data about the cart in an event involving interacting with a cart.
     * (Required)
     * 
     */
    @SerializedName("cart")
    @Expose
    private Cart cart;
    /**
     * Google attribution token
     * <p>
     * The Google attribution token as described in Google Cloud Platform's documentation for Cloud Retail Solutions (https://cloud.google.com/retail/docs/attribution-tokens). Instructions for implementing this are evolving over time. If you use GroupBy's Google-powered platform, reach out to your Customer Success rep to find out whether you need to implement this property and if so, how you should do it.Because Google decides what these values are, we don't know the max length. We're using 100 right now just to protect our system and we can increase or decrease it in the future if we need to without it being a breaking change because customers are instructed to use the token value as is.
     * 
     */
    @SerializedName("googleAttributionToken")
    @Expose
    private String googleAttributionToken;
    public final static Creator<AddToCartEvent> CREATOR = new Creator<AddToCartEvent>() {


        @SuppressWarnings({
            "unchecked"
        })
        public AddToCartEvent createFromParcel(android.os.Parcel in) {
            return new AddToCartEvent(in);
        }

        public AddToCartEvent[] newArray(int size) {
            return (new AddToCartEvent[size]);
        }

    }
    ;

    protected AddToCartEvent(android.os.Parcel in) {
        this.cart = ((Cart) in.readValue((Cart.class.getClassLoader())));
        this.googleAttributionToken = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public AddToCartEvent() {
    }

    /**
     * 
     * @param googleAttributionToken
     * @param cart
     */
    public AddToCartEvent(Cart cart, String googleAttributionToken) {
        super();
        this.cart = cart;
        this.googleAttributionToken = googleAttributionToken;
    }

    /**
     * cart component
     * <p>
     * Contains data about the cart in an event involving interacting with a cart.
     * (Required)
     * 
     */
    public Cart getCart() {
        return cart;
    }

    /**
     * cart component
     * <p>
     * Contains data about the cart in an event involving interacting with a cart.
     * (Required)
     * 
     */
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    /**
     * Google attribution token
     * <p>
     * The Google attribution token as described in Google Cloud Platform's documentation for Cloud Retail Solutions (https://cloud.google.com/retail/docs/attribution-tokens). Instructions for implementing this are evolving over time. If you use GroupBy's Google-powered platform, reach out to your Customer Success rep to find out whether you need to implement this property and if so, how you should do it.Because Google decides what these values are, we don't know the max length. We're using 100 right now just to protect our system and we can increase or decrease it in the future if we need to without it being a breaking change because customers are instructed to use the token value as is.
     * 
     */
    public String getGoogleAttributionToken() {
        return googleAttributionToken;
    }

    /**
     * Google attribution token
     * <p>
     * The Google attribution token as described in Google Cloud Platform's documentation for Cloud Retail Solutions (https://cloud.google.com/retail/docs/attribution-tokens). Instructions for implementing this are evolving over time. If you use GroupBy's Google-powered platform, reach out to your Customer Success rep to find out whether you need to implement this property and if so, how you should do it.Because Google decides what these values are, we don't know the max length. We're using 100 right now just to protect our system and we can increase or decrease it in the future if we need to without it being a breaking change because customers are instructed to use the token value as is.
     * 
     */
    public void setGoogleAttributionToken(String googleAttributionToken) {
        this.googleAttributionToken = googleAttributionToken;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddToCartEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cart");
        sb.append('=');
        sb.append(((this.cart == null)?"<null>":this.cart));
        sb.append(',');
        sb.append("googleAttributionToken");
        sb.append('=');
        sb.append(((this.googleAttributionToken == null)?"<null>":this.googleAttributionToken));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.googleAttributionToken == null)? 0 :this.googleAttributionToken.hashCode()));
        result = ((result* 31)+((this.cart == null)? 0 :this.cart.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddToCartEvent) == false) {
            return false;
        }
        AddToCartEvent rhs = ((AddToCartEvent) other);
        return (((this.googleAttributionToken == rhs.googleAttributionToken)||((this.googleAttributionToken!= null)&&this.googleAttributionToken.equals(rhs.googleAttributionToken)))&&((this.cart == rhs.cart)||((this.cart!= null)&&this.cart.equals(rhs.cart))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(cart);
        dest.writeValue(googleAttributionToken);
    }

    public int describeContents() {
        return  0;
    }

}
