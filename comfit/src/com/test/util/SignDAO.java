package com.test.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.test.mybatis.DBConn;
import com.test.mybatis.userDTO;

public class SignDAO implements ISingDAO
{
	private Connection conn;

	@Override
	public int singUser(userDTO dto) throws SQLException
	{
		int result = 0;
		
		try
		{
			///이메일, 이름, 주소, 비번, 전화, 닉네임, 난수코드 /순서 주의!! 
			conn = DBConn.getConnection();
			//System.out.println("gs");
			String sql = "{call REGIT_PRC(?, ?, ?, ?, ?, ?, ?)}";
			
			CallableStatement cstmt = conn.prepareCall(sql);
			
			
			cstmt.setString(1, dto.getU_email());
			cstmt.setString(2, dto.getU_name());
			cstmt.setString(3, dto.getU_address());
			cstmt.setString(4, dto.getU_password());
			cstmt.setString(5, dto.getU_tel());
			cstmt.setString(6, dto.getU_nickname());
			cstmt.setString(7, dto.getRandom());
			
			result = cstmt.executeUpdate();
			
			cstmt.close();
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			try
			{
				conn.close();
			} catch (Exception e)
			{
				System.out.println(e.toString());
			}
		}
		
		return result;
	}

	@Override
	public userDTO findEmail(userDTO dto) throws SQLException
	{	
		userDTO user = new userDTO();
		
		try
		{
			conn = DBConn.getConnection();
			
			String sql = "SELECT U_EMAIL, U_JOINDATE" + 
						 " FROM USER_INFORMATION" + 
						 " WHERE U_TEL  = ? AND U_NAME= ?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//System.out.println("//"+dto.getU_tel());
			
			pstmt.setString(1, dto.getU_tel());
			pstmt.setString(2, dto.getU_name());
			
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next())
			{
				user.setU_email(rs.getString("U_EMAIL"));
				user.setU_joindate(rs.getString("U_JOINDATE"));
			}
			
			rs.close();
			pstmt.close();
			
			
			
		} catch (Exception e)
		{
			DBConn.close();
			System.out.println(e.toString());
		}
		
		DBConn.close();
		//System.out.println("디비접속종료");
		return user;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
