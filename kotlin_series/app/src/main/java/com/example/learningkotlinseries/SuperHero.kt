package com.example.learningkotlinseries

class SuperHero(var name: String, var age: Int, var job: String) {
    init {
        println("Constructor method called.")
    }

    private var country = "Turkey"

    //  getter
    fun getCountry(): String {
        return this.country
    }

    //  setter
    fun changeCounty(country: String): String {
        this.country = country
        return country
    }

    //  public, private, internal, protected
    fun getSuperHeroName() {
        println(this.name)
    }
}