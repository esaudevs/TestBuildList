/* fun main(args: Array<String>) {

    val bannerHome = setBanner(
        bannerTitle = title,
        contents = contents,
        showForYouSection = true
    )

    bannerHome.forEach(::println)
}

data class Content(
    val title: String,
    val featuredBrand: String
)

val title = "Home page"
val contents = listOf(
    Content("Electronics", "LG"),
    Content("Body", "Nivea"),
    Content("Kitchen", "T-fal")
)

fun setBanner(
    bannerTitle: String,
    contents: List<Content>,
    showForYouSection: Boolean
): List<String> =
    listOf(
        bannerTitle.uppercase(),
        "Departments:",
        "--------------------"
    ) + contents.mapIndexed { index, content ->
        "${index + 1} - ${content.title} - ${content.featuredBrand}"
    } + "--------------------" +
            if (showForYouSection) {
                listOf("For You")
            } else {
                emptyList()
            } */