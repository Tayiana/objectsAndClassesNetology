package ru.netology

import org.junit.Assert.*
import org.junit.Test
import ru.netology.WallService.add

class WallServiceTest {
    private var posts = emptyArray<Post>()

    val firstPost = Post(
        id = 0,
        ownerId = 1,
        fromInt = 1,
        createdBy = 85,
        date = 1644747617,
        text = "Текст поста",
        replyOwnerId = 1896,
        replyPostId = 356,
        friendsOnly = 1,
        Comments(
            count = 12,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        Copyright(
            id = 12,
            link = "ссылка",
            name = "",
            type = ""
        ),
        Likes(
            count = 12,
            userLikes = true,
            canLike = true,
            canPublish = true
        ),
        Reposts(
            count = 122,
            userReposted = true
        ),
        Views(count = 121),
        postType = "post",
        signerId = 777,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        Donut(
            isDonut = false,
            paidDuration = 123,
            placeholder = 2,
            canPublishFreeCopy = false,
            editMode = ""
        ),
        postponedId = 0
    )

    val secondPost = Post(
        id = 1,
        ownerId = 222,
        fromInt = 222,
        createdBy = 95,
        date = 244747700,
        text = "Текст поста 2",
        replyOwnerId = 1896,
        replyPostId = 356,
        friendsOnly = 1,
        Comments(
            count = 12,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        Copyright(
            id = 12,
            link = "ссылка",
            name = "",
            type = ""
        ),
        Likes(
            count = 12,
            userLikes = true,
            canLike = true,
            canPublish = true
        ),
        Reposts(
            count = 122,
            userReposted = true
        ),
        Views(count = 121),
        postType = "post",
        signerId = 777,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        Donut(
            isDonut = false,
            paidDuration = 123,
            placeholder = 2,
            canPublishFreeCopy = false,
            editMode = ""
        ),
        postponedId = 0
    )

    val thirdPost = Post(
        id = 1,
        ownerId = 333,
        fromInt = 333,
        createdBy = 33,
        date = 344747700,
        text = "Текст поста 3",
        replyOwnerId = 1896,
        replyPostId = 356,
        friendsOnly = 1,
        Comments(
            count = 12,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        Copyright(
            id = 12,
            link = "ссылка",
            name = "",
            type = ""
        ),
        Likes(
            count = 12,
            userLikes = true,
            canLike = true,
            canPublish = true
        ),
        Reposts(
            count = 122,
            userReposted = true
        ),
        Views(count = 121),
        postType = "post",
        signerId = 777,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        Donut(
            isDonut = false,
            paidDuration = 123,
            placeholder = 2,
            canPublishFreeCopy = false,
            editMode = ""
        ),
        postponedId = 0
    )

    val fourPost = Post(
        id = 3,
        ownerId = 444,
        fromInt = 444,
        createdBy = 44,
        date = 444747617,
        text = "Текст поста 4",
        replyOwnerId = 1896,
        replyPostId = 356,
        friendsOnly = 1,
        Comments(
            count = 12,
            canPost = true,
            groupsCanPost = true,
            canClose = true,
            canOpen = true
        ),
        Copyright(
            id = 12,
            link = "ссылка",
            name = "",
            type = ""
        ),
        Likes(
            count = 12,
            userLikes = true,
            canLike = true,
            canPublish = true
        ),
        Reposts(
            count = 122,
            userReposted = true
        ),
        Views(count = 121),
        postType = "post",
        signerId = 777,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        Donut(
            isDonut = false,
            paidDuration = 123,
            placeholder = 2,
            canPublishFreeCopy = false,
            editMode = ""
        ),
        postponedId = 0
    )

    @Test
    //проверка на метод добавления
    fun createNewPost() {
        val postId = add(firstPost).id
        assertNotNull(postId)
    }

    @Test
    fun updateExistingTrue() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(firstPost)
        service.add(secondPost)
        // создаём информацию об обновлении
        val update = fourPost//thirdPost
        // выполняем целевое действие
        val result = service.update(update)
        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun updateExistingFalse() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(firstPost)
        service.add(secondPost)
        service.add(thirdPost)
        // создаём информацию об обновлении
        val update = fourPost
        // выполняем целевое действие
        val result = service.update(update)
        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
}