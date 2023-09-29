package ua.page.object.selenium;

public interface HeaderLogic {
    default HeaderLogic iCheckingNumberOnCartIcon(String num) {
        return this;
    }
}
