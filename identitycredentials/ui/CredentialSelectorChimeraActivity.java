package com.google.android.gms.identitycredentials.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.identitycredentials.ui.CredentialSelectorChimeraActivity;
import defpackage.abg;
import defpackage.abl;
import defpackage.acq;
import defpackage.boui;
import defpackage.bouj;
import defpackage.boum;
import defpackage.bowy;
import defpackage.bpcw;
import defpackage.bpda;
import defpackage.bpdb;
import defpackage.bpdd;
import defpackage.bpde;
import defpackage.bpdf;
import defpackage.bpdg;
import defpackage.bpdh;
import defpackage.bpdl;
import defpackage.bpeq;
import defpackage.flq;
import defpackage.fmb;
import defpackage.fne;
import defpackage.fox;
import defpackage.fvp;
import defpackage.fvq;
import defpackage.fxqu;
import defpackage.fxwd;
import defpackage.fxwo;
import defpackage.fxws;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.jax;
import defpackage.jxm;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialSelectorChimeraActivity extends ryt {
    public ResultReceiver j;
    public int k;
    private boum l;
    private final fxqu m;

    public CredentialSelectorChimeraActivity() {
        bpdf bpdfVar = new bpdf(this);
        int i = fxya.a;
        this.m = new jxm(new fxxg(bpdl.class), new bpdg(this), bpdfVar, new bpdh(this));
    }

    public static /* synthetic */ void g(CredentialSelectorChimeraActivity credentialSelectorChimeraActivity, String str) {
        if (str != null) {
            ResultReceiver resultReceiver = credentialSelectorChimeraActivity.j;
            if (resultReceiver != null) {
                resultReceiver.send(0, bpcw.a(str, null));
            }
            credentialSelectorChimeraActivity.b(0, bpcw.g(credentialSelectorChimeraActivity.k, str, null));
            return;
        }
        ResultReceiver resultReceiver2 = credentialSelectorChimeraActivity.j;
        if (resultReceiver2 != null) {
            resultReceiver2.send(0, null);
        }
        credentialSelectorChimeraActivity.setResult(0, null);
        credentialSelectorChimeraActivity.finish();
        credentialSelectorChimeraActivity.overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Exception exc) {
        if (exc != null) {
            Log.e("CredentialSelector", "Failed to show the credential selector; closing the activity", exc);
        }
        c();
    }

    public final bpdl a() {
        return (bpdl) this.m.a();
    }

    public final void b(int i, Intent intent) {
        setResult(i, intent);
        finish();
        overridePendingTransition(0, 0);
    }

    public final void c() {
        int i = this.k;
        g(this, i != 0 ? i + (-1) != 1 ? "android.credentials.GetCredentialException.TYPE_USER_CANCELED" : new jax((byte[]) null).a : null);
    }

    public final void h(fmb fmbVar, final int i) {
        int i2;
        int i3 = i & 6;
        fmb al = fmbVar.al(77749666);
        if (i3 == 0) {
            i2 = (true != al.W(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && al.Z()) {
            al.E();
        } else {
            acq acqVar = new acq();
            al.J(5004770);
            boolean W = al.W(this);
            Object i4 = al.i();
            if (W || i4 == flq.a) {
                i4 = new fxwo() { // from class: bpcx
                    @Override // defpackage.fxwo
                    public final Object a(Object obj) {
                        ActivityResult activityResult = (ActivityResult) obj;
                        fxxm.f(activityResult, "it");
                        Intent intent = activityResult.b;
                        int i5 = activityResult.a;
                        bpdl a = CredentialSelectorChimeraActivity.this.a();
                        boxd boxdVar = new boxd(i5, intent);
                        bpdq bpdqVar = a.a().e;
                        int i6 = boxdVar.a;
                        Intent intent2 = boxdVar.b;
                        if (i6 == 0) {
                            a.i(bpdp.a(a.a(), null, null, null, null, boxe.a, null, 79));
                        } else if (bpdqVar == null) {
                            Log.w("CredentialSelector", "Illegal state: received a provider result but found no matching entry.");
                            a.g();
                        } else if (intent2 == null) {
                            Log.w("CredentialSelector", "The provider activity succeeded with null result.");
                            a.g();
                        } else {
                            a.i(bpdp.a(a.a(), null, null, null, null, null, new bowy(bowz.c, intent2), 63));
                        }
                        return fxrq.a;
                    }
                };
                al.M(i4);
            }
            al.w();
            abl a = abg.a(acqVar, (fxwo) i4, al);
            bowy bowyVar = a().a().g;
            al.J(5004770);
            boolean W2 = al.W(this);
            Object i5 = al.i();
            if (W2 || i5 == flq.a) {
                i5 = new bpda(this, null);
                al.M(i5);
            }
            al.w();
            fne.f(bowyVar, (fxws) i5, al);
            fvp e = fvq.e(904320766, new bpdb(this, a().a().d, a, a().a().c, a().a().b), al);
            al.J(5004770);
            boolean W3 = al.W(this);
            Object i6 = al.i();
            if (W3 || i6 == flq.a) {
                i6 = new fxwd() { // from class: bpcy
                    @Override // defpackage.fxwd
                    public final Object a() {
                        CredentialSelectorChimeraActivity.this.a().h();
                        return fxrq.a;
                    }
                };
                al.M(i6);
            }
            al.w();
            bpeq.a(e, (fxwd) i6, al, 6);
        }
        fox ac = al.ac();
        if (ac != null) {
            ac.d = new fxws() { // from class: bpcz
                @Override // defpackage.fxws
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    CredentialSelectorChimeraActivity.this.h((fmb) obj, foy.a(i7 | 1));
                    return fxrq.a;
                }
            };
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Exception exc;
        boum d;
        int i;
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        try {
            Intent intent = getIntent();
            fxxm.e(intent, "getIntent(...)");
            ResultReceiver c = bpcw.c(intent);
            this.j = c;
            Log.w("CredentialSelector", "ResultReceiver: " + c);
            Intent intent2 = getIntent();
            fxxm.e(intent2, "getIntent(...)");
            d = bpcw.d(intent2);
        } catch (Exception e) {
            e = e;
        }
        try {
            if (d == null) {
                throw new IllegalStateException("Request info cannot be null");
            }
            this.l = d;
            boum boumVar = null;
            if (d == null) {
                try {
                    fxxm.j("request");
                    d = null;
                } catch (Exception e2) {
                    exc = e2;
                    k(exc);
                }
            }
            if (d instanceof boui) {
                i = 2;
            } else {
                boolean z = d instanceof bouj;
                i = 1;
            }
            this.k = i;
            getOnBackPressedDispatcher().b(this, new bpde(this));
            if (bundle == null) {
                bpdl a = a();
                boum boumVar2 = this.l;
                if (boumVar2 == null) {
                    fxxm.j("request");
                } else {
                    boumVar = boumVar2;
                }
                Context applicationContext = getApplicationContext();
                fxxm.e(applicationContext, "getApplicationContext(...)");
                bpdl.j(a, boumVar, applicationContext);
            }
            ComposeView composeView = new ComposeView(this, null, 0, 6, null);
            composeView.a(new fvp(-76635275, true, new bpdd(this)));
            setContentView(composeView);
        } catch (Exception e3) {
            e = e3;
            exc = e;
            k(exc);
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        fxxm.f(intent, "intent");
        super.onNewIntent(intent);
        try {
            ResultReceiver c = bpcw.c(intent);
            if (c == null) {
                return;
            }
            this.j = c;
            setIntent(intent);
            boum d = bpcw.d(intent);
            if (d == null) {
                throw new IllegalStateException("Request info cannot be null");
            }
            this.l = d;
            bpdl a = a();
            boum boumVar = this.l;
            if (boumVar == null) {
                fxxm.j("request");
                boumVar = null;
            }
            Context applicationContext = getApplicationContext();
            fxxm.e(applicationContext, "getApplicationContext(...)");
            bpdl.j(a, boumVar, applicationContext);
        } catch (Exception e) {
            k(e);
        }
    }
}
