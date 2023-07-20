module br.com.wizardfx.wizardjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens br.com.wizardfx to javafx.fxml;
    exports br.com.wizardfx;

    opens br.com.layout to javafx.fxml;
    exports br.com.layout;
    exports br.com.layout.propriedades;
    opens br.com.layout.propriedades to javafx.fxml;
    exports br.com.layout.testes;
    opens br.com.layout.testes to javafx.fxml;

}