package com.spring.security.api.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.spring.security.api.models.UserAccountRecord;

public interface UserAccountRecordRepository extends MongoRepository<UserAccountRecord,String> {

	
	public UserAccountRecord findByUsernameIgnoreCase(String username);
	
	public UserAccountRecord findByUsername(String username);

	public List<UserAccountRecord> findByUsernameIgnoreCaseIn(String[] username);
	
	public UserAccountRecord findByUserId(String userid);
	@Query(value = "{'userId':{$in:?0}}")
	public List<UserAccountRecord> findByUserIds(List<String> userIds);

	@Query(value = "{'username':{$in:?0}}")
	public List<UserAccountRecord> findByUsernames(Set<String> usernames);
	
	public List<UserAccountRecord> findByUsernameIgnoreCaseIn(Set<String> usernames);
	
	@Query(value="{'username':{'$in':?0}}" , delete = true)
	public void deleteUserAccountRecord(Set<String> userEmail);
}
