package com.korit.crud.repository.implement;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.korit.crud.CrudApplication;
import com.korit.crud.entity.BoardEntity;
import com.korit.crud.entity.UserEntity;
import com.korit.crud.repository.BoardRepository;
import com.korit.crud.repository.UserRepository;

public class BoardRepositoryImplement implements BoardRepository{

	private final Connection connection;
	private final UserRepository userRepository;

    public BoardRepositoryImplement(Connection connection, UserRepository userRepository) {
        this.connection = connection;
        this.userRepository = userRepository;
    }
	
	@Override
	public void savePost(BoardEntity boardEntity, String nickname) {
		final String SQL = "INSERT INTO board (name, content, nickname, date) VALUES (?, ?, ?, CURDATE())";
		
		try {
						
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, boardEntity.getName());
			preparedStatement.setString(2, boardEntity.getContent());
			preparedStatement.setString(3, nickname);
			
			preparedStatement.executeUpdate(); 
		}catch(Exception exception){
			exception.printStackTrace();
		}
		
	}

	@Override
	public void viewPostAll() {
	    final String SQL = "SELECT id, name, nickname, date FROM board ORDER BY id DESC";
	    
	    try {
	        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
	        
	        ResultSet resultSet = preparedStatement.executeQuery();
	        
	        // 헤더 출력 (옵션)
	        System.out.println("게시물 번호 / 게시물 제목 / 작성자 닉네임 / 작성일");
	        
	        // ResultSet에서 각 행을 순차적으로 처리
	        while (resultSet.next()) {
	            int id = resultSet.getInt("id"); // 게시물 번호
	            String name = resultSet.getString("name"); // 게시물 제목
	            String nickname = resultSet.getString("nickname"); // 작성자 닉네임
	            Date date = resultSet.getDate("date"); // 작성일
	            
	            // 형식에 맞게 출력
	            System.out.println(id + " / " + name + " / " + nickname + " / " + date);
	        }
	        
	    } catch (Exception exception) {
	        exception.printStackTrace();
	    }
	}


	@Override
	public void viewPostDetail(int postNum) {
		final String SQL = "SELECT name, nickname, date, content FROM board WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, postNum);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				System.out.println("제목 : " + resultSet.getString(1)); 
				System.out.println("작성자 닉네임 : " + resultSet.getString(2));
				System.out.println("작성일 : " + resultSet.getString(3));
				System.out.println("내용 : " + resultSet.getString(4));
			}else {
	            System.out.println("해당 게시물이 존재하지 않습니다.");
	        }
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		
	}

	@Override
	public boolean ExistByPostNum(int postNum) {
		final String SQL = "SELECT nickname FROM board WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, postNum);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				
				return true;
			}
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		return false;
	}

	@Override
	public void updatePost(BoardEntity boardEntity, int postNum) {
		final String SQL = "UPDATE board SET name = ?, content = ? WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, boardEntity.getName());
			preparedStatement.setString(2, boardEntity.getContent());
			preparedStatement.setInt(3, postNum);
			
			preparedStatement.executeUpdate(); 
		}catch(Exception exception) {
			exception.printStackTrace();
		}
	}

	// 삭제 요청이 왔을 때 로그인한 유저와 삭제하려는 게시물을 작성한 유저의 닉네임이 같은지 비교
	@Override
	public boolean EqualByPostNum(int postNum, String id) {
		// 로그인 되어있는 유저의 id를 이용하여 닉네임 찾아냄 
		UserEntity userEntity = userRepository.findById(id);
		String userNickname = userEntity.getNickname();
		
		// 삭제하려는 게시물을 작성한 유저의 닉네임 찾기
		final String SQL = "SELECT nickname FROM board WHERE id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, postNum);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				String selectNickname = resultSet.getString(1);
				if(userNickname.equals(selectNickname)) {
					return true;
				}
			}
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public void deletePost(int postNum) {
		final String SQL = "DELETE FROM board WHERE id = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setInt(1, postNum);
			
			preparedStatement.executeUpdate();
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		
	}

	
	
}
