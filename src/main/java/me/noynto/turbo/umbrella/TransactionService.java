package me.noynto.turbo.umbrella;

import io.helidon.webserver.http.HttpService;

/**
 * <b>Application Programming Interface</b>
 * <p>Interface permettant de travailler avec des transactions.</p>
 */
public interface TransactionService extends HttpService {

    /**
     * <p>Créer une transaction à partir d'une description.</p>
     *
     * @param description la description
     */
    void create(Description description);

}
