package com.coded.NursesApp.service.booking;

import com.coded.NursesApp.entity.BookEntity;
import com.coded.NursesApp.entity.NurseEntity;
import com.coded.NursesApp.entity.UserEntity;
import com.coded.NursesApp.reposatriy.BookRepository;
import com.coded.NursesApp.reposatriy.NurseRepository;
import com.coded.NursesApp.reposatriy.UserRepository;
import com.coded.NursesApp.service.auth.UserDetailUtil;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    private final BookRepository bookRepositoryRepository;
    private final UserRepository userRepository;
    private final NurseRepository nurseRepository;
    public BookingServiceImpl(BookRepository bookRepositoryRepository, UserRepository userRepository, NurseRepository nurseRepository) {
        this.bookRepositoryRepository = bookRepositoryRepository;
        this.userRepository = userRepository;
        this.nurseRepository = nurseRepository;
    }

    @Override
    public void SaveBook(Long nurseID) {
        BookEntity bookEntity=new BookEntity();
        UserEntity userEntity= userRepository.findById(UserDetailUtil.userDetails().getId())
                        .orElseThrow();
        NurseEntity nurseEntity = nurseRepository.findById(nurseID)
                        .orElseThrow();
        bookEntity.setUser(userEntity);
        bookEntity.setNurse(nurseEntity);
        bookEntity.setBookingDate(LocalDate.now());
        bookRepositoryRepository.save(bookEntity);
    }

    @Override
    public BookEntity getBookDetails(Long bookId) {
        return bookRepositoryRepository.findById(bookId).orElseThrow();
    }

    @Override
    public List<BookEntity> getAllBookingDetails() {
        return bookRepositoryRepository.findAll();
    }

}
