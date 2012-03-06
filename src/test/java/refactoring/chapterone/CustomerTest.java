package refactoring.chapterone;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class CustomerTest {

    @Test
    public void should_receive_report_when_rents_a_regular_movie_for_less_than_three_days(){
        Customer tony = new Customer("Tony");
        Movie regularMovie = new Movie("Regular Movie Title", Movie.REGULAR);
        int daysRented = 1;
        Rental rental = new Rental(regularMovie, daysRented);
        tony.addRental(rental);
        
        String reportExpected = "Rental Record for Tony\n\tRegular Movie Title\t2.0\nAmount owed is 2.0\nYou earned 1 frequent renter points";
        Assert.assertThat(tony.statement(), is(reportExpected));
    }

    @Test
    public void should_receive_report_when_rents_a_regular_movie_for_more_than_two_days(){
        Customer tony = new Customer("Tony");
        Movie regularMovie = new Movie("Regular Movie Title", Movie.REGULAR);
        int dayRented = 3;
        Rental rental = new Rental(regularMovie, dayRented);
        tony.addRental(rental);

        String reportExpected = "Rental Record for Tony\n\tRegular Movie Title\t3.5\nAmount owed is 3.5\nYou earned 1 frequent renter points";
        Assert.assertThat(tony.statement(), is(reportExpected));
    }

    @Test
    public void should_receive_report_when_rents_a_children_movie_for_less_than_four_days(){
        Customer tony = new Customer("Tony");
        Movie childrensMovie = new Movie("Childrens Movie Title", Movie.CHILDRENS);
        int daysRented = 1;
        Rental rental = new Rental(childrensMovie, daysRented);
        tony.addRental(rental);

        String reportExpected = "Rental Record for Tony\n\tChildrens Movie Title\t1.5\nAmount owed is 1.5\nYou earned 1 frequent renter points";
        Assert.assertThat(tony.statement(), is(reportExpected));
    }

    @Test
    public void should_receive_report_when_rents_a_children_movie_for_more_than_three_days(){
        Customer tony = new Customer("Tony");
        Movie childrensMovie = new Movie("Childrens Movie Title", Movie.CHILDRENS);
        int daysRented = 4;
        Rental rental = new Rental(childrensMovie, daysRented);
        tony.addRental(rental);

        String reportExpected = "Rental Record for Tony\n\tChildrens Movie Title\t3.0\nAmount owed is 3.0\nYou earned 1 frequent renter points";
        Assert.assertThat(tony.statement(), is(reportExpected));
    }

    @Test
    public void should_receive_report_when_rents_a_new_release_movie_for_one_day(){
        Customer tony = new Customer("Tony");
        Movie newReleaseMovie = new Movie("New Release Movie Title", Movie.NEW_RELEASE);
        int daysRented = 1;
        Rental rental = new Rental(newReleaseMovie, daysRented);
        tony.addRental(rental);

        String reportExpected = "Rental Record for Tony\n\tNew Release Movie Title\t3.0\nAmount owed is 3.0\nYou earned 1 frequent renter points";
        Assert.assertThat(tony.statement(), is(reportExpected));
    }

    @Test
    public void should_receive_report_when_rents_a_new_release_movie_for_more_than_one_day(){
        Customer tony = new Customer("Tony");
        Movie newReleaseMovie = new Movie("New Release Movie Title", Movie.NEW_RELEASE);
        int daysRented = 2;
        Rental rental = new Rental(newReleaseMovie, daysRented);
        tony.addRental(rental);

        String reportExpected = "Rental Record for Tony\n\tNew Release Movie Title\t6.0\nAmount owed is 6.0\nYou earned 2 frequent renter points";
        Assert.assertThat(tony.statement(), is(reportExpected));
    }
}
