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
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.asej;
import defpackage.asot;
import defpackage.dglq;
import defpackage.dgmd;
import defpackage.dgna;
import defpackage.dgsz;
import defpackage.dgta;
import defpackage.dgtg;
import defpackage.dgth;
import defpackage.dgti;
import defpackage.dgtj;
import defpackage.dgtk;
import defpackage.dgtl;
import defpackage.ejhf;
import defpackage.jti;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PromoteScreenLockAndOnbodyChimeraActivity extends qfp implements dgsz, abt {
    public dgta k;
    private dgtl n;
    private KeyguardManager o;
    private Button p;
    private Button q;
    private ViewGroup r;
    private TextView s;
    private ProgressBar t;
    private GlifLayout u;
    private abv v;
    private static final asot l = asot.b("Trustlet_Onbody", asej.TRUSTLET_ONBODY);
    public static final dglq j = new dgtj();
    private final dgtk m = new dgtk(this);
    private int w = 0;

    private final abv l() {
        abv abvVar = this.v;
        if (abvVar != null) {
            return abvVar;
        }
        abv registerForActivityResult = registerForActivityResult(new acl(), this);
        this.v = registerForActivityResult;
        return registerForActivityResult;
    }

    private final void m(boolean z) {
        this.p.setVisibility(0);
        this.p.setText(getString(R.string.trust_agent_button_got_it));
        this.p.setOnClickListener(new dgtg(this, z));
    }

    @Override // defpackage.dgsz
    public final void b() {
        if (!this.o.isDeviceSecure()) {
            Intent a = dgna.a(getApplicationContext());
            this.w = 1;
            l().b(a);
        } else {
            Intent intent = new Intent();
            intent.setAction("android.app.action.CONFIRM_DEVICE_CREDENTIAL");
            this.w = 2;
            l().b(intent);
        }
    }

    @Override // defpackage.dgsz
    public final void c() {
        this.q.setVisibility(8);
        this.p.setVisibility(8);
        this.r.setVisibility(8);
        this.s.setVisibility(8);
        this.t.setVisibility(0);
        this.u.H(R.string.trust_agent_checking_smartlock_status);
        jti.a(this).c(0, new Bundle(), this.m);
    }

    @Override // defpackage.dgsz
    public final void d() {
        dgtl dgtlVar = this.n;
        dgtlVar.b = true;
        dgmd dgmdVar = dgtlVar.c;
        if (dgmdVar == null || !dgmdVar.k()) {
            return;
        }
        dgtlVar.x();
    }

    @Override // defpackage.dgsz
    public final void e() {
        this.q.setVisibility(0);
        this.p.setVisibility(0);
        this.r.setVisibility(0);
        this.s.setVisibility(8);
        this.t.setVisibility(8);
        this.u.b(this.k.b());
        this.r.addView(this.k.a(getLayoutInflater()));
        this.p.setOnClickListener(new dgth(this));
        this.q.setOnClickListener(new dgti(this));
    }

    @Override // defpackage.dgsz
    public final void f() {
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.s.setVisibility(0);
        this.t.setVisibility(8);
        this.u.H(R.string.onbody_promotion_desc_smartlock_allset_title);
        this.s.setText(this.k.c());
        m(true);
    }

    @Override // defpackage.dgsz
    public final void g() {
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.s.setVisibility(0);
        this.t.setVisibility(8);
        this.u.b(this.k.e());
        this.u.I(getDrawable(2131233391));
        if (this.k.d().isEmpty()) {
            this.s.setVisibility(8);
        } else {
            this.s.setText(this.k.d());
        }
        m(false);
    }

    @Override // defpackage.dgsz
    public final boolean h() {
        return this.o.isDeviceSecure();
    }

    @Override // defpackage.abt
    public final /* bridge */ /* synthetic */ void jq(Object obj) {
        int i = ((ActivityResult) obj).a;
        int i2 = this.w;
        if (i2 != 1) {
            if (i2 != 2) {
                ((ejhf) l.j()).z("Invalid request code: %s", i2);
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
        dgtl dgtlVar = this.n;
        dgmd dgmdVar = dgtlVar.c;
        if (dgmdVar != null && dgmdVar.k()) {
            dgtlVar.c.f("screen_lock_set_from", dgtlVar.a);
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
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        dgta dgtaVar = this.k;
        if (dgtaVar != null) {
            dgtaVar.g();
        }
        super.onDestroy();
    }
}
