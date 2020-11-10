package core;

public class LoggingSingletonDriver extends DriverDecorator {
    private static LoggingSingletonDriver _instance;

    public LoggingSingletonDriver(core.Driver driver) {
        super(driver);
    }

    public static LoggingSingletonDriver getInstance()
    {
        if (_instance == null)
        {
            _instance = new LoggingSingletonDriver(new WebCoreDriver());
        }

        return _instance;
    }

    @Override
    public void start(Browser browser) {
        System.out.print(String.format("start browser = %s", browser.name()));
        Driver.start(browser);
    }

    @Override
    public void quit() {
        System.out.print("close browser");
        Driver.quit();
    }

    @Override
    public void goToUrl(String url) {
        System.out.print(String.format("go to url = %s", url));
        Driver.goToUrl(url);
    }
}
