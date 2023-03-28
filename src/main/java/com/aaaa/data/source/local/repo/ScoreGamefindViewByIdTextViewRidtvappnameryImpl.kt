package com.aaaa.data.source.local.repo

import com.aaaa.data.dao.ScofindViewByIdTextViewRidtvappnameo
import com.aaaa.data.model.game.ScorefindViewByIdTextViewRidtvappnamedel
import com.aaaa.interfaces.ScorefindViewByIdTextViewRidtvappnameitory
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ScoreGamefindViewByIdTextViewRidtvappnameryImpl @Inject constructor(private val scofindViewByIdTextViewRidtvappnameo: ScofindViewByIdTextViewRidtvappnameo) :
    ScorefindViewByIdTextViewRidtvappnameitory {
    override fun gefindViewByIdTextViewRidtvappnamere(): Flow<ScorefindViewByIdTextViewRidtvappnamedel?> {
        return scofindViewByIdTextViewRidtvappnameo.getfindViewByIdTextViewRidtvappnamee()
    }

    override suspend fun insefindViewByIdTextViewRidtvappnamere(value: ScorefindViewByIdTextViewRidtvappnamedel) {
        scofindViewByIdTextViewRidtvappnameo.inserfindViewByIdTextViewRidtvappnamere(value)
    }

    override suspend fun clefindViewByIdTextViewRidtvappnamear() {
        scofindViewByIdTextViewRidtvappnameo.cfindViewByIdTextViewRidtvappnamear()
        scofindViewByIdTextViewRidtvappnameo.inserfindViewByIdTextViewRidtvappnamere(ScorefindViewByIdTextViewRidtvappnamedel())
    }

}