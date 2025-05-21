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
import defpackage.eike;
import defpackage.jpc;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.kdr;
import defpackage.kjo;
import defpackage.tpq;
import defpackage.tps;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class LicenseSourceListFragment extends dg {
    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.list_fragment, viewGroup, false);
    }

    @Override // defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        tps tpsVar = (tps) new jrh(this).a(tps.class);
        LayoutInflater layoutInflater = (LayoutInflater) requireContext().getSystemService("layout_inflater");
        eike.e(layoutInflater);
        final tpq tpqVar = new tpq(requireContext(), layoutInflater);
        tpsVar.b.g(getViewLifecycleOwner(), new jpd() { // from class: tpn
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ArrayAdapter arrayAdapter = tpqVar;
                arrayAdapter.clear();
                arrayAdapter.addAll((eitj) obj);
            }
        });
        jpc jpcVar = tpsVar.c;
        final kdr a = kjo.a(this);
        jpcVar.g(getViewLifecycleOwner(), new jpd() { // from class: tpo
            @Override // defpackage.jpd
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    kdr.this.q();
                }
            }
        });
        ListView listView = (ListView) view;
        listView.setAdapter((ListAdapter) tpqVar);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: tpp
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                LicenseSourceWrapper licenseSourceWrapper = (LicenseSourceWrapper) tpqVar.getItem(i);
                eike.e(licenseSourceWrapper);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("source", licenseSourceWrapper);
                kdr.this.k(R.id.action_listLicenses, bundle2);
            }
        });
    }
}
