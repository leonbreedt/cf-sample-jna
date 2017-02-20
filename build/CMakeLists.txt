cmake_minimum_required(VERSION 2.8)

project(fastadd)
set(CMAKE_BUILD_TYPE Release)

add_library(test SHARED fastadd.c)
