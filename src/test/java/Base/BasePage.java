package Base;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BasePage {
    String key="12343432432423";
    String token = "123123213213213123123123";
    public void createBoard(String boardName){
        given()
                .pathParam("key", key)
                .pathParam("token",token)
                .contentType("application/json")
                .when()
                .post("/1/boards/?name="+boardName+"&key={key}&token={token}")
                .then()
                .statusCode(200).extract().response();
    }
    public void getBoards(){
        given()
                .log().all()
                .contentType("apllication/json")
                .pathParam("key", key)
                .pathParam("token",token)
                .when()
                .get("/1/members/mehmetalikaraman/boards/?key={key}&token={token}").prettyPeek()
                .then()
                .statusCode(200).extract().response();
    }
    Response response;
    public Response getResponseBoards(){

        response=
                given()
                        .contentType("apllication/json")
                        .pathParam("key", key)
                        .pathParam("token",token)
                        .when()
                        .get("/1/members/mehmetalikaraman/boards/?key={key}&token={token}")
                        .thenReturn();
        return response;
    }
    public  void deleteBoard(String boardId) {
        given()
                .pathParam("key", key)
                .pathParam("token",token)
                .when()
                .delete("/1/boards/"+boardId+"?key={key}&token={token}" ).prettyPeek()
                .then()
                .statusCode(200).extract().response();}
}
