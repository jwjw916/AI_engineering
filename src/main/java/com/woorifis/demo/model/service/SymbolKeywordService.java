package com.woorifis.demo.model.service;

import com.woorifis.demo.model.entity.SymbolDetail;
import com.woorifis.demo.model.entity.SymbolKeyword;
import com.woorifis.demo.model.repository.SymbolDetailRepository;
import com.woorifis.demo.model.repository.SymbolKeywordRepository;
import com.woorifis.demo.model.repository.SymbolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SymbolKeywordService {
    private final SymbolKeywordRepository symbolKeywordRepository;

    
    public List<SymbolDetail> searchSymbol(String keyword){
        List<SymbolKeyword> searchResults_ = symbolKeywordRepository.findByKeywordContaining(keyword);
        List<SymbolDetail> searchResults = new ArrayList<>();
        for(SymbolKeyword sk : searchResults_){
            searchResults.add(sk.getSymid());
        }
        return searchResults;
    }
}
