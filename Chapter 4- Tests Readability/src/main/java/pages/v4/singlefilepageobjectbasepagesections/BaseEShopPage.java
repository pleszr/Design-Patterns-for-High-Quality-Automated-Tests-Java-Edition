package pages.v4.singlefilepageobjectbasepagesections;

import core.Driver;
import pages.v3.singlefilepageobjectssections.CartInfoSection;
import pages.v3.singlefilepageobjectssections.MainMenuSection;
import pages.v3.singlefilepageobjectssections.SearchSection;

public abstract class BaseEShopPage {
    protected final Driver driver;

    public BaseEShopPage(Driver driver) {
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

    protected abstract String getUrl();

    public void open()
    {
        driver.goToUrl(getUrl());
    }
}
