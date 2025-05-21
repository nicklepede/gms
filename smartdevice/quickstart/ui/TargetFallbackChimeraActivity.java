package com.google.android.gms.smartdevice.quickstart.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import defpackage.arjz;
import defpackage.arkc;
import defpackage.arkd;
import defpackage.arxo;
import defpackage.bp;
import defpackage.ddne;
import defpackage.ddre;
import defpackage.ddwc;
import defpackage.ddzf;
import defpackage.degs;
import defpackage.degt;
import defpackage.degu;
import defpackage.demq;
import defpackage.denq;
import defpackage.dg;
import defpackage.dtiv;
import defpackage.dtiw;
import defpackage.dtiy;
import defpackage.elno;
import defpackage.elpn;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkhl;
import defpackage.qex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TargetFallbackChimeraActivity extends qex implements degt {
    private static final arxo h = new denq(new String[]{"TargetFallbackChimeraActivity"});
    private ddzf i;
    private int j;

    private final dg j() {
        return gI().g(R.id.fragment_container);
    }

    @Override // defpackage.degt
    public final void A(List list) {
        int size = this.j - list.size();
        fecj v = elno.a.v();
        int i = this.j;
        if (!v.b.L()) {
            v.U();
        }
        elno elnoVar = (elno) v.b;
        elnoVar.b |= 1;
        elnoVar.c = i;
        int size2 = list.size();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elno elnoVar2 = (elno) fecpVar;
        elnoVar2.b |= 2;
        elnoVar2.d = size2;
        if (!fecpVar.L()) {
            v.U();
        }
        elno elnoVar3 = (elno) v.b;
        elnoVar3.b |= 4;
        elnoVar3.e = size;
        this.i.l((elno) v.Q());
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

    @Override // defpackage.degt
    public final void o(int i) {
        fecj v = ddne.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ddne ddneVar = (ddne) fecpVar;
        ddneVar.c = 5;
        ddneVar.b |= 1;
        if (!fecpVar.L()) {
            v.U();
        }
        ddne ddneVar2 = (ddne) v.b;
        ddneVar2.b |= 2;
        ddneVar2.d = i;
        this.i.n(10599, (ddne) v.Q());
        setResult(0);
        finish();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        this.i.s(5);
        dg j = j();
        if (j instanceof degu) {
            ((degu) j).y();
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        h.d("onConfigurationChanged()", new Object[0]);
        super.onConfigurationChanged(configuration);
        dg j = j();
        if (j instanceof degu) {
            ((degu) j).x();
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        if (!arkd.a(this)) {
            h.m("Invalid caller, finishing activity.", new Object[0]);
            finishAndRemoveTask();
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (fkhl.c()) {
            arjz.a(this);
        }
        arkc.g(this);
        setContentView(R.layout.smartdevice_fragment_container);
        if (bundle == null) {
            List<dtiv> list = ((dtiw) new dtiy().j(intent)).a;
            ArrayList arrayList = new ArrayList();
            for (dtiv dtivVar : list) {
                arrayList.add(new FallbackAccount(dtivVar.b, dtivVar.c, ""));
            }
            this.j = arrayList.size();
            degu a = degs.a(arrayList);
            bp bpVar = new bp(gI());
            if (!demq.b(this)) {
                getApplicationContext();
                bpVar.A(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out, R.anim.sud_slide_back_in, R.anim.sud_slide_back_out);
            }
            bpVar.F(R.id.fragment_container, a);
            bpVar.w(null);
            bpVar.b();
        }
        long a2 = ddwc.a(this);
        h.h("onCreate(): SessionId: %d; Is deferred SUW: %b", Long.valueOf(a2), Boolean.valueOf(ddre.s(this)));
        ddzf i = ddzf.i(this);
        this.i = i;
        i.b = a2;
        i.c = elpn.COSMIC_RAY;
    }
}
