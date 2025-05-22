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
import defpackage.asxd;
import defpackage.aszs;
import defpackage.atae;
import defpackage.ataf;
import defpackage.atag;
import defpackage.atah;
import defpackage.atav;
import defpackage.auid;
import defpackage.aupz;
import defpackage.auqx;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bp;
import defpackage.cq;
import defpackage.cvso;
import defpackage.cvsq;
import defpackage.cvts;
import defpackage.cvtu;
import defpackage.cwmz;
import defpackage.cwnf;
import defpackage.cwof;
import defpackage.cwpa;
import defpackage.cwpb;
import defpackage.cwpc;
import defpackage.cwpe;
import defpackage.cwpf;
import defpackage.cwpg;
import defpackage.cxoj;
import defpackage.eluo;
import defpackage.enlm;
import defpackage.ennz;
import defpackage.eqfo;
import defpackage.eqgc;
import defpackage.eqgo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.ftzr;
import defpackage.ryt;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class AvatarChimeraActivity extends ryt implements ataf, atag, cwpg {
    public cq k;
    public boolean l;
    public Uri m;
    public Uri n;
    public Uri o;
    public Uri p;
    public boolean q;
    public Context r;
    private atah u;
    private String v;
    private String x;
    private String y;
    private static final ausn s = ausn.b("People.Avatar", auid.PEOPLE);
    public static final byte[] j = new byte[0];
    private final cvts t = cvts.a();
    private int w = -1;
    private final eqgo z = new aupz(Integer.MAX_VALUE, 9);
    private final atav A = new cwpa(this);
    private final eqfo B = new cwpb(this);
    private final atav C = new cwpc(this);

    private final void n() {
        Callable callable = new Callable() { // from class: cwoz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AvatarChimeraActivity avatarChimeraActivity = AvatarChimeraActivity.this;
                return cwlh.a(avatarChimeraActivity.r).b(avatarChimeraActivity.o.toString(), false);
            }
        };
        eqgo eqgoVar = this.z;
        eqgc.t(eqgoVar.submit(callable), this.B, eqgoVar);
    }

    private final void o() {
        Uri uri = this.m;
        aszs aszsVar = cvsq.a;
        boolean z = uri != null;
        atah atahVar = this.u;
        atahVar.e(new cwnf(atahVar, this.x, this.y, this.p, z)).e(this.C);
        this.q = true;
        this.k = new cwpe();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.v(this.k, "progress_dialog");
        bpVar.b();
    }

    @Override // defpackage.cwpg
    public final void a() {
        g();
    }

    @Override // defpackage.cwpg
    public final void b() {
        this.n = Uri.EMPTY;
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        startActivityForResult(intent, 2);
    }

    @Override // defpackage.cwpg
    public final void c() {
        Uri a = cwpf.a(this, "camera-avatar.jpg");
        this.m = a;
        if (a == null) {
            cwof.l("People.Avatar", "Failed to create temp file to take photo");
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
            cwof.l("People.Avatar", "No activity to take photo");
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
        if (ftzr.a.lK().a()) {
            cvts cvtsVar = this.t;
            fgrc v = enlm.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            enlm enlmVar = (enlm) fgriVar;
            enlmVar.c = i - 1;
            enlmVar.b |= 1;
            if (!fgriVar.L()) {
                v.U();
            }
            enlm enlmVar2 = (enlm) v.b;
            enlmVar2.b |= 2;
            enlmVar2.d = z;
            enlm enlmVar3 = (enlm) v.Q();
            String str = this.x;
            cvtu cvtuVar = cvtsVar.b;
            fgrc v2 = ennz.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            ennz ennzVar = (ennz) v2.b;
            enlmVar3.getClass();
            ennzVar.t = enlmVar3;
            ennzVar.b |= 32768;
            cvtu.b(str, v2);
        }
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
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
            cwof.l("People.Avatar", "Empty data returned from pick photo");
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

    @Override // defpackage.atck
    public final void onConnected(Bundle bundle) {
        if (!this.l) {
            aszs aszsVar = cvsq.a;
            atah atahVar = this.u;
            atahVar.d(new cwmz(atahVar, this.x, this.y)).e(this.A);
        } else if (this.o != null) {
            n();
        } else {
            if ((this.m == null && this.n == null) || this.q || this.p == null) {
                return;
            }
            o();
        }
    }

    @Override // defpackage.ateu
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        k();
        h();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        this.r = getApplicationContext();
        getWindow().getDecorView();
        int i = auqx.a;
        if (asxd.g(this)) {
            ((eluo) s.j()).x("This activity is not available for restricted profile.");
            setResult(0);
            finish();
            return;
        }
        try {
            this.v = aura.B(this);
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
                cwof.c("People.Avatar", "Profile image account name is unspecified");
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
                    int intValue = ((Integer) cxoj.a.getOrDefault(this.v, -1)).intValue();
                    this.w = intValue;
                    if (intValue == -1) {
                        cwof.c("People.Avatar", "EXTRA_SOCIAL_CLIENT_APP_ID must be set");
                        l(3);
                        setResult(0);
                        finish();
                        return;
                    }
                }
            }
            atae ataeVar = new atae(this);
            ataeVar.c = this.v;
            aszs aszsVar = cvsq.a;
            cvso cvsoVar = new cvso();
            cvsoVar.a = this.w;
            ataeVar.d(aszsVar, cvsoVar.a());
            atah a = ataeVar.a();
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

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStart() {
        super.onStart();
        if (this.u.p() || this.u.q()) {
            return;
        }
        this.u.g();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStop() {
        super.onStop();
        if (this.u.p() || this.u.q()) {
            this.u.h();
        }
    }

    @Override // defpackage.atck
    public final void onConnectionSuspended(int i) {
    }
}
