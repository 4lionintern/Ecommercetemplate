package com.example.sparsh23.laltern;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link About_Us.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link About_Us#newInstance} factory method to
 * create an instance of this fragment.
 */
public class About_Us extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    TextView about_us;
    private OnFragmentInteractionListener mListener;

    public About_Us() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment About_Us.
     */
    // TODO: Rename and change types and number of parameters
    public static About_Us newInstance(String param1, String param2) {
        About_Us fragment = new About_Us();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
        //random gibberish
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_about__us,container,false);

        about_us = (TextView)root.findViewById(R.id.about_us);
        about_us.setText(Html.fromHtml("<p>At lal10, we sell authentic Indian Handicraft and Handloom products in Bulk to markets across the globe. We have used technology to enable commerce from various craft clusters of our country and have minimized the traditional problems in the Indian handicraft sector. We connect with 8250+ artisans across 22 Indian States.&nbsp;We are India&#39;s biggest supplier of Handicraft and Handloom directly from the artisan clusters after FabIndia.&nbsp;With a team of 12 people from IIT-M, DCE, NID they are determined to bridge the traditional gaps (marketing &amp; operations) faced by buyers and artisans with their expertise.&nbsp;Presently we export our goods to 18 countries and have offices in Mumbai, Bangalore, Noida and Brussels.&nbsp;Our mission is to ensure that the artisans and craftsmen expand their horizons beyond local markets and that customers get authentic products at the right price.&nbsp;\n" +
                "</p>\n" +
                "<p>Media Mentions :&nbsp;\n" +
                "</p>\n" ));
        about_us.setMovementMethod(LinkMovementMethod.getInstance());

        WebView webView = (WebView)root.findViewById(R.id.webview_aboutus);
        webView.getSettings().getJavaScriptCanOpenWindowsAutomatically();
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.getSettings().setLoadWithOverviewMode(true);
        ///webView.getSettings().setUseWideViewPort(true);
        // webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        //  webView.clearCache(true);
        webView.clearView();
        webView.reload();
        //   webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webView.setScrollbarFadingEnabled(false);
        webView.clearCache(true);
        webView.loadUrl("file:///android_asset/Untitled.html");
        //webView.loadUrl(mParam1.get("des"));
        return root;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
