data class ItemsResponse(
    val id: String,
    val name: String,
    val urlName: String
)

data class ItemPayload(
    val items: List<Item>
)

data class Item(
    val id: String,
    val name: String,
    val slug: String = urlName
)