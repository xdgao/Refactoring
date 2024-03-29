package com.thoughtworks.refactoring.chapterone;

public abstract class Price {

    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int dayRented) {
        // add bonus for a two day new release rental
        if ((getPriceCode() == Movie.NEW_RELEASE) && dayRented > 1)
            return 2;
        return 1;
    }
}
