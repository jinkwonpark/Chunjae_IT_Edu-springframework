package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.TestVO;
import kr.ed.haebeop.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public List<TestVO> testList() throws Exception {
        return testRepository.testList();
    }

    @Override
    public TestVO getTest(int num) throws Exception {
        return testRepository.getTest(num);
    }

    @Override
    public void testInsert(TestVO test) throws Exception {
        testRepository.testInsert(test);
    }
}
