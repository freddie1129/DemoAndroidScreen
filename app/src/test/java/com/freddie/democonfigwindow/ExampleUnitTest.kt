package com.freddie.democonfigwindow

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


fun <T, R> Collection<T>.myfold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R
) : R {
    var accmulator : R = initial
    for (element: T in this)
    {
        accmulator = combine(accmulator, element)
    }
    return accmulator
}



class ExampleUnitTest {



    @Test
    fun addition_isCorrect() {
/*        var items = listOf(1,2,3,4,5)
        assertEquals(16, items.myfold<Int,Int>(0, {acc:Int, i : Int ->
            acc + i
        } ))*/


        var b : Boolean = true

        assertEquals(12, run { if (b) 12 else "abc" })

        var str : String = "abc"
        str.run {  }

        var items = listOf(1,2,3,4,5)
        items.run {  }

        var number = mutableListOf(1,2,3,4,5)
        number.run { this.add(9) }

        assertArrayEquals(mutableListOf(1,2,3,4,5,9).toIntArray(), number.toIntArray())

        var test : String? = null

        test?.run {
            print(this.length)
        }

        with(test)
        {
            test = "abc"
        }

        assertEquals("abc",test)
    }
}
