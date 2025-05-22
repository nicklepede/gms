package com.google.android.gms.credential.manager.passwordimport;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.credential.manager.passwordimport.ImportProgressFragment;
import defpackage.axuk;
import defpackage.axun;
import defpackage.axuo;
import defpackage.axup;
import defpackage.axuq;
import defpackage.axur;
import defpackage.axxa;
import defpackage.axxn;
import defpackage.dg;
import defpackage.fxqu;
import defpackage.fxqv;
import defpackage.fxqw;
import defpackage.fxwo;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.jxm;
import defpackage.lwb;
import defpackage.mbh;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ImportProgressFragment extends axxn {
    public static final axxa x(fxqu fxquVar) {
        return (axxa) fxquVar.a();
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fxxm.f(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(R.layout.pwm_import_progress, viewGroup, false);
        dg g = getParentFragmentManager().g(R.id.nav_host_fragment);
        fxxm.c(g);
        final lwb a = mbh.a(g);
        dg h = ((ryt) requireContext()).getSupportFragmentManager().h("PWMImportScreenFragment");
        fxxm.c(h);
        fxqu a2 = fxqv.a(fxqw.c, new axun(new axuk(h)));
        int i = fxya.a;
        final jxm jxmVar = new jxm(new fxxg(axxa.class), new axuo(a2), new axuq(this, a2), new axup(a2));
        if (x(jxmVar).j.ii() == null) {
            a.j(R.id.ImportValidationFragment);
        }
        x(jxmVar).p.g(getViewLifecycleOwner(), new axur(new fxwo() { // from class: axul
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    fxqu fxquVar = jxmVar;
                    ((TextView) inflate.findViewById(R.id.pwm_import_progress_description)).setText(this.getResources().getString(R.string.pwm_import_progress_description, ImportProgressFragment.x(fxquVar).b()));
                }
                return fxrq.a;
            }
        }));
        x(jxmVar).r.g(getViewLifecycleOwner(), new axur(new fxwo() { // from class: axum
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                if (((axwt) obj) != null) {
                    lwb.this.j(R.id.action_ImportProgressFragment_to_ImportResultFragment);
                }
                return fxrq.a;
            }
        }));
        fxxm.c(inflate);
        return inflate;
    }
}
