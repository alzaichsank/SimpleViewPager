/*yourpackagename*/



class Tab1Fragment.kt : Fragment(){
   
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (savedInstanceState != null) {
        }

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
       //inflater your xml layour
        val view = inflater.inflate(R.layout.fragment_tab1, container, false)

        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        
    }


}