package com.example.camelproblemdemo.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

  @Override
  public void configure() {
//    from("file://d:/tmp-data/?fileName=test&noop=true")
//      .setHeader("val1", constant(1))
//      .setHeader("val2", constant("yo"))
//      .to("sql:insert into tmp (col1, col2) values (:#val1, :#val2)?dataSource=#dataSource")
//    ;

    from("file://d:/tmp-data/?fileName=test&noop=true")
      .setHeader("val1", constant(1))
      .setHeader("val2", constant("yo"))
      .setHeader("insertSql", constant("insert into tmp (col1, col2) values (:#val1, :#val2)"))
      .toD("sql:${header.insertSql}?dataSource=#dataSource")
    ;
  }
}
