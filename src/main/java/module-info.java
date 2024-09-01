module net.d4y2k.jabkafx {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.logging;
	requires lombok;

    opens net.d4y2k.jabkafx to javafx.fxml;
    exports net.d4y2k.jabkafx;
}
