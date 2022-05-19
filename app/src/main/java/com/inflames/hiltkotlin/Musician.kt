package com.inflames.hiltkotlin

import javax.inject.Inject

// Constructor Injection
// Burada bu classa scope belirtebiliriz/
/*
* @Singleton -- Tüm uygulama boyunca bir kere oluşturulur ve hayatta kalır.
* @ActivityRetainedScoped
* @ViewModelScoped --
* @ActivityScoped -- Activity Yaşam Döngüsü boyunca olulturulur aktivite yok edildiğinde yok edliri
* @FragmentScoped -- Fragment Yaşam Döngüsü boyunca olulturulur Fragment yok edildiğinde yok edliri
* */
class Musician @Inject constructor(instrument: Instrument, band: Band) {

    /* Field Injection*/

    fun sing() {
        println("Singing")
    }
}