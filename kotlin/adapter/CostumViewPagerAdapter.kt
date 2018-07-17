/*yourpackage*/

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by Alza Ichsan Kurniawan on 29/12/2017.
 */
class CostumViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    private var mFragmentItems:ArrayList<Fragment> = ArrayList()
    private var mFragmentTitles:ArrayList<String> = ArrayList()

    //we need to create function to add fragments

    fun addFragments(fragmentItem:Fragment,fragmentTitle:String){
        mFragmentItems.add(fragmentItem)
        mFragmentTitles.add(fragmentTitle)
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentItems[position]
    }

    override fun getCount(): Int {
        return mFragmentItems.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return mFragmentTitles[position]
    }

}