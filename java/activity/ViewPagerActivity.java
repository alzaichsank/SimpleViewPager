/*yourpackagename*/



public class ViewPagerActivity extends AppCompatActivity() {

    //set that ViewPager
    private ViewPager viewPager;

   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        
     // set fragment on adapter
    private void setupViewPager(ViewPager viewPager){
        View_Pager_Acitivity.ViewPagerAdapter adapter = new View_Pager_Acitivity.ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new Home(), "tab1");
        adapter.addFrag(new LoginDetail(), "tab2");
        viewPager.setAdapter(adapter);
    }


    //make class for  adapter
    static class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager){
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title){
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position){
            return mFragmentTitleList.get(position);
        }
    }
    }

}
