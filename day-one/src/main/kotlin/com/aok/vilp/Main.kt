package com.aok.vilp

import com.aok.vilp.com.aok.vilp.getResourceAsText
import kotlin.math.abs

fun main() {
    val algo = getResourceAsText("locationId.txt")!!
    val leftList = mutableListOf<Int>()
    val rightList = mutableListOf<Int>()
    algo.trim().split("\n").stream()
        .map { it.trim().split("   ") }
        .forEach {
            leftList.add(it[0].toInt())
            rightList.add(it[1].toInt())
        }

    leftList.sort()
    rightList.sort()
    val totalDistance = IntRange(0, leftList.size - 1).sumOf { abs(leftList[it] - rightList[it]) }
    println("Total distance is $totalDistance")

    val similarityMap = mutableMapOf<Int, Int>()
    leftList.forEach { similarityMap[it] = 0 }
    rightList.forEach { if (similarityMap.containsKey(it)) { similarityMap[it] = similarityMap[it]!!.plus(1) } }
    println("The similarity is " + leftList.sumOf { it * (similarityMap[it] ?: 0) })
}