package eu.kanade.tachiyomi.extension.all.gdscans

import eu.kanade.tachiyomi.multisrc.mangathemesia.MangaThemesia

class Gdscans : MangaThemesia(
    "GD Scans",
    "https://gdscans.com",
    "all",
    mangaUrlDirectory = "/manga",
) {
    override val supportsLatest = true

    override fun chapterListSelector() = "li.wp-manga-chapter:has(a[href*='/ch-'])"
}
