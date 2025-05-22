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
import defpackage.ekxj;
import defpackage.jvr;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.lwb;
import defpackage.mbz;
import defpackage.vlz;
import defpackage.vma;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        ekxj.e(licenseWrapper);
        vma vmaVar = (vma) new jxw(this, new vlz(application, licenseWrapper)).a(vma.class);
        final TextView textView = (TextView) view.findViewById(android.R.id.text1);
        vmaVar.a.g(getViewLifecycleOwner(), new jvs() { // from class: vlg
            @Override // defpackage.jvs
            public final void a(Object obj) {
                textView.setText((String) obj);
            }
        });
        jvr jvrVar = vmaVar.b;
        final lwb a = mbz.a(this);
        jvrVar.g(getViewLifecycleOwner(), new jvs() { // from class: vlh
            @Override // defpackage.jvs
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    lwb.this.q();
                }
            }
        });
    }
}
