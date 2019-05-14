package project01.services.creators;

import project01.model.insurances.info.ClientInfo;

import static project01.services.InfoBase.*;

public class ClientInfoCreator {

    public ClientInfo createClientInfo(){
        return new ClientInfo(generate(CLIENT_NAME),
                              generate(CLIENT_SURNAME),
                              generate(CLIENT_BIRTH_DATE),
                              generate(CLIENT_ADDRESS),
                              generate(CLIENT_PHONE_NUMBER));
    }
}
