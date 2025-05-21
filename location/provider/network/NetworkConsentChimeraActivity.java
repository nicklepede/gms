package com.google.android.gms.location.provider.network;

import android.content.DialogInterface;
import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.location.provider.network.NetworkConsentChimeraActivity;
import defpackage.asej;
import defpackage.asot;
import defpackage.bwth;
import defpackage.bwti;
import defpackage.canf;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensm;
import defpackage.enss;
import defpackage.esiu;
import defpackage.eswh;
import defpackage.eswq;
import defpackage.eswt;
import defpackage.eswu;
import defpackage.esyo;
import defpackage.esys;
import defpackage.fecj;
import defpackage.fpss;
import defpackage.iq;
import defpackage.qfp;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class NetworkConsentChimeraActivity extends qfp implements DialogInterface.OnClickListener {
    public static final asot j = asot.b("NlpConsent", asej.LOCATION);
    private iq k;
    private int l;
    private int m;
    private enss n = null;

    private final void a(boolean z) {
        final int intExtra;
        if (this.n != null) {
            return;
        }
        asot asotVar = j;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 5638)).B("consent dialog choice was %b", Boolean.valueOf(z));
        if (!isFinishing()) {
            finish();
        }
        if (!z) {
            if (Build.VERSION.SDK_INT < 28) {
                this.n = ensm.a;
                return;
            }
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 5639)).x("setting location off");
            enss e = canf.c().e(System.currentTimeMillis() + fpss.b());
            eiho eihoVar = new eiho() { // from class: cakb
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    ((ejhf) ((ejhf) ((ejhf) NetworkConsentChimeraActivity.j.i()).s((Throwable) obj)).ah((char) 5637)).x("Error suppressing next LOWD invocation from NLP consent dialog");
                    return null;
                }
            };
            enre enreVar = enre.a;
            this.n = enps.g(enox.f(e, Throwable.class, eihoVar, enreVar), new enqc() { // from class: cakc
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    return bwth.c(NetworkConsentChimeraActivity.this, false, bwti.a);
                }
            }, enreVar);
            return;
        }
        bwti bwtiVar = bwti.a;
        eswq eswqVar = eswq.SOURCE_QUICK_SETTINGS;
        fecj v = esys.a.v();
        esiu esiuVar = esiu.Y;
        if (!v.b.L()) {
            v.U();
        }
        esys esysVar = (esys) v.b;
        esysVar.c = esiuVar.a();
        esysVar.b |= 1;
        fecj v2 = esyo.a.v();
        fecj v3 = eswh.a.v();
        if (!v3.b.L()) {
            v3.U();
        }
        eswh eswhVar = (eswh) v3.b;
        eswhVar.b |= 1;
        eswhVar.c = true;
        eswt eswtVar = (eswt) eswu.a.v();
        eswtVar.k(this.l);
        if (!v3.b.L()) {
            v3.U();
        }
        eswh eswhVar2 = (eswh) v3.b;
        eswu eswuVar = (eswu) eswtVar.Q();
        eswuVar.getClass();
        eswhVar2.d = eswuVar;
        eswhVar2.b |= 2;
        eswu eswuVar2 = eswu.a;
        eswt eswtVar2 = (eswt) eswuVar2.v();
        eswtVar2.k(R.string.common_agree);
        if (!v3.b.L()) {
            v3.U();
        }
        eswh eswhVar3 = (eswh) v3.b;
        eswu eswuVar3 = (eswu) eswtVar2.Q();
        eswuVar3.getClass();
        eswhVar3.f = eswuVar3;
        eswhVar3.b |= 8;
        eswt eswtVar3 = (eswt) eswuVar2.v();
        eswtVar3.k(R.string.common_disagree);
        if (!v3.b.L()) {
            v3.U();
        }
        eswh eswhVar4 = (eswh) v3.b;
        eswu eswuVar4 = (eswu) eswtVar3.Q();
        eswuVar4.getClass();
        eswhVar4.g = eswuVar4;
        eswhVar4.b |= 16;
        eswt eswtVar4 = (eswt) eswuVar2.v();
        eswtVar4.k(this.m);
        if (!v3.b.L()) {
            v3.U();
        }
        eswh eswhVar5 = (eswh) v3.b;
        eswu eswuVar5 = (eswu) eswtVar4.Q();
        eswuVar5.getClass();
        eswhVar5.e = eswuVar5;
        eswhVar5.b |= 4;
        if (!v2.b.L()) {
            v2.U();
        }
        esyo esyoVar = (esyo) v2.b;
        eswh eswhVar6 = (eswh) v3.Q();
        eswhVar6.getClass();
        esyoVar.e = eswhVar6;
        esyoVar.b |= 1;
        if (!v.b.L()) {
            v.U();
        }
        esys esysVar2 = (esys) v.b;
        esyo esyoVar2 = (esyo) v2.Q();
        esyoVar2.getClass();
        esysVar2.d = esyoVar2;
        esysVar2.b |= 8;
        this.n = bwth.e(this, true, bwtiVar, eswqVar, (esys) v.Q());
        if (Build.VERSION.SDK_INT > 28 || (intExtra = getIntent().getIntExtra("newMode", 0)) == 0) {
            return;
        }
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 5640)).z("setting location mode to %d", intExtra);
        this.n = enps.g((enss) Objects.requireNonNull(this.n), new enqc() { // from class: caka
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                return bwth.d(NetworkConsentChimeraActivity.this, intExtra, bwti.a);
            }
        }, enre.a);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        a(i == -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d  */
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.provider.network.NetworkConsentChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        enss enssVar = this.n;
        if (enssVar != null) {
            try {
                enssVar.get();
            } catch (InterruptedException | ExecutionException e) {
                boolean z = e instanceof ExecutionException;
                Throwable th = e;
                if (z) {
                    th = e.getCause();
                }
                ((ejhf) ((ejhf) ((ejhf) j.i()).s(th)).ah((char) 5645)).x("failed to set NLP consent from NLP consent dialog");
            }
        }
        super.onDestroy();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        a(false);
        super.onPause();
    }
}
