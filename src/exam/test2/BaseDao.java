package exam.test2;

/*public abstract class BaseDao<BaseEntity> {
	public abstract void save(BaseEntity t);
	public abstract BaseEntity getById(long id);
}*/

public abstract class BaseDao<T extends BaseEntity> {
	public abstract void save(T t);
	public abstract T getById(long id);
}