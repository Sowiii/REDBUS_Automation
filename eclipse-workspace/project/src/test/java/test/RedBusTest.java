package test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.DateSelectionPage;
import pages.PassengerDetailsPage;
import pages.PaymentPage;
import pages.PlaceSelectionPage;
import pages.QrCodePage;
import pages.SearchResultPage;
import pages.SeatSelectionPage;

public class RedBusTest extends BaseClass {
	
	 @BeforeMethod
	    public void start() {
	        setup();
	    }

    @Test
    public void bookingFlow() throws InterruptedException, IOException {
    	PlaceSelectionPage placePage = new PlaceSelectionPage(driver);
    	DateSelectionPage datePage = new DateSelectionPage(driver);
        SearchResultPage resultsPage = new SearchResultPage(driver);
        SeatSelectionPage seatPage = new SeatSelectionPage(driver);
        PassengerDetailsPage passengerPage =new PassengerDetailsPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        QrCodePage qrCodePage = new QrCodePage(driver);

    	placePage.selectFromPlace("Bangalore");
    	placePage.selectToPlace("Thrissur");
    	datePage.selectDateAndSearch();
        resultsPage.selectAcFilter();
        resultsPage.selectSleeperFilter();
        resultsPage.openSeatsForBus();

        seatPage.selectSeat();
        seatPage.openBoardingAndDroppingPoints();
        seatPage.selectBoardingPoint();
        seatPage.selectDroppingPoint();

        // Replace these with authorized test data.
        passengerPage.enterPassengerDetails(
            "8943520568",
            "sowinsojan04@gmail.com",
            "Sowin",
            "22"
        );
        passengerPage.rejectInsuranceAndContinue();
        paymentPage.verifyPaymentDetailsPage();
        paymentPage.selectPayViaUPI();
        qrCodePage.verifyQrCodeAndTakeScreenshot();
        
    }
    
    @AfterMethod
    public void close(){
        tearDown();
    }
}