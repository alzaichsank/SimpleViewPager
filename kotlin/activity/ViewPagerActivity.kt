/*yourpackagename*/


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_view_pager.*
import kotlinx.android.synthetic.main.appbar_main.*

class ViewPagerActivity : AppCompatActivity() {

    private var pagerAdapter: CostumViewPagerAdapter?=null

   

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
     
        setSupportActionBar(toolbar_main)

        /* add your view pager on here */

        pagerAdapter = CostumViewPagerAdapter(supportFragmentManager)
        pagerAdapter!!.addFragments(Tab1Fragment(),"TAB1")
        pagerAdapter!!.addFragments(Tab2Fragment(),"TAB2")

        //adding pageradapter to viewpager
        costomViewPager.adapter = pagerAdapter


        //Now setting up viewpager with tablayout
        costomTabLayout.setupWithViewPager(costomViewPager)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return false
    }

}
