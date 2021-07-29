package negocio;

import dao.TestDao;

public class TestABM {
    private static TestABM instancia;	
	private TestDao dao = TestDao.getInstancia();
		
	public static TestABM getInstancia() {
		if(instancia == null) {
			instancia = new TestABM();
		}
		return instancia;
	}    
}

