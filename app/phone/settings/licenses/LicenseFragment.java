package com.google.android.gms.app.phone.settings.licenses;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.R;
import defpackage.dg;
import defpackage.eike;
import defpackage.jpc;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.kdr;
import defpackage.kjo;
import defpackage.tpz;
import defpackage.tqa;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class LicenseFragment extends dg {
    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.license_fragment, viewGroup, false);
    }

    @Override // defpackage.dg
    public final void onViewCreated(View view, Bundle bundle) {
        Application application = ((Activity) requireContext()).getApplication();
        LicenseWrapper licenseWrapper = (LicenseWrapper) getArguments().getParcelable("license");
        eike.e(licenseWrapper);
        tqa tqaVar = (tqa) new jrh(this, new tpz(application, licenseWrapper)).a(tqa.class);
        final TextView textView = (TextView) view.findViewById(android.R.id.text1);
        tqaVar.a.g(getViewLifecycleOwner(), new jpd() { // from class: tpg
            @Override // defpackage.jpd
            public final void a(Object obj) {
                textView.setText((String) obj);
            }
        });
        jpc jpcVar = tqaVar.b;
        final kdr a = kjo.a(this);
        jpcVar.g(getViewLifecycleOwner(), new jpd() { // from class: tph
            @Override // defpackage.jpd
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    kdr.this.q();
                }
            }
        });
    }
}
