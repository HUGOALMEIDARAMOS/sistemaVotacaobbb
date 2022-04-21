package com.votacao.votacaobbbapi.repository;

import com.votacao.votacaobbbapi.model.ParametroModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParametroRepository extends MongoRepository<ParametroModel, String> {
}
