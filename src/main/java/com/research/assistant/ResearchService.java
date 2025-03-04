package com.research.assistant;

import org.springframework.stereotype.Service;

@Service
public class ResearchService {
    public String processContent(ResearchRequest request) {


        String prompt=buildPrompt(request);


        return null;
    }
    private String buildPrompt(ResearchRequest request){
        StringBuilder prompt=new StringBuilder();
        switch (request.getOperation()
        ){
            case "Summarize":
                prompt.append("");
                break;

            case "suggest":
                prompt.append("");
                break;
            default:
                throw new IllegalArgumentException("unknown operation"+request.getOperation());

        }
        prompt.append(request.getOperation());
        return prompt.toString();
    }
}
