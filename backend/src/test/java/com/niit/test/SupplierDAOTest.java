package com.niit.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.SupplierDAO;
import com.niit.backend.Product;
import com.niit.backend.Supplier;

public class SupplierDAOTest {
static SupplierDAO supplierDAO;

@BeforeClass
public static void initialize()
{
AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext();
contex.scan("com.niit");
contex.refresh();
supplierDAO=(SupplierDAO)contex.getBean("supplierDAO");

}
@Ignore
@Test
public void addSupplier() {
Supplier supplier=new Supplier();
supplier.setName("dinesh");
supplier.setDescription("mi ");
assertTrue("problem in adding Supplier",supplierDAO.addSupplier(supplier));
}
@Test
public void updateSupplier()
{
Supplier supplier=supplierDAO.getSupplier(68);
supplier.setDescription("16 gb ram");
supplier.setName("RAM");
supplier.setSupplierName("dinesh");
assertTrue("problem in updating category",supplierDAO.updateSupplier(supplier));

}
@Ignore
@Test
public void deleteSupplierTest()
{
Supplier supplier=supplierDAO.getSupplier(71);
assertTrue("problem in deleting supplier",supplierDAO.deleteSupplier(supplier));

}
@Ignore
@Test
public void listSuppliersTest()
{
List<Supplier> listSuppliers=supplierDAO.listSuppliers();
assertNotNull("problem in list supplier",supplierDAO.listSuppliers());
for(Supplier supplier:listSuppliers)
{
System.out.println("supplier ID:"+supplier.getSupplierId());
System.out.println("supplier Name:"+supplier.getName());
System.out.println("supplier Desc:"+supplier.getDescription());
}
}


}

