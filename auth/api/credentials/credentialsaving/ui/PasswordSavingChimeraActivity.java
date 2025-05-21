package com.google.android.gms.auth.api.credentials.credentialsaving.ui;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.auth.api.credentials.credentialsaving.ui.PasswordSavingChimeraActivity;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.abt;
import defpackage.abv;
import defpackage.acm;
import defpackage.aozv;
import defpackage.arxd;
import defpackage.asng;
import defpackage.asot;
import defpackage.bmcg;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgu;
import defpackage.bmgx;
import defpackage.eble;
import defpackage.eiic;
import defpackage.eiid;
import defpackage.eiiw;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.ew;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.irx;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.wim;
import defpackage.wit;
import defpackage.wkg;
import defpackage.wkp;
import defpackage.wmm;
import defpackage.wol;
import defpackage.wom;
import defpackage.xul;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PasswordSavingChimeraActivity extends qet {
    private static final asot n = xul.b("PasswordSavingChimeraActivity");
    public wom j;
    public bmgq k;
    public String l;
    public abv m;

    public final void a(wit witVar) {
        Account account;
        witVar.f(n);
        bmgq bmgqVar = this.k;
        wom womVar = this.j;
        if (womVar != null && (account = womVar.r) != null) {
            bmgqVar = bmgp.a(this, account.name);
        }
        fecj v = elfd.a.v();
        String str = this.l;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elfd elfdVar = (elfd) fecpVar;
        str.getClass();
        elfdVar.b |= 2;
        elfdVar.e = str;
        if (!fecpVar.L()) {
            v.U();
        }
        elfd elfdVar2 = (elfd) v.b;
        elfdVar2.d = 17;
        elfdVar2.b |= 1;
        fecj k = witVar.k();
        if (!k.b.L()) {
            k.U();
        }
        elfb elfbVar = (elfb) k.b;
        elfb elfbVar2 = elfb.a;
        elfbVar.f = 206;
        elfbVar.b |= 8;
        if (!v.b.L()) {
            v.U();
        }
        elfd elfdVar3 = (elfd) v.b;
        elfb elfbVar3 = (elfb) k.Q();
        elfbVar3.getClass();
        elfdVar3.s = elfbVar3;
        elfdVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bmgqVar.a((elfd) v.Q());
        setResult(witVar.a(), witVar.b());
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        this.k = bmgp.a(this, null);
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) arxd.b(getIntent(), "save_password_request", SavePasswordRequest.CREATOR);
        if (savePasswordRequest == null) {
            this.l = bmgx.a();
            a((wit) wit.c().c(28453, wkg.a("savePasswordRequest")));
            return;
        }
        this.l = (String) eiic.c(savePasswordRequest.b, bmgx.a());
        wim.a(this, savePasswordRequest.c);
        super.onCreate(bundle);
        getContainerActivity();
        int i = eble.a;
        String q = asng.q(this);
        bmgu.a(this, new eiiw() { // from class: wmn
            @Override // defpackage.eiiw
            public final void lB(Object obj) {
                PasswordSavingChimeraActivity passwordSavingChimeraActivity = PasswordSavingChimeraActivity.this;
                passwordSavingChimeraActivity.k.a(bmgw.b(207, (bmgv) obj, passwordSavingChimeraActivity.l));
            }
        });
        if (q == null) {
            a((wit) wit.c().c(28442, "Cannot get calling package name."));
            return;
        }
        eiid a = bmcg.a(getApplication(), q);
        if (!a.h()) {
            a((wit) wit.c().c(28442, "Cannot get app name and icon."));
            return;
        }
        eiid a2 = aozv.a(this, q);
        if (!a2.h()) {
            a((wit) wit.c().c(28442, "Cannot get app ID."));
            return;
        }
        wom womVar = (wom) new jrh(this, new wol(getApplication(), (String) a2.c(), q, this.l, (irx) a.c(), savePasswordRequest)).a(wom.class);
        this.j = womVar;
        womVar.l.g(this, new jpd() { // from class: wmo
            @Override // defpackage.jpd
            public final void a(Object obj) {
                PasswordSavingChimeraActivity.this.m.b(new ace((PendingIntent) obj).a());
            }
        });
        this.m = registerForActivityResult(new acm(), new abt() { // from class: wmp
            @Override // defpackage.abt
            public final void jq(Object obj) {
                int i2 = ((ActivityResult) obj).a;
                wom womVar2 = PasswordSavingChimeraActivity.this.j;
                if (i2 != -1) {
                    womVar2.j.k(16, "Zuul key retrieval failed.");
                } else {
                    womVar2.p.add(womVar2.r);
                    womVar2.j.f(bmjm.ACCOUNT_CONFIRMATION);
                }
            }
        });
        this.j.m.g(this, new jpd() { // from class: wmq
            @Override // defpackage.jpd
            public final void a(Object obj) {
                PasswordSavingChimeraActivity.this.a((wit) obj);
            }
        });
        new jrh(this).a(wkp.class);
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("PasswordSavingBottomSheetDialogFragment") == null) {
            new wmm().show(supportFragmentManager, "PasswordSavingBottomSheetDialogFragment");
        }
    }
}
