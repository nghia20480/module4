package product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product.model.Branch;
import product.repository.BranchRepository;

import java.util.List;
@Service
public class BranchService implements product.service.BranchService {
    @Autowired
    BranchRepository branchRepository;
    @Override
    public boolean create(Branch branch) {
        return branchRepository.create(branch);
    }

    @Override
    public boolean update(Branch branch) {
        return branchRepository.update(branch);
    }

    @Override
    public Branch findById(int id) {
        return branchRepository.findById(id);
    }

    @Override
    public List<Branch> findAll() {
        return branchRepository.findAll();
    }

    @Override
    public boolean deleteById(int id) {
        return branchRepository.deleteById(id);
    }
}
