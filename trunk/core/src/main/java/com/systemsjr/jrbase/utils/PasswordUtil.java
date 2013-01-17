package com.systemsjr.jrbase.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;

public class PasswordUtil {
	/**
	 * This method encrypts the password. The method can be used when
	 * creating a user or when verifying the user. 
	 * The method uses MD5 algorithm to encrypt the password. The character 
	 * encoding is UTF-16
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public synchronized static String encryptPassword(String password) throws Exception{
		String encoding = "UTF-16";
		String algorithm = "MD5";
		MessageDigest md = null;
	    try
	    {
	      md = MessageDigest.getInstance(algorithm); // get the algorithm instance
	    }
	    catch(NoSuchAlgorithmException e)
	    {
	      throw new Exception(e.getMessage());
	    }
	    try
	    {
	      md.update(password.getBytes(encoding));
	    }
	    catch(UnsupportedEncodingException e)
	    {
	      throw new Exception(e.getMessage());
	    }

	    byte raw[] = md.digest(); //complete the hashing 
	    
	    return new String(Base64.encodeBase64(raw)); /// encode the characters in base 64
	}
}
