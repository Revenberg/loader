package info.revenberg.loader.service;

import info.revenberg.dao.jpa.BundleRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

@Service
public class BatchService {
    @Autowired
    private BatchRepository BatchRepository;
    
    public BatchService() {    
    }

    public Long getLastReadCount() {
        return bundleRepository.getLastReadCount();
    }

}
