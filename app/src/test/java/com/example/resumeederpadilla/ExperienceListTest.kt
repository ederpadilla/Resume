package com.example.resumeederpadilla

import androidx.annotation.NonNull
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.resumeederpadilla.model.ExperienceItem
import com.example.resumeederpadilla.model.GetResumeResponse
import com.example.resumeederpadilla.model.SkillsItem
import com.example.resumeederpadilla.ui.main.model.ResumeModel
import com.example.resumeederpadilla.ui.main.viewmodel.ResumeViewModel
import com.example.resumeederpadilla.util.ShowLog
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito
import io.reactivex.schedulers.Schedulers
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.internal.schedulers.ExecutorScheduler
import io.reactivex.Scheduler.Worker
import io.reactivex.disposables.Disposable
import io.reactivex.Scheduler
import junit.framework.Assert.assertEquals
import org.junit.BeforeClass
import java.util.concurrent.Executor
import java.util.concurrent.TimeUnit
import org.junit.ClassRule
import org.mockito.Mock
import org.mockito.MockitoAnnotations


class ExperienceListTest {



    //@get:Rule
    //@JvmField
    //val rule = InstantTaskExecutorRule()

    //private val viewModel by lazy { ResumeViewModel(ResumeModel()) }

    ////@Before
    //public fun setValues(){
    //    RxAndroidPlugins.setInitMainThreadSchedulerHandler { scheduler -> Schedulers.trampoline() }

    //    val skills = listOf<SkillsItem>(
    //        SkillsItem("Test 1"),
    //        SkillsItem("Test 2")
    //    )
    //    val experiences = listOf<ExperienceItem>(
    //        ExperienceItem("des 1","place 1","between 1"),
    //        ExperienceItem("des 2","place 2","between 2")
    //    )
    //    viewModel.resume.value = GetResumeResponse(skills,"Mother of tests",
    //        "Tester",experiences)
    //}


    //@Test
    //fun checkSize() {
    //    // then
    //    setValues()
    //    //Assert.assertEquals("2", viewModel.experiences.value)
    //}

    lateinit var viewModel: ResumeViewModel
    @Mock
    val model = ResumeModel()

    @Before
    fun init(){
        MockitoAnnotations.initMocks(this)
        viewModel = ResumeViewModel(model)
        ShowLog.errorLog("Before","Before")
    }

    @Test
    fun invalidName(){
        viewModel.noInternet.value = false
        assertEquals(false, viewModel.noInternet.value!!)
    }

}