package com.google.android.gms.app.phone.settings.licenses;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.gms.R;
import com.google.android.gms.app.phone.settings.licenses.LicenseSourceWrapper;
import defpackage.dg;
import defpackage.ekxj;
import defpackage.jvr;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.lwb;
import defpackage.mbz;
import defpackage.vlq;
import defpackage.vls;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class LicenseSourceListFragment extends dg {
    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.list_fragment, viewGroup, false);
    }

    @Override // defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        vls vlsVar = (vls) new jxw(this).a(vls.class);
        LayoutInflater layoutInflater = (LayoutInflater) requireContext().getSystemService("layout_inflater");
        ekxj.e(layoutInflater);
        final vlq vlqVar = new vlq(requireContext(), layoutInflater);
        vlsVar.b.g(getViewLifecycleOwner(), new jvs() { // from class: vln
            @Override // defpackage.jvs
            public final void a(Object obj) {
                ArrayAdapter arrayAdapter = vlqVar;
                arrayAdapter.clear();
                arrayAdapter.addAll((elgo) obj);
            }
        });
        jvr jvrVar = vlsVar.c;
        final lwb a = mbz.a(this);
        jvrVar.g(getViewLifecycleOwner(), new jvs() { // from class: vlo
            @Override // defpackage.jvs
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    lwb.this.q();
                }
            }
        });
        ListView listView = (ListView) view;
        listView.setAdapter((ListAdapter) vlqVar);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: vlp
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                LicenseSourceWrapper licenseSourceWrapper = (LicenseSourceWrapper) vlqVar.getItem(i);
                ekxj.e(licenseSourceWrapper);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("source", licenseSourceWrapper);
                lwb.this.k(R.id.action_listLicenses, bundle2);
            }
        });
    }
}
