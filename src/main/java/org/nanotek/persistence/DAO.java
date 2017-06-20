package org.nanotek.persistence;

import java.util.List;
import java.util.Map;

import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaUpdate;

import org.nanotek.Base;

public interface DAO <T extends Base<?>> {
	
	public void setBaseClass(Class<T> baseClass);
	
	public void clear();

	
	public boolean contains(T entity);


	
	public Query createNamedQuery(String name);

	
	public StoredProcedureQuery createNamedStoredProcedureQuery(String name);

	
	public Query createNativeQuery(String sqlString);

	
	public Query createNativeQuery(String sqlString,  Class<T> resultClass);

	
	public Query createNativeQuery(String sqlString, String resultSetMapping);

	
	public Query createQuery(String qlString);

	
//	public <T> TypedQuery<T> createQuery(CriteriaQuery<T> criteriaQuery);

	
	public Query createQuery(CriteriaUpdate<T> updateQuery);

	
	public Query createQuery(CriteriaDelete<T> deleteQuery);

	
//	public <T> TypedQuery<T> createQuery(String qlString, Class<T> resultClass);

	
	public StoredProcedureQuery createStoredProcedureQuery(String procedureName, String... resultSetMappings);

	
	public void detach(T entity);

	
	public T find(Object primaryKey);
//	public <T> T find(Class<T> entityClass, Object primaryKey);



	public T find(Object primaryKey, Map<String, Object> properties);

//	public <T> T find(Class<T> entityClass, Object primaryKey,
//			Map<String, Object> properties);

//	
//	public <T> T find(Class<T> entityClass, Object primaryKey,
//			LockModeType lockMode);

//	
//	public <T> T find(Class<T> entityClass, Object primaryKey,
//			LockModeType lockMode, Map<String, Object> properties);

	
	public void flush();

	
	public T merge(T entity);

	
	public void persist(T entity);

	
	public void refresh(T entity);

	
	public void refresh(Map<String, Object> properties);

	
//	public void refresh(Object entity, LockModeType lockMode);
//
//	
//	public void refresh(Object entity, LockModeType lockMode,
//			Map<String, Object> properties);

	public void remove(T entity);
	
	
	/**
	 * 
	 * @return
	 */
	
	public Long countRecords();
	public List<T> loadAll(); 
	public List<T> listRecords(Integer firstResult , Integer maxResults);
	
}