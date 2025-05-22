package com.google.android.gms.app.phone.settings.licenses;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.R;
import com.google.android.gms.app.phone.settings.licenses.LicenseWrapper;
import defpackage.dg;
import defpackage.ekvk;
import defpackage.ekxj;
import defpackage.ig;
import defpackage.jvr;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.lwb;
import defpackage.mbz;
import defpackage.rxx;
import defpackage.vlm;
import defpackage.vlv;
import defpackage.vlw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class LicenseSourceFragment extends dg {
    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LicenseSourceWrapper licenseSourceWrapper = (LicenseSourceWrapper) getArguments().getParcelable("source");
        ekxj.e(licenseSourceWrapper);
        ig hO = ((rxx) requireContext()).hO();
        ekxj.e(hO);
        hO.y(ekvk.b(licenseSourceWrapper.d));
        return layoutInflater.inflate(R.layout.list_fragment, viewGroup, false);
    }

    @Override // defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        Application application = ((Activity) requireContext()).getApplication();
        LicenseSourceWrapper licenseSourceWrapper = (LicenseSourceWrapper) getArguments().getParcelable("source");
        ekxj.e(licenseSourceWrapper);
        vlw vlwVar = (vlw) new jxw(this, new vlv(application, licenseSourceWrapper)).a(vlw.class);
        final vlm vlmVar = new vlm(requireContext());
        vlwVar.a.g(getViewLifecycleOwner(), new jvs() { // from class: vlj
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ArrayAdapter arrayAdapter = vlmVar;
                arrayAdapter.clear();
                arrayAdapter.addAll((elim) obj);
            }
        });
        jvr jvrVar = vlwVar.b;
        final lwb a = mbz.a(this);
        jvrVar.g(getViewLifecycleOwner(), new jvs() { // from class: vlk
            @Override // defpackage.jvs
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    lwb.this.q();
                }
            }
        });
        ListView listView = (ListView) view;
        listView.setAdapter((ListAdapter) vlmVar);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: vll
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                LicenseWrapper licenseWrapper = (LicenseWrapper) vlmVar.getItem(i);
                ekxj.e(licenseWrapper);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("license", licenseWrapper);
                lwb.this.k(R.id.action_openLicense, bundle2);
            }
        });
    }
}
