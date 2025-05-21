package com.google.android.gms.auth.folsom.recovery.wear;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.auth.folsom.recovery.wear.WearKeyProviderChimeraActivity;
import defpackage.abhr;
import defpackage.abng;
import defpackage.abt;
import defpackage.abv;
import defpackage.acm;
import defpackage.arwm;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qex;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class WearKeyProviderChimeraActivity extends qex {
    public static final asot h = abng.b("WearKeyProvider");
    public abhr i;
    public abv j;
    private String k;
    private String l;
    private String m;

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        asot asotVar = h;
        ((ejhf) asotVar.h()).x("onCreate");
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.k = intent.getStringExtra("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME");
        this.l = intent.getStringExtra("SECURITY_DOMAIN");
        this.m = intent.getStringExtra("com.google.android.gms.auth.folsom.EXTRA_RECEIVER_NODE_ID");
        setTheme(R.style.Theme_GoogleMaterial_Light_NoActionBar);
        if (TextUtils.isEmpty(this.k) || TextUtils.isEmpty(this.l) || TextUtils.isEmpty(this.m)) {
            ((ejhf) asotVar.j()).T("Invalid param - domain: %s, account %s, node %s", this.l, this.k, this.m);
            finish();
            return;
        }
        abhr abhrVar = (abhr) new jrh(this).a(abhr.class);
        this.i = abhrVar;
        String str = this.k;
        arwm.s(str);
        String str2 = this.l;
        arwm.s(str2);
        String str3 = this.m;
        arwm.s(str3);
        if (abhrVar.g) {
            ((ejhf) abhr.a.h()).x("view model already initialized");
        } else {
            abhrVar.g = true;
            abhrVar.c = str;
            abhrVar.b = str2;
            abhrVar.d = str3;
        }
        this.i.a(false);
        setContentView(R.layout.webview_activity);
        this.i.e.hR(new jpd() { // from class: abhm
            @Override // defpackage.jpd
            public final void a(Object obj) {
                WearKeyProviderChimeraActivity wearKeyProviderChimeraActivity = WearKeyProviderChimeraActivity.this;
                wearKeyProviderChimeraActivity.i.b(abhb.CHECK_YOUR_PHONE);
                ((ejhf) WearKeyProviderChimeraActivity.h.h()).x("Launching resolution");
                wearKeyProviderChimeraActivity.j.b(new ace(((aqyd) obj).b()).a());
            }
        });
        this.i.f.hR(new jpd() { // from class: abhn
            @Override // defpackage.jpd
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    WearKeyProviderChimeraActivity.this.finish();
                }
            }
        });
        acm acmVar = new acm();
        final abhr abhrVar2 = this.i;
        Objects.requireNonNull(abhrVar2);
        this.j = registerForActivityResult(acmVar, new abt() { // from class: abho
            @Override // defpackage.abt
            public final void jq(Object obj) {
                int i = ((ActivityResult) obj).a;
                abhr abhrVar3 = abhr.this;
                if (i == -1) {
                    ((ejhf) abhr.a.h()).x("Getting key again after challenge");
                    abhrVar3.a(true);
                } else {
                    ((ejhf) abhr.a.h()).x("Activity did not end with RESULT_OK");
                    abhrVar3.b(abhb.NON_RECOVERABLE_ERROR_AFTER_CHALLENGE);
                    abhrVar3.f.hS(true);
                }
            }
        });
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        this.i.e.k(this);
        super.onDestroy();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        ((ejhf) h.h()).B("New intent: %s", intent);
        super.onNewIntent(intent);
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME", this.k);
        bundle.putString("SECURITY_DOMAIN", this.l);
        bundle.putString("com.google.android.gms.auth.folsom.EXTRA_RECEIVER_NODE_ID", this.m);
        super.onSaveInstanceState(bundle);
    }
}
