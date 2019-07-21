package com.example.demo.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "LinkList")
public class LinkList {

    @Id
    private long id;
    private long userId;
    @Field
    private String[][] link;
    @Field
    private String http;
    @Field
    private String name;
    @Field
    private String preview;
    @Field
    private String css;
    @Field
    private String text;
    /*@Field
    private String[] images;*/


    public LinkList(long userId, String[][] link, String http, String name, String preview, String css, String text) {

        this.userId = userId;
        this.link = link;
        this.http = link[(int) userId][0];
        this.name = link[(int) userId][1];
        this.preview = link[(int) userId][2];
        this.css = link[(int) userId][3];
        this.text = link[(int) userId][4];
    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String[][] getLink() {
        return link;
    }

    public void setLink(String[][] link) {
        this.link = link;
    }

    public String getHttp() {
        return http;
    }

    public void setHttp(String http) {
        this.http = http;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

  /*  @Override
    public String toString() {
        return String.format(
                "List[id=%s, studentName='%s',
                studentAge="+studentAge+"]",
        id, studentName);
    }*/
}

/* Идея
{
  "_id" : ObjectId("592c7029aafef820f432c5f3"),
  "_class" : "com.example.demo.Entities.documents.LinkList",
   "userId" : "5",
   "link" : [
    {
      "http" : "https://spring.io/projects/spring-data-mongodb",
      "name" : "Spring Data MongoDB",
      "preview" : "Spring Data for MongoDB is part of the umbrella Spring Data project which aims to provide a familiar and consistent Spring-based programming model for new datastores while retaining store-specific features and capabilities.",
      "css" : "placehold",
      "text" : "text",

    },
    {
       "http" : "https://spring.io/projects/spring-data-mongodb",
      "name" : "Spring Data MongoDB",
      "preview" : "Spring Data for MongoDB is part of the umbrella Spring Data project which aims to provide a familiar and consistent Spring-based programming model for new datastores while retaining store-specific features and capabilities.",
      "css" : "placehold",
      "text" : "text",
    }
  ]
}
 */