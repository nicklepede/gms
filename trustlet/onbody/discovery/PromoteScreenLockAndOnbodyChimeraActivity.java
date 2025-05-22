package com.google.android.gms.trustlet.onbody.discovery;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.auid;
import defpackage.ausn;
import defpackage.diwv;
import defpackage.dixi;
import defpackage.diyf;
import defpackage.djee;
import defpackage.djef;
import defpackage.djel;
import defpackage.djem;
import defpackage.djen;
import defpackage.djeo;
import defpackage.djep;
import defpackage.djeq;
import defpackage.eluo;
import defpackage.jzx;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PromoteScreenLockAndOnbodyChimeraActivity extends ryt implements djee, aby {
    public djef k;
    private djeq n;
    private KeyguardManager o;
    private Button p;
    private Button q;
    private ViewGroup r;
    private TextView s;
    private ProgressBar t;
    private GlifLayout u;
    private aca v;
    private static final ausn l = ausn.b("Trustlet_Onbody", auid.TRUSTLET_ONBODY);
    public static final diwv j = new djeo();
    private final djep m = new djep(this);
    private int w = 0;

    private final aca l() {
        aca acaVar = this.v;
        if (acaVar != null) {
            return acaVar;
        }
        aca registerForActivityResult = registerForActivityResult(new acq(), this);
        this.v = registerForActivityResult;
        return registerForActivityResult;
    }

    private final void m(boolean z) {
        this.p.setVisibility(0);
        this.p.setText(getString(R.string.trust_agent_button_got_it));
        this.p.setOnClickListener(new djel(this, z));
    }

    @Override // defpackage.djee
    public final void b() {
        if (!this.o.isDeviceSecure()) {
            Intent a = diyf.a(getApplicationContext());
            this.w = 1;
            l().b(a);
        } else {
            Intent intent = new Intent();
            intent.setAction("android.app.action.CONFIRM_DEVICE_CREDENTIAL");
            this.w = 2;
            l().b(intent);
        }
    }

    @Override // defpackage.djee
    public final void c() {
        this.q.setVisibility(8);
        this.p.setVisibility(8);
        this.r.setVisibility(8);
        this.s.setVisibility(8);
        this.t.setVisibility(0);
        this.u.H(R.string.trust_agent_checking_smartlock_status);
        jzx.a(this).c(0, new Bundle(), this.m);
    }

    @Override // defpackage.djee
    public final void d() {
        djeq djeqVar = this.n;
        djeqVar.b = true;
        dixi dixiVar = djeqVar.c;
        if (dixiVar == null || !dixiVar.k()) {
            return;
        }
        djeqVar.x();
    }

    @Override // defpackage.djee
    public final void e() {
        this.q.setVisibility(0);
        this.p.setVisibility(0);
        this.r.setVisibility(0);
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        this.u.b(this.k.b());
        this.r.addView(this.k.a(getLayoutInflater()));
        this.p.setOnClickListener(new djem(this));
        this.q.setOnClickListener(new djen(this));
    }

    @Override // defpackage.djee
    public final void f() {
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.s.setVisibility(0);
        this.t.setVisibility(8);
        this.u.H(R.string.onbody_promotion_desc_smartlock_allset_title);
        this.s.setText(this.k.c());
        m(true);
    }

    @Override // defpackage.djee
    public final void g() {
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.s.setVisibility(0);
        this.t.setVisibility(8);
        this.u.b(this.k.e());
        this.u.I(getDrawable(2131233457));
        if (this.k.d().isEmpty()) {
            this.s.setVisibility(8);
        } else {
            this.s.setText(this.k.d());
        }
        m(false);
    }

    @Override // defpackage.djee
    public final boolean h() {
        return this.o.isDeviceSecure();
    }

    @Override // defpackage.aby
    public final /* bridge */ /* synthetic */ void jF(Object obj) {
        int i = ((ActivityResult) obj).a;
        int i2 = this.w;
        if (i2 != 1) {
            if (i2 != 2) {
                ((eluo) l.j()).z("Invalid request code: %s", i2);
                return;
            } else if (i == -1) {
                this.k.i();
                return;
            } else {
                k();
                return;
            }
        }
        if (i != 1 || !h()) {
            k();
            return;
        }
        djeq djeqVar = this.n;
        dixi dixiVar = djeqVar.c;
        if (dixiVar != null && dixiVar.k()) {
            djeqVar.c.f("screen_lock_set_from", djeqVar.a);
        }
        this.k.j();
    }

    public final void k() {
        setResult(0);
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c9, code lost:
    
        if (r0.equals("com.google.android.gms.trustlet.onbody.discovery.OnbodyPromotionActivity") == false) goto L25;
     */
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.trustlet.onbody.discovery.PromoteScreenLockAndOnbodyChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        djef djefVar = this.k;
        if (djefVar != null) {
            djefVar.g();
        }
        super.onDestroy();
    }
}
