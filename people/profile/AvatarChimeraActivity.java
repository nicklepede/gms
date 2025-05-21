package com.google.android.gms.people.profile;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.people.profile.AvatarChimeraActivity;
import defpackage.aquo;
import defpackage.aqxd;
import defpackage.aqxp;
import defpackage.aqxq;
import defpackage.aqxr;
import defpackage.aqxs;
import defpackage.aqyg;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asnd;
import defpackage.asng;
import defpackage.asot;
import defpackage.bp;
import defpackage.cq;
import defpackage.ctji;
import defpackage.ctjk;
import defpackage.ctkm;
import defpackage.ctko;
import defpackage.cuds;
import defpackage.cudy;
import defpackage.cuey;
import defpackage.cuft;
import defpackage.cufu;
import defpackage.cufv;
import defpackage.cufx;
import defpackage.cufy;
import defpackage.cufz;
import defpackage.cvfa;
import defpackage.ejhf;
import defpackage.ekya;
import defpackage.elan;
import defpackage.enrv;
import defpackage.ensj;
import defpackage.ensv;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.frfw;
import defpackage.qfp;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class AvatarChimeraActivity extends qfp implements aqxq, aqxr, cufz {
    public cq k;
    public boolean l;
    public Uri m;
    public Uri n;
    public Uri o;
    public Uri p;
    public boolean q;
    public Context r;
    private aqxs u;
    private String v;
    private String x;
    private String y;
    private static final asot s = asot.b("People.Avatar", asej.PEOPLE);
    public static final byte[] j = new byte[0];
    private final ctkm t = ctkm.a();
    private int w = -1;
    private final ensv z = new asmf(Integer.MAX_VALUE, 9);
    private final aqyg A = new cuft(this);
    private final enrv B = new cufu(this);
    private final aqyg C = new cufv(this);

    private final void n() {
        Callable callable = new Callable() { // from class: cufs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AvatarChimeraActivity avatarChimeraActivity = AvatarChimeraActivity.this;
                return cuca.a(avatarChimeraActivity.r).b(avatarChimeraActivity.o.toString(), false);
            }
        };
        ensv ensvVar = this.z;
        ensj.t(ensvVar.submit(callable), this.B, ensvVar);
    }

    private final void o() {
        Uri uri = this.m;
        aqxd aqxdVar = ctjk.a;
        boolean z = uri != null;
        aqxs aqxsVar = this.u;
        aqxsVar.e(new cudy(aqxsVar, this.x, this.y, this.p, z)).e(this.C);
        this.q = true;
        this.k = new cufx();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.v(this.k, "progress_dialog");
        bpVar.b();
    }

    @Override // defpackage.cufz
    public final void a() {
        g();
    }

    @Override // defpackage.cufz
    public final void b() {
        this.n = Uri.EMPTY;
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        startActivityForResult(intent, 2);
    }

    @Override // defpackage.cufz
    public final void c() {
        Uri a = cufy.a(this, "camera-avatar.jpg");
        this.m = a;
        if (a == null) {
            cuey.l("People.Avatar", "Failed to create temp file to take photo");
            k();
            g();
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", this.m);
        intent.addFlags(1);
        intent.addFlags(2);
        try {
            startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException unused) {
            cuey.l("People.Avatar", "No activity to take photo");
        }
    }

    public final void f(Uri uri) {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.people.profile.AvatarPreviewActivity");
        className.setAction("android.intent.action.VIEW");
        className.putExtra("com.google.android.gms.people.profile.EXTRA_ACCOUNT", this.x);
        className.putExtra("com.google.android.gms.people.profile.EXTRA_URI", uri);
        startActivityForResult(className, 3);
    }

    final void g() {
        l(5);
        setResult(0);
        finish();
    }

    public final void h() {
        l(6);
        setResult(1);
        finish();
    }

    public final void k() {
        Toast.makeText(this, R.string.people_avatar_error, 0).show();
    }

    public final void l(int i) {
        m(i, false);
    }

    public final void m(int i, boolean z) {
        if (frfw.a.a().a()) {
            ctkm ctkmVar = this.t;
            fecj v = ekya.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            ekya ekyaVar = (ekya) fecpVar;
            ekyaVar.c = i - 1;
            ekyaVar.b |= 1;
            if (!fecpVar.L()) {
                v.U();
            }
            ekya ekyaVar2 = (ekya) v.b;
            ekyaVar2.b |= 2;
            ekyaVar2.d = z;
            ekya ekyaVar3 = (ekya) v.Q();
            String str = this.x;
            ctko ctkoVar = ctkmVar.b;
            fecj v2 = elan.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            elan elanVar = (elan) v2.b;
            ekyaVar3.getClass();
            elanVar.t = ekyaVar3;
            elanVar.b |= 32768;
            ctko.b(str, v2);
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 == -1) {
                f(this.m);
                return;
            } else {
                g();
                return;
            }
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            if (i2 != -1) {
                g();
                return;
            }
            this.p = (Uri) intent.getParcelableExtra("com.google.android.gms.people.profile.EXTRA_URI");
            if (this.u.p()) {
                o();
                return;
            }
            return;
        }
        if (i2 != -1) {
            g();
            return;
        }
        Uri data = intent.getData();
        this.n = data;
        if (data == null || TextUtils.isEmpty(data.toString())) {
            cuey.l("People.Avatar", "Empty data returned from pick photo");
            k();
            g();
            return;
        }
        Uri uri = this.n;
        if (uri == null || !("http".equals(uri.getScheme()) || "https".equals(uri.getScheme()))) {
            f(this.n);
            return;
        }
        this.o = this.n;
        this.n = null;
        if (this.u.p()) {
            n();
        }
    }

    @Override // defpackage.aqzv
    public final void onConnected(Bundle bundle) {
        if (!this.l) {
            aqxd aqxdVar = ctjk.a;
            aqxs aqxsVar = this.u;
            aqxsVar.d(new cuds(aqxsVar, this.x, this.y)).e(this.A);
        } else if (this.o != null) {
            n();
        } else {
            if ((this.m == null && this.n == null) || this.q || this.p == null) {
                return;
            }
            o();
        }
    }

    @Override // defpackage.arcf
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        k();
        h();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        this.r = getApplicationContext();
        getWindow().getDecorView();
        int i = asnd.a;
        if (aquo.g(this)) {
            ((ejhf) s.j()).x("This activity is not available for restricted profile.");
            setResult(0);
            finish();
            return;
        }
        try {
            this.v = asng.B(this);
            if (bundle != null) {
                this.w = bundle.getInt("app_id", -1);
                this.x = bundle.getString("account_name");
                this.y = bundle.getString("page_gaia_id");
                this.l = bundle.getBoolean("owner_loaded");
                this.m = (Uri) bundle.getParcelable("take_photo_uri");
                this.n = (Uri) bundle.getParcelable("pick_photo_uri");
                this.o = (Uri) bundle.getParcelable("remote_pick_photo_uri");
                this.p = (Uri) bundle.getParcelable("cropped_photo_uri");
                this.q = bundle.getBoolean("result_pending");
            }
            if (this.x == null && this.y == null && (extras = getIntent().getExtras()) != null) {
                this.x = extras.getString("com.google.android.gms.people.profile.EXTRA_ACCOUNT");
                this.y = extras.getString("com.google.android.gms.people.profile.EXTRA_PAGE_ID");
            }
            if (TextUtils.isEmpty(this.x)) {
                cuey.c("People.Avatar", "Profile image account name is unspecified");
                l(2);
                setResult(0);
                finish();
                return;
            }
            if (this.w == -1) {
                Bundle extras2 = getIntent().getExtras();
                if (extras2 != null) {
                    this.w = extras2.getInt("com.google.android.gms.people.profile.EXTRA_APP_ID", -1);
                }
                if (this.w == -1) {
                    int intValue = ((Integer) cvfa.a.getOrDefault(this.v, -1)).intValue();
                    this.w = intValue;
                    if (intValue == -1) {
                        cuey.c("People.Avatar", "EXTRA_SOCIAL_CLIENT_APP_ID must be set");
                        l(3);
                        setResult(0);
                        finish();
                        return;
                    }
                }
            }
            aqxp aqxpVar = new aqxp(this);
            aqxpVar.c = this.v;
            aqxd aqxdVar = ctjk.a;
            ctji ctjiVar = new ctji();
            ctjiVar.a = this.w;
            aqxpVar.d(aqxdVar, ctjiVar.a());
            aqxs a = aqxpVar.a();
            this.u = a;
            a.l(this);
            this.u.m(this);
            if (bundle == null) {
                l(4);
            }
        } catch (SecurityException unused) {
            setResult(0);
            finish();
        }
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("app_id", this.w);
        bundle.putString("account_name", this.x);
        bundle.putString("page_gaia_id", this.y);
        bundle.putBoolean("owner_loaded", this.l);
        bundle.putParcelable("take_photo_uri", this.m);
        bundle.putParcelable("pick_photo_uri", this.n);
        bundle.putParcelable("remote_pick_photo_uri", this.o);
        bundle.putParcelable("cropped_photo_uri", this.p);
        bundle.putBoolean("result_pending", this.q);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStart() {
        super.onStart();
        if (this.u.p() || this.u.q()) {
            return;
        }
        this.u.g();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStop() {
        super.onStop();
        if (this.u.p() || this.u.q()) {
            this.u.h();
        }
    }

    @Override // defpackage.aqzv
    public final void onConnectionSuspended(int i) {
    }
}
