package HealthcarePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage {
    WebDriver driver;

    @FindBy(id = "combo_facility")
    WebElement facilitySelect;

    @FindBy(name = "hospital_readmission")
    WebElement chkReadmission;

    @FindBy(id = "radio_program_medicare")
    WebElement radioProgramMedicare;

    @FindBy(id = "radio_program_medicaid")
    WebElement radioProgramMedicaid;

    @FindBy(id = "radio_program_medicare")
    WebElement radioProgramNone;

    @FindBy(id = "txt_visit_date")
    WebElement inpVisitDate;

    @FindBy(id = "txt_comment")
    WebElement inpComment;

    @FindBy(id = "btn-book-appointment")
    WebElement btnAppointment;



    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void SelectFacility() {
        Select facility = new Select(facilitySelect);
        facility.selectByValue("Seoul CURA Healthcare Center");
    }

    public void ClickReadmissionCheckBox() {
        chkReadmission.click();

    }
    public void ClickRadioProgramMedicare() {
        radioProgramMedicare.click();

    }
    public void ClickRadioProgramMedicaid() {
        radioProgramMedicaid.click();

    }
    public void ClickRadioProgramNone() {
        radioProgramNone.click();

    }
    public void EnterVisitDate() {
        inpVisitDate.clear();
        inpVisitDate.sendKeys("01/12/2022");

    }

    public void EnterComment() {
        inpComment.clear();
        inpComment.sendKeys("This is simple comment.");

    }
    public void ClickBtnAppointment() {
        btnAppointment.click();
    }


}
