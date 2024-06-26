package com.itwill.gaebokchi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itwill.gaebokchi.dto.expertUserCreateDto;
import com.itwill.gaebokchi.dto.normalUserCreateDto;
import com.itwill.gaebokchi.repository.User;
import com.itwill.gaebokchi.repository.UserDao;
import com.itwill.gaebokchi.dto.UserSignInDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserDao userDao;

	public boolean checkUserid(String userid) {

		User user = userDao.selectByUserid(userid);
		if (user == null) {
			return true;
		} else {
			return false;
		}
	}

	public void nomalUserCreate(normalUserCreateDto dto) {
		User user = dto.toEntity();
		userDao.insertNormalUser(user);

	}
@Transactional
	public void expertUserCreate(expertUserCreateDto dto) throws Exception {
		User user = dto.toEntity();
		try {
            userDao.insertPros(user.getLicense());
            userDao.insertExpertUser(user);
        } catch (Exception e) {
            throw new Exception("Failed to insert into pros table", e);
        }
       
    }

	public User read(UserSignInDto dto) {

		User user = userDao.selectByUseridAndPassword(dto.toEntity());

		return user;
	}

}
