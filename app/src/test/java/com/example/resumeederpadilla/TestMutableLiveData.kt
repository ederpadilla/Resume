package com.example.resumeederpadilla

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import junit.framework.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class TestMutableLiveData {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Test
    fun `the test`(){
        val mutableLiveData = MutableLiveData<Boolean>()
        mutableLiveData.postValue(false)
        assertEquals(false,mutableLiveData.value)
    }


}