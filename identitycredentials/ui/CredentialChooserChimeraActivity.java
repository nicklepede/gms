package com.google.android.gms.identitycredentials.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.identitycredentials.ui.CredentialChooserChimeraActivity;
import defpackage.abg;
import defpackage.abl;
import defpackage.boug;
import defpackage.bowy;
import defpackage.bpcq;
import defpackage.bpcr;
import defpackage.bpct;
import defpackage.bpcu;
import defpackage.bpcv;
import defpackage.bpjc;
import defpackage.bpjj;
import defpackage.bpjq;
import defpackage.bpne;
import defpackage.bpnf;
import defpackage.bpqm;
import defpackage.bpqo;
import defpackage.bpqs;
import defpackage.flq;
import defpackage.fmb;
import defpackage.fne;
import defpackage.fox;
import defpackage.frc;
import defpackage.fvp;
import defpackage.fxqu;
import defpackage.fxwd;
import defpackage.fxwo;
import defpackage.fxws;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.jxm;
import defpackage.jyl;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class CredentialChooserChimeraActivity extends ryt {
    private final fxqu j;

    public CredentialChooserChimeraActivity() {
        fxwd fxwdVar = new fxwd() { // from class: bpcp
            @Override // defpackage.fxwd
            public final Object a() {
                CredentialChooserChimeraActivity credentialChooserChimeraActivity = CredentialChooserChimeraActivity.this;
                Intent intent = credentialChooserChimeraActivity.getIntent();
                fxxm.e(intent, "getIntent(...)");
                return new bpjk(intent, credentialChooserChimeraActivity, System.currentTimeMillis());
            }
        };
        int i = fxya.a;
        this.j = new jxm(new fxxg(bpjj.class), new bpcu(this), fxwdVar, new bpcv(this));
    }

    private static final bpjq f(frc frcVar) {
        return (bpjq) frcVar.a();
    }

    public final bpjj a() {
        return (bpjj) this.j.a();
    }

    public final void b() {
        finish();
        overridePendingTransition(0, 0);
    }

    public final void c(fmb fmbVar, final int i) {
        int i2;
        int i3 = i & 6;
        fmb al = fmbVar.al(849457018);
        if (i3 == 0) {
            i2 = (true != al.W(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && al.Z()) {
            al.E();
        } else {
            boug bougVar = new boug();
            al.J(5004770);
            boolean W = al.W(this);
            Object i4 = al.i();
            if (W || i4 == flq.a) {
                i4 = new fxwo() { // from class: bpcn
                    @Override // defpackage.fxwo
                    public final Object a(Object obj) {
                        ActivityResult activityResult = (ActivityResult) obj;
                        fxxm.f(activityResult, "it");
                        Intent intent = activityResult.b;
                        int i5 = activityResult.a;
                        bpjj a = CredentialChooserChimeraActivity.this.a();
                        boxd boxdVar = new boxd(i5, intent);
                        fynx fynxVar = a.d;
                        if (fynxVar.b() != null) {
                            Object b = fynxVar.b();
                            fxxm.c(b);
                            bpjq bpjqVar = (bpjq) b;
                            boxa boxaVar = bpjqVar.c;
                            int i6 = boxdVar.a;
                            Intent intent2 = boxdVar.b;
                            if (i6 == 0) {
                                if (bpjqVar.f) {
                                    a.x();
                                } else {
                                    a.p(boxs.a);
                                    bpjq bpjqVar2 = (bpjq) a.a.b();
                                    fynxVar.f(bpjqVar2 != null ? bpjq.a(bpjqVar2, null, null, null, boxe.a, null, null, 243) : null);
                                }
                            } else if (boxaVar != null) {
                                Intent a2 = bouh.a(new boxp(boxaVar.a, boxaVar.b, boxaVar.c, new boxf(i6, intent2)), a.f);
                                if (boxaVar.f) {
                                    bpjq bpjqVar3 = (bpjq) fynxVar.b();
                                    fynxVar.f(bpjqVar3 != null ? bpjq.a(bpjqVar3, null, null, null, null, new bowy(bowz.b, a2), null, 239) : null);
                                } else if (fryd.m() && a2 != null) {
                                    bpjq bpjqVar4 = (bpjq) fynxVar.b();
                                    fynxVar.f(bpjqVar4 != null ? bpjq.a(bpjqVar4, null, null, null, null, new bowy(bowz.b, a2), null, 239) : null);
                                }
                            } else {
                                Log.w("CredentialSelector", "Illegal state: received a provider result but found no matching entry.");
                                a.r();
                            }
                        }
                        return fxrq.a;
                    }
                };
                al.M(i4);
            }
            al.w();
            abl a = abg.a(bougVar, (fxwo) i4, al);
            frc b = jyl.b(a().a, al);
            bpjq f = f(b);
            bowy bowyVar = f != null ? f.e : null;
            al.J(-1633490746);
            boolean W2 = al.W(f) | al.W(this);
            Object i5 = al.i();
            if (W2 || i5 == flq.a) {
                i5 = new bpcq(f, this, null);
                al.M(i5);
            }
            al.w();
            fne.f(bowyVar, (fxws) i5, al);
            bpnf bpnfVar = f != null ? f.a : null;
            bpjc bpjcVar = f != null ? f.g : null;
            bpqo bpqoVar = f != null ? f.b : null;
            if (bpjcVar != null) {
                al.J(227510482);
                al.w();
                b();
            } else if (f == null || bpnfVar == null || (bpnfVar.e.isEmpty() && (bpnfVar.d.f || bpnfVar.h == null))) {
                if (f != null && bpqoVar != null) {
                    bpqs bpqsVar = bpqoVar.c;
                    if (!bpqsVar.a.isEmpty() || !bpqsVar.b.isEmpty() || (bpqsVar.c != null && !bpqoVar.b.b)) {
                        al.J(228254699);
                        bpqm.h(a(), bpqoVar, a, f.d, al, 584);
                        al.w();
                    }
                }
                al.J(228523438);
                al.w();
                if (f(b) != null) {
                    Log.e("CredentialSelector", "UI wasn't able to render neither get nor create flow");
                    Intent b2 = a().b();
                    if (b2 != null) {
                        setResult(-1, b2);
                    }
                    b();
                }
            } else {
                al.J(227872066);
                bpne.a(a(), bpnfVar, a, f.d, al, 584);
                al.w();
            }
        }
        fox ac = al.ac();
        if (ac != null) {
            ac.d = new fxws() { // from class: bpco
                @Override // defpackage.fxws
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i6 = i;
                    CredentialChooserChimeraActivity.this.c((fmb) obj, foy.a(i6 | 1));
                    return fxrq.a;
                }
            };
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getOnBackPressedDispatcher().b(this, new bpcr(a(), this));
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fvp(1801542457, true, new bpct(this)));
        setContentView(composeView);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        fxxm.f(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        a().w(intent, this, System.currentTimeMillis());
    }
}
