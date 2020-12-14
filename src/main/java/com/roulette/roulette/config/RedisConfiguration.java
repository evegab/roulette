package com.roulette.roulette.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import com.roulette.roulette.model.RouletteModel;
@Configuration
public class RedisConfiguration {
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}
	@Bean
	RedisTemplate<String, RouletteModel> redisTemplate(){
		final RedisTemplate<String, RouletteModel> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
	}
}
