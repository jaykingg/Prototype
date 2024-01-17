package com.template.prototype.dummy

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/dummy")
class DummyController {

    /**
     *  전체 Dummy 가져오기
     */
    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getAllDummy() {

    }

    /**
     *  단일 Dummy 가져오기
     *  @param id = database PK
     */
    @GetMapping("{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getDummy(
        @PathVariable id: Long
    ) {

    }

    /**
     *  단일 Dummy 저장하기
     */
    @PostMapping("/register", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun registerDummy(
        @RequestBody
        payload: DummyPayload
    ) {

    }

    /**
     * 단일 Dummy 삭제하기
     * @param id = 비활성화 시킬 Dummy PK
     */
    @PostMapping("/disable", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun disableDummy(
        @RequestBody
        id: Long
    ) {

    }

    /**
     * Test 용 Dummy 생성
     * @param number = 생성할 Dummy 갯수
     */
    @PostMapping("/makeTests")
    fun makeTestDummy(
        @RequestBody
        number: Int

    ) {
        
    }


}