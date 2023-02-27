package test.com.softeem.dao.impl;

import com.softeem.bean.Dept;
import com.softeem.dao.DeptDao;
import com.softeem.dao.impl.DeptDaoImpl;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.List;

/**
 * DeptDaoImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>7月 5, 2022</pre>
 */
public class DeptDaoImplTest {

    DeptDao deptDao;

    @Before
    public void before() throws Exception {
        deptDao = new DeptDaoImpl();
    }


    /**
     * Method: findAll()
     */
    @Test
    public void testFindAll() throws Exception {
        List<Dept> all = deptDao.findAll();
        for (Dept dept : all) {
            System.out.println("dept = " + dept);
        }
    }

    /**
     * Method: save(Dept dept)
     */
    @Test
    public void testSave() throws Exception {

        Dept dept = new Dept();
        dept.setName("测试部");
        deptDao.save(dept);
    }

    /**
     * Method: updateById(Dept dept)
     */
    @Test
    public void testUpdateById() throws Exception {

        Dept dept = new Dept();
        dept.setId(5);
        dept.setName("烟酒部");
        deptDao.updateById(dept);
    }

    /**
     * Method: deleteById(Integer id)
     */
    @Test
    public void testDeleteById() throws Exception {

    }

    /**
     * Method: findById(Integer id)
     */
    @Test
    public void testFindById() throws Exception {

    }

    /**
     * Method: page(Integer pageNumber)
     */
    @Test
    public void testPage() throws Exception {

    }

    /**
     * Method: pageRecord()
     */
    @Test
    public void testPageRecord() throws Exception {

        Integer record = deptDao.pageRecord();
        System.out.println("record = " + record);
    }


} 
