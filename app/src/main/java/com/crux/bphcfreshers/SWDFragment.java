package com.crux.bphcfreshers;

import android.content.ComponentName;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SWDFragment extends Fragment {

//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
////        return inflater.inflate(R.layout.fragment_swd, null);
//
//        final String url = "http://swd.bits-hyderabad.ac.in/";
//        CustomTabsIntent customTabsIntent;
//        final CustomTabsClient[] customTabsClient = new CustomTabsClient[1];
//        final CustomTabsSession[] customTabsSession = new CustomTabsSession[1];
//
//        CustomTabsServiceConnection customTabsServiceConnection = new CustomTabsServiceConnection() {
//            @Override
//            public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient client) {
//                customTabsClient[0] = client;
//                customTabsClient[0].warmup(0L);
//                customTabsSession[0] = customTabsClient[0].newSession(null);
//
//
//            }
//
//            @Override
//            public void onServiceDisconnected(ComponentName name) {
//                customTabsClient[0] = null;
//
//            }
//        };
//
//
//        CustomTabsClient.bindCustomTabsService(getContext(), String.valueOf(getParentFragment()), customTabsServiceConnection);
//        customTabsIntent = new CustomTabsIntent.Builder(customTabsSession[0])
//                .setShowTitle(true)
//                .setToolbarColor(Color.rgb(80,70,250))
//                .build();
//
//        customTabsIntent.launchUrl(getContext(), Uri.parse(url));
//
//        return null;
//    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//        final String url = "http://swd.bits-hyderabad.ac.in/";
//        CustomTabsIntent customTabsIntent;
//        final CustomTabsClient[] customTabsClient = new CustomTabsClient[1];
//        final CustomTabsSession[] customTabsSession = new CustomTabsSession[1];
//
//        CustomTabsServiceConnection customTabsServiceConnection = new CustomTabsServiceConnection() {
//            @Override
//            public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient client) {
//                customTabsClient[0] = client;
//                customTabsClient[0].warmup(0L);
//                customTabsSession[0] = customTabsClient[0].newSession(null);
//
//
//            }
//
//            @Override
//            public void onServiceDisconnected(ComponentName name) {
//                customTabsClient[0] = null;
//
//            }
//        };
//
//
//        CustomTabsClient.bindCustomTabsService(getContext(), String.valueOf(getParentFragment()), customTabsServiceConnection);
//        customTabsIntent = new CustomTabsIntent.Builder(customTabsSession[0])
//                .setShowTitle(true)
//                .setToolbarColor(Color.rgb(80,70,250))
//                .build();
//
//        customTabsIntent.launchUrl(getContext(), Uri.parse(url));
//
//
//    }

}
