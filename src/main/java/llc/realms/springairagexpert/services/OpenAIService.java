package llc.realms.springairagexpert.services;

import guru.springframework.springairag.model.Answer;
import guru.springframework.springairag.model.Question;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface OpenAIService {

    Answer getAnswer(Question question);
}
