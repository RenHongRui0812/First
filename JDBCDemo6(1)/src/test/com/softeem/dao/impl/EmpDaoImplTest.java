package test.com.softeem.dao.impl;

import com.softeem.bean.Emp;
import com.softeem.dao.EmpDao;
import com.softeem.dao.impl.EmpDaoImpl;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;

/**
 * EmpDaoImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>7月 5, 2022</pre>
 */
public class EmpDaoImplTest {

    EmpDao empDao ;
    
    @Before
    public void before() throws Exception {
        empDao = new EmpDaoImpl();
    }

    /**
     * Method: findEmpDept()
     */
    @Test
    public void testFindEmpDept() throws Exception {
        List<Emp> empDept = empDao.findEmpDept();
        for (Emp emp : empDept) {
            System.out.println("emp = " + emp);
        }
    }

    /**
     * Method: login(Emp emp)
     */
    @Test
    public void testLogin() throws Exception {
//TODO: Test goes here... 
    }

  

    /**
     * Method: findAll()
     */
    @Test
    public void testFindAll() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: save(Emp emp)
     */
    @Test
    public void testSave() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: updateById(Emp emp)
     */
    @Test
    public void testUpdateById() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: deleteById(Integer id)
     */
    @Test
    public void testDeleteById() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: findById(Integer id)
     */
    @Test
    public void testFindById() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: page(Integer pageNumber)
     */
    @Test
    public void testPage() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: pageRecord()
     */
    @Test
    public void testPageRecord() throws Exception {
//TODO: Test goes here... 
    }


} 
