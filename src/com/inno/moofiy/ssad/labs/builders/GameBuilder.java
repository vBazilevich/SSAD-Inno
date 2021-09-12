package com.inno.moofiy.ssad.labs.builders;

public interface GameBuilder {
    GameBuilder title(String data);

    GameBuilder publisher(String data);

    GameBuilder company(String data);

    GameBuilder price(String data);

    GameBuilder date(String data);

    GameBuilder trailer(String data);

    GameBuilder discounts(String data);
}
