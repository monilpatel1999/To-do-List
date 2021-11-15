module com.example.patelcop3330assignment4part2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens com.example.patelcop3330assignment4part2 to javafx.fxml;
    exports com.example.patelcop3330assignment4part2;
}