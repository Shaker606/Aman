package com.hyd.hotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyd.hotel.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String> {

}
