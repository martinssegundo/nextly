package com.nextly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookSearchTest {

    String[][] phoneBook = {
            {"Ana", "(83)999556688"},
            {"Bruce", "(83)999556689"},
            {"Charles", "(83)999556690"},
            {"Davide", "(83)999556691"},
    };

    @Test
    void searchByNameReturningSucess() {
        var index = PhoneBookSearch.searchByName(phoneBook,"Charles");
        assertEquals(index, 2);
    }

    @Test
    void searchByNameReturningError() {
        var index = PhoneBookSearch.searchByName(phoneBook,"Carlos");
        assertEquals(index, -1);
    }
}