fun getArcaneItems(): List<Item> {
    return allItems.filter { it.slug.contains("arcane", ignoreCase = true) }
}