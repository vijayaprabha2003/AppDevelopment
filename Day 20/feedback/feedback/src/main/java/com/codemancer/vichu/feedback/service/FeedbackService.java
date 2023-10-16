package com.codemancer.vichu.feedback.service;

import java.util.List;

import com.codemancer.vichu.feedback.dto.request.FeedbackRequest;
import com.codemancer.vichu.feedback.dto.response.FeedbackResponse;

public interface FeedbackService {

    boolean saveFeedback(FeedbackRequest request);

    List<FeedbackResponse> getFeedbacks();

}
