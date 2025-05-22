package com.google.android.gms.auth.api.credentials.credman.passwordmanager;

import android.app.PendingIntent;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.credman.passwordmanager.GooglePasswordManagerProxyChimeraActivity;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import defpackage.aby;
import defpackage.aca;
import defpackage.acr;
import defpackage.atzs;
import defpackage.ausn;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonp;
import defpackage.ektg;
import defpackage.ekvh;
import defpackage.enqp;
import defpackage.enqs;
import defpackage.ensq;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.yeu;
import defpackage.ygq;
import defpackage.ymo;
import defpackage.ytr;
import defpackage.yts;
import defpackage.yut;
import defpackage.zsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GooglePasswordManagerProxyChimeraActivity extends rxx {
    private static final ausn l = zsi.b("GooglePasswordManagerProxyChimeraActivity");
    public yts j;
    public aca k;
    private boni m;
    private String n;
    private CallingAppInfoCompat o;

    private final void k(String str) {
        a((ymo) new yeu(ektg.a, (int[]) null).c(28453, str));
    }

    public final void a(ymo ymoVar) {
        ymoVar.f(l);
        fgrc v = enqp.a.v();
        if (!v.b.L()) {
            v.U();
        }
        enqp enqpVar = (enqp) v.b;
        enqpVar.c = 1;
        enqpVar.b |= 1;
        yut.a(v, this.o);
        enqs enqsVar = (enqs) enqs.a.v().Q();
        if (!v.b.L()) {
            v.U();
        }
        enqp enqpVar2 = (enqp) v.b;
        enqsVar.getClass();
        enqpVar2.o = enqsVar;
        enqpVar2.b |= 32768;
        yut.b(v, ymoVar.b);
        boni boniVar = this.m;
        fgrc v2 = ensq.a.v();
        String str = this.n;
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        ensq ensqVar = (ensq) fgriVar;
        str.getClass();
        ensqVar.b |= 2;
        ensqVar.e = str;
        if (!fgriVar.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        ensq ensqVar2 = (ensq) fgriVar2;
        ensqVar2.d = 26;
        ensqVar2.b = 1 | ensqVar2.b;
        if (!fgriVar2.L()) {
            v2.U();
        }
        ensq ensqVar3 = (ensq) v2.b;
        enqp enqpVar3 = (enqp) v.Q();
        enqpVar3.getClass();
        ensqVar3.A = enqpVar3;
        ensqVar3.b |= 33554432;
        boniVar.a((ensq) v2.Q());
        setResult(0, ymoVar.b());
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.ThemeTranslucentDayNight);
        setContentView(R.layout.credentials_password_manager_proxy);
        this.m = bonh.a(this, null);
        this.n = (String) ekvh.c(getIntent().getStringExtra("session_id"), bonp.a());
        CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) atzs.b(getIntent(), "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
        if (callingAppInfoCompat == null) {
            k(ygq.a("callingAppInfoCompat"));
            return;
        }
        this.o = callingAppInfoCompat;
        CredentialManagerAccount credentialManagerAccount = (CredentialManagerAccount) atzs.b(getIntent(), "credential_manager_account", CredentialManagerAccount.CREATOR);
        if (credentialManagerAccount == null) {
            k(ygq.a("credential_manager_account"));
            return;
        }
        yts ytsVar = (yts) new jxw(this, new ytr(credentialManagerAccount)).a(yts.class);
        this.j = ytsVar;
        ytsVar.b.g(this, new jvs() { // from class: ytj
            @Override // defpackage.jvs
            public final void a(Object obj) {
                GooglePasswordManagerProxyChimeraActivity.this.a((ymo) obj);
            }
        });
        this.j.c.g(this, new jvs() { // from class: ytk
            @Override // defpackage.jvs
            public final void a(Object obj) {
                GooglePasswordManagerProxyChimeraActivity.this.k.b(new acj((PendingIntent) obj).a());
            }
        });
        this.k = registerForActivityResult(new acr(), new aby() { // from class: ytl
            @Override // defpackage.aby
            public final void jF(Object obj) {
                int i = ((ActivityResult) obj).a;
                yts ytsVar2 = GooglePasswordManagerProxyChimeraActivity.this.j;
                if (i == 0) {
                    ytsVar2.a.g();
                } else {
                    ytsVar2.a.k(16, "Password Manager had unexpected ActivityResult.");
                }
            }
        });
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        yts ytsVar = this.j;
        if (ytsVar != null) {
            ytsVar.a.i();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.j.a.k(16, "GooglePasswordManagerProxyActivity canceled.");
        return super.onTouchEvent(motionEvent);
    }
}
