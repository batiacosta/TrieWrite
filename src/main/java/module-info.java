module com.example.triewrite {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;
    requires org.fxmisc.richtext;


    opens com.example.triewrite to javafx.fxml;
    exports com.example.triewrite;
    exports triewrite to javafx.graphics;

}
