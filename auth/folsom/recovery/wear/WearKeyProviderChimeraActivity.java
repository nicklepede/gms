package com.google.android.gms.auth.folsom.recovery.wear;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.auth.folsom.recovery.wear.WearKeyProviderChimeraActivity;
import defpackage.aby;
import defpackage.aca;
import defpackage.acr;
import defpackage.adhr;
import defpackage.adng;
import defpackage.atzb;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.ryb;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class WearKeyProviderChimeraActivity extends ryb {
    public static final ausn h = adng.b("WearKeyProvider");
    public adhr i;
    public aca j;
    private String k;
    private String l;
    private String m;

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        ausn ausnVar = h;
        ((eluo) ausnVar.h()).x("onCreate");
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.k = intent.getStringExtra("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME");
        this.l = intent.getStringExtra("SECURITY_DOMAIN");
        this.m = intent.getStringExtra("com.google.android.gms.auth.folsom.EXTRA_RECEIVER_NODE_ID");
        setTheme(R.style.Theme_GoogleMaterial_Light_NoActionBar);
        if (TextUtils.isEmpty(this.k) || TextUtils.isEmpty(this.l) || TextUtils.isEmpty(this.m)) {
            ((eluo) ausnVar.j()).T("Invalid param - domain: %s, account %s, node %s", this.l, this.k, this.m);
            finish();
            return;
        }
        adhr adhrVar = (adhr) new jxw(this).a(adhr.class);
        this.i = adhrVar;
        String str = this.k;
        atzb.s(str);
        String str2 = this.l;
        atzb.s(str2);
        String str3 = this.m;
        atzb.s(str3);
        if (adhrVar.g) {
            ((eluo) adhr.a.h()).x("view model already initialized");
        } else {
            adhrVar.g = true;
            adhrVar.c = str;
            adhrVar.b = str2;
            adhrVar.d = str3;
        }
        this.i.a(false);
        setContentView(R.layout.webview_activity);
        this.i.e.ig(new jvs() { // from class: adhm
            @Override // defpackage.jvs
            public final void a(Object obj) {
                WearKeyProviderChimeraActivity wearKeyProviderChimeraActivity = WearKeyProviderChimeraActivity.this;
                wearKeyProviderChimeraActivity.i.b(adhb.CHECK_YOUR_PHONE);
                ((eluo) WearKeyProviderChimeraActivity.h.h()).x("Launching resolution");
                wearKeyProviderChimeraActivity.j.b(new acj(((atas) obj).b()).a());
            }
        });
        this.i.f.ig(new jvs() { // from class: adhn
            @Override // defpackage.jvs
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    WearKeyProviderChimeraActivity.this.finish();
                }
            }
        });
        acr acrVar = new acr();
        final adhr adhrVar2 = this.i;
        Objects.requireNonNull(adhrVar2);
        this.j = registerForActivityResult(acrVar, new aby() { // from class: adho
            @Override // defpackage.aby
            public final void jF(Object obj) {
                int i = ((ActivityResult) obj).a;
                adhr adhrVar3 = adhr.this;
                if (i == -1) {
                    ((eluo) adhr.a.h()).x("Getting key again after challenge");
                    adhrVar3.a(true);
                } else {
                    ((eluo) adhr.a.h()).x("Activity did not end with RESULT_OK");
                    adhrVar3.b(adhb.NON_RECOVERABLE_ERROR_AFTER_CHALLENGE);
                    adhrVar3.f.ih(true);
                }
            }
        });
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        this.i.e.k(this);
        super.onDestroy();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        ((eluo) h.h()).B("New intent: %s", intent);
        super.onNewIntent(intent);
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME", this.k);
        bundle.putString("SECURITY_DOMAIN", this.l);
        bundle.putString("com.google.android.gms.auth.folsom.EXTRA_RECEIVER_NODE_ID", this.m);
        super.onSaveInstanceState(bundle);
    }
}
