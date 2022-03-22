package com.example.moviecatalogue.ui.home.activity

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.example.moviecatalogue.R
import com.example.moviecatalogue.utils.DataDummy
import com.example.moviecatalogue.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test


class HomeActivityTest{
    private val dummyMovie = DataDummy.generateDummyMovie()
    private val exampleMovie = DataDummy.generateDummyMovie()[0]
    private val dummyTvShows = DataDummy.generateDummyTv()
    private val exampleTvShows = DataDummy.generateDummyTv()[0]


    @get:Rule
    var activityRule = ActivityTestRule(HomeActivity::class.java)

    @Before
    fun setUp() {
        IdlingRegistry.getInstance().register(EspressoIdlingResource.idlingResource)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.idlingResource)
    }

    @Test
    fun GetMovie() {
        onView(withId(R.id.rv_movie1)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie1))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
        onView(withId(R.id.rv_movie1)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tv_name_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_name_movie)).check(matches(withText(exampleMovie.title)))
        onView(withId(R.id.tv_release_date)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_release_date)).check(matches(withText(exampleMovie.date)))
        onView(withId(R.id.img_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre_movie)).check(matches(withText(exampleMovie.genre)))
        onView(withId(R.id.tv_sinopsis)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_sinopsis)).check(matches(withText(exampleMovie.description)))
        onView(withId(R.id.tv_pemain)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_pemain)).check(matches(withText(exampleMovie.pemain)))
        onView(withId(R.id.btn_website)).check(matches(isDisplayed()))
    }

    @Test
    fun getTvShows(){
        onView(withId(R.id.view_pager)).check(matches(isDisplayed()))
        onView(withId(R.id.view_pager)).perform(swipeLeft())
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShows.size))
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tv_name_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_name_movie)).check(matches(withText(exampleTvShows.title)))
        onView(withId(R.id.tv_release_date)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_release_date)).check(matches(withText(exampleTvShows.date)))
        onView(withId(R.id.img_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre_movie)).check(matches(withText(exampleTvShows.genre)))
        onView(withId(R.id.tv_sinopsis)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_sinopsis)).check(matches(withText(exampleTvShows.description)))
        onView(withId(R.id.tv_pemain)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_pemain)).check(matches(withText(exampleTvShows.pemain)))
        onView(withId(R.id.btn_website)).check(matches(isDisplayed()))
    }

}