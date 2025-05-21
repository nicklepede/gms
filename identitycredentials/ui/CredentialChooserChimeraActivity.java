package com.google.android.gms.identitycredentials.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.identitycredentials.ui.CredentialChooserChimeraActivity;
import defpackage.abb;
import defpackage.abg;
import defpackage.bmnn;
import defpackage.bmqf;
import defpackage.bmvj;
import defpackage.bmvk;
import defpackage.bmvm;
import defpackage.bmvn;
import defpackage.bmvo;
import defpackage.bnbv;
import defpackage.bncc;
import defpackage.bncj;
import defpackage.bnfx;
import defpackage.bnfy;
import defpackage.bnjf;
import defpackage.bnjh;
import defpackage.bnjl;
import defpackage.fla;
import defpackage.flk;
import defpackage.fmn;
import defpackage.fog;
import defpackage.fql;
import defpackage.fuuw;
import defpackage.fuy;
import defpackage.fvaf;
import defpackage.fvaq;
import defpackage.fvau;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.jqx;
import defpackage.jrw;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class CredentialChooserChimeraActivity extends qfp {
    private final fuuw j;

    public CredentialChooserChimeraActivity() {
        fvaf fvafVar = new fvaf() { // from class: bmvi
            @Override // defpackage.fvaf
            public final Object a() {
                CredentialChooserChimeraActivity credentialChooserChimeraActivity = CredentialChooserChimeraActivity.this;
                Intent intent = credentialChooserChimeraActivity.getIntent();
                fvbo.e(intent, "getIntent(...)");
                return new bncd(intent, credentialChooserChimeraActivity, System.currentTimeMillis());
            }
        };
        int i = fvcc.a;
        this.j = new jqx(new fvbi(bncc.class), new bmvn(this), fvafVar, new bmvo(this));
    }

    private static final bncj f(fql fqlVar) {
        return (bncj) fqlVar.a();
    }

    public final bncc a() {
        return (bncc) this.j.a();
    }

    public final void b() {
        finish();
        overridePendingTransition(0, 0);
    }

    public final void c(flk flkVar, final int i) {
        int i2;
        int i3 = i & 6;
        flk ak = flkVar.ak(849457018);
        if (i3 == 0) {
            i2 = (true != ak.V(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && ak.Y()) {
            ak.D();
        } else {
            bmnn bmnnVar = new bmnn();
            ak.I(5004770);
            boolean V = ak.V(this);
            Object i4 = ak.i();
            if (V || i4 == fla.a) {
                i4 = new fvaq() { // from class: bmvg
                    @Override // defpackage.fvaq
                    public final Object a(Object obj) {
                        ActivityResult activityResult = (ActivityResult) obj;
                        fvbo.f(activityResult, "it");
                        Intent intent = activityResult.b;
                        int i5 = activityResult.a;
                        bncc a = CredentialChooserChimeraActivity.this.a();
                        bmqk bmqkVar = new bmqk(i5, intent);
                        fvrz fvrzVar = a.d;
                        if (fvrzVar.b() != null) {
                            Object b = fvrzVar.b();
                            fvbo.c(b);
                            bncj bncjVar = (bncj) b;
                            bmqh bmqhVar = bncjVar.c;
                            int i6 = bmqkVar.a;
                            Intent intent2 = bmqkVar.b;
                            if (i6 == 0) {
                                if (bncjVar.f) {
                                    a.x();
                                } else {
                                    a.p(bmqz.a);
                                    bncj bncjVar2 = (bncj) a.a.b();
                                    fvrzVar.f(bncjVar2 != null ? bncj.a(bncjVar2, null, null, null, bmql.a, null, null, 243) : null);
                                }
                            } else if (bmqhVar != null) {
                                Intent a2 = bmno.a(new bmqw(bmqhVar.a, bmqhVar.b, bmqhVar.c, new bmqm(i6, intent2)), a.f);
                                if (bmqhVar.f) {
                                    bncj bncjVar3 = (bncj) fvrzVar.b();
                                    fvrzVar.f(bncjVar3 != null ? bncj.a(bncjVar3, null, null, null, null, new bmqf(bmqg.b, a2), null, 239) : null);
                                } else if (fpev.m() && a2 != null) {
                                    bncj bncjVar4 = (bncj) fvrzVar.b();
                                    fvrzVar.f(bncjVar4 != null ? bncj.a(bncjVar4, null, null, null, null, new bmqf(bmqg.b, a2), null, 239) : null);
                                }
                            } else {
                                Log.w("CredentialSelector", "Illegal state: received a provider result but found no matching entry.");
                                a.r();
                            }
                        }
                        return fuvs.a;
                    }
                };
                ak.L(i4);
            }
            ak.v();
            abg a = abb.a(bmnnVar, (fvaq) i4, ak);
            fql b = jrw.b(a().a, ak);
            bncj f = f(b);
            bmqf bmqfVar = f != null ? f.e : null;
            ak.I(-1633490746);
            boolean V2 = ak.V(f) | ak.V(this);
            Object i5 = ak.i();
            if (V2 || i5 == fla.a) {
                i5 = new bmvj(f, this, null);
                ak.L(i5);
            }
            ak.v();
            fmn.f(bmqfVar, (fvau) i5, ak);
            bnfy bnfyVar = f != null ? f.a : null;
            bnbv bnbvVar = f != null ? f.g : null;
            bnjh bnjhVar = f != null ? f.b : null;
            if (bnbvVar != null) {
                ak.I(227510482);
                ak.v();
                b();
            } else if (f == null || bnfyVar == null || (bnfyVar.e.isEmpty() && (bnfyVar.d.f || bnfyVar.h == null))) {
                if (f != null && bnjhVar != null) {
                    bnjl bnjlVar = bnjhVar.c;
                    if (!bnjlVar.a.isEmpty() || !bnjlVar.b.isEmpty() || (bnjlVar.c != null && !bnjhVar.b.b)) {
                        ak.I(228254699);
                        bnjf.h(a(), bnjhVar, a, f.d, ak, 584);
                        ak.v();
                    }
                }
                ak.I(228523438);
                ak.v();
                if (f(b) != null) {
                    Log.e("CredentialSelector", "UI wasn't able to render neither get nor create flow");
                    Intent b2 = a().b();
                    if (b2 != null) {
                        setResult(-1, b2);
                    }
                    b();
                }
            } else {
                ak.I(227872066);
                bnfx.a(a(), bnfyVar, a, f.d, ak, 584);
                ak.v();
            }
        }
        fog ab = ak.ab();
        if (ab != null) {
            ab.d = new fvau() { // from class: bmvh
                @Override // defpackage.fvau
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    CredentialChooserChimeraActivity.this.c((flk) obj, foh.a(i6 | 1));
                    return fuvs.a;
                }
            };
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getOnBackPressedDispatcher().b(this, new bmvk(a(), this));
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fuy(1801542457, true, new bmvm(this)));
        setContentView(composeView);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        fvbo.f(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        a().w(intent, this, System.currentTimeMillis());
    }
}
