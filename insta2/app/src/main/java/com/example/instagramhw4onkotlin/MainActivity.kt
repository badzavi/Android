package com.example.instagramhw4onkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var adapter: NewsListAdapter? = null
    private var listener: NewsListAdapter.ItemClickListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listener = object : NewsListAdapter.ItemClickListener {
            override fun itemClick(position: Int, item: News?) {
                val intent = Intent(this@MainActivity, NewsDetailActivity::class.java)
                intent.putExtra("news", item)
                startActivity(intent)
            }
        }

        recyclerView = findViewById(R.id.recyclerView)
        this.recyclerView?.layoutManager = LinearLayoutManager(this)

        adapter = NewsListAdapter(newsGenerator()!!, listener as NewsListAdapter.ItemClickListener)
        this.recyclerView?.adapter = adapter
    }

    private fun newsGenerator(): List<News>? {
        val items: MutableList<News> = ArrayList()
        val s = "Нравится: "
        var k: String
        val news1 = News(
            R.drawable.avatar,
            "9 января",
            "instagram".also {
                k = it
            },
            R.drawable.iv1,
            "$k  Do you wish I was different? -Euphoria",
            s + 150, "Посмотреть все комментарии (15)"
        )
        val news2 = News(
            R.drawable.avatar,
            "15 февраля",
            "instagram".also {
                k = it
            },
            R.drawable.iv2,
            "$k  Square cat :)",
            s + 480200,
            "Посмотреть все комментарии (12655)"
        )
        val news3 = News(
            R.drawable.avatar2,
            "9 января",
            "loridemissy".also {
                k = it
            },
            R.drawable.iv3,
            "$k  Ice-cream - my love :3",
            s + 150, "Посмотреть все комментарии (15)"
        )
        val news4 = News(
            R.drawable.avatar2,
            "29 января",
            "loridemissy".also {
                k = it
            },
            R.drawable.iv4,
            "$k  Do you like tea?",
            s + 150, "Посмотреть все комментарии (15)"
        )
        val news5 = News(
            R.drawable.avatar3,
            "30 декабря",
            "mdkh_yo".also {
                k = it
            },
            R.drawable.iv5,
            "$k  Do you wish I was different? -Euphoria",
            s + 150, "Посмотреть все комментарии (15)"
        )
        val news6 = News(
            R.drawable.avatar3,
            "6 февраля",
            "mdkh_yo".also {
                k = it
            },
            R.drawable.iv6,
            "$k  Too sweet)",
            s + 150, "Посмотреть все комментарии (15)"
        )
        val news7 = News(
            R.drawable.avatar4,
            "3 января",
            "d_milkanova".also {
                k = it
            },
            R.drawable.iv7,
            "$k  Cooooookies ;)",
            s + 150, "Посмотреть все комментарии (15)"
        )
        val news8 = News(
            R.drawable.avatar4,
            "14 февраля",
            "d_milkanova".also {
                k = it
            },
            R.drawable.iv8,
            "$k  Coffee, coffee and only coffee",
            s + 150, "Посмотреть все комментарии (15)"
        )
        val news9 = News(
            R.drawable.avatar5,
            "8 марта",
            "kendalljenner".also {
                k = it
            },
            R.drawable.iv9,
            "$k  Tea or coffee?",
            s + 150, "Посмотреть все комментарии (15)"
        )
        val news10 = News(
            R.drawable.avatar5,
            "10 января",
            "kendalljenner".also {
                k = it
            },
            R.drawable.iv10,
            "$k  Of course coffee",
            s + 150, "Посмотреть все комментарии (15)"
        )
        items.add(news1)
        items.add(news2)
        items.add(news3)
        items.add(news4)
        items.add(news5)
        items.add(news6)
        items.add(news7)
        items.add(news8)
        items.add(news9)
        items.add(news10)
        items.add(news1)
        items.add(news2)
        items.add(news3)
        items.add(news4)
        items.add(news5)
        items.add(news6)
        items.add(news7)
        items.add(news8)
        items.add(news9)
        items.add(news10)
        return items
    }
}
