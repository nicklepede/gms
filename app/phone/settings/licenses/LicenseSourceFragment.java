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
import defpackage.eiif;
import defpackage.eike;
import defpackage.ig;
import defpackage.jpc;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.kdr;
import defpackage.kjo;
import defpackage.qet;
import defpackage.tpm;
import defpackage.tpv;
import defpackage.tpw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class LicenseSourceFragment extends dg {
    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LicenseSourceWrapper licenseSourceWrapper = (LicenseSourceWrapper) getArguments().getParcelable("source");
        eike.e(licenseSourceWrapper);
        ig hy = ((qet) requireContext()).hy();
        eike.e(hy);
        hy.y(eiif.b(licenseSourceWrapper.d));
        return layoutInflater.inflate(R.layout.list_fragment, viewGroup, false);
    }

    @Override // defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        Application application = ((Activity) requireContext()).getApplication();
        LicenseSourceWrapper licenseSourceWrapper = (LicenseSourceWrapper) getArguments().getParcelable("source");
        eike.e(licenseSourceWrapper);
        tpw tpwVar = (tpw) new jrh(this, new tpv(application, licenseSourceWrapper)).a(tpw.class);
        final tpm tpmVar = new tpm(requireContext());
        tpwVar.a.g(getViewLifecycleOwner(), new jpd() { // from class: tpj
            @Override // defpackage.jpd
            public final void a(Object obj) {
                ArrayAdapter arrayAdapter = tpmVar;
                arrayAdapter.clear();
                arrayAdapter.addAll((eivh) obj);
            }
        });
        jpc jpcVar = tpwVar.b;
        final kdr a = kjo.a(this);
        jpcVar.g(getViewLifecycleOwner(), new jpd() { // from class: tpk
            @Override // defpackage.jpd
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    kdr.this.q();
                }
            }
        });
        ListView listView = (ListView) view;
        listView.setAdapter((ListAdapter) tpmVar);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: tpl
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                LicenseWrapper licenseWrapper = (LicenseWrapper) tpmVar.getItem(i);
                eike.e(licenseWrapper);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("license", licenseWrapper);
                kdr.this.k(R.id.action_openLicense, bundle2);
            }
        });
    }
}
