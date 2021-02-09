package com.example.isen_2021.network

import java.io.Serializable

class RegisterResult(val data: User) {}

class User(val id: Int): Serializable {}