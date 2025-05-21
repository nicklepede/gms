package com.google.android.gms.credential.manager.passwordimport;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.credential.manager.passwordimport.ImportProgressFragment;
import defpackage.avqk;
import defpackage.avqn;
import defpackage.avqo;
import defpackage.avqp;
import defpackage.avqq;
import defpackage.avqr;
import defpackage.avta;
import defpackage.avtn;
import defpackage.dg;
import defpackage.fuuw;
import defpackage.fuux;
import defpackage.fuuy;
import defpackage.fvaq;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.jqx;
import defpackage.kdr;
import defpackage.kiw;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ImportProgressFragment extends avtn {
    public static final avta x(fuuw fuuwVar) {
        return (avta) fuuwVar.a();
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fvbo.f(layoutInflater, "inflater");
        final View inflate = layoutInflater.inflate(R.layout.pwm_import_progress, viewGroup, false);
        dg g = getParentFragmentManager().g(R.id.nav_host_fragment);
        fvbo.c(g);
        final kdr a = kiw.a(g);
        dg h = ((qfp) requireContext()).getSupportFragmentManager().h("PWMImportScreenFragment");
        fvbo.c(h);
        fuuw a2 = fuux.a(fuuy.c, new avqn(new avqk(h)));
        int i = fvcc.a;
        final jqx jqxVar = new jqx(new fvbi(avta.class), new avqo(a2), new avqq(this, a2), new avqp(a2));
        if (x(jqxVar).j.hT() == null) {
            a.j(R.id.ImportValidationFragment);
        }
        x(jqxVar).p.g(getViewLifecycleOwner(), new avqr(new fvaq() { // from class: avql
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    fuuw fuuwVar = jqxVar;
                    ((TextView) inflate.findViewById(R.id.pwm_import_progress_description)).setText(this.getResources().getString(R.string.pwm_import_progress_description, ImportProgressFragment.x(fuuwVar).b()));
                }
                return fuvs.a;
            }
        }));
        x(jqxVar).r.g(getViewLifecycleOwner(), new avqr(new fvaq() { // from class: avqm
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                if (((avst) obj) != null) {
                    kdr.this.j(R.id.action_ImportProgressFragment_to_ImportResultFragment);
                }
                return fuvs.a;
            }
        }));
        fvbo.c(inflate);
        return inflate;
    }
}
