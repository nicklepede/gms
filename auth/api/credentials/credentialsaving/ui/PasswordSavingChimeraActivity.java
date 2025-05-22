package com.google.android.gms.auth.api.credentials.credentialsaving.ui;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.auth.api.credentials.credentialsaving.ui.PasswordSavingChimeraActivity;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aby;
import defpackage.aca;
import defpackage.acr;
import defpackage.arcm;
import defpackage.atzs;
import defpackage.aura;
import defpackage.ausn;
import defpackage.boiy;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonm;
import defpackage.bonp;
import defpackage.edxt;
import defpackage.ekvh;
import defpackage.ekvi;
import defpackage.ekwb;
import defpackage.enso;
import defpackage.ensq;
import defpackage.ew;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.itn;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.yes;
import defpackage.yez;
import defpackage.ygq;
import defpackage.ygz;
import defpackage.yiw;
import defpackage.ykv;
import defpackage.ykw;
import defpackage.zsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PasswordSavingChimeraActivity extends rxx {
    private static final ausn n = zsi.b("PasswordSavingChimeraActivity");
    public ykw j;
    public boni k;
    public String l;
    public aca m;

    public final void a(yez yezVar) {
        Account account;
        yezVar.f(n);
        boni boniVar = this.k;
        ykw ykwVar = this.j;
        if (ykwVar != null && (account = ykwVar.r) != null) {
            boniVar = bonh.a(this, account.name);
        }
        fgrc v = ensq.a.v();
        String str = this.l;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        ensq ensqVar = (ensq) fgriVar;
        str.getClass();
        ensqVar.b |= 2;
        ensqVar.e = str;
        if (!fgriVar.L()) {
            v.U();
        }
        ensq ensqVar2 = (ensq) v.b;
        ensqVar2.d = 17;
        ensqVar2.b |= 1;
        fgrc l = yezVar.l();
        if (!l.b.L()) {
            l.U();
        }
        enso ensoVar = (enso) l.b;
        enso ensoVar2 = enso.a;
        ensoVar.f = 206;
        ensoVar.b |= 8;
        if (!v.b.L()) {
            v.U();
        }
        ensq ensqVar3 = (ensq) v.b;
        enso ensoVar3 = (enso) l.Q();
        ensoVar3.getClass();
        ensqVar3.s = ensoVar3;
        ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boniVar.a((ensq) v.Q());
        setResult(yezVar.a(), yezVar.b());
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        this.k = bonh.a(this, null);
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) atzs.b(getIntent(), "save_password_request", SavePasswordRequest.CREATOR);
        if (savePasswordRequest == null) {
            this.l = bonp.a();
            a((yez) yez.c().c(28453, ygq.a("savePasswordRequest")));
            return;
        }
        this.l = (String) ekvh.c(savePasswordRequest.b, bonp.a());
        yes.a(this, savePasswordRequest.c);
        super.onCreate(bundle);
        getContainerActivity();
        int i = edxt.a;
        String q = aura.q(this);
        bonm.a(this, new ekwb() { // from class: yix
            @Override // defpackage.ekwb
            public final void lY(Object obj) {
                PasswordSavingChimeraActivity passwordSavingChimeraActivity = PasswordSavingChimeraActivity.this;
                passwordSavingChimeraActivity.k.a(bono.b(207, (bonn) obj, passwordSavingChimeraActivity.l));
            }
        });
        if (q == null) {
            a((yez) yez.c().c(28442, "Cannot get calling package name."));
            return;
        }
        ekvi a = boiy.a(getApplication(), q);
        if (!a.h()) {
            a((yez) yez.c().c(28442, "Cannot get app name and icon."));
            return;
        }
        ekvi a2 = arcm.a(this, q);
        if (!a2.h()) {
            a((yez) yez.c().c(28442, "Cannot get app ID."));
            return;
        }
        ykw ykwVar = (ykw) new jxw(this, new ykv(getApplication(), (String) a2.c(), q, this.l, (itn) a.c(), savePasswordRequest)).a(ykw.class);
        this.j = ykwVar;
        ykwVar.l.g(this, new jvs() { // from class: yiy
            @Override // defpackage.jvs
            public final void a(Object obj) {
                PasswordSavingChimeraActivity.this.m.b(new acj((PendingIntent) obj).a());
            }
        });
        this.m = registerForActivityResult(new acr(), new aby() { // from class: yiz
            @Override // defpackage.aby
            public final void jF(Object obj) {
                int i2 = ((ActivityResult) obj).a;
                ykw ykwVar2 = PasswordSavingChimeraActivity.this.j;
                if (i2 != -1) {
                    ykwVar2.j.k(16, "Zuul key retrieval failed.");
                } else {
                    ykwVar2.p.add(ykwVar2.r);
                    ykwVar2.j.f(boqf.ACCOUNT_CONFIRMATION);
                }
            }
        });
        this.j.m.g(this, new jvs() { // from class: yja
            @Override // defpackage.jvs
            public final void a(Object obj) {
                PasswordSavingChimeraActivity.this.a((yez) obj);
            }
        });
        new jxw(this).a(ygz.class);
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("PasswordSavingBottomSheetDialogFragment") == null) {
            new yiw().show(supportFragmentManager, "PasswordSavingBottomSheetDialogFragment");
        }
    }
}
