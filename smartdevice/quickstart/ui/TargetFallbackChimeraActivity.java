package com.google.android.gms.smartdevice.quickstart.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import defpackage.atmo;
import defpackage.atmr;
import defpackage.atms;
import defpackage.auad;
import defpackage.bp;
import defpackage.dfyj;
import defpackage.dg;
import defpackage.dgcj;
import defpackage.dghh;
import defpackage.dgkj;
import defpackage.dgrv;
import defpackage.dgrw;
import defpackage.dgrx;
import defpackage.dgxt;
import defpackage.dgyt;
import defpackage.dvth;
import defpackage.dvti;
import defpackage.dvtk;
import defpackage.eobc;
import defpackage.eodb;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fmya;
import defpackage.ryb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TargetFallbackChimeraActivity extends ryb implements dgrw {
    private static final auad h = new dgyt(new String[]{"TargetFallbackChimeraActivity"});
    private dgkj i;
    private int j;

    private final dg j() {
        return gY().g(R.id.fragment_container);
    }

    @Override // defpackage.dgrw
    public final void A(List list) {
        int size = this.j - list.size();
        fgrc v = eobc.a.v();
        int i = this.j;
        if (!v.b.L()) {
            v.U();
        }
        eobc eobcVar = (eobc) v.b;
        eobcVar.b |= 1;
        eobcVar.c = i;
        int size2 = list.size();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        eobc eobcVar2 = (eobc) fgriVar;
        eobcVar2.b |= 2;
        eobcVar2.d = size2;
        if (!fgriVar.L()) {
            v.U();
        }
        eobc eobcVar3 = (eobc) v.b;
        eobcVar3.b |= 4;
        eobcVar3.e = size;
        this.i.l((eobc) v.Q());
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((FallbackAccount) it.next()).b);
        }
        Intent intent = new Intent();
        intent.putStringArrayListExtra("accounts", arrayList);
        setResult(-1, intent);
        finish();
    }

    @Override // defpackage.dgrw
    public final void o(int i) {
        fgrc v = dfyj.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        dfyj dfyjVar = (dfyj) fgriVar;
        dfyjVar.c = 5;
        dfyjVar.b |= 1;
        if (!fgriVar.L()) {
            v.U();
        }
        dfyj dfyjVar2 = (dfyj) v.b;
        dfyjVar2.b |= 2;
        dfyjVar2.d = i;
        this.i.n(10599, (dfyj) v.Q());
        setResult(0);
        finish();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        this.i.s(5);
        dg j = j();
        if (j instanceof dgrx) {
            ((dgrx) j).y();
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        h.d("onConfigurationChanged()", new Object[0]);
        super.onConfigurationChanged(configuration);
        dg j = j();
        if (j instanceof dgrx) {
            ((dgrx) j).x();
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        if (!atms.a(this)) {
            h.m("Invalid caller, finishing activity.", new Object[0]);
            finishAndRemoveTask();
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (fmya.c()) {
            atmo.a(this);
        }
        atmr.g(this);
        setContentView(R.layout.smartdevice_fragment_container);
        if (bundle == null) {
            List<dvth> list = ((dvti) new dvtk().j(intent)).a;
            ArrayList arrayList = new ArrayList();
            for (dvth dvthVar : list) {
                arrayList.add(new FallbackAccount(dvthVar.b, dvthVar.c, ""));
            }
            this.j = arrayList.size();
            dgrx a = dgrv.a(arrayList);
            bp bpVar = new bp(gY());
            if (!dgxt.b(this)) {
                getApplicationContext();
                bpVar.A(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out, R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
            }
            bpVar.F(R.id.fragment_container, a);
            bpVar.w(null);
            bpVar.b();
        }
        long a2 = dghh.a(this);
        h.h("onCreate(): SessionId: %d; Is deferred SUW: %b", Long.valueOf(a2), Boolean.valueOf(dgcj.s(this)));
        dgkj i = dgkj.i(this);
        this.i = i;
        i.b = a2;
        i.c = eodb.COSMIC_RAY;
    }
}
