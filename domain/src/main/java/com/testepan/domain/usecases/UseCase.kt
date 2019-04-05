package com.testepan.domain.usecases

import io.reactivex.Observable


abstract class UseCase {

    interface WithParameter<in P, R> {
        fun execute(params: P): Observable<R>
    }

    interface WithoutParameter<R> {
        fun execute(): Observable<R>
    }
}
