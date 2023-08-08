package product.repository.impl;

import org.springframework.stereotype.Repository;
import product.model.Branch;
import product.repository.BranchRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class BranchRepositoryImpl implements BranchRepository {
    public static Map<Integer,Branch> branchMap;
    static {
        branchMap = new HashMap<>();
        branchMap.put(1,new Branch(1,"Iphone"));
        branchMap.put(2,new Branch(2,"Samsung"));
        branchMap.put(3,new Branch(3,"Xiaomi"));
        branchMap.put(4,new Branch(4,"Huawei"));
    }
    @Override
    public boolean create(Branch branch) {
        if(branchMap.containsKey(branch.getBranchID())){
            return false;
        }
        branchMap.put(branch.getBranchID(),branch);
        return false;
    }

    @Override
    public boolean update(Branch branch) {
        if(branchMap.containsKey(branch.getBranchID())) {
            branchMap.put(branch.getBranchID(),branch);
            return true;
        }
        return false;
    }

    @Override
    public Branch findById(int id) {
        return branchMap.get(id);
    }

    @Override
    public List<Branch> findAll() {
        return new ArrayList<>(branchMap.values());
    }

    @Override
    public boolean deleteById(int id) {
        if(branchMap.containsKey(id)){
            branchMap.remove(id);
            return true;
        }
        return false;
    }
}
