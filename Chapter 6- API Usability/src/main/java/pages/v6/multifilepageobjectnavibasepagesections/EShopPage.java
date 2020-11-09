package pages.v6.multifilepageobjectnavibasepagesections;

import core.Driver;
import pages.v7.multifilepageobjectsectionsdriverinterfaces.Sections.CartInfoSection;
import pages.v7.multifilepageobjectsectionsdriverinterfaces.Sections.MainMenuSection;
import pages.v7.multifilepageobjectsectionsdriverinterfaces.Sections.SearchSection;

public abstract class EShopPage {
    protected final Driver driver;

    public EShopPage(Driver driver) {
        this.driver = driver;
    }

    public MainMenuSection mainMenuSection() {
        return new MainMenuSection(driver);
    }

    public CartInfoSection cartInfoSection() {
        return new CartInfoSection(driver);
    }

    public SearchSection searchSection() {
        return new SearchSection(driver);
    }
}
