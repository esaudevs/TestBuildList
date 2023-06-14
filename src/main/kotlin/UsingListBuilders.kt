fun main(args: Array<String>) {

    val bannerHome = setBanner(
        bannerTitle = title,
        contents = contents,
        showForYouSection = true
    )

    if (bannerHome is MutableList<String>) {
        bannerHome[0] = "Banner title updated"
    }

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
): List<String> = buildList {
    add(bannerTitle.uppercase())
    add("Departments:")
    add("--------------------")
    contents.mapIndexedTo(this) { index, content ->
        "${index + 1} - ${content.title} - ${content.featuredBrand}"
    }
    add("--------------------")
    if (showForYouSection) {
        add("For You")
    }
}