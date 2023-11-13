package org.example.SchoolProject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.SchoolProject.Enum.Gender;
import org.example.SchoolProject.Enum.Genre;
import org.example.SchoolProject.Enum.Role;

@Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class LibraryUser implements Comparable <LibraryUser> {
        private long libraryUserID;
        private Gender gender;
        private String name;
        private Genre bookOrdered;
        private Role role;             //this role will help me in comparing my users and its in my libraryUser

        @Override
        public int compareTo(LibraryUser o) {
            return Integer.compare(o.role.ordinal(), this.role.ordinal());
        }
    }

