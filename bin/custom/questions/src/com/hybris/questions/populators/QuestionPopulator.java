package com.hybris.questions.populators;

import com.hybris.questions.model.QuestionModel;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.springframework.stereotype.Component;
import questions.data.QuestionData;

@Component
public class QuestionPopulator implements Populator<QuestionModel, QuestionData> {
    @Override
    public void populate(QuestionModel questionModel, QuestionData questionData) throws ConversionException {
        questionData.setCode(questionModel.getCode());
        questionData.setQuestion(questionModel.getQuestion());
        questionData.setQuestionCustomer(questionModel.getQuestionCustomer().getUid());
        questionData.setAnswer(questionModel.getAnswer());
        if (questionModel.getQuestion() != null) {
            questionData.setAnswerCustomer(questionModel.getAnswerCustomer().getUid());
        }
    }
}
