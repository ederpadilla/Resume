package com.example.resumeederpadilla.ui.main.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.resumeederpadilla.model.ExperienceItem
import com.example.resumeederpadilla.model.GetResumeResponse
import com.example.resumeederpadilla.model.SkillsItem
import com.example.resumeederpadilla.ui.main.model.ResumeModel
import com.example.resumeederpadilla.util.ShowLog

class ResumeViewModel (private val model : ResumeModel) : ViewModel() {

    val resume = MutableLiveData<GetResumeResponse>()

    val skills = MutableLiveData<List<SkillsItem>>()

    val experiences =  MutableLiveData<List<ExperienceItem>>()

    val error = MutableLiveData<String>()

    val showProgress = MutableLiveData<Boolean>()

    val hideProgress = MutableLiveData<Boolean>()

    val noInternet = MutableLiveData<Boolean>()

    fun getResume(){
        model.getExperiences{ resume: GetResumeResponse?,
                              error: String?, showProgress : Boolean?,
                              hideProgress : Boolean?, noInternet : Boolean?->
            showProgress?.let {
                if (it)
                this.showProgress.postValue(it)
            }
            hideProgress?.let {
                if (it)
                    this.hideProgress.postValue(it)
            }
            noInternet?.let {
                if (it)
                    this.noInternet.postValue(it)
            }
            resume?.let {
                this.resume.postValue(it)
                this.skills.postValue(it.skills)
                this.experiences.postValue(it.experience)
            }
            error?.let {
                this.error.postValue(it)
            }
        }
    }

}