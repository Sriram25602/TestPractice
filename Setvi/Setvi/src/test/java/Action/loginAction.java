package Action;

import Page.LoginPage;
//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class loginAction extends LoginPage{

    public static void main(String[] args){

        LoginPage login = new LoginPage();
        login.tutorial();
        login.editFile("PresentationOne");
        login.editFile(121216);
        login.file();
        login.file2();
    }
}



