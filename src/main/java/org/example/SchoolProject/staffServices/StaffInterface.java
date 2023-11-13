package org.example.SchoolProject.staffServices;

@FunctionalInterface
public interface StaffInterface<T, R> {
    T function(R r);
}
