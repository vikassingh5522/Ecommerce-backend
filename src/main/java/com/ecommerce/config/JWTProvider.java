package com.ecommerce.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class JWTProvider {

    private final SecretKey key = Keys.hmacShaKeyFor(JWTConstant.SECRET_KEY.getBytes());


    private static final long EXPIRATION_TIME = 36 * 60 * 60 * 1000; // 36 hours in ms

    public String generateToken(Authentication auth) {
        return Jwts.builder()
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .claim("email", auth.getName())
                // Optional: you can also include roles if you want
                //.claim("authorities", "ROLE_USER")
                .signWith(key)
                .compact();
    }

    public String getEmailFromToken(String jwt) {
        if (jwt.startsWith("Bearer ")) {
            jwt = jwt.substring(7);
        }

        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(jwt)
                    .getBody();
            return String.valueOf(claims.get("email"));
        } catch (ExpiredJwtException e) {
            throw new RuntimeException("Token is expired");
        }
    }
}
