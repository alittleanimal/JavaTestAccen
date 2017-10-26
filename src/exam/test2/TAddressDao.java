package exam.test2;

public class TAddressDao extends BaseDao<BaseEntity> {

	@Override
	public void save(BaseEntity t) {

	}

	@Override
	public BaseEntity getById(long id) {
		return null;
	}
	
	public static void main(String[] args) {
		TAddressDao tAddressDao = new TAddressDao();
		TUser tUser = new TUser();
		tAddressDao.save(tUser);
	}

}
