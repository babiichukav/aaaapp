package com.aaaa.ui.game.menu

import androidx.lifecycle.ViewModel
import com.aaaa.data.source.local.repo.ScoreGamefindViewByIdTextViewRidtvappnameryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MenuViewModel @Inject constructor(
    scoreGamefindViewByIdTextViewRidtvappnameryImpl: ScoreGamefindViewByIdTextViewRidtvappnameryImpl
) : ViewModel() {
    val scfindViewByIdTextViewRidtvappnamedel = scoreGamefindViewByIdTextViewRidtvappnameryImpl.gefindViewByIdTextViewRidtvappnamere()
}