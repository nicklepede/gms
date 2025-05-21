package com.google.android.gms.identitycredentials.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.identitycredentials.ui.CredentialSelectorChimeraActivity;
import defpackage.abb;
import defpackage.abg;
import defpackage.acl;
import defpackage.bmnp;
import defpackage.bmnq;
import defpackage.bmnt;
import defpackage.bmqf;
import defpackage.bmvp;
import defpackage.bmvt;
import defpackage.bmvu;
import defpackage.bmvw;
import defpackage.bmvx;
import defpackage.bmvy;
import defpackage.bmvz;
import defpackage.bmwa;
import defpackage.bmwe;
import defpackage.bmxj;
import defpackage.fla;
import defpackage.flk;
import defpackage.fmn;
import defpackage.fog;
import defpackage.fuuw;
import defpackage.fuy;
import defpackage.fuz;
import defpackage.fvaf;
import defpackage.fvaq;
import defpackage.fvau;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.izh;
import defpackage.jqx;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CredentialSelectorChimeraActivity extends qfp {
    public ResultReceiver j;
    public int k;
    private bmnt l;
    private final fuuw m;

    public CredentialSelectorChimeraActivity() {
        bmvy bmvyVar = new bmvy(this);
        int i = fvcc.a;
        this.m = new jqx(new fvbi(bmwe.class), new bmvz(this), bmvyVar, new bmwa(this));
    }

    public static /* synthetic */ void g(CredentialSelectorChimeraActivity credentialSelectorChimeraActivity, String str) {
        if (str != null) {
            ResultReceiver resultReceiver = credentialSelectorChimeraActivity.j;
            if (resultReceiver != null) {
                resultReceiver.send(0, bmvp.a(str, null));
            }
            credentialSelectorChimeraActivity.b(0, bmvp.g(credentialSelectorChimeraActivity.k, str, null));
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

    public final bmwe a() {
        return (bmwe) this.m.a();
    }

    public final void b(int i, Intent intent) {
        setResult(i, intent);
        finish();
        overridePendingTransition(0, 0);
    }

    public final void c() {
        int i = this.k;
        g(this, i != 0 ? i + (-1) != 1 ? "android.credentials.GetCredentialException.TYPE_USER_CANCELED" : new izh((byte[]) null).a : null);
    }

    public final void h(flk flkVar, final int i) {
        int i2;
        int i3 = i & 6;
        flk ak = flkVar.ak(77749666);
        if (i3 == 0) {
            i2 = (true != ak.V(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && ak.Y()) {
            ak.D();
        } else {
            acl aclVar = new acl();
            ak.I(5004770);
            boolean V = ak.V(this);
            Object i4 = ak.i();
            if (V || i4 == fla.a) {
                i4 = new fvaq() { // from class: bmvq
                    @Override // defpackage.fvaq
                    public final Object a(Object obj) {
                        ActivityResult activityResult = (ActivityResult) obj;
                        fvbo.f(activityResult, "it");
                        Intent intent = activityResult.b;
                        int i5 = activityResult.a;
                        bmwe a = CredentialSelectorChimeraActivity.this.a();
                        bmqk bmqkVar = new bmqk(i5, intent);
                        bmwj bmwjVar = a.a().e;
                        int i6 = bmqkVar.a;
                        Intent intent2 = bmqkVar.b;
                        if (i6 == 0) {
                            a.i(bmwi.a(a.a(), null, null, null, null, bmql.a, null, 79));
                        } else if (bmwjVar == null) {
                            Log.w("CredentialSelector", "Illegal state: received a provider result but found no matching entry.");
                            a.g();
                        } else if (intent2 == null) {
                            Log.w("CredentialSelector", "The provider activity succeeded with null result.");
                            a.g();
                        } else {
                            a.i(bmwi.a(a.a(), null, null, null, null, null, new bmqf(bmqg.c, intent2), 63));
                        }
                        return fuvs.a;
                    }
                };
                ak.L(i4);
            }
            ak.v();
            abg a = abb.a(aclVar, (fvaq) i4, ak);
            bmqf bmqfVar = a().a().g;
            ak.I(5004770);
            boolean V2 = ak.V(this);
            Object i5 = ak.i();
            if (V2 || i5 == fla.a) {
                i5 = new bmvt(this, null);
                ak.L(i5);
            }
            ak.v();
            fmn.f(bmqfVar, (fvau) i5, ak);
            fuy e = fuz.e(904320766, new bmvu(this, a().a().d, a, a().a().c, a().a().b), ak);
            ak.I(5004770);
            boolean V3 = ak.V(this);
            Object i6 = ak.i();
            if (V3 || i6 == fla.a) {
                i6 = new fvaf() { // from class: bmvr
                    @Override // defpackage.fvaf
                    public final Object a() {
                        CredentialSelectorChimeraActivity.this.a().h();
                        return fuvs.a;
                    }
                };
                ak.L(i6);
            }
            ak.v();
            bmxj.a(e, (fvaf) i6, ak, 6);
        }
        fog ab = ak.ab();
        if (ab != null) {
            ab.d = new fvau() { // from class: bmvs
                @Override // defpackage.fvau
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i;
                    CredentialSelectorChimeraActivity.this.h((flk) obj, foh.a(i7 | 1));
                    return fuvs.a;
                }
            };
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Exception exc;
        bmnt d;
        int i;
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        try {
            Intent intent = getIntent();
            fvbo.e(intent, "getIntent(...)");
            ResultReceiver c = bmvp.c(intent);
            this.j = c;
            Log.w("CredentialSelector", "ResultReceiver: " + c);
            Intent intent2 = getIntent();
            fvbo.e(intent2, "getIntent(...)");
            d = bmvp.d(intent2);
        } catch (Exception e) {
            e = e;
        }
        try {
            if (d == null) {
                throw new IllegalStateException("Request info cannot be null");
            }
            this.l = d;
            bmnt bmntVar = null;
            if (d == null) {
                try {
                    fvbo.j("request");
                    d = null;
                } catch (Exception e2) {
                    exc = e2;
                    k(exc);
                }
            }
            if (d instanceof bmnp) {
                i = 2;
            } else {
                boolean z = d instanceof bmnq;
                i = 1;
            }
            this.k = i;
            getOnBackPressedDispatcher().b(this, new bmvx(this));
            if (bundle == null) {
                bmwe a = a();
                bmnt bmntVar2 = this.l;
                if (bmntVar2 == null) {
                    fvbo.j("request");
                } else {
                    bmntVar = bmntVar2;
                }
                Context applicationContext = getApplicationContext();
                fvbo.e(applicationContext, "getApplicationContext(...)");
                bmwe.j(a, bmntVar, applicationContext);
            }
            ComposeView composeView = new ComposeView(this, null, 0, 6, null);
            composeView.a(new fuy(-76635275, true, new bmvw(this)));
            setContentView(composeView);
        } catch (Exception e3) {
            e = e3;
            exc = e;
            k(exc);
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        fvbo.f(intent, "intent");
        super.onNewIntent(intent);
        try {
            ResultReceiver c = bmvp.c(intent);
            if (c == null) {
                return;
            }
            this.j = c;
            setIntent(intent);
            bmnt d = bmvp.d(intent);
            if (d == null) {
                throw new IllegalStateException("Request info cannot be null");
            }
            this.l = d;
            bmwe a = a();
            bmnt bmntVar = this.l;
            if (bmntVar == null) {
                fvbo.j("request");
                bmntVar = null;
            }
            Context applicationContext = getApplicationContext();
            fvbo.e(applicationContext, "getApplicationContext(...)");
            bmwe.j(a, bmntVar, applicationContext);
        } catch (Exception e) {
            k(e);
        }
    }
}
