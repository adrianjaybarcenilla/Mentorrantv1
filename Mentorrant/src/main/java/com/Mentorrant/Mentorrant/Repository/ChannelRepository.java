package com.Mentorrant.Mentorrant.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mentorrant.Mentorrant.Entity.ChannelEntity;

@Repository
public interface ChannelRepository extends JpaRepository<ChannelEntity, Integer> {
	ChannelEntity findChannelByChannelNumber(String channelNumber);

}
