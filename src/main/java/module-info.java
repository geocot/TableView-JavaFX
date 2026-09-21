module net.professeurcot.demotableviewplanetes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens net.professeurcot.demotableviewplanetes to javafx.fxml;
    exports net.professeurcot.demotableviewplanetes;
}