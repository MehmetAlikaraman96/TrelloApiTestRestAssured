package Test;

import Base.BasePage;
import Base.BaseTest;
import org.junit.Test;

public class TrelloApiTest extends BaseTest {
    BasePage basePage = new BasePage();

    @Test
    public void trelloApiTest(){
        //basePage.createBoard("OrnekBoard");

        //basePage.deleteBoard("5eb71931b9bb326e95e09d53"); -Daha önce oluşturulan board silinmiştir-//

        basePage.getBoards();
}}
