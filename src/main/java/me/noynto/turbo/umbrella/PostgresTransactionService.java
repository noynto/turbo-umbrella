package me.noynto.turbo.umbrella;

import io.helidon.http.Status;
import io.helidon.webserver.http.Handler;
import io.helidon.webserver.http.HttpRules;
import jakarta.json.JsonObject;

public record PostgresTransactionService(
        PostgresConfiguration configuration
) implements TransactionService {

    @Override
    public void routing(HttpRules rules) {
        rules.post("/", post());
    }

    private Handler post() {
        return (request, response) -> {
            JsonObject object = request.content().as(JsonObject.class);
            Description description = new Description(object.getString("description"));
            this.create(description);
            response.status(Status.CREATED_201);
            response.send();
        };
    }

    @Override
    public void create(Description description) {

    }
}
